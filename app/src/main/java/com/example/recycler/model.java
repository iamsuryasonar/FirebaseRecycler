package com.example.recycler;


public class model {
    String name;
    String bio;
    String dp;
    public model() {
    }

    public model(String name, String bio, String dp) {
        this.name = name;
        this.bio = bio;
        this.dp = dp;
    }

    public String getDp() {
        return dp;
    }

    public void setDp(String dp) {
        this.dp = dp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
