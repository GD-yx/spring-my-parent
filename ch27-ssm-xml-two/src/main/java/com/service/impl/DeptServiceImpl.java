package com.service.impl;

import com.dao.DeptDao;
import com.dao.StudentDao;
import com.entity.Student;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 南八
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Autowired
    private StudentDao studentDao;

    @Transactional
    @Override
    public void deleteById(int deptid) {
        studentDao.deleteByDeptId(deptid);
        deptDao.deleteById(deptid);
    }


}
