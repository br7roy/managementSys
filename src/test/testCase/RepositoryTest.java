/*
* Package PACKAGE_NAME 
* FileName: Test
* Author:   fth
* Date:     2017/4/16 9:51
*/

import com.rust.manage.dao.impl.TestDaoImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * FileName:    RepositoryTest
 * Author:      Br7roy
 * Date:        2017/4/16
 * Description:
 */
public class RepositoryTest {

    private ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext =
                new ClassPathXmlApplicationContext(
                        "config/spring/spring-mybatis.xml");
    }


    @Test
    public void test() {
        TestDaoImpl testDao = applicationContext.getBean("testDaoImpl", TestDaoImpl.class);
        com.rust.manage.domain.dto.Test test = testDao.selectByPrimaryKey("1");
        System.out.println(test.getName());

    }
}
