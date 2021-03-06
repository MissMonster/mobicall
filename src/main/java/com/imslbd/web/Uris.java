package com.imslbd.web;

/**
 * Created by someone on 12/10/2015.
 */
public enum Uris {
    fileUpload("/file-upload", "Upload File"),
    dashboard("/dashboard", "Dashboard"),
    login("/login", "Login"),
    register("/register", "Register"),
    staticResourcesPattern("/static/*", "Static Resources"),
    publicResourcesPattern("/public/*", "Public Resources"),
    event_publish_form("/event-publish-form", "Publish And Send Event"),
    logout("/logout", "Logout"),
    callDetails("/call/details", "Call Details"),
    br_checker_details("/br-checker/details", "Br Checker Details"),
    br_checker_view("/br-details/view", "Br Checker Info"),
    BrCheckerImages("/br-checker/images", "Br Checker Images"), googleMap("/google-map", "Google Map");

    public final String value;
    public final String label;

    Uris(final String value, String label) {
        this.value = value;
        this.label = label;
    }
}
