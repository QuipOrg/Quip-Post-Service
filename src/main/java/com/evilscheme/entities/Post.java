package com.evilscheme.entities;

import javax.persistence.*;
import java.util.List;
import java.io.*;

@Entity
@Table(name="Posts")
public class Post implements Serializable {

    private Long id;
    private Long ownerId;
    private String title;
    private String description;
    private String mediaUrl;
    private List<Long> likes; // Account Ids
    private List<Long> dislikes; // Account Ids
    private List<Long> comments; // Comment Ids

    public Post() {
    }

    public Post(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public Post(String title, String description, String mediaUrl, List<Long> likes, List<Long> dislikes, List<Long> comments) {
        this.title = title;
        this.description = description;
        this.mediaUrl = mediaUrl;
        this.likes = likes;
        this.dislikes = dislikes;
        this.comments = comments;
    }

    public Post(String title, String description, String mediaUrl) {
        this.title = title;
        this.description = description;
        this.mediaUrl = mediaUrl;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="ownerId")
    public Long getOwner() {
        return ownerId;
    }

    public void setOwner(Long ownerId) {
        this.ownerId = ownerId;
    }

    @Column(name = "media")
    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name="likes")
    public List<Long> getLikes() {
        return likes;
    }

    public void setLikes(List<Long> likes) {
        this.likes = likes;
    }

    @Column(name = "comments")
    public List<Long> getDislikes() {
        return dislikes;
    }

    public void setDislikes(List<Long> dislikes) {
        this.dislikes = dislikes;
    }

    @Column(name = "comments")
    public List<Long> getComments() {
        return comments;
    }

    public void setComments(List<Long> comments) {
        this.comments = comments;
    }
}

