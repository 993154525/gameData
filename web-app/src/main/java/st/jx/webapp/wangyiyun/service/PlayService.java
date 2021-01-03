package st.jx.webapp.wangyiyun.service;

import com.st.dao.PlayUsers;
import com.st.util.JsonUtil;
import com.st.util.RadomLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
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

    @RequestMapping(value = "send", method = RequestMethod.GET)
    public String sendLog() throws IOException {
        String url = "http://localhost:8080/api/play/getLog";
        for (int i = 0; i < 100000; i++) {
            PlayUsers playUser = RadomLog.createLog();
            restTemplate.postForEntity(url, playUser, String.class);
        }
        return "success";
    }

    @RequestMapping(value = "getLog", method = RequestMethod.POST)
    public void getLog(@RequestBody PlayUsers playUsers) throws IOException {
        kafkaTemplate.send("wangyiyun", JsonUtil.toJson(playUsers));
    }


}
