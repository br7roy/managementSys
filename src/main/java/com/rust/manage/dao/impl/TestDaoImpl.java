/*
* Package com.fth.dao.Impl 
* FileName: TestDaoImpl
* Author:   fth
* Date:     2017/4/15 21:57
*/
package com.rust.manage.dao.impl;

import com.rust.manage.dao.TestDao;
import com.rust.manage.domain.dto.Test;
import com.rust.manage.domain.mapper.TestMapper;
import com.rust.manage.process.FooBaseDao;
import org.springframework.stereotype.Repository;

/**
 * FileName:    TestDaoImpl
 * Author:      Br7roy
 * Date:        2017/4/15
 * Description:
 */
@Repository
public class TestDaoImpl extends FooBaseDao implements TestDao {
    private Class<TestMapper> testMapperClass = TestMapper.class;


    @Override
    public Test selectByPrimaryKey(String id) {
        return getSqlSession().getMapper(testMapperClass).selectByPrimaryKey(id);
    }
}
