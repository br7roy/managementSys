/*
* Package com.rust.manage.service.impl 
* FileName: LoginServiceImpl
* Author:   Br7roy
* Date:     2017/4/17 16:14
*/
package com.rust.manage.service.Impl;

import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rust.manage.common.Constant;
import com.rust.manage.dao.UserInfoDao;
import com.rust.manage.domain.dto.UserInfo;
import com.rust.manage.domain.response.LoginResponse;
import com.rust.manage.service.LoginService;

/**
 * FileName:    LoginServiceImpl
 * Author:      Br7roy
 * Date:        2017/4/17
 * Description:
 */
@Service
public class LoginServiceImpl implements LoginService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public LoginResponse checkLoginInfo(String name, String pwd) {
        LoginResponse loginResponse = new LoginResponse();

        logger.info("--------------->this is checkLoginService<-------------");

        logger.info("name:[" + name + "]------pwd:[" + pwd + "]");


//        if (RustDataVerifyUtil.isEmpty(name) || RustDataVerifyUtil.isEmpty(pwd)) {
//            loginResponse.setResponseCode(Constant.respCode.ERROR_CODE);
//            loginResponse.setResponseMsg(Constant.respMsg.login_error);
//            logger.info("返回登录响应：" + RustFastJsonUtil.tojson(loginResponse));
//            return loginResponse;
////            return new LoginResponse(Constant.respCode.ERROR_CODE, Constant.respMsg.login_fail);
//        }
        if (isBlank(name) || isBlank(pwd)) {
            loginResponse.setResponseCode(Constant.respCode.ERROR_CODE);
            loginResponse.setResponseMsg(Constant.respMsg.login_error);
            //logger.info("返回登录响应：" + RustFastJsonUtil.tojson(loginResponse));
            return loginResponse;
        }

        logger.info("--------------->参数校验通过<--------------");

        UserInfo userInfo = userInfoDao.getUserInfo(name, pwd);

//        logger.info("--------------->用户信息：[" + RustFastJsonUtil.tojson(userInfo) + "]<--------------");

//        if (RustDataVerifyUtil.isBlank(userInfo)) {
//            loginResponse.setResponseCode(Constant.respCode.ERROR_CODE);
//            loginResponse.setResponseMsg(Constant.respMsg.login_error);
//            return loginResponse;
////            return new LoginResponse(Constant.respCode.ERROR_CODE, Constant.respMsg.login_error);
//        }

        if (isBlank(userInfo)) {
            loginResponse.setResponseCode(Constant.respCode.ERROR_CODE);
            loginResponse.setResponseMsg(Constant.respMsg.login_error);
            return loginResponse;
        }

        String token = UUID.randomUUID().toString();

        userInfo.setToken(token);
        userInfoDao.updateUserInfo(userInfo);
//        userInfoDao.saveUserInfo(userInfo);

        Cookie cookie = new Cookie("cookie", userInfo.getId() + token);

        logger.info("cookieName:"+cookie.getName());
        logger.info("cookieValue:" + cookie.getValue());
//        loginResponse.setResponseCode(Constant.respCode.SUCCESS_CODE);
        loginResponse.setResponseCode("0000");
//        loginResponse.setResponseMsg(Constant.respMsg.login_success);
        loginResponse.setResponseMsg("登录成功");
        loginResponse.setObjData(userInfo);
        loginResponse.setCookie(cookie);
        return loginResponse;
//        return new LoginResponse(Constant.respCode.SUCCESS_CODE, Constant.respMsg.login_success, userInfo, cookie);

    }

    @Override
    public int saveCookie(String... strings) {

        return 0;
    }

    boolean isBlank(Object object) {
        return object == null || object.equals("null") || object.equals("");
//        if (!object.equals(null) || !object.equals("")) {
//            return true;
//        }
//        return false;
//    }
    }
}

