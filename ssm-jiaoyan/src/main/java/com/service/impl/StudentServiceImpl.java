package com.service.impl;

import com.dao.StudentDao;
import com.entity.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 南八
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao dao;

    public void setDao(StudentDao dao) {
        this.dao = dao;
    }

    @Override
    public int insert(Student student) {
        return dao.insert(student);
    }
}
