package st.jx.webapp.wangyiyun.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author shaotian
 * @date 2021-03-24 11:17
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayPayment {

    @JsonProperty("uniq")
    private String uniq = "";

    @JsonProperty("uid")
    private String uid = "";

    @JsonProperty("gid")
    private Long gid = 0L;

    @JsonProperty("data_gid")
    private Long dataGid = 0L;

    @JsonProperty("pay_gname")
    private String payGName = "";

    @JsonProperty("pay_money")
    private Double payMoney = 0.0;

    @JsonProperty("pay_server")
    private String payServer = "";

    @JsonProperty("productid")
    private String productId = "";

    @JsonProperty("product_name")
    private String productName = "";

    @JsonProperty("pay_gold")
    private Long payGold = 0L;

    @JsonProperty("pay_type")
    private Integer payType = 0;

    @JsonProperty("pay_type_code")
    private String payTypeCode = "";

    @JsonProperty("pay_entity")
    private String payEntity = "";

    @JsonProperty("pay_userinfo")
    private String payUserinfo = "";

    @JsonProperty("pay_result")
    private String payResult = "";

    @JsonProperty("apple_trans_id")
    private String appleTransId = "";

    @JsonProperty("apple_sandbox")
    private Integer appleSandbox = 0;

    @JsonProperty("test_user")
    private Integer testUser = 0;

    @JsonProperty("is_test")
    private Integer isTest = 0;

    @JsonProperty("ctime")
    private String ctime = "";

    @JsonProperty("mtime")
    private String mtime = "";

    @JsonProperty("pay_time")
    private String payTime = "";

    @JsonProperty("status")
    private Integer status = 0;

    @JsonProperty("ip")
    private String ip = "";

    @JsonProperty("aid")
    private Long aid = 0L;

    @JsonProperty("noticetype")
    private Integer noticeType = 0;

    @JsonProperty("roleid")
    private String roleId = "";

    @JsonProperty("rolename")
    private String roleName = "";

    @JsonProperty("device_type")
    private String deviceType = "";

    @JsonProperty("mac")
    private String mac = "";

    @JsonProperty("cp_order_id")
    private String cpOrderId = "";

    @JsonProperty("notice_status")
    private Integer noticeStatus = 0;

    @JsonProperty("notice_result")
    private String noticeResult = "";

    @JsonProperty("notify_times")
    private Integer notifyTimes = 0;

    @JsonProperty("device")
    private String device = "";

    @JsonProperty("ext")
    private String ext = "";

    @JsonProperty("modeltype")
    private String modelType = "";

    @JsonProperty("resolution")
    private String resolution = "";

    @JsonProperty("net")
    private String net = "";

    @JsonProperty("level")
    private Integer level = 0;

    @JsonProperty("upflag")
    private String upFlag = "";

    public String getUniq() {
        return uniq;
    }

    public void setUniq(String uniq) {
        this.uniq = uniq;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public Long getDataGid() {
        return dataGid;
    }

    public void setDataGid(Long dataGid) {
        this.dataGid = dataGid;
    }

    public String getPayGName() {
        return payGName;
    }

    public void setPayGName(String payGName) {
        this.payGName = payGName;
    }

    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    public String getPayServer() {
        return payServer;
    }

    public void setPayServer(String payServer) {
        this.payServer = payServer;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getPayGold() {
        return payGold;
    }

    public void setPayGold(Long payGold) {
        this.payGold = payGold;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getPayTypeCode() {
        return payTypeCode;
    }

    public void setPayTypeCode(String payTypeCode) {
        this.payTypeCode = payTypeCode;
    }

    public String getPayEntity() {
        return payEntity;
    }

    public void setPayEntity(String payEntity) {
        this.payEntity = payEntity;
    }

    public String getPayUserinfo() {
        return payUserinfo;
    }

    public void setPayUserinfo(String payUserinfo) {
        this.payUserinfo = payUserinfo;
    }

    public String getPayResult() {
        return payResult;
    }

    public void setPayResult(String payResult) {
        this.payResult = payResult;
    }

    public String getAppleTransId() {
        return appleTransId;
    }

    public void setAppleTransId(String appleTransId) {
        this.appleTransId = appleTransId;
    }

    public Integer getAppleSandbox() {
        return appleSandbox;
    }

    public void setAppleSandbox(Integer appleSandbox) {
        this.appleSandbox = appleSandbox;
    }

    public Integer getTestUser() {
        return testUser;
    }

    public void setTestUser(Integer testUser) {
        this.testUser = testUser;
    }

    public Integer getIsTest() {
        return isTest;
    }

    public void setIsTest(Integer isTest) {
        this.isTest = isTest;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getMtime() {
        return mtime;
    }

    public void setMtime(String mtime) {
        this.mtime = mtime;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public Integer getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
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

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getCpOrderId() {
        return cpOrderId;
    }

    public void setCpOrderId(String cpOrderId) {
        this.cpOrderId = cpOrderId;
    }

    public Integer getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(Integer noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    public String getNoticeResult() {
        return noticeResult;
    }

    public void setNoticeResult(String noticeResult) {
        this.noticeResult = noticeResult;
    }

    public Integer getNotifyTimes() {
        return notifyTimes;
    }

    public void setNotifyTimes(Integer notifyTimes) {
        this.notifyTimes = notifyTimes;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getUpFlag() {
        return upFlag;
    }

    public void setUpFlag(String upFlag) {
        this.upFlag = upFlag;
    }

    @Override
    public String toString() {
        return "PayPayment{" +
                "uniq='" + uniq + '\'' +
                ", uid='" + uid + '\'' +
                ", gid=" + gid +
                ", dataGid=" + dataGid +
                ", payGName='" + payGName + '\'' +
                ", payMoney=" + payMoney +
                ", payServer='" + payServer + '\'' +
                ", productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", payGold=" + payGold +
                ", payType=" + payType +
                ", payTypeCode='" + payTypeCode + '\'' +
                ", payEntity='" + payEntity + '\'' +
                ", payUserinfo='" + payUserinfo + '\'' +
                ", payResult='" + payResult + '\'' +
                ", appleTransId='" + appleTransId + '\'' +
                ", appleSandbox=" + appleSandbox +
                ", testUser=" + testUser +
                ", isTest=" + isTest +
                ", ctime='" + ctime + '\'' +
                ", mtime='" + mtime + '\'' +
                ", payTime='" + payTime + '\'' +
                ", status=" + status +
                ", ip='" + ip + '\'' +
                ", aid=" + aid +
                ", noticeType=" + noticeType +
                ", roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", mac='" + mac + '\'' +
                ", cpOrderId='" + cpOrderId + '\'' +
                ", noticeStatus=" + noticeStatus +
                ", noticeResult='" + noticeResult + '\'' +
                ", notifyTimes=" + notifyTimes +
                ", device='" + device + '\'' +
                ", ext='" + ext + '\'' +
                ", modelType='" + modelType + '\'' +
                ", resolution='" + resolution + '\'' +
                ", net='" + net + '\'' +
                ", level=" + level +
                ", upFlag='" + upFlag + '\'' +
                '}';
    }
}
