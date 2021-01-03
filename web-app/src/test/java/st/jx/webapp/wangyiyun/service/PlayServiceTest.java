package st.jx.webapp.wangyiyun.service;

import com.tencent.ads.App;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;


/**
 * @author shaotian
 * @create 2021-01-03 13:04
 */
@SpringBootTest()
class PlayServiceTest {

    @Autowired
    @Qualifier("PlayService")
    private PlayService playService;

    @Test
    void test() throws IOException {
        playService.sendLog();
    }

}