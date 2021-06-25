package st.jx.webapp.wangyiyun.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SummaryLog {

    @JsonProperty("id")
    private int id;

    @JsonProperty("period")
    private String period;

    @JsonProperty("game_id")
    private int gameId;

    @JsonProperty("channel_id")
    private String channelId;

    @JsonProperty("impression_cnt")
    private int impressionCnt;

    @JsonProperty("click_cnt")
    private int clickCnt;

    @JsonProperty("activate_cnt")
    private int activateCnt;

    @JsonProperty("cost")
    private double cost;

    @JsonProperty("total_cost")
    private double totalCost;

    @JsonProperty("login_user_cnt")
    private int loginUserCnt;

    @JsonProperty("register_cnt")
    private int registerCnt;

    @JsonProperty("old_login_user_cnt")
    private int oldLoginUserCnt;

    @JsonProperty("pay_user_cnt")
    private int payUserCnt;

    @JsonProperty("income_money")
    private double incomeMoney;

    @JsonProperty("total_income_money")
    private double totalIncomeMoney;

    @JsonProperty("offline_income_money")
    private double offlineIncomeMoney;

    @JsonProperty("new_pay_user_cnt")
    private int newPayUserCnt;

    @JsonProperty("new_income_money")
    private double newIncomeMoney;

    @JsonProperty("old_pay_user_cnt")
    private int oldPayUserCnt;

    @JsonProperty("old_income_money")
    private double oldIncomeMoney;

    @JsonProperty("ltv_leiji_income_money")
    private double totalLtv;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public int getImpressionCnt() {
        return impressionCnt;
    }

    public void setImpressionCnt(int impressionCnt) {
        this.impressionCnt = impressionCnt;
    }

    public int getClickCnt() {
        return clickCnt;
    }

    public void setClickCnt(int clickCnt) {
        this.clickCnt = clickCnt;
    }

    public int getActivateCnt() {
        return activateCnt;
    }

    public void setActivateCnt(int activateCnt) {
        this.activateCnt = activateCnt;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public int getLoginUserCnt() {
        return loginUserCnt;
    }

    public void setLoginUserCnt(int loginUserCnt) {
        this.loginUserCnt = loginUserCnt;
    }

    public int getRegisterCnt() {
        return registerCnt;
    }

    public void setRegisterCnt(int registerCnt) {
        this.registerCnt = registerCnt;
    }

    public int getOldLoginUserCnt() {
        return oldLoginUserCnt;
    }

    public void setOldLoginUserCnt(int oldLoginUserCnt) {
        this.oldLoginUserCnt = oldLoginUserCnt;
    }

    public int getPayUserCnt() {
        return payUserCnt;
    }

    public void setPayUserCnt(int payUserCnt) {
        this.payUserCnt = payUserCnt;
    }

    public double getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(double incomeMoney) {
        this.incomeMoney = incomeMoney;
    }

    public double getTotalIncomeMoney() {
        return totalIncomeMoney;
    }

    public void setTotalIncomeMoney(double totalIncomeMoney) {
        this.totalIncomeMoney = totalIncomeMoney;
    }

    public double getOfflineIncomeMoney() {
        return offlineIncomeMoney;
    }

    public void setOfflineIncomeMoney(double offlineIncomeMoney) {
        this.offlineIncomeMoney = offlineIncomeMoney;
    }

    public int getNewPayUserCnt() {
        return newPayUserCnt;
    }

    public void setNewPayUserCnt(int newPayUserCnt) {
        this.newPayUserCnt = newPayUserCnt;
    }

    public double getNewIncomeMoney() {
        return newIncomeMoney;
    }

    public void setNewIncomeMoney(double newIncomeMoney) {
        this.newIncomeMoney = newIncomeMoney;
    }

    public int getOldPayUserCnt() {
        return oldPayUserCnt;
    }

    public void setOldPayUserCnt(int oldPayUserCnt) {
        this.oldPayUserCnt = oldPayUserCnt;
    }

    public double getOldIncomeMoney() {
        return oldIncomeMoney;
    }

    public void setOldIncomeMoney(double oldIncomeMoney) {
        this.oldIncomeMoney = oldIncomeMoney;
    }

    public double getTotalLtv() {
        return totalLtv;
    }

    public void setTotalLtv(double totalLtv) {
        this.totalLtv = totalLtv;
    }
}
