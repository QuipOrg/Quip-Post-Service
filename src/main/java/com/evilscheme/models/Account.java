package com.evilscheme.models;



import javax.persistence.*;
import java.util.List;
import java.io.*;

public class Account implements Serializable{
    private Long id;
    private String username;
    private String password;
    private String fname;
    private String lname;
    private String email;
    private String profilePic;
    private List<Role> roles;

    public Account() {
    }

    public Account(String username, String password, String fname, String lname, String email) {
        this.username = username;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
    }

    public Account(String username, String password, String fname, String lname, String email, String profilePic) {
        this.username = username;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.profilePic = profilePic;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }


    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePic() {
        return profilePic;
    }
    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public List<Role> getRoles() {
        return roles;
    }
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
