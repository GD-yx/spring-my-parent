package com.service.emp.impl;

import com.service.emp.EmployeeService;

/**
 * @author 南八
 */
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void getAll() {
        System.out.println("getAll in EmployeeServiceImpl");
    }

    @Override
    public void getById() {
        System.out.println("getById in EmployeeServiceImpl");
    }

    @Override
    public void deleteById() {
        System.out.println("deleteById in EmployeeServiceImpl");
    }

    public void xxx(){
        System.out.println("自己写的方法");
    }
}
