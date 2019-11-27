package com.dao.impl;

import com.dao.EmployeeDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @author 南八
 */
@Repository()
@Primary
public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void update() {
        System.out.println("update in employeeDaoImpl-----------");
    }
}
