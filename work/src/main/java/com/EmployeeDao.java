package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author 南八
 */
public class EmployeeDao {
    public int deleteEmpsByDeptId(Connection conn, int deptid) throws SQLException {
        String sql = "delete from employee where deptid ="+deptid;
        int count = 0;
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        count = preparedStatement.executeUpdate();
        return count;
    }
}
