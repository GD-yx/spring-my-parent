package com;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author 南八
 */
public class EmployeeService {
    DeptDao deptDao;
    EmployeeDao employeeDao;

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public int deleteDeptWithEmps(Connection conn, int deptid) throws SQLException {
        int count = 0;
        count += employeeDao.deleteEmpsByDeptId(conn,deptid);
        count += deptDao.deleteDeptById(conn,deptid);
        return count;
    }

}
