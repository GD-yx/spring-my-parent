package com.dao;

import com.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 南八
 */
@Repository
public interface StudentDao {
    int insert(Student student);
}
