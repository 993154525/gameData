package st.jx.webapp.wangyiyun.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @author shaotian
 * @date 2021-03-09 13:44
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity(name = "user_reg")
public class UserReg {

    @Id
    @GeneratedValue
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("gid")
    @Column
    private Integer gid;

    @JsonProperty("aid")
    @Column
    private String aid;

    @JsonProperty("sid")
    @Column
    private String sid;

    @JsonProperty("uid")
    @Column
    private String uid;

    @JsonProperty("username")
    @Column
    private String username;

    @JsonProperty("roleid")
    @Column
    private String roleId;

    @JsonProperty("rolename")
    @Column
    private String roleName;

    @JsonProperty("ip")
    @Column
    private String ip;

    @JsonProperty("idfa")
    @Column
    private String idfa;

    @JsonProperty("oaid")
    @Column
    private String oaid;

    @JsonProperty("device_type")
    @Column
    private String deviceType;

    @JsonProperty("time")
    @Column
    private Timestamp time;

    @JsonProperty("mac")
    @Column
    private String mac;

    @JsonProperty("keyword_id")
    @Column
    private String keywordId;

    @JsonProperty("ext2")
    @Column
    private String ext2;

    @JsonProperty("activate_id")
    @Column
    private int activateId;

    @JsonProperty("ext1")
    @Column
    private String ext1;

    @JsonProperty("dsp")
    @Column
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
