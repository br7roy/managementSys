/*
* Package com.rust.manage.service.impl 
* FileName: LoginServiceImpl
* Author:   Br7roy
* Date:     2017/4/17 16:14
*/
package com.rust.manage.service.Impl;

import com.rust.manage.common.Constant;
import com.rust.manage.dao.UserInfoDao;
import com.rust.manage.domain.dto.UserInfo;
import com.rust.manage.domain.response.LoginResponse;
import com.rust.manage.service.LoginService;
import com.rust.util.verify.RustDataVerifyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import java.util.UUID;

/**
 * FileName:    LoginServiceImpl
 * Author:      Br7roy
 * Date:        2017/4/17
 * Description:
 */
@Service
public class LoginServiceImpl implements LoginService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private UserInfoDao userInfoDao;

    @Override
    public LoginResponse checkLoginInfo(String name, String pwd) {

        logger.info("--------------->this is checkLoginService<-------------");

        if (RustDataVerifyUtil.isEmpty(name) || RustDataVerifyUtil.isEmpty(pwd)) {
            return new LoginResponse(Constant.respCode.ERROR_CODE, Constant.respMsg.login_fail);
        }

        logger.info("--------------->参数校验通过<--------------");

        UserInfo userInfo = userInfoDao.getUserInfo(name, pwd);
        if (RustDataVerifyUtil.isBlank(userInfo)) {
            return new LoginResponse(Constant.respCode.ERROR_CODE, Constant.respMsg.login_error);
        }
        String token = UUID.randomUUID().toString();

        userInfo.setToken(token);
        userInfoDao.saveUserInfo(userInfo);

        Cookie cookie = new Cookie(Constant.cookie, userInfo.getId() + token);

        return new LoginResponse(Constant.respCode.SUCCESS_CODE, Constant.respMsg.login_success, userInfo, cookie);

    }

    @Override
    public int saveCookie(String... strings) {

        return 0;
    }
}
