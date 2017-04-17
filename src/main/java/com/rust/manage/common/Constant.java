/*
* Package com.rust.manage.common 
* FileName: Constant
* Author:   Br7roy
* Date:     2017/4/17 18:42
*/
package com.rust.manage.common;

/**
 * FileName:    Constant
 * Author:      Br7roy
 * Date:        2017/4/17
 * Description:
 */
public class Constant {
    public static final String UTF_8_ENCODING = "UTF-8";
    public static final String cookie = "cookie";

    public interface respCode {

        String SUCCESS_CODE = "0000";

        String ERROR_CODE = "9999";

    }

    public interface respMsg {
        String login_success = "登录成功";
        String login_fail = "登录失败,用户名或密码不能为空";
        String login_error = "登录失败，用户名或密码错误";
    }
}
