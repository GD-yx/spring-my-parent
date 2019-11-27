package com.service;

import com.dao.DeptDao;
import com.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 南八
 */
@Service
public class DeptService {
    @Autowired
    private DeptDao dao;

    public List<Dept> getAll(int pageNum,int pageSize){
        return dao.getAll(pageNum, pageSize);
    }
}
