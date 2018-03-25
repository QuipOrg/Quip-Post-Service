package com.evilscheme.services;

import com.evilscheme.control.PostService;
import com.evilscheme.entities.Post;
import com.evilscheme.exceptions.PostNotFoundException;
import com.evilscheme.repositories.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Stream;

@Service
public class PostServiceImpl implements PostService {
    @Resource
    private PostRepository repository;

    @Override
    @Transactional
    public Post create(Post obj) {
        return this.repository.save(obj);
    }

    @Override
    @Transactional(rollbackFor = PostNotFoundException.class)
    public boolean delete(Long id) throws PostNotFoundException {
        Post post = this.repository.getOne(id);
        if (post == null)
            throw new PostNotFoundException("Account not found.");
        this.repository.delete(post);
        return true;
    }

    @Override
    public Stream<Post> streamAll() {
        return this.repository.findAll().stream();
    }

    @Override
    public List<Post> findAll() {
        return this.repository.findAll();
    }

    @Override
    @Transactional(rollbackFor = PostNotFoundException.class)
    public Post update(Post obj) throws PostNotFoundException{
        Post post = this.repository.getOne(obj.getId());
        if (post == null)
            throw new PostNotFoundException("Post not found.");
        post.setTitle(obj.getTitle());
        post.setDescription(obj.getDescription());
        post.setMediaUrl(obj.getMediaUrl());
        post.setDislikes(obj.getDislikes());
        post.setLikes(obj.getLikes());
        post.setComments(obj.getComments());
        post.getComments().forEach(x -> {
            System.out.println("Comment Id: " + x);
        });
        return post;
    }

    @Override
    public Post findById(Long id) {
        return this.repository.getOne(id);
    }
}
