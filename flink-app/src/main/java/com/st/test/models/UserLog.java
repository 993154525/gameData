package com.st.test.models;

import org.apache.flink.calcite.shaded.com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.flink.calcite.shaded.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.flink.calcite.shaded.com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.flink.calcite.shaded.com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 登录日志表
 *
 * @author shaotian
 * @date 2021-03-11 13:48
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserLog {

    @JsonProperty("gid")
    private Integer gid = 0;

    @JsonProperty("sid")
    private String sid = "";

    @JsonProperty("aid")
    private String aid = "";

    @JsonProperty("uid")
    private String uid = "";

    @JsonProperty("username")
    private String username = "";

    @JsonProperty("roleid")
    private String roleId = "";

    @JsonProperty("rolename")
    private String roleName = "";

    @JsonProperty("vip")
    private String vipSource = "";

    @JsonIgnore
    private Long vip = 0L;

    @JsonProperty("onlinetime")
    private String onlineTimeSource = "";

    @JsonIgnore
    private Long onlineTime = 0L;

    @JsonProperty("time")
    private String time = "";

    @JsonProperty("level")
    private String levelSource = "";

    @JsonIgnore
    private Long level = 0L;

    @JsonProperty("ip")
    private String ip = "";

    @JsonProperty("device_type")
    private String deviceType = "";

    @JsonProperty("device_brand")
    private String deviceBrand = "";

    @JsonProperty("modelType")
    private String modelType = "";

    @JsonProperty("device_resolution")
    private String deviceResolution = "";

    @JsonProperty("device_net")
    private String deviceNet = "";

    @JsonProperty("sdk_version")
    private String sdkVersion = "";

    @JsonProperty("reg_time")
    private String regTime = "";

    @JsonProperty("init_aid")
    private String initAid = "";

    @JsonProperty("oaid")
    private String oaid = "";

    @JsonProperty("dsp")
    private String dsp = "";


    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
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

    public String getVipSource() {
        return vipSource;
    }

    public void setVipSource(String vipSource) {
        this.vipSource = vipSource;
    }

    public Long getVip() {
        return vip;
    }

    public void setVip(Long vip) {
        this.vip = vip;
    }

    public String getOnlineTimeSource() {
        return onlineTimeSource;
    }

    public void setOnlineTimeSource(String onlineTimeSource) {
        this.onlineTimeSource = onlineTimeSource;
    }

    public Long getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Long onlineTime) {
        this.onlineTime = onlineTime;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLevelSource() {
        return levelSource;
    }

    public void setLevelSource(String levelSource) {
        this.levelSource = levelSource;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
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
                "gid=" + gid +
                ", sid='" + sid + '\'' +
                ", aid='" + aid + '\'' +
                ", uid='" + uid + '\'' +
                ", username='" + username + '\'' +
                ", roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", vipSource='" + vipSource + '\'' +
                ", vip=" + vip +
                ", onlineTimeSource='" + onlineTimeSource + '\'' +
                ", onlineTime=" + onlineTime +
                ", time='" + time + '\'' +
                ", levelSource='" + levelSource + '\'' +
                ", level=" + level +
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
