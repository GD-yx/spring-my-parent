package service;

import com.github.pagehelper.Page;
import entity.Dept;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface DeptService {
    List<Dept> getAll(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
    int getUserCount();

}
