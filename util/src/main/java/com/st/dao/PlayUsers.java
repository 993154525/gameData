package com.st.dao;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

/**
 * @author shaotian
 * @create 2021-01-03 11:13
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayUsers {

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("click_at")
    private Timestamp clickAt;

    @JsonProperty("type")
    private String type;

    @JsonProperty("game_name")
    private String gameName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Timestamp getClickAt() {
        return clickAt;
    }

    public void setClickAt(Timestamp clickAt) {
        this.clickAt = clickAt;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    @Override
    public String toString() {
        return "PlayUsers{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", clickAt=" + clickAt +
                ", type='" + type + '\'' +
                ", gameName='" + gameName + '\'' +
                '}';
    }
}
