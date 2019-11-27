package com.dao;

import com.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 南八
 */
public interface StudentDao {
    List<Student> getAll(@Param("pageNum")int pageNum,
                         @Param("pageSize")int pageSize);
    void insert(Student student);

    void deleteByDeptId(int deptid);
}
