package st.jx.webapp.wangyiyun.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleLog {

    @JsonProperty("id")
    private long id;

    @JsonProperty("gid")
    private int gid;

    @JsonProperty("site")
    private String site;

    @JsonProperty("sdk_site")
    private String sdkSite;

    @JsonProperty("sid")
    private String sid;

    @JsonProperty("aid")
    private String aid;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("roleid")
    private String roleId;

    @JsonProperty("rolename")
    private String roleName;

    @JsonProperty("device")
    private String device;

    @JsonProperty("mac")
    private String mac;

    @JsonProperty("gameversion")
    private String gameVersion;

    @JsonProperty("modeltype")
    private String modelType;

    @JsonProperty("ip")
    private String ip;

    @JsonProperty("time")
    private String time;

    @JsonProperty("device_model")
    private String deviceModel;

    @JsonProperty("device_resolution")
    private String deviceResolution;

    @JsonProperty("device_version")
    private String deviceVersion;

    @JsonProperty("device_net")
    private String deviceNet;

    @JsonProperty("ext")
    private String ext;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSdkSite() {
        return sdkSite;
    }

    public void setSdkSite(String sdkSite) {
        this.sdkSite = sdkSite;
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

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public void setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceResolution() {
        return deviceResolution;
    }

    public void setDeviceResolution(String deviceResolution) {
        this.deviceResolution = deviceResolution;
    }

    public String getDeviceVersion() {
        return deviceVersion;
    }

    public void setDeviceVersion(String deviceVersion) {
        this.deviceVersion = deviceVersion;
    }

    public String getDeviceNet() {
        return deviceNet;
    }

    public void setDeviceNet(String deviceNet) {
        this.deviceNet = deviceNet;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }
}
