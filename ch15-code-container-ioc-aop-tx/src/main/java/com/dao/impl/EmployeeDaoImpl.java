package com.dao.impl;

import com.dao.EmployeeDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @author 南八
 */
@Repository()
public class EmployeeDaoImpl implements EmployeeDao {
    public EmployeeDaoImpl(){
        System.out.println("dao的构造函数--------");
    }
    @Override
    public void update() {
        System.out.println("update in employeeDaoImpl-----------");
    }
}
