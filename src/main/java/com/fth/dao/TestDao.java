/*
* Package com.fth.dao 
* FileName: TestDao
* Author:   fth
* Date:     2017/4/15 21:56
*/
package com.fth.dao;

import com.fth.domain.dto.Test;

/**
 * FileName:    TestDao
 * Author:      Br7roy
 * Date:        2017/4/15
 * Description:
 */
public interface TestDao {
    Test selectByPrimaryKey(String id);
}
