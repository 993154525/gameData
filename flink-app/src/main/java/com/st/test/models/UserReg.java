package com.st.test.models;

import org.apache.flink.calcite.shaded.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.flink.calcite.shaded.com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

/**
 * @author shaotian
 * @date 2021-03-09 13:44
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserReg {

    @JsonProperty("gid")
    private Integer gid;

    @JsonProperty("aid")
    private String aid;

    @JsonProperty("sid")
    private String sid;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("username")
    private String username;

    @JsonProperty("roleid")
    private String roleId;

    @JsonProperty("rolename")
    private String roleName;

    @JsonProperty("ip")
    private String ip;

    @JsonProperty("idfa")
    private String idfa;

    @JsonProperty("oaid")
    private String oaid;

    @JsonProperty("device_type")
    private String deviceType;

    @JsonProperty("time")
    private Timestamp time;

    @JsonProperty("mac")
    private String mac;

    @JsonProperty("keyword_id")
    private String keywordId;

    @JsonProperty("ext2")
    private String ext2;

    @JsonProperty("activate_id")
    private int activateId;

    @JsonProperty("ext1")
    private String ext1;

    @JsonProperty("dsp")
    private String dsp;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIdfa() {
        return idfa;
    }

    public void setIdfa(String idfa) {
        this.idfa = idfa;
    }

    public String getOaid() {
        return oaid;
    }

    public void setOaid(String oaid) {
        this.oaid = oaid;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(String keywordId) {
        this.keywordId = keywordId;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public int getActivateId() {
        return activateId;
    }

    public void setActivateId(int activateId) {
        this.activateId = activateId;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getDsp() {
        return dsp;
    }

    public void setDsp(String dsp) {
        this.dsp = dsp;
    }
}
