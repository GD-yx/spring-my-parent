package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author 南八
 */
public class DeptDao {
    public int deleteDeptById(Connection conn, int id) throws SQLException {
        String sql = "delete from dept where id ="+id;
        int count = 0;
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        count = preparedStatement.executeUpdate();
        return count;
    }
}
