/*
* Package com.fth.process
* FileName: FooBaseDao
* Author:   fth
* Date:     2017/4/15 22:02
*/
package com.rust.manage.process;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;

/**
 * FileName:    RustBaseDao
 * Author:      Br7roy
 * Date:        2017/4/15
 * Description:
 */
public abstract class RustBaseDao<F> extends SqlSessionDaoSupport {
    public RustBaseDao() {
    }

//    @Autowired
//    @Override
//    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
//        super.setSqlSessionTemplate(sqlSessionTemplate);
//    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

//    protected <F> F getMapper(Class<F> fClass) {
//        return getSqlSession().getMapper(fClass);
//    }

}
