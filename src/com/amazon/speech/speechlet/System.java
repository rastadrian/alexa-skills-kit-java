package com.amazon.speech.speechlet;

/**
 * Context System for Session-less requests.
 */
public class System {
    private User user;
    private String apiEndpoint;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getApiEndpoint() {
        return apiEndpoint;
    }

    public void setApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
    }
}
