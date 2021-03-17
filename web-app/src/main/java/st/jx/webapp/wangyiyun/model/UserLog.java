package st.jx.webapp.wangyiyun.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 登录日志表
 *
 * @author shaotian
 * @date 2021-03-11 13:48
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserLog {

    @JsonProperty("gid")
    private String gid;

    @JsonProperty("sid")
    private String sid;

    @JsonProperty("aid")
    private String aid;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("username")
    private String username;

    @JsonProperty("roleid")
    private String roleId;

    @JsonProperty("rolename")
    private String roleName;

    @JsonProperty("vip")
    private String vip;

    @JsonProperty("onlinetime")
    private String onlineTime;

    @JsonProperty("time")
    private String time;

    @JsonProperty("level")
    private String level;

    @JsonProperty("ip")
    private String ip;

    @JsonProperty("device_type")
    private String deviceType;

    @JsonProperty("device_brand")
    private String deviceBrand;

    @JsonProperty("modelType")
    private String modelType;

    @JsonProperty("device_resolution")
    private String deviceResolution;

    @JsonProperty("device_net")
    private String deviceNet;

    @JsonProperty("sdk_version")
    private String sdkVersion;

    @JsonProperty("reg_time")
    private String regTime;

    @JsonProperty("init_aid")
    private String initAid;

    @JsonProperty("oaid")
    private String oaid;

    @JsonProperty("dsp")
    private String dsp;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
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

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(String onlineTime) {
        this.onlineTime = onlineTime;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceBrand() {
        return deviceBrand;
    }

    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getDeviceResolution() {
        return deviceResolution;
    }

    public void setDeviceResolution(String deviceResolution) {
        this.deviceResolution = deviceResolution;
    }

    public String getDeviceNet() {
        return deviceNet;
    }

    public void setDeviceNet(String deviceNet) {
        this.deviceNet = deviceNet;
    }

    public String getSdkVersion() {
        return sdkVersion;
    }

    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public String getInitAid() {
        return initAid;
    }

    public void setInitAid(String initAid) {
        this.initAid = initAid;
    }

    public String getOaid() {
        return oaid;
    }

    public void setOaid(String oaid) {
        this.oaid = oaid;
    }

    public String getDsp() {
        return dsp;
    }

    public void setDsp(String dsp) {
        this.dsp = dsp;
    }

    @Override
    public String toString() {
        return "UserLog{" +
                "gid='" + gid + '\'' +
                ", sid='" + sid + '\'' +
                ", aid='" + aid + '\'' +
                ", uid='" + uid + '\'' +
                ", username='" + username + '\'' +
                ", roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", vip='" + vip + '\'' +
                ", onlineTime='" + onlineTime + '\'' +
                ", time='" + time + '\'' +
                ", level='" + level + '\'' +
                ", ip='" + ip + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", deviceBrand='" + deviceBrand + '\'' +
                ", modelType='" + modelType + '\'' +
                ", deviceResolution='" + deviceResolution + '\'' +
                ", deviceNet='" + deviceNet + '\'' +
                ", sdkVersion='" + sdkVersion + '\'' +
                ", regTime='" + regTime + '\'' +
                ", initAid='" + initAid + '\'' +
                ", oaid='" + oaid + '\'' +
                ", dsp='" + dsp + '\'' +
                '}';
    }
}
