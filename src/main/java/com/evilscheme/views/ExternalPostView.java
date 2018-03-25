package com.evilscheme.views;

import java.util.List;


import com.evilscheme.entities.Post;
import com.evilscheme.exceptions.PostNotFoundException;
import com.evilscheme.exceptions.NotOwnerException;
import com.evilscheme.forms.PostForm;
import com.evilscheme.services.PostServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping(value = "posts")
public class ExternalPostView {
    @Resource
    PostServiceImpl postService;

//    @Autowired
//    private JwtTokenProvider tokenProvider;


    @RequestMapping(value = "", method = RequestMethod.POST)
    public List<Post> add(@RequestHeader("Authorization") String token, @RequestBody PostForm post) {
//        Profile profile = this.profileRepository.findByUser(this.tokenProvider.getUsername(refactorToken(token)));
//        Post post1 = new Post(post.getTitle(), post.getDescription(), post.getMedia());
//        post1.setOwner(profile.getAccount());
//        Post retVal = this.postService.create(post1);]2 -
//                profile.getPosts().add(retVal);
//        return this.profileService.update(profile).getPosts();
        // Make a call to the profile micro service here...
        return null;
    }

    @RequestMapping(value = "/image", method = RequestMethod.POST)
    public List<Post> addImage(@RequestHeader("Authorization") String token, @RequestBody Post post) throws PostNotFoundException {
//        Profile profile = this.profileRepository.findByUser(this.tokenProvider.getUsername(refactorToken(token)));
//        post.setOwner(profile.getAccount());
        // Make a call to the profile micro service here...
        this.postService.create(post);
//        profile.getPosts().add(post);
//        return this.profileService.update(profile).getPosts();
        return null;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Post> getAll() {
        return this.postService.findAll();
    }

    @RequestMapping(value = "/like/{id}", method = RequestMethod.GET)
    public Post like(@RequestHeader("Authorization") String token, @PathVariable Long id) throws PostNotFoundException {
//        Account account = this.accountRepository.findByUsername(this.tokenProvider.getUsername(refactorToken(token)));
        // Make a call to the account micro service here...
        Post post = this.postService.findById(id);
//
//        int canlike = 0;
//        int disliked = 0;
//        if (post.getLikes() != null && post.getLikes().size() > 0)
//            canlike = post.getLikes().stream().filter(x -> (x.getId().equals(account.getId()))).toArray().length;
//        if (post.getDislikes() != null && post.getDislikes().size() > 0)
//            disliked = post.getDislikes().stream().filter(x -> (x.getId().equals(account.getId()))).toArray().length;
//
//        if (canlike > 0)
//            post.getLikes().remove(account);
//        else
//            post.getLikes().add(account);
//        ;
//        if (disliked > 0)
//            post.getDislikes().remove(account);
        return this.postService.update(post);
    }

    @RequestMapping(value = "/dislike/{id}", method = RequestMethod.GET)
    public Post dislike(@RequestHeader("Authorization") String token, @PathVariable Long id) throws PostNotFoundException {
//        Account account = this.accountRepository.findByUsername(this.tokenProvider.getUsername(refactorToken(token)));
        // Make a call to the account micro service here...
        Post post = this.postService.findById(id);
//
//        int canlike = 0;
//        int disliked = 0;
//        if (post.getLikes() != null && post.getLikes().size() > 0)
//            canlike = post.getLikes().stream().filter(x -> (x.getId().equals(account.getId()))).toArray().length;
//        if (post.getDislikes() != null && post.getDislikes().size() > 0)
//            disliked = post.getDislikes().stream().filter(x -> (x.getId().equals(account.getId()))).toArray().length;
//
//        if (disliked > 0)
//            post.getDislikes().remove(account);
//        else
//            post.getDislikes().add(account);
//        if (canlike > 0)
//            post.getLikes().remove(account);
        return this.postService.update(post);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Post update(@RequestHeader("Authorization") String token, @RequestBody Post post) throws PostNotFoundException, NotOwnerException {
//        Account account = this.accountRepository.findByUsername(this.tokenProvider.getUsername(refactorToken(token)));
        // Make a call to the account micro service here...
//        if (account.equals(post.getOwner()))
//            return this.postService.update(post);
//        else
//            throw new java.security.acl.NotOwnerException("You can't edit this content", HttpStatus.NOT_ACCEPTABLE);
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean delete(@RequestHeader("Authorization") String token, @PathVariable Long id) throws PostNotFoundException, NotOwnerException {
//        Account account = this.accountRepository.findByUsername(this.tokenProvider.getUsername(refactorToken(token)));
        // Make a call to the account micro service here...
        Post post = this.postService.findById(id);
//        if (account.equals(post.getOwner()))
//            return this.postService.delete(id);
//        else
//            throw new NotOwnerException("You can't delete this content", HttpStatus.NOT_ACCEPTABLE);
        return false;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Post getById(@PathVariable Long id) {
        return this.postService.findById(id);
    }
}
