/*
* Package com.rust.manage.domain.response 
* FileName: LoginResponse
* Author:   fth
* Date:     2017/4/17 15:59
*/
package com.rust.manage.domain.response;

import com.rust.manage.common.CommonResponse;

import javax.servlet.http.Cookie;

/**
 * FileName:    LoginResponse
 * Author:      Br7roy
 * Date:        2017/4/17
 * Description:
 */
public class LoginResponse extends CommonResponse {
    private static final long serialVersionUID = -3749651303276315604L;
    private String userAcct;
    private String id;
    private Cookie cookie;

    @Override
    public String getResponseMsg() {
        return super.getResponseMsg();
    }

    @Override
    public void setResponseMsg(String responseMsg) {
        super.setResponseMsg(responseMsg);
    }

    @Override
    public String getResponseCode() {
        return super.getResponseCode();
    }

    @Override
    public void setResponseCode(String responseCode) {
        super.setResponseCode(responseCode);
    }

    @Override
    public Object getObjData() {
        return super.getObjData();
    }

    @Override
    public void setObjData(Object objData) {
        super.setObjData(objData);
    }

    public String getUserAcct() {
        return userAcct;
    }

    public void setUserAcct(String userAcct) {
        this.userAcct = userAcct;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cookie getCookie() {
        return cookie;
    }

    public void setCookie(Cookie cookie) {
        this.cookie = cookie;
    }

    public LoginResponse() {
    }

    public LoginResponse(String userAcct, String id, Cookie cookie) {
        this.userAcct = userAcct;
        this.id = id;
        this.cookie = cookie;
    }

    public LoginResponse(String responseCode, String responseMsg, Object objData, Cookie cookie) {
        super(responseCode, responseMsg, objData);
        this.cookie = cookie;
    }

    public LoginResponse(String responseCode, String responseMsg, Object objData) {
        super(responseCode, responseMsg, objData);
    }


    public LoginResponse(String respCode, String respMsg) {
        super(respCode, respMsg);
    }

}
