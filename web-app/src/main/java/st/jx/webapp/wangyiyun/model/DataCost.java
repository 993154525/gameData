package st.jx.webapp.wangyiyun.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author shaotian
 * @create 2021-03-21 17:08
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataCost {

    @JsonProperty("period")
    private String period;

    @JsonProperty("game_id")
    private String gameId;

    @JsonProperty("channel_id")
    private String channelId;

    @JsonProperty("cost")
    private Double cost;

    @JsonProperty("total_cost")
    private Double totalCost;

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

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "DataCost{" +
                "period=" + period +
                ", gameId='" + gameId + '\'' +
                ", channelId='" + channelId + '\'' +
                ", cost=" + cost +
                ", totalCost=" + totalCost +
                '}';
    }
}
