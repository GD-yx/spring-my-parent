package com.dao;

import com.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 南八
 */
public interface EmployeeDao {
    void insert();

    List<EmployeeEntity> getAll(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);

}
