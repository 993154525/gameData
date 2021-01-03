package com.st.util;

import com.st.dao.PlayUsers;

import java.sql.Timestamp;
import java.util.Random;

/**
 * @author shaotian
 * @create 2021-01-03 12:14
 */
public class RadomLog {

    public static PlayUsers createLog() {
        PlayUsers playUsers = new PlayUsers();
        playUsers.setUserName(createUserName());
        playUsers.setType(createType());
        playUsers.setGameName(createGameName());
        playUsers.setClickAt(creatAt());
        return playUsers;
    }

    public static String createUserName() {
        String val = "";
        Random random = new Random();

        //参数length，表示生成几位随机数
        for (int i = 0; i < 4; i++) {

            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            //输出字母还是数字
            if ("char".equalsIgnoreCase(charOrNum)) {
                //输出是大写字母还是小写字母
                int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
                val += (char) (random.nextInt(26) + temp);
            } else if ("num".equalsIgnoreCase(charOrNum)) {
                val += String.valueOf(random.nextInt(10));
            }
        }
        return val;
    }

    public static Timestamp creatAt() {
        return new Timestamp(System.currentTimeMillis());
    }

    public static String createType() {
        String[] name = new String[]{"LOGIN", "CLOSE"};
        return name[new Random().nextInt(name.length - 1)];
    }

    public static String createGameName() {
        String[] name = new String[]{"三国魔将转", "三国志14", "NBA2k01", "绝地求生", "LOL"};
        return name[new Random().nextInt(name.length)];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(createLog().toString());
        }
    }

}
