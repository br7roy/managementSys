/*
* Package com.fth.dao 
* FileName: TestDao
* Author:   fth
* Date:     2017/4/15 21:56
*/
package com.rust.manage.dao;

import com.rust.manage.domain.dto.Test;

/**
 * FileName:    TestDao
 * Author:      Br7roy
 * Date:        2017/4/15
 * Description:
 */
public interface TestDao {
    Test selectByPrimaryKey(String id);
}
