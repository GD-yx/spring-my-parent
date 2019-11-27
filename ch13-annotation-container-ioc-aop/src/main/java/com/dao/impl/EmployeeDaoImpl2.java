package com.dao.impl;

import com.dao.EmployeeDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @author 南八
 */
@Repository()

public class EmployeeDaoImpl2 implements EmployeeDao {
    @Override
    public void update() {
        System.out.println("update in employeeDaoImpl222-----------");
    }
}
