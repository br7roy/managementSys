/*
* Package com.rust.manage.dao 
* FileName: UserInfoDao
* Author:   Br7roy
* Date:     2017/4/17 18:52
*/
package com.rust.manage.dao;

import com.rust.manage.domain.dto.UserInfo;

/**
 * FileName:    UserInfoDao
 * Author:      Br7roy
 * Date:        2017/4/17
 * Description:
 */
public interface UserInfoDao {
    UserInfo getUserInfo(String acct, String loginPwd);

    int saveUserInfo(UserInfo userInfo);

    int updateUserInfo(UserInfo userInfo);
}
