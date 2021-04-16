package st.jx.webapp.wangyiyun.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 留存表
 * @author shaotian
 * @date 2021-04-13 15:04
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class KeepLogin {

    @JsonProperty("keep_day")
    private Integer keepDay = 0;

    @JsonProperty("period")
    private String period = "";

    @JsonProperty("game_id")
    private String gameId = "";

    @JsonProperty("channel_id")
    private String channelId = "";

    @JsonProperty("keep_cnt")
    private Integer keepCnt = 0;

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

    public Integer getKeepDay() {
        return keepDay;
    }

    public void setKeepDay(Integer keepDay) {
        this.keepDay = keepDay;
    }

    public Integer getKeepCnt() {
        return keepCnt;
    }

    public void setKeepCnt(Integer keepCnt) {
        this.keepCnt = keepCnt;
    }

    @Override
    public String toString() {
        return "KeepLogin{" +
                "keepDay=" + keepDay +
                ", period='" + period + '\'' +
                ", gameId='" + gameId + '\'' +
                ", channelId='" + channelId + '\'' +
                ", keepCnt=" + keepCnt +
                '}';
    }
}
