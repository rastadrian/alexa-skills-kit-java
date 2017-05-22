package com.amazon.speech.speechlet;

/**
 * Context System for Session-less requests.
 */
public class System {
    private final Application application;
    private final User user;
    private final String apiEndpoint;

    /**
     * Returns a new builder instance used to construct a new {@code System}.
     *
     * @return the builder
     */
    public static Builder builder() {
        return new Builder();
    }

    private System(Builder builder) {
        this.application = builder.application;
        this.user = builder.user;
        this.apiEndpoint = builder.apiEndpoint;
    }

    public Application getApplication() {
        return application;
    }

    public User getUser() {
        return user;
    }

    public String getApiEndpoint() {
        return apiEndpoint;
    }

    /**
     * Builder used to construct a new {@code System}.
     */
    public static final class Builder {
        private Application application;
        private User user;
        private String apiEndpoint;

        private Builder() {
        }

        public Builder withApplication(final Application application) {
            this.application = application;
            return this;
        }

        public Builder withUser(final User user) {
            this.user = user;
            return this;
        }

        public Builder withApiEndpoint(final String apiEndpoint) {
            this.apiEndpoint = apiEndpoint;
            return this;
        }

        public System build() {
            return new System(this);
        }
    }
}
