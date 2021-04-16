package st.jx.webapp.wangyiyun.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author shaotian
 * @create 2021-03-21 18:35
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataIncome {

    @JsonProperty("period")
    private String period;

    @JsonProperty("game_id")
    private String gameId;

    @JsonProperty("channel_id")
    private String channelId;

    @JsonProperty("income_money")
    private String incomeMoney;

    @JsonProperty("total_income_money")
    private String totalIncomeMoney;


    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

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

    public String getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(String incomeMoney) {
        this.incomeMoney = incomeMoney;
    }

    public String getTotalIncomeMoney() {
        return totalIncomeMoney;
    }

    public void setTotalIncomeMoney(String totalIncomeMoney) {
        this.totalIncomeMoney = totalIncomeMoney;
    }
}
