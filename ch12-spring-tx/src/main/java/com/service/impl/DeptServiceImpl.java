package com.service.impl;

import com.dao.DeptDaoImpl;
import com.dao.EmployeeDaoImpl;

/**
 * @author 南八
 */
public class DeptServiceImpl {
    private DeptDaoImpl deptDao;
    private EmployeeDaoImpl employeeDao;

    public void setDeptDao(DeptDaoImpl deptDao) {
        this.deptDao = deptDao;
    }

    public void setEmployeeDao(EmployeeDaoImpl employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void deleteWholeById(int id) throws Exception {
        employeeDao.deleteByDeptId(id);
        deptDao.deleteById(id);
    }
}
