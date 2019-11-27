package com.service.impl;

import com.dao.DeptsDao;
import com.service.DeptService;

public class DeptServiceImpl implements DeptService {

    private DeptsDao dao;

    public void setDao(DeptsDao dao) {
        this.dao = dao;
    }

    @Override
    public int insert(Integer id, String deptname) {
        return dao.insert(id, deptname);
    }
}
