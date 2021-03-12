package st.jx.webapp.wangyiyun.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

/**
 * 点击日志表
 * @author shaotian
 * @date 2021-03-11 11:50
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdvClickNewLog {

    @JsonProperty("gid")
    private Integer gid;

    @JsonProperty("aid")
    private String aid;

    @JsonProperty("link_code")
    private String linkCode;

    @JsonProperty("channel")
    private String channel;

    @JsonProperty("cid")
    private Integer cid;

    @JsonProperty("device")
    private String device;

    @JsonProperty("oaid")
    private String oaid;

    @JsonProperty("ip")
    private String ip;

    @JsonProperty("os")
    private boolean os;

    @JsonProperty("callback")
    private String callback;

    @JsonProperty("callbacked")
    private boolean callbacked;

    @JsonProperty("time")
    private Timestamp time;

    @JsonProperty("init_aid")
    private String initAid;

    @JsonProperty("mac")
    private String mac;

    @JsonProperty("extra")
    private String extra;

    @JsonProperty("dsp")
    private String dsp;

    @JsonProperty("ua")
    private String ua;

    @JsonProperty("version")
    private String version;

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

    public String getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(String linkCode) {
        this.linkCode = linkCode;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getOaid() {
        return oaid;
    }

    public void setOaid(String oaid) {
        this.oaid = oaid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public boolean isOs() {
        return os;
    }

    public void setOs(boolean os) {
        this.os = os;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public boolean isCallbacked() {
        return callbacked;
    }

    public void setCallbacked(boolean callbacked) {
        this.callbacked = callbacked;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getInitAid() {
        return initAid;
    }

    public void setInitAid(String initAid) {
        this.initAid = initAid;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getDsp() {
        return dsp;
    }

    public void setDsp(String dsp) {
        this.dsp = dsp;
    }

    public String getUa() {
        return ua;
    }

    public void setUa(String ua) {
        this.ua = ua;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "AdvClickNewLog{" +
                "gid=" + gid +
                ", aid='" + aid + '\'' +
                ", linkCode='" + linkCode + '\'' +
                ", channel='" + channel + '\'' +
                ", cid=" + cid +
                ", device='" + device + '\'' +
                ", oaid='" + oaid + '\'' +
                ", ip='" + ip + '\'' +
                ", os=" + os +
                ", callback='" + callback + '\'' +
                ", callbacked=" + callbacked +
                ", time=" + time +
                ", initAid='" + initAid + '\'' +
                ", mac='" + mac + '\'' +
                ", extra='" + extra + '\'' +
                ", dsp='" + dsp + '\'' +
                ", ua='" + ua + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
