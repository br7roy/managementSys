/*
* Package com.rust.manage.dao.impl 
* FileName: UserInfoDaoImpl
* Author:   Br7roy
* Date:     2017/4/17 18:57
*/
package com.rust.manage.dao.impl;

import com.rust.manage.dao.UserInfoDao;
import com.rust.manage.domain.dto.UserInfo;
import com.rust.manage.domain.mapper.UserInfoMapper;
import com.rust.manage.process.RustBaseDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * FileName:    UserInfoDaoImpl
 * Author:      Br7roy
 * Date:        2017/4/17
 * Description:
 */
public class UserInfoDaoImpl extends RustBaseDao implements UserInfoDao {
    private Class<UserInfoMapper> userInfoMapperClass = UserInfoMapper.class;
    private Logger logger = LoggerFactory.getLogger(UserInfoDaoImpl.class);

    @Override
    public UserInfo getUserInfo(String acct, String loginPwd) {
        return getSqlSession().getMapper(userInfoMapperClass).selectByAcctPwd(acct, loginPwd);
    }

    @Override
    public int saveUserInfo(UserInfo userInfo) {
        long startTme = System.currentTimeMillis();
        logger.info("------------>开始对用户信息进行保存：" + startTme + "<-----------");

        int checkNum = getSqlSession().getMapper(userInfoMapperClass).insertSelective(userInfo);

        long endTime = System.currentTimeMillis();
        if (checkNum > 0) {
            logger.info("------------------->保存用户信息成功，保存:[" + checkNum + "]条数据" + endTime + "<-----------------");
            return checkNum;
        } else
            logger.error("---------------->保存用户信息失败<" + endTime + "-------------------");
        return checkNum;
    }

}
