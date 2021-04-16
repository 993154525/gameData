package st.jx.webapp.wangyiyun.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 订单日志表
 * @author shaotian
 * @date 2021-03-11 11:55
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IncomeLog {

    @JsonProperty("gid")
    private int gid;

    @JsonProperty("sid")
    private String sid;

    @JsonProperty("aid")
    private String aid;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("uniq")
    private String uniq;

    @JsonProperty("cp_order_id")
    private String cpOrderId;

    @JsonProperty("trans_order_id")
    private String transOrderId;

    @JsonProperty("username")
    private String username;

    @JsonProperty("roleid")
    private String roleId;

    @JsonProperty("rolename")
    private String roleName;

    @JsonProperty("level")
    private int level;

    @JsonProperty("device_type")
    private String deviceType;

    @JsonProperty("ip")
    private String ip;

    @JsonProperty("income_channel")
    private String incomeChannel;

    @JsonProperty("pay_entity")
    private String payEntity;

    @JsonProperty("income_money")
    private float incomeMoney;

    @JsonProperty("income_status")
    private String incomeStatus;

    @JsonProperty("income_time")
    private String incomeTime;

    @JsonProperty("reg_date")
    private String regDate;

    @JsonProperty("ly_flag")
    private int lyFlag;

    @JsonProperty("init_aid")
    private String initAid;

    @JsonProperty("income_gold")
    private int incomeGold;

    @JsonProperty("own_gold")
    private int ownGold;

    @JsonProperty("income_currency")
    private String incomeCurrency;

    @JsonProperty("dsp")
    private String dsp;

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUniq() {
        return uniq;
    }

    public void setUniq(String uniq) {
        this.uniq = uniq;
    }

    public String getCpOrderId() {
        return cpOrderId;
    }

    public void setCpOrderId(String cpOrderId) {
        this.cpOrderId = cpOrderId;
    }

    public String getTransOrderId() {
        return transOrderId;
    }

    public void setTransOrderId(String transOrderId) {
        this.transOrderId = transOrderId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIncomeChannel() {
        return incomeChannel;
    }

    public void setIncomeChannel(String incomeChannel) {
        this.incomeChannel = incomeChannel;
    }

    public String getPayEntity() {
        return payEntity;
    }

    public void setPayEntity(String payEntity) {
        this.payEntity = payEntity;
    }

    public float getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(float incomeMoney) {
        this.incomeMoney = incomeMoney;
    }

    public String getIncomeStatus() {
        return incomeStatus;
    }

    public void setIncomeStatus(String incomeStatus) {
        this.incomeStatus = incomeStatus;
    }

    public String getIncomeTime() {
        return incomeTime;
    }

    public void setIncomeTime(String incomeTime) {
        this.incomeTime = incomeTime;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public int getLyFlag() {
        return lyFlag;
    }

    public void setLyFlag(int lyFlag) {
        this.lyFlag = lyFlag;
    }

    public String getInitAid() {
        return initAid;
    }

    public void setInitAid(String initAid) {
        this.initAid = initAid;
    }

    public int getIncomeGold() {
        return incomeGold;
    }

    public void setIncomeGold(int incomeGold) {
        this.incomeGold = incomeGold;
    }

    public int getOwnGold() {
        return ownGold;
    }

    public void setOwnGold(int ownGold) {
        this.ownGold = ownGold;
    }

    public String getIncomeCurrency() {
        return incomeCurrency;
    }

    public void setIncomeCurrency(String incomeCurrency) {
        this.incomeCurrency = incomeCurrency;
    }

    public String getDsp() {
        return dsp;
    }

    public void setDsp(String dsp) {
        this.dsp = dsp;
    }

    @Override
    public String toString() {
        return "IncomeLog{" +
                "gid='" + gid + '\'' +
                ", sid='" + sid + '\'' +
                ", aid='" + aid + '\'' +
                ", uid='" + uid + '\'' +
                ", orderId='" + orderId + '\'' +
                ", uniq='" + uniq + '\'' +
                ", cpOrderId='" + cpOrderId + '\'' +
                ", transOrderId='" + transOrderId + '\'' +
                ", username='" + username + '\'' +
                ", roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", level='" + level + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", ip='" + ip + '\'' +
                ", incomeChannel='" + incomeChannel + '\'' +
                ", payEntity='" + payEntity + '\'' +
                ", incomeMoney='" + incomeMoney + '\'' +
                ", incomeStatus='" + incomeStatus + '\'' +
                ", incomeTime='" + incomeTime + '\'' +
                ", regDate='" + regDate + '\'' +
                ", lyFlag='" + lyFlag + '\'' +
                ", initAid='" + initAid + '\'' +
                ", incomeGold='" + incomeGold + '\'' +
                ", ownGold='" + ownGold + '\'' +
                ", incomeCurrency='" + incomeCurrency + '\'' +
                ", dsp='" + dsp + '\'' +
                '}';
    }
}
