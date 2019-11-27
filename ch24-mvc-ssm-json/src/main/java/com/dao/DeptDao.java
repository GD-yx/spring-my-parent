package com.dao;

import com.entity.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptDao {

    List<Dept> getAll();
    void insert(Dept dept);
}
