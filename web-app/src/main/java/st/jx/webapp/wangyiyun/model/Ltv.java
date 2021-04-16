package st.jx.webapp.wangyiyun.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author shaotian
 * @date 2021-04-14 16:55
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ltv {

    @JsonProperty("period")
    private String period = "";

    @JsonProperty("game_id")
    private String gameId = "";

    @JsonProperty("channel_id")
    private String channelId = "";

    @JsonProperty("ltvDay")
    private Integer ltvDay;

    @JsonProperty("income_money")
    private Double incomeMoney = 0.0;

    @JsonProperty("income_period")
    private String incomePeriod;

    private Double totalLtv = 0.0;

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

    public Integer getLtvDay() {
        return ltvDay;
    }

    public void setLtvDay(Integer ltvDay) {
        this.ltvDay = ltvDay;
    }

    public Double getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(Double incomeMoney) {
        this.incomeMoney = incomeMoney;
    }

    public String getIncomePeriod() {
        return incomePeriod;
    }

    public void setIncomePeriod(String incomePeriod) {
        this.incomePeriod = incomePeriod;
    }

    public Double getTotalLtv() {
        return totalLtv;
    }

    public void setTotalLtv(Double totalLtv) {
        this.totalLtv = totalLtv;
    }

    @Override
    public String toString() {
        return "Ltv{" +
                "period='" + period + '\'' +
                ", gameId='" + gameId + '\'' +
                ", channelId='" + channelId + '\'' +
                ", ltvDay=" + ltvDay +
                ", incomeMoney=" + incomeMoney +
                ", incomePeriod='" + incomePeriod + '\'' +
                ", totalLtv=" + totalLtv +
                '}';
    }
}
