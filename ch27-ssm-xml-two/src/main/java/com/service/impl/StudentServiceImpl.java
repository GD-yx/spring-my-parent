package com.service.impl;

import com.dao.StudentDao;
import com.entity.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 南八
 */
@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentDao dao;
    @Override
    public List<Student> getAll(int pageNum, int pageSize) {
        return dao.getAll(pageNum, pageSize);
    }

    @Override
    public void insert(Student student) {
        dao.insert(student);
    }
}
