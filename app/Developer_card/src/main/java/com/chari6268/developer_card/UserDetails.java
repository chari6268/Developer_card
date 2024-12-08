package com.chari6268.developer_card;

public class UserDetails {
    private String name;
    private String batch;
    private String githubUrl;
    private String linkedinUrl;

    public UserDetails(String name, String batch, String githubUrl, String linkedinUrl) {
        this.name = name;
        this.batch = batch;
        this.githubUrl = githubUrl;
        this.linkedinUrl = linkedinUrl;
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

