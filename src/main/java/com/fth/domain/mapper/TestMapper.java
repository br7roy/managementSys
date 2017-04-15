package com.fth.domain.mapper;


import com.fth.domain.dto.Test;

public interface TestMapper {
    int deleteByPrimaryKey(String id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}