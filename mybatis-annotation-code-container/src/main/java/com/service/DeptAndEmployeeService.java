package com.service;

import com.entity.EmployeeEntity;

import java.util.List;

/**
 * @author 南八
 */
public interface DeptAndEmployeeService {
    List<EmployeeEntity> getAll(int pageNum,int pageSize);//分页
    void txDemo();//事务
}
