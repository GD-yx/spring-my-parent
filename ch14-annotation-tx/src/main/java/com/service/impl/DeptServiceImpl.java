package com.service.impl;


import com.dao.DeptDao;
import com.dao.EmployeeDao;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 南八
 */

@Service
@Transactional()//此类支持事务，推荐放在方法上
public class DeptServiceImpl {
    private DeptDao deptDao;
    private EmployeeDao employeeDao;

    public DeptServiceImpl(DeptDao deptDao, EmployeeDao employeeDao) {
        this.deptDao = deptDao;
        this.employeeDao = employeeDao;
    }

    @Transactional
    public void txDemo(){
        deptDao.delete();
        employeeDao.insert();
    }
}
