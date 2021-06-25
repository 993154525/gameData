package com.st.test.utils;

/**
 * sql存储区域
 *
 * @author shaotian
 * @date 2021-03-11 18:05
 */
public class SqlStore {

    public static final String NO_PRINT = "00000000-0000-0000-0000-000000000000";

    public static final String ERROR_TIME = "0000-00-00 00:00:00";

    public static final String PRE_IOS = "91";

    public static final String PRE_ANDROID = "93";

    public static final String INSERT_CLINK_SQL = "INSERT INTO " +
            "adv_click_new_log_?" +
            "(`gid`, `aid`, `link_code`, `channel`, `cid`, `device`, " +
            "`oaid`, `ip`, `os`, `callback`, `callbacked`, `time`, " +
            "`init_aid`, `mac`, `extra`, `dsp`, `ua`, `version`) " +
            "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) " +
            "ON DUPLICATE KEY UPDATE version = VALUES(`version`)";

    public static final String INSERT_ACT_SQL = "INSERT INTO " +
            "log_activate_?" +
            "(`gid`, `site`, `sdk_site`, `aid`, `device`, " +
            "`mac`, `gameversion`, `modeltype`, `ip`, `time`, " +
            "`device_fr`, `device_imsi`, `device_model`, `device_resolution`, " +
            "`device_version`, `device_brand`, `device_net`, `device_other`, " +
            "`device_idfv`, `ext`, `ext_1`, `oaid`, `dsp`) " +
            "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) " +
            "ON DUPLICATE KEY UPDATE `ext_1` = VALUES(`ext_1`),`aid` = VALUES(`aid`),`dsp` = VALUES(`dsp`)";

    public static final String INSERT_REG_SQL = "INSERT INTO " +
            "`user_reg`(`gid`, `aid`, " +
            "`sid`, `uid`, `username`, `roleid`, `rolename`, " +
            "`ip`, `idfa`, `oaid`, `device_type`, `time`, `mac`, " +
            "`keyword_id`, `ext2`, `activate_id`, `ext1`, `dsp`,`first_aid`) " +
            "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) " +
            "ON DUPLICATE KEY UPDATE `ext2` = VALUES(`ext2`),`activate_id` = VALUES(`activate_id`)" +
            ",`aid` = VALUES(`aid`),`dsp` = VALUES(`dsp`)";

    public static final String INSERT_LOGIN_SQL = "INSERT INTO " +
            "user_login_23_?(`gid`, `sid`, `aid`, `uid`, " +
            "`username`, `roleid`, `rolename`, `vip`, " +
            "`onlinetime`, `time`, `level`, `ip`, `device_type`, " +
            "`device_brand`, `modelType`, `device_resolution`, `device_net`, " +
            "`sdk_version`, `reg_time`, `init_aid`, `oaid`, `dsp`) " +
            "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) " +
            "ON DUPLICATE KEY UPDATE `aid` = VALUES(`aid`),`dsp` = VALUES(`dsp`)";

    public static final String INSERT_PAY_INCOME = "INSERT INTO " +
            "`income_log`(`gid`, `sid`, `aid`, " +
            "`uid`, `order_id`, `uniq`, `cp_order_id`, `trans_order_id`, " +
            "`username`, `roleid`, `rolename`, `level`, `device_type`, `ip`, " +
            "`income_channel`, `pay_entity`, `income_money`, `income_status`, " +
            "`income_time`, `reg_date`, `ly_flag`, `init_aid`, `income_gold`, " +
            "`own_gold`, `income_currency`, `dsp`) " +
            "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) " +
            "ON DUPLICATE KEY UPDATE `income_status`=VALUES(`income_status`)," +
            "`income_channel`=VALUES(`income_channel`),`pay_entity`=VALUES(`pay_entity`)," +
            "`reg_date`=VALUES(`reg_date`),`dsp`=VALUES(`dsp`),`device_type` = VALUES(`device_type`)";

    public static final String INSERT_PAY_INCOME_CHECK = "INSERT INTO " +
            "`income_log_check`(`gid`, `sid`, `aid`, " +
            "`uid`, `order_id`, `uniq`, `cp_order_id`, `trans_order_id`, " +
            "`username`, `roleid`, `rolename`, `level`, `device_type`, `ip`, " +
            "`income_channel`, `pay_entity`, `income_money`, `income_status`, " +
            "`income_time`, `reg_date`, `ly_flag`, `init_aid`, `income_gold`, " +
            "`income_currency`, `dsp`) " +
            "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) " +
            "ON DUPLICATE KEY UPDATE `income_status`=VALUES(`income_status`)," +
            "`income_channel`=VALUES(`income_channel`),`pay_entity`=VALUES(`pay_entity`)," +
            "`reg_date`=VALUES(`reg_date`),`dsp`=VALUES(`dsp`)";

    public static final String INSERT_INCOME_SQL = "INSERT INTO " +
            "`income_log`(`gid`, `sid`, `aid`, " +
            "`uid`, `order_id`, `uniq`, `cp_order_id`, `trans_order_id`, " +
            "`username`, `roleid`, `rolename`, `level`, `device_type`, `ip`, " +
            "`income_channel`, `pay_entity`, `income_money`, `income_status`, " +
            "`income_time`, `reg_date`, `ly_flag`, `init_aid`, `income_gold`, " +
            "`own_gold`, `income_currency`, `dsp`) " +
            "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) " +
            "ON DUPLICATE KEY UPDATE income_status = VALUES(`income_status`)";

    public static final String INSERT_DATA_COST_SQL = "INSERT INTO " +
            "`tp_data_cost`(`period`, `game_id`, " +
            "`channel_id`, `cost`, `total_cost`) " +
            "VALUES (?, ?, ?, ?, ?) " +
            "ON DUPLICATE KEY UPDATE " +
            "`cost` = VALUES(`cost`)," +
            "`total_cost` = VALUES(`total_cost`)";

    public static final String INSERT_DATA_INCOME_SQL = "INSERT INTO " +
            "`tp_data_income`(`period`, `game_id`, " +
            "`channel_id`, `income_money`, `total_income_money`) " +
            "VALUES (?, ?, ?, ?, ?) " +
            "ON DUPLICATE KEY UPDATE " +
            "`income_money` = VALUES(`income_money`)," +
            "`total_income_money` = VALUES(`total_income_money`)";

    public static final String INSERT_SUMMARY_VIEW_KEEP = "INSERT INTO " +
            "`tp_data_summary_view`(`period`, `game_id`, `channel_id`, keep_?) " +
            "VALUES (?, ?, ?, ?) " +
            "ON DUPLICATE KEY UPDATE " +
            "keep_? = VALUES(keep_?)";

    public static final String INSERT_SUMMARY_TOTAL_LTV = "INSERT INTO " +
            "`tp_data_summary_view`(`period`, `channel_id`, `game_id`, ltv_leiji_income_money) " +
            "VALUES (?, ?, ?, ?) " +
            "ON DUPLICATE KEY UPDATE " +
            "ltv_leiji_income_money = VALUES(ltv_leiji_income_money)";

    public static final String INSERT_SUMMARY_VIEW_RECORD = "INSERT INTO " +
            "`tp_data_summary_view`(`period`, `game_id`, " +
            "`channel_id`, `cost`, `total_cost`,`impression_cnt`) " +
            "VALUES (?, ?, ?, ?, ? ,?) " +
            "ON DUPLICATE KEY UPDATE " +
            "`cost` = VALUES(`cost`)," +
            "`total_cost` = VALUES(`total_cost`)," +
            "`impression_cnt` = VALUES(`impression_cnt`)";

    public static final String SELECT_ACT_MATCH_IP = "select id,aid,dsp " +
            "from adv_click_new_log_? " +
            "where (`ip` = ? " +
            "AND time BETWEEN ? AND ?) " +
            "AND init_aid = ? " +
            "AND channel != 'default' " +
            "ORDER BY time desc ";

    public static final String SELECT_ACT_WX_DEVICE = "select id,aid,dsp " +
            "from adv_click_new_log_? " +
            "where (`device` = ? " +
            "AND time BETWEEN ? AND ? " +
            "AND gid = ?) " +
            "AND channel = 'wxxyx' " +
            "ORDER BY time desc ";

    public static final String SELECT_REG_MATCH_ACT = "select id,aid,dsp " +
            "from log_activate_? " +
            "where device = ? " +
            "AND ext_1 = ? " +
            "AND time BETWEEN ? AND ? ";

    public static final String SELECT_REG_MATCH_CLICK = "select id,aid,dsp " +
            "from adv_click_new_log_? FORCE index(ip) where " +
            "(`ip` = ? " +
            "AND time BETWEEN ? AND ?) " +
            "AND `init_aid` = ? " +
            "AND channel != 'default' " +
            "ORDER BY time desc";

    public static final String SELECT_LOGIN_MATCH_REG = "select aid,dsp " +
            "from user_reg " +
            "where uid = ? AND ext1 = ? ";

    public static final String SELECT_INCOME_MATCH_REG = "select aid,dsp,time " +
            "from user_reg " +
            "where uid = ? AND ext1 = ? ";

    public static final String SELECT_SDK_CHANNEL_INFO = "select " +
            "game from ty_sdk_channel_info " +
            "where id = ?";

    public static final String SELECT_SDK_CHANNEL_ID = "select channelid " +
            "from sdk_payment where orderid = ? ";

    public static final String SELECT_PAY_TYPES_CODE = "select code from " +
            "pay_types and id = ? ";

    public static final String SELECT_SDK_PAY_ENTITIES = "SELECT ent.name " +
            "from pay_entities as ent LEFT JOIN " +
            "pay_game_config as conf " +
            "ON conf.entity_id = ent.id " +
            "where conf.game_id = ? " +
            "and conf.pay_type_id= 6 " +
            "and conf.type = ? " +
            "and ent.pay_type_id= 6";

    public static final String SELECT_PAY_PAYMENT_ENTITIES = "SELECT ent.name " +
            "from pay_entities as ent " +
            "LEFT JOIN " +
            "pay_game_config as conf " +
            "ON conf.entity_id = ent.id " +
            "where conf.mark = ? " +
            "and conf.pay_type_id= 1 " +
            "and conf.type = 0";

    public static final String SELECT_TOTAL_COST_MAX = "SELECT total_cost " +
            "FROM `tp_data_cost` " +
            "WHERE period = ? " +
            "AND game_id = ? " +
            "AND channel_id = ?";

    public static final String SELECT_TOTAL_COST = "SELECT * " +
            "FROM `tp_data_cost` " +
            "WHERE period = ? " +
            "AND game_id = ? " +
            "AND channel_id = ?";

    public static final String SELECT_TOTAL_INCOME_MAX = "SELECT MAX(total_income_money) " +
            "FROM `tp_data_income` " +
            "WHERE game_id = ? " +
            "AND channel_id = ? " +
            "AND period < ?";

    public static final String SELECT_TOTAL_INCOME = "SELECT * " +
            "FROM `tp_data_income` " +
            "WHERE period = ? " +
            "AND game_id = ? " +
            "AND channel_id = ?";

    public static final String SELECT_PAYMENT_ISNULL = "select id from " +
            "pay_payment " +
            "where cp_order_id = ?";

    public static final String SELECT_INCOME_ISNULL = "select id from " +
            "income_log " +
            "where gid = ? " +
            "AND cp_order_id = ?";

    public static final String COLLECT_COST_RECORD = "select " +
            "`date`,`gid`,`aid`,sum(cost) as cost,sum(impression) as impression_cnt " +
            "from data_cost_record " +
            "WHERE `date` = ? AND `gid` = ? AND `aid` = ? " +
            "GROUP BY `date`,`gid`,`aid`";

    public static final String SELECT_GAME_ISNULL = "SELECT id " +
            "FROM " +
            "tp_data_summary_view " +
            "WHERE period <= ? " +
            "AND game_id = ? " +
            "AND f_game_name = ? " +
            "limit 1";

    public static final String SELECT_INCOME_GAME_CHECK = "SELECT MIN(period),MAX(period) " +
            "FROM " +
            "tp_data_summary_view " +
            "WHERE game_id = ? ";

    public static final String SELECT_CHANNEL_ISNULL = "SELECT id " +
            "FROM " +
            "tp_data_summary_view " +
            "WHERE (period = ? " +
            "AND channel_id = ? " +
            "AND game_id = ?) " +
            "AND f_game_channel = ? " +
            "AND f_game_pack = ? " +
            "AND f_game_device = ? " +
            "AND f_game_mode = ? " +
            "limit 1";

    public static final String SELECT_SUMMARY_VIEW = "SELECT `cost`,`register_cnt`,`ltv_leiji_income_money`," +
            "`f_game_name`, `f_game_channel`, `f_game_pack`, `f_game_device`, `f_game_mode` " +
            "FROM " +
            "tp_data_summary_view " +
            "WHERE period = ? " +
            "AND channel_id = ? " +
            "AND game_id = ? ";

    public static final String UPDATE_INCOME_STATUS = "UPDATE income_log " +
            "SET income_status = ? " +
            "WHERE gid = ? " +
            "AND order_id = ?";

    public static final String LTV_INCOME_TOTAL = "SELECT SUM(income_money) " +
            "FROM tp_data_ltv " +
            "WHERE period = ? " +
            "AND channel_id = ? " +
            "AND game_id = ? " +
            "GROUP BY period,channel_id,game_id";

    public static final String UPDATE_SUMMARY_GAME = "update " +
            "tp_data_summary_view " +
            "SET f_game_name = ? " +
            "WHERE period BETWEEN ? AND ? " +
            "AND game_id = ?";

    public static final String UPDATE_SUMMARY_CHANNEL = "update " +
            "tp_data_summary_view " +
            "SET f_game_name = ?," +
            "f_game_channel = ?," +
            "f_game_pack = ?," +
            "f_game_device = ?," +
            "f_game_mode = ? " +
            "WHERE period BETWEEN ? AND ? " +
            "AND channel_id = ? " +
            "AND game_id = ?";

    public static final String UPDATE_SINGLE_CHANNEL = "update " +
            "tp_data_single_server_new " +
            "SET f_game_channel = ? " +
            "WHERE period BETWEEN ? AND ? " +
            "AND channel_id = ? " +
            "AND game_id = ?";

    public static final String SELECT_SUMMARY_INFO = "select period,channel_id,game_id " +
            "from %s " +
            "WHERE period BETWEEN ? AND ? " +
            "AND channel_id != ''";

    public static final String SELECT_LTV_INFO = "select period,channel_id,game_id,ltv_day,income_money " +
            "from tp_data_ltv " +
            "WHERE income_period BETWEEN ? AND ? ";

    public static final String SELECT_LTV_INFO_SUM = "select period,channel_id,game_id,sum(income_money) " +
            "from tp_data_ltv " +
            "WHERE period BETWEEN ? AND ? " +
            "GROUP BY period,channel_id,game_id";

    public static final String SELECT_CHANNEL_INFO = "select f_channel_id,f_game_id,f_channel_name," +
            "f_channel_list,f_channel_device,f_channel_mode " +
            "from config_channel";

    public static final String SELECT_GAME_INFO = "select f_game_id,f_game_name " +
            "from config_game";

    public static final String UPDATE_SUMMARY_CHANNEL_INFO = "update " +
            "%s " +
            "SET f_game_name = ?," +
            "f_game_channel = ?," +
            "f_game_pack = ?," +
            "f_game_device = ?," +
            "f_game_mode = ? " +
            "WHERE period = ? " +
            "AND channel_id = ? " +
            "AND game_id = ?";

    public static final String INSERT_SUMMARY_LTV_INCOME = "insert into " +
            "tp_data_ltv_summary(`period`,`channel_id`,`game_id`,income_?) " +
            "VALUES(?,?,?,?) " +
            "ON DUPLICATE KEY UPDATE income_?=VALUES(income_?)";

    public static final String INSERT_SUMMARY_LTV_VIEW = "insert into " +
            "tp_data_ltv_summary(`period`,`channel_id`,`game_id`," +
            "`cost`,`register_cnt`,`total_ltv`," +
            "`f_game_name`,`f_game_channel`,`f_game_pack`,`f_game_device`," +
            "`f_game_mode`) VALUES(?,?,?,?,?,?,?,?,?,?,?) " +
            "ON DUPLICATE KEY UPDATE `cost`=VALUES(`cost`)," +
            "`register_cnt`=VALUES(`register_cnt`),`total_ltv`=VALUES(`total_ltv`)," +
            "`f_game_name`=VALUES(`f_game_name`),`f_game_channel`=VALUES(`f_game_channel`)," +
            "`f_game_pack`=VALUES(`f_game_pack`),`f_game_device`=VALUES(`f_game_device`)," +
            "`f_game_mode`=VALUES(`f_game_mode`)";

    public static final String INSERT_SUMMARY_KEEP_VIEW = "insert into " +
            "tp_data_keep_summary(`period`,`channel_id`,`game_id`," +
            "`register_cnt`,`pay_user_cnt`," +
            "`f_game_name`,`f_game_channel`,`f_game_pack`,`f_game_device`," +
            "`f_game_mode`) VALUES(?,?,?,?,?,?,?,?,?,?) " +
            "ON DUPLICATE KEY UPDATE `pay_user_cnt`=VALUES(`pay_user_cnt`)," +
            "`register_cnt`=VALUES(`register_cnt`),`f_game_name`=VALUES(`f_game_name`)" +
            ",`f_game_channel`=VALUES(`f_game_channel`),`f_game_pack`=VALUES(`f_game_pack`)" +
            ",`f_game_device`=VALUES(`f_game_device`),`f_game_mode`=VALUES(`f_game_mode`)";

    public static final String INSERT_SUMMARY_LTV_TOTAL = "insert into " +
            "tp_data_ltv_summary(`period`,`channel_id`,`game_id`,`cost`,`register_cnt`," +
            "`total_ltv`,`f_game_name`,`f_game_channel`,`f_game_pack`," +
            "`f_game_device`,`f_game_mode`,income_?) VALUES(?,?,?,?,?,?,?,?,?,?,?,?) " +
            "ON DUPLICATE KEY UPDATE `cost`=VALUES(`cost`)," +
            "`register_cnt`=VALUES(`register_cnt`),`total_ltv`=VALUES(`total_ltv`)," +
            "`f_game_name`=VALUES(`f_game_name`),`f_game_channel`=VALUES(`f_game_channel`)," +
            "`f_game_pack`=VALUES(`f_game_pack`),`f_game_device`=VALUES(`f_game_device`)," +
            "`f_game_mode`=VALUES(`f_game_mode`),income_?=VALUES(income_?)";

    public static final String SELECT_PAY_MIN_TIME = "select min(income_time) as income_time " +
            "from income_log " +
            "where gid = ?" +
            "AND aid = ? " +
            "AND uid = ?";

    public static final String INSERT_PAY_REGISTER = "INSERT INTO `payment_register`" +
            "(`game_id`, `channel_id`, `uid`, `reg_date`, `first_income_date`) " +
            "VALUES (?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE " +
            "`reg_date`=VALUES(`reg_date`),`first_income_date`=VALUES(`first_income_date`)";

    public static final String SELECT_SINGLE_SUMMARY = "SELECT `period`, `game_id`, `channel_id`, `server_id`, `login_user_cnt`, " +
            "`register_cnt`, `pay_user_cnt`, `income_money`, `new_pay_user_cnt`, `new_income_money`, " +
            "`keep_1`, `keep_3`, `keep_7` " +
            "FROM tp_data_single_server " +
            "where period between ? and ?";

    public static final String INSERT_SINGLE_SUMMARY = "insert into " +
            "tp_data_single_server_new(`period`,`game_id`,`channel_id`,`server_id`," +
            "`login_user_cnt`,`register_cnt`,`pay_user_cnt`,`income_money`,`new_pay_user_cnt`," +
            "`new_income_money`,`keep_1`,`keep_3`,`keep_7`,`f_game_name`,`f_game_channel`,`f_game_pack`," +
            "`f_game_device`,`f_game_mode`) " +
            "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) " +
            "ON DUPLICATE KEY UPDATE " +
            "`login_user_cnt`=VALUES(`login_user_cnt`),`register_cnt`=VALUES(`register_cnt`),`pay_user_cnt`=VALUES(`pay_user_cnt`)," +
            "`income_money`=VALUES(`income_money`),`new_pay_user_cnt`=VALUES(`new_pay_user_cnt`)," +
            "`new_income_money`=VALUES(`new_income_money`),`keep_1`=VALUES(`keep_1`),`keep_3`=VALUES(`keep_3`),`keep_7`=VALUES(`keep_7`)," +
            "`f_game_name`=VALUES(`f_game_name`),`f_game_channel`=VALUES(`f_game_channel`)";

    /**
     * 写入注册留存
     */
    public static final String INSERT_REGISTER_KEEP_DAY = "INSERT INTO " +
            "`tp_data_keep_day`(`period`, `game_id`, `channel_id`," +
            "`f_game_name`,`f_game_channel`,`f_game_pack`,`f_game_device`,`f_game_mode`," +
            "`register_cnt`,`pay_user_cnt`," +
            "keep_?) " +
            "VALUES (?,?,?,?,?,?,?,?,?,?,?) " +
            "ON DUPLICATE KEY UPDATE " +
            "register_cnt = VALUES(register_cnt)," +
            "pay_user_cnt = VALUES(pay_user_cnt)," +
            "keep_? = VALUES(keep_?)";
    /**
     * 写入付费留存
     */
    public static final String INSERT_PAY_KEEP_DAY = "INSERT INTO " +
            "`tp_data_keep_summary`(`period`, `game_id`, `channel_id`," +
            "pay_?) " +
            "VALUES (?,?,?,?) " +
            "ON DUPLICATE KEY UPDATE " +
            "pay_? = VALUES(pay_?)";
    /**
     * 筛选历史注册留存
     */
    public static final String SELECT_REGISTER_KEEP_DAY = "SELECT " +
            "`period`, `game_id`, `channel_id`, `keep_day`, `keep_cnt` " +
            "FROM `tp_data_register_keep_new` " +
            "WHERE `period` BETWEEN '%s' AND '%s'";

    /**
     * 筛选历史付费留存
     */
    public static final String SELECT_PAY_KEEP_DAY = "SELECT " +
            "`period`, `game_id`, `channel_id`, `keep_day`, `keep_cnt` " +
            "FROM `tp_data_payment_keep` " +
            "WHERE `period` BETWEEN '%s' AND '%s'";
    /**
     * 写入历史注册留存
     */
    public static final String INSERT_REGISTER_KEEP_DAY_BATCH = "INSERT INTO " +
            "`tp_data_keep_summary`(`period`, `game_id`, `channel_id`,keep_?) " +
            "VALUES (?,?,?,?) " +
            "ON DUPLICATE KEY UPDATE " +
            "keep_? = VALUES(keep_?)";
    /**
     * 查找是否用户充值
     */
    public static final String SELECT_PAYMENT_REGISTER_INFO = "SELECT id " +
            "FROM `payment_register` " +
            "WHERE game_id= ? " +
            "AND channel_id = ? " +
            "AND uid = ?";
    /**
     * 查找SummaryView中的游戏配置信息
     */
    public static final String SELECT_SUMMARY_VIEW_GAME_CONFIG_INFO = "SELECT " +
            "`period`,game_id,channel_id,f_game_name,f_game_channel," +
            "f_game_pack,f_game_device," +
            "f_game_mode,register_cnt,new_pay_user_cnt " +
            "FROM `tp_data_summary_view` " +
            "WHERE period= ? " +
            "AND game_id = ? " +
            "AND channel_id = ?";

    public static void main(String[] args) {
    }

}
