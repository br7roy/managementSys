package com.rust.manage.domain.mapper;

import com.rust.manage.domain.dto.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    UserInfo selectByAcctPwd(@Param("acctName") String acctName, @Param("loginPassword") String loginPassword);
}