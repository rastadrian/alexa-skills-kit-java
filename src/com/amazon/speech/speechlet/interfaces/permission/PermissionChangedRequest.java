package com.amazon.speech.speechlet.interfaces.permission;

import com.amazon.speech.speechlet.SpeechletRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.apache.commons.lang3.Validate;

import java.util.Date;
import java.util.Locale;

@JsonTypeName("AlexaSkillEvent.SkillPermissionChangedEvent")
public class PermissionChangedRequest extends SpeechletRequest {

    private final EventBody body;

    /**
     * Returns a new builder instance used to construct a new {@code MessageReceivedRequest}.
     *
     * @return the builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Private constructor to return a new {@code PermissionChangedRequest} from a {@code Builder}.
     *
     * @param builder the builder used to construct the {@code PermissionChangedRequest}
     */
    private PermissionChangedRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    /**
     * Protected constructor used for JSON serialization and for extending this class.
     *
     * @param requestId the unique identifier associated with the request
     * @param timestamp the request timestamp
     * @param locale    the locale of the request
     * @param body      the event's body
     */
    protected PermissionChangedRequest(@JsonProperty("requestId") final String requestId,
                                       @JsonProperty("timestamp") final Date timestamp,
                                       @JsonProperty("locale") final Locale locale,
                                       @JsonProperty("body") final EventBody body) {
        super(requestId, timestamp, locale);
        this.body = body;
    }

    public EventBody getBody() {
        return body;
    }

    /**
     * Builder used to construct a new {@code PermissionChangedRequest}.
     */
    public static final class Builder extends
            SpeechletRequest.SpeechletRequestBuilder<Builder, PermissionChangedRequest> {

        private EventBody body;

        private Builder() {
            //NOP
        }

        public Builder withBody(EventBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PermissionChangedRequest build() {
            Validate.notNull(body, "Body must be defined");
            return new PermissionChangedRequest(this);
        }
    }
}
