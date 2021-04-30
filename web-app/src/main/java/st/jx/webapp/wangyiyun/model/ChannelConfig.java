package st.jx.webapp.wangyiyun.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author shaotian
 * @date 2021-04-22 15:52
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChannelConfig {

    @JsonProperty("id")
    private Integer id = 0;

    @JsonProperty("f_channel_id")
    private String fChannelId = "";

    @JsonProperty("f_game_id")
    private Integer fGameId = 0;

    @JsonProperty("f_channel_name")
    private String fChannelName = "";

    @JsonProperty("f_channel_list")
    private String fChannelList = "";

    @JsonProperty("f_channel_device")
    private String fChannelDevice = "";

    @JsonProperty("f_channel_mode")
    private String fChannelMode = "";

    @JsonProperty("data_type")
    private String data_type = "CHANNEL";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfChannelId() {
        return fChannelId;
    }

    public void setfChannelId(String fChannelId) {
        this.fChannelId = fChannelId;
    }

    public Integer getfGameId() {
        return fGameId;
    }

    public void setfGameId(Integer fGameId) {
        this.fGameId = fGameId;
    }

    public String getfChannelDevice() {
        return fChannelDevice;
    }

    public void setfChannelDevice(String fChannelDevice) {
        this.fChannelDevice = fChannelDevice;
    }

    public String getfChannelName() {
        return fChannelName;
    }

    public void setfChannelName(String fChannelName) {
        this.fChannelName = fChannelName;
    }

    public String getfChannelList() {
        return fChannelList;
    }

    public void setfChannelList(String fChannelList) {
        this.fChannelList = fChannelList;
    }

    public String getfChannelMode() {
        return fChannelMode;
    }

    public void setfChannelMode(String fChannelMode) {
        this.fChannelMode = fChannelMode;
    }

    public String getData_type() {
        return data_type;
    }

    public void setData_type(String data_type) {
        this.data_type = data_type;
    }
}
