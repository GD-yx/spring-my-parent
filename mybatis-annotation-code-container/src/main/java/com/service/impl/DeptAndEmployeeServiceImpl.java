package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import com.entity.EmployeeEntity;
import com.service.DeptAndEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 南八
 */

@Service
public class DeptAndEmployeeServiceImpl implements DeptAndEmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private DeptDao deptDao;

    @Override
    public List<EmployeeEntity> getAll(int pageNum, int pageSize){
        return employeeDao.getAll(pageNum, pageSize);
    }

    @Transactional
    @Override
    public void txDemo() {
        deptDao.delete();
        employeeDao.insert();
    }

}