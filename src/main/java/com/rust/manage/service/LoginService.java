/*
* Package com.rust.manage.service.impl 
* FileName: LoginService
* Author:   Br7roy
* Date:     2017/4/17 16:14
*/
package com.rust.manage.service;

import com.rust.manage.domain.response.LoginResponse;

/**
 * FileName:    LoginService
 * Author:      Br7roy
 * Date:        2017/4/17
 * Description:
 */
public interface LoginService {
    LoginResponse checkLoginInfo(String name, String pwd);

    int saveCookie(String... strings);
}
