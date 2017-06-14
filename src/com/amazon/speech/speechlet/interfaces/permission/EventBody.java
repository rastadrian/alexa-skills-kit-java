package com.amazon.speech.speechlet.interfaces.permission;

import java.util.List;

/**
 * An event's body that contains the relevant event information.
 */
public class EventBody {
    private List<String> acceptedPermissions;

    public List<String> getAcceptedPermissions() {
        return acceptedPermissions;
    }

    public void setAcceptedPermissions(List<String> acceptedPermissions) {
        this.acceptedPermissions = acceptedPermissions;
    }
}
