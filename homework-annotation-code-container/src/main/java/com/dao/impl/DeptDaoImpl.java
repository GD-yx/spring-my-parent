package com.dao.impl;

import com.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author 南八
 */
@Repository
public class DeptDaoImpl implements DeptDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int delete() {
        String sql = "delete from dept2  where id = 8";
        int row = jdbcTemplate.update(sql);
        return row;
    }
}
