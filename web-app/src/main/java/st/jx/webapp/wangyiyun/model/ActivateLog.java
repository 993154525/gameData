package st.jx.webapp.wangyiyun.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 激活日志表
 * @author shaotian
 * @date 2021-03-11 13:42
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActivateLog {

    @JsonProperty("gid")
    private String gid;

    @JsonProperty("site")
    private String site;

    @JsonProperty("sdk_site")
    private String sdkSite;

    @JsonProperty("aid")
    private String aid;

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

    @JsonProperty("device_fr")
    private String deviceFr;

    @JsonProperty("device_imsi")
    private String deviceImsi;

    @JsonProperty("device_model")
    private String deviceModel;

    @JsonProperty("device_resolution")
    private String deviceResolution;

    @JsonProperty("device_version")
    private String deviceVersion;

    @JsonProperty("device_brand")
    private String deviceBrand;

    @JsonProperty("device_net")
    private String deviceNet;

    @JsonProperty("device_other")
    private String deviceOther;

    @JsonProperty("device_idfv")
    private String deviceIdfv;

    @JsonProperty("ext")
    private String ext;

    @JsonProperty("ext_1")
    private String ext_1;

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

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
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

    public String getDeviceFr() {
        return deviceFr;
    }

    public void setDeviceFr(String deviceFr) {
        this.deviceFr = deviceFr;
    }

    public String getDeviceImsi() {
        return deviceImsi;
    }

    public void setDeviceImsi(String deviceImsi) {
        this.deviceImsi = deviceImsi;
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

    public String getDeviceBrand() {
        return deviceBrand;
    }

    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
    }

    public String getDeviceNet() {
        return deviceNet;
    }

    public void setDeviceNet(String deviceNet) {
        this.deviceNet = deviceNet;
    }

    public String getDeviceOther() {
        return deviceOther;
    }

    public void setDeviceOther(String deviceOther) {
        this.deviceOther = deviceOther;
    }

    public String getDeviceIdfv() {
        return deviceIdfv;
    }

    public void setDeviceIdfv(String deviceIdfv) {
        this.deviceIdfv = deviceIdfv;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getExt_1() {
        return ext_1;
    }

    public void setExt_1(String ext_1) {
        this.ext_1 = ext_1;
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
        return "ActivateLog{" +
                "gid='" + gid + '\'' +
                ", site='" + site + '\'' +
                ", sdkSite='" + sdkSite + '\'' +
                ", aid='" + aid + '\'' +
                ", device='" + device + '\'' +
                ", mac='" + mac + '\'' +
                ", gameVersion='" + gameVersion + '\'' +
                ", modelType='" + modelType + '\'' +
                ", ip='" + ip + '\'' +
                ", time='" + time + '\'' +
                ", deviceFr='" + deviceFr + '\'' +
                ", deviceImsi='" + deviceImsi + '\'' +
                ", deviceModel='" + deviceModel + '\'' +
                ", deviceResolution='" + deviceResolution + '\'' +
                ", deviceVersion='" + deviceVersion + '\'' +
                ", deviceBrand='" + deviceBrand + '\'' +
                ", deviceNet='" + deviceNet + '\'' +
                ", deviceOther='" + deviceOther + '\'' +
                ", deviceIdfv='" + deviceIdfv + '\'' +
                ", ext='" + ext + '\'' +
                ", ext_1='" + ext_1 + '\'' +
                ", oaid='" + oaid + '\'' +
                ", dsp='" + dsp + '\'' +
                '}';
    }
}
