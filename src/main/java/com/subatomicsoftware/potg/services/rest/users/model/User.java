package com.subatomicsoftware.potg.services.rest.users.model;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.annotation.Id;

/**
 * Created by slotterdesktop on 6/11/2016.
 */
public class User {

    @Id
    private String id;
    private Integer bnetId;
    private String bnetTag;
    private String twitchURL;
    private Boolean twitchDisplay;

    public Boolean getTwitchDisplay() {
        return twitchDisplay;
    }

    public void setTwitchDisplay(Boolean twitchDisplay) {
        this.twitchDisplay = twitchDisplay;
    }

    public Integer getBnetId() {
        return bnetId;
    }

    @Required
    public void setBnetId(Integer bnetId) {
        this.bnetId = bnetId;
    }

    public String getBnetTag() {
        return bnetTag;
    }

    @Required
    public void setBnetTag(String bnetTag) {
        this.bnetTag = bnetTag;
    }

    public String getTwitchURL() {
        return twitchURL;
    }

    public void setTwitchURL(String twitchURL) {
        this.twitchURL = twitchURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
