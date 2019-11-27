package dao;

import entity.Dept;
import org.apache.ibatis.annotations.Select;

public interface DeptDao {
    @Select("select id,deptname from dept where id = 1")
    Dept getById();
}
