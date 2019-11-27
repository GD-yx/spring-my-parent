package com.service.impl;

import com.dao.DeptDao;
import com.entity.Dept;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 南八
 */
@Service("ss")
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao;

    public void setDao(DeptDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Dept> getAll() {
        return dao.getAll();
    }

    @Override
    public void insert(Dept dept) {
        dao.insert(dept);
    }
}
