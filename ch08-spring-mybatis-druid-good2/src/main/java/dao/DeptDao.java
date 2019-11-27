package dao;

import entity.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 南八
 */
public interface DeptDao {
    List<Dept> getAll(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);
    int getUserCount();
}
