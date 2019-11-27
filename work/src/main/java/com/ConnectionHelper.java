package com;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author 南八
 */
public class ConnectionHelper {
    private static  final String URL = "jdbc:mysql://localhost:3306/demo2";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String DRIVERCLASSNAME = "com.mysql.jdbc.Driver";

    static {
        try {
            Class.forName(DRIVERCLASSNAME);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("jdbc driver load failec",e);
        }
    }

    public  static Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

   /* public static void main(String[] args) {
        System.out.println(ConnectionHelper.getConnection());
    }*/
}
