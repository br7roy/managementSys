/*
* Package com.fth.process 
* FileName: FooBaseDao
* Author:   fth
* Date:     2017/4/15 22:02
*/
package com.fth.process;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;

/**
 * FileName:    FooBaseDao
 * Author:      Br7roy
 * Date:        2017/4/15
 * Description:
 */
public class FooBaseDao extends SqlSessionDaoSupport {
    public FooBaseDao() {
    }


    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
