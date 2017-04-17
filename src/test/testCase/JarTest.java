/*
* Package PACKAGE_NAME 
* FileName: TestCommponent
* Author:   Br7roy
* Date:     2017/4/17 23:10
*/

import com.rust.manage.domain.response.LoginResponse;
import com.rust.util.verify.RustDataVerifyUtil;
import org.junit.Test;

/**
 * FileName:    JarTest
 * Author:      Br7roy
 * Date:        2017/4/17
 * Description:
 */
public class JarTest {
    @Test
    public void test() {
        String s = null;
        LoginResponse response = new LoginResponse();
        response.setResponseMsg("hahaha");
        if (RustDataVerifyUtil.isNotBlank(response)) {
            System.out.println("cgl");
        }else
            System.out.println("shibaile");
    }

}
