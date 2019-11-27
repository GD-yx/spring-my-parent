package com.service;

import com.entity.Student;

import java.util.List;

/**
 * @author 南八
 */
public interface StudentService {
    List<Student> getAll(int pageNum,int pageSize);
    void insert(Student student);
}
