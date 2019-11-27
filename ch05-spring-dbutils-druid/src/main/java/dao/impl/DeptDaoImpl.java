package dao.impl;

import dao.DeptDao;
import entity.Dept;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class DeptDaoImpl implements DeptDao {
    private QueryRunner queryRunner;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    @Override
    public Dept getById() {
        String  sql = "select id,deptname from dept where id = 1";
        BeanHandler<Dept> beanHandler = new BeanHandler<>(Dept.class);
        Dept dept = null;
        try {
            dept = queryRunner.query(sql,beanHandler);
        } catch (SQLException e) {
            e.printStackTrace();
            throw  new RuntimeException("query failed....");
        }
        return dept;
    }
}
