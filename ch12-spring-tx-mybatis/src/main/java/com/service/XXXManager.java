package com.service;

import com.dao.DeptDao;
import com.dao.EmployeeDao;

/**
 * @author 南八
 */
public class XXXManager {
    DeptDao deptDao;
    EmployeeDao employeeDao;

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void demo(){
        employeeDao.delete();
        deptDao.insert();
    }
}
