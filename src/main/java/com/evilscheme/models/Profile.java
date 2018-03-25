package com.evilscheme.models;

import com.evilscheme.entities.Post;


import java.util.List;
import java.io.*;


public class Profile implements Serializable {
    private Long profileId;
    private Account account;
    private String description;
    private List<Post> posts;
    private List<Account> friends;
    private List<Account> recomendedFriends;

    public Profile() {
    }


    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Account> getFriends() {
        return friends;
    }

    public void setFriends(List<Account> friends) {
        this.friends = friends;
    }

    public List<Account> getRecomendedFriends() {
        return recomendedFriends;
    }

    public void setRecomendedFriends(List<Account> recomendedFriends) {
        this.recomendedFriends = recomendedFriends;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
