package st.jx.webapp.wangyiyun.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author shaotian
 * @date 2021-04-14 18:54
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Record {

    @JsonProperty("id")
    private int id;

    @JsonProperty("date")
    private String date;

    @JsonProperty("gid")
    private String gid;

    @JsonProperty("aid")
    private String aid;

    @JsonProperty("type")
    private String type;

    @JsonProperty("cost")
    private Double cost;

    @JsonProperty("impression")
    private int impression;

    @JsonProperty("click")
    private int click;

    @JsonProperty("adv_account")
    private String advAccount;

    @JsonProperty("adv_entity")
    private String advEntity;

    @JsonProperty("adv_agent")
    private String advAgent;

    @JsonProperty("adminname")
    private String adminName;

    @JsonProperty("updatetime")
    private String updateTime;

    @JsonProperty("checked")
    private int checked;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public int getImpression() {
        return impression;
    }

    public void setImpression(int impression) {
        this.impression = impression;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }

    public String getAdvAccount() {
        return advAccount;
    }

    public void setAdvAccount(String advAccount) {
        this.advAccount = advAccount;
    }

    public String getAdvEntity() {
        return advEntity;
    }

    public void setAdvEntity(String advEntity) {
        this.advEntity = advEntity;
    }

    public String getAdvAgent() {
        return advAgent;
    }

    public void setAdvAgent(String advAgent) {
        this.advAgent = advAgent;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public int getChecked() {
        return checked;
    }

    public void setChecked(int checked) {
        this.checked = checked;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", gid='" + gid + '\'' +
                ", aid='" + aid + '\'' +
                ", type='" + type + '\'' +
                ", cost=" + cost +
                ", impression=" + impression +
                ", click=" + click +
                ", advAccount='" + advAccount + '\'' +
                ", advEntity='" + advEntity + '\'' +
                ", advAgent='" + advAgent + '\'' +
                ", adminName='" + adminName + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", checked=" + checked +
                '}';
    }
}
