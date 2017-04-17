package com.rust.manage.controller;

import com.rust.manage.common.Constant;
import com.rust.manage.domain.response.LoginResponse;
import com.rust.manage.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

/**
 * FileName: CommonServlet
 * Author:   Br7roy
 * Date:     2017/4/17
 * Description:
 * History:
 */
@Controller
@RequestMapping("/account")
public class CommonServlet {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private LoginService loginService;


    @RequestMapping("/login.do")
    @ResponseBody
    protected LoginResponse checkAcct(String name, String pwd, HttpServletResponse response) throws ServletException, IOException {
        logger.info("------------->检验账户开始acct:[" + name + "]    pwd:[" + pwd + "]<--------------");
        LoginResponse loginResponse = loginService.checkLoginInfo(name, pwd);
        if (Objects.equals(loginResponse.getResponseCode(), Constant.respCode.SUCCESS_CODE)) {
            response.addCookie(loginResponse.getCookie());
        }
        logger.info("---------------->检验账户处理结束<----------------");
        return loginResponse;
    }

}
