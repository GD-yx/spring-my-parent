package com.dao;

/**
 * @author 南八
 */
public class EmployeeDaoImpl extends BaseDao {
    public void deleteByDeptId(int id){
        String sql = "delete from employee where deptid = ?";
        jdbcTemplate.update(sql,id);
    }
}
