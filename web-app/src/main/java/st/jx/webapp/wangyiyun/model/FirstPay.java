package st.jx.webapp.wangyiyun.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FirstPay {

    @JsonProperty("game_id")
    private String gameId = "";

    @JsonProperty("channel_id")
    private String channelId = "";

    @JsonProperty("uid")
    private String uid = "";

    @JsonProperty("reg_date")
    private String regDate = "";

    @JsonProperty("first_income_date")
    private String firstIncomeDate = "";

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getFirstIncomeDate() {
        return firstIncomeDate;
    }

    public void setFirstIncomeDate(String firstIncomeDate) {
        this.firstIncomeDate = firstIncomeDate;
    }
}
