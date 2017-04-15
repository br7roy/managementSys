/*
* Package com.fth.dao.Impl 
* FileName: TestDaoImpl
* Author:   fth
* Date:     2017/4/15 21:57
*/
package com.fth.dao.impl;

import com.fth.dao.TestDao;
import com.fth.domain.dto.Test;
import com.fth.domain.mapper.TestMapper;
import com.fth.process.FooBaseDao;
import org.springframework.stereotype.Repository;

/**
 * FileName:    TestDaoImpl
 * Author:      Br7roy
 * Date:        2017/4/15
 * Description:
 */
@Repository("testDaoImpl")
public class TestDaoImpl extends FooBaseDao implements TestDao {
    private Class<TestMapper> testMapperClass = TestMapper.class;
    @Override
    public Test selectByPrimaryKey(String id) {
        return getSqlSession().getMapper(testMapperClass).selectByPrimaryKey(id);
    }
}
