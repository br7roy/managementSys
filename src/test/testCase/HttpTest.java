/*
* Package PACKAGE_NAME 
* FileName: HttpTest
* Author:   Br7roy
* Date:     2017/4/17 23:32
*/

import com.rust.manage.common.Constant;
import com.rust.manage.domain.request.LoginRequest;
import com.rust.util.client.http.RustHttpClientUtil;
import com.rust.util.message.RustFastJsonUtil;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * FileName:    HttpTest
 * Author:      Br7roy
 * Date:        2017/4/17
 * Description:
 */
public class HttpTest {
    private static Logger logger = LoggerFactory.getLogger(HttpTest.class);
    @Test
    public void test() {
        try {
            RustHttpClientUtil http = new RustHttpClientUtil("南博公司员工管理系统",  //服务器名称
                    "http://localhost:8080/account/login.do",         //服务器请求地址
                    1000,  //HTTP连接超时时间
                    20000,     //响应超时时间
                    Constant.UTF_8_ENCODING,  //报文字符集
                    false,    //是否报文base64转码
                    false,    //是否启用代理
                    null,     //代理 IP
                    0);//代理端口
            /*发送报文*/
            Map<String, String> hMap = new HashMap<>();
            hMap.put("name", "jack");
            hMap.put("pwd", "123");
            LoginRequest loginRequest = new LoginRequest();
            loginRequest.setUserAcct("jack");
            loginRequest.setLoginPwd("123");

            logger.info("-----------模拟前端发送请求报文-------------");
            int code = http.send(RustFastJsonUtil.tojson(loginRequest));

            logger.info("-----------通信flag:" + code);
            String result = http.getSendData();
            logger.info("页面反馈报文: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
