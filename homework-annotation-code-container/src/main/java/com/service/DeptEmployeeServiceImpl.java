package com.service;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 南八
 */
@Service
@Transactional()
public class DeptEmployeeServiceImpl {
    private DeptDao deptDao;
    private EmployeeDao employeeDao;

    public DeptEmployeeServiceImpl(DeptDao deptDao, EmployeeDao employeeDao) {
        this.deptDao = deptDao;
        this.employeeDao = employeeDao;
    }
    @Transactional(readOnly = false)
    public void deleteAndInsert(){
        deptDao.delete();
        employeeDao.update();
    }
}
