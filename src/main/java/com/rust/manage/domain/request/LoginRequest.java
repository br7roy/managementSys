/*
* Package com.rust.manage.domain 
* FileName: LoginRequest
* Author:   fth
* Date:     2017/4/17 15:58
*/
package com.rust.manage.domain.request;

/**
 * FileName:    LoginRequest
 * Author:      Br7roy
 * Date:        2017/4/17
 * Description:
 */
public class LoginRequest {
   private String userAcct;
    private String loginPwd;

    public String getUserAcct() {
        return userAcct;
    }

    public void setUserAcct(String userAcct) {
        this.userAcct = userAcct;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }
}
