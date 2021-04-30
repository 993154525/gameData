package st.jx.webapp.wangyiyun.service;

import com.st.dao.PlayUsers;
import com.st.util.JsonUtil;
import com.st.util.RadomLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import st.jx.webapp.wangyiyun.model.*;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author shaotian
 * @create 2021-01-03 12:43
 */
@RestController("PlayService")
@RequestMapping("/api/play/")
public class PlayService {

    private Logger log = LoggerFactory.getLogger(PlayUsers.class);

    public final ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "send", method = RequestMethod.GET)
    public String sendLog() throws IOException {
        String url = "http://localhost:8080/api/play/getLog";
        for (int i = 0; i < 100000; i++) {
            PlayUsers playUser = RadomLog.createLog();
            restTemplate.postForEntity(url, playUser, String.class);
        }
        return "success";
    }

    @RequestMapping(value = "getLog", method = RequestMethod.GET)
    public void getLog() throws IOException {
        List<UserReg> userRegs = jdbcTemplate.query("select * from user_reg"
                , new Object[]{}, new BeanPropertyRowMapper<>(UserReg.class));
        userRegs.forEach(userReg -> {
            try {
                kafkaTemplate.send("reg_r1p2", JsonUtil.toJson(userReg));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    @RequestMapping(value = "getClickLog", method = RequestMethod.GET)
    public void getClickLog() throws IOException {
        List<AdvClickNewLog> advClickNewLogList = jdbcTemplate.query("select * from adv_click_new_log_3"
                , new Object[]{}, new BeanPropertyRowMapper<>(AdvClickNewLog.class));
        advClickNewLogList.forEach(advClickNewLog -> {
            try {
                kafkaTemplate.send("play800-log-click", JsonUtil.toJson(advClickNewLog));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    @RequestMapping(value = "getActivateLog", method = RequestMethod.GET)
    public void getActivateLog() throws IOException {
        List<ActivateLog> activateLogList = jdbcTemplate.query("select * from log_activate_3_4"
                , new Object[]{}, new BeanPropertyRowMapper<>(ActivateLog.class));
        activateLogList.forEach(activateLog -> {
            try {
                kafkaTemplate.send("play800-log-activate", JsonUtil.toJson(activateLog));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    @RequestMapping(value = "getRegLog", method = RequestMethod.GET)
    public void getRegLog() throws IOException {
        List<UserRegLog> userRegLogs = jdbcTemplate.query("select * from user_reg_1"
                , new Object[]{}, new BeanPropertyRowMapper<>(UserRegLog.class));
        userRegLogs.forEach(userRegLog -> {
            try {
                kafkaTemplate.send("play800-log-reg", JsonUtil.toJson(userRegLog));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    @RequestMapping(value = "getLoginLog", method = RequestMethod.GET)
    public void getLoginLog() throws IOException {
        List<UserLog> userLogs = jdbcTemplate.query("select * from user_login_23_24"
                , new Object[]{}, new BeanPropertyRowMapper<>(UserLog.class));
        userLogs.forEach(userLog -> {
            try {
                kafkaTemplate.send("play800-log-login", JsonUtil.toJson(userLog));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    @RequestMapping(value = "getIncomeLog", method = RequestMethod.GET)
    public void getIncmeLog() throws IOException {
        List<IncomeLog> incomeLogs = jdbcTemplate.query("select * from income_log"
                , new Object[]{}, new BeanPropertyRowMapper<>(IncomeLog.class));
        incomeLogs.forEach(incomeLog -> {
            try {
                kafkaTemplate.send("play800-log-income", JsonUtil.toJson(incomeLog));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    @RequestMapping(value = "getDataIncome", method = RequestMethod.GET)
    public void getDataIncome() throws IOException {
        List<DataIncome> dataIncomes = jdbcTemplate.query("select * from tp_data_income WHERE `period` = '2021-04-16' LIMIT 100"
                , new Object[]{}, new BeanPropertyRowMapper<>(DataIncome.class));
        dataIncomes.forEach(dataIncome -> {
            try {
                kafkaTemplate.send("play800-data-income", JsonUtil.toJson(dataIncome));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    @RequestMapping(value = "getDataCost", method = RequestMethod.GET)
    public void getDataCost() throws IOException {
        List<DataCost> dataCosts = jdbcTemplate.query("select * from tp_data_cost"
                , new Object[]{}, new BeanPropertyRowMapper<>(DataCost.class));
        dataCosts.forEach(dataCost -> {
            try {
                kafkaTemplate.send("play800-data-cost", JsonUtil.toJson(dataCost));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    @RequestMapping(value = "getSdkPay", method = RequestMethod.GET)
    public void getSdkPay() throws IOException {
        List<SdkPayment> sdkPayments = jdbcTemplate.query("select * from sdk_payment where channelid != 116 AND status in (1,2) limit 1000"
                , new Object[]{}, new BeanPropertyRowMapper<>(SdkPayment.class));
        sdkPayments.forEach(sdkPayment -> {
            try {
                kafkaTemplate.send("play800-sdk-pay", JsonUtil.toJson(sdkPayment));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    @RequestMapping(value = "getPayPayment", method = RequestMethod.GET)
    public void getPayPayment() throws IOException {
        List<PayPayment> payPayments = jdbcTemplate.query("select * from pay_payment where status in (1,3,4) limit 100"
                , new Object[]{}, new BeanPropertyRowMapper<>(PayPayment.class));
        payPayments.forEach(payPayment -> {
            try {
                kafkaTemplate.send("play800-pay-payment", JsonUtil.toJson(payPayment));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    @RequestMapping(value = "getKeep", method = RequestMethod.GET)
    public void getKeep() throws IOException {
        List<KeepLogin> keepLogins = jdbcTemplate.query("select * from tp_data_register_keep_new where keep_day in (1,3,7,15,30) ORDER BY `period` desc limit 1000"
                , new Object[]{}, new BeanPropertyRowMapper<>(KeepLogin.class));
        keepLogins.forEach(keepLogin -> {
            try {
                kafkaTemplate.send("play800-login-keep", JsonUtil.toJson(keepLogin));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    @RequestMapping(value = "getRecord", method = RequestMethod.GET)
    public void getRecord() throws IOException {
        List<Record> records = jdbcTemplate.query("select * from data_cost_record where id = 620955 "
                , new Object[]{}, new BeanPropertyRowMapper<>(Record.class));
        records.forEach(record -> {
            try {
                kafkaTemplate.send("play800-data-record", JsonUtil.toJson(record));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    @RequestMapping(value = "getLtv", method = RequestMethod.GET)
    public void getLtv() throws IOException {
        List<Ltv> ltvs = jdbcTemplate.query("select * from tp_data_ltv where period = '2021-04-12'"
                , new Object[]{}, new BeanPropertyRowMapper<>(Ltv.class));
        ltvs.forEach(ltv -> {
            try {
                kafkaTemplate.send("play800-income-ltv", JsonUtil.toJson(ltv));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    @RequestMapping(value = "getGameConfig", method = RequestMethod.GET)
    public void getGameConfig() throws IOException {
        List<GameConfig> gameConfigs = jdbcTemplate.query("select * from config_game"
                , new Object[]{}, new BeanPropertyRowMapper<>(GameConfig.class));
        gameConfigs.forEach(gameConfig -> {
            try {
                kafkaTemplate.send("play800-data-config", JsonUtil.toJson(gameConfig));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    @RequestMapping(value = "getChannelConfig", method = RequestMethod.GET)
    public void getGameChannel() throws IOException {
        List<ChannelConfig> channelConfigs = jdbcTemplate.query("select * from config_channel"
                , new Object[]{}, new BeanPropertyRowMapper<>(ChannelConfig.class));
        channelConfigs.forEach(channelConfig -> {
            try {
                kafkaTemplate.send("play800-data-config", JsonUtil.toJson(channelConfig));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }


}
