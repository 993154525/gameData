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
import st.jx.webapp.wangyiyun.model.ActivateLog;
import st.jx.webapp.wangyiyun.model.AdvClickNewLog;
import st.jx.webapp.wangyiyun.model.UserReg;

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
        List<ActivateLog> activateLogList = jdbcTemplate.query("select * from log_activate_3_3"
                , new Object[]{}, new BeanPropertyRowMapper<>(ActivateLog.class));
        activateLogList.forEach(activateLog -> {
            try {
                kafkaTemplate.send("play800-log-activate", JsonUtil.toJson(activateLog));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }


}
