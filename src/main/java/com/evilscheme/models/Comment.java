package com.evilscheme.models;

import com.evilscheme.entities.Post;
import java.util.List;
import java.io.*;

public class Comment implements Serializable {
    private Long id;
    private Account owner;
    private String description;
    private Post parentPost;
    private List<Account> likes;
    private List<Account> dislikes;

    public Comment() {
    }

    public Comment(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Account getOwner() {
        return owner;
    }

    public void setOwner(Account owner) {
        this.owner = owner;
    }

    public List<Account> getLikes() {
        return likes;
    }

    public void setLikes(List<Account> likes) {
        this.likes = likes;
    }

    public List<Account> getDislikes() {
        return dislikes;
    }

    public void setDislikes(List<Account> dislikes) {
        this.dislikes = dislikes;
    }

    public Post getParentPost() {
        return parentPost;
    }

    public void setParentPost(Post parentPost) {
        this.parentPost = parentPost;
    }
}