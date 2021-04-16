package st.jx.webapp.wangyiyun.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * sdk付费表
 * @author shaotian
 * @date 2021-03-17 16:47
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SdkPayment {

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("username")
    private String username;

    @JsonProperty("gid")
    private Integer gid;

    @JsonProperty("site")
    private String site;

    @JsonProperty("sid")
    private String sid;

    @JsonProperty("aid")
    private Long aid;

    @JsonProperty("orderid")
    private String orderId;

    @JsonProperty("extra")
    private String extra;

    @JsonProperty("roleid")
    private String roleId;

    @JsonProperty("rolename")
    private String roleName;

    @JsonProperty("grade")
    private String grade;

    @JsonProperty("amount")
    private double amount;

    @JsonProperty("subject")
    private String subject;

    @JsonProperty("desc")
    private String desc;

    @JsonProperty("productdesc")
    private String productDesc;

    @JsonProperty("productname")
    private String productName;

    @JsonProperty("ctime")
    private String ctime;

    @JsonProperty("mtime")
    private String mtime;

    @JsonProperty("ntime")
    private String nTime;

    @JsonProperty("status")
    private Integer status;

    @JsonProperty("ip")
    private String ip;

    @JsonProperty("payresult")
    private String payResult;

    @JsonProperty("noticestatus")
    private Integer noticeStatus;

    @JsonProperty("noticeresult")
    private String noticeResult;

    @JsonProperty("clientstatus")
    private Integer clientStatus;

    @JsonProperty("cid")
    private Integer cid;

    @JsonProperty("channelid")
    private Integer channelId;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("pay_gold")
    private Integer payGold;

    @JsonProperty("mac")
    private String mac;

    @JsonProperty("device_type")
    private String deviceType;

    @JsonProperty("device")
    private String device;

    @JsonProperty("channel_type")
    private Integer channelType;

    @JsonProperty("pay_type")
    private String payType;

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

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public String getnTime() {
        return nTime;
    }

    public void setnTime(String nTime) {
        this.nTime = nTime;
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

    public String getPayResult() {
        return payResult;
    }

    public void setPayResult(String payResult) {
        this.payResult = payResult;
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

    public Integer getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(Integer clientStatus) {
        this.clientStatus = clientStatus;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getPayGold() {
        return payGold;
    }

    public void setPayGold(Integer payGold) {
        this.payGold = payGold;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public Integer getChannelType() {
        return channelType;
    }

    public void setChannelType(Integer channelType) {
        this.channelType = channelType;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    @Override
    public String toString() {
        return "SdkPayment{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", gid=" + gid +
                ", site='" + site + '\'' +
                ", sid='" + sid + '\'' +
                ", aid=" + aid +
                ", orderId='" + orderId + '\'' +
                ", extra='" + extra + '\'' +
                ", roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", grade='" + grade + '\'' +
                ", amount=" + amount +
                ", subject='" + subject + '\'' +
                ", desc='" + desc + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", productName='" + productName + '\'' +
                ", ctime='" + ctime + '\'' +
                ", mtime='" + mtime + '\'' +
                ", nTime='" + nTime + '\'' +
                ", status=" + status +
                ", ip='" + ip + '\'' +
                ", payResult='" + payResult + '\'' +
                ", noticeStatus=" + noticeStatus +
                ", noticeResult='" + noticeResult + '\'' +
                ", clientStatus=" + clientStatus +
                ", cid=" + cid +
                ", channelId=" + channelId +
                ", currency='" + currency + '\'' +
                ", payGold=" + payGold +
                ", mac='" + mac + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", device='" + device + '\'' +
                ", channelType=" + channelType +
                ", payType='" + payType + '\'' +
                '}';
    }
}
