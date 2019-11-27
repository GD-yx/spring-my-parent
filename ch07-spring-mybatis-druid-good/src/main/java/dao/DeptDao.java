package dao;

import com.github.pagehelper.Page;
import entity.Dept;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface DeptDao {
    List<Dept> getAll(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
    int getUserCount();

    //Page<Dept> getUserByPageHelper(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
}
