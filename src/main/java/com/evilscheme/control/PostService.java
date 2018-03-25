package com.evilscheme.control;


import com.evilscheme.entities.Post;
import com.evilscheme.exceptions.PostNotFoundException;

import java.util.List;
import java.util.stream.Stream;

public interface PostService {
    Post create(Post obj);
    boolean delete(Long id) throws PostNotFoundException;
    Stream<Post> streamAll();
    List<Post> findAll();
    Post update(Post obj) throws PostNotFoundException;
    Post findById(Long id);
}
