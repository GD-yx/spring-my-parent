package com.service.impl;

import com.dao.EmployeeDao;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 南八
 */

public class EmployeeServiceImpl2 implements EmployeeService {


    private EmployeeDao dao;

    public void setDao(EmployeeDao dao) {
        this.dao = dao;
    }

    @Override
    public void update() {
        System.out.println("update in service 2....");
        dao.update();
    }
}
