package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author 南八
 */
public abstract class BaseDao {
    protected JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
