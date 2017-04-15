package com.rust.manage.domain.mapper;


import com.rust.manage.domain.dto.Test;
import org.apache.ibatis.annotations.Param;

public interface TestMapper {
    int deleteByPrimaryKey(String id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(@Param("id") String id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}