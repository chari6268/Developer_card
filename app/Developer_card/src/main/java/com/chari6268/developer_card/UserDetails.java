package com.chari6268.developer_card;

import android.widget.ImageView;

public class UserDetails {
    private String name;
    private String batch;
    private String githubUrl;
    private String linkedinUrl;
    private int imageView;

    public UserDetails(String name, String batch, String githubUrl, String linkedinUrl,int imageView) {
        this.name = name;
        this.batch = batch;
        this.githubUrl = githubUrl;
        this.linkedinUrl = linkedinUrl;
        this.imageView = imageView;
    }

    public int getImageView() {
        return imageView;
    }

    public String getName() {
        return name;
    }

    public String getBatch() {
        return batch;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public String getLinkedinUrl() {
        return linkedinUrl;
    }
}

