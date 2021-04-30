package st.jx.webapp.wangyiyun.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author shaotian
 * @date 2021-04-22 15:46
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GameConfig {

    @JsonProperty("f_game_id")
    private Integer fGameId = 0;

    @JsonProperty("f_game_name")
    private String fGameName = "";

    @JsonProperty("data_type")
    private String dataType = "GAME";

    public Integer getfGameId() {
        return fGameId;
    }

    public void setfGameId(Integer fGameId) {
        this.fGameId = fGameId;
    }

    public String getfGameName() {
        return fGameName;
    }

    public void setfGameName(String fGameName) {
        this.fGameName = fGameName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
}
