package service.impl;

import com.github.pagehelper.Page;
import dao.DeptDao;
import entity.Dept;
import org.apache.ibatis.session.RowBounds;
import service.DeptService;

import java.util.List;

/**
 * @author 南八
 */
public class DeptServiceImpl implements DeptService {

    private DeptDao dao;

    public void setDao(DeptDao dao) {
        this.dao = dao;
    }


    @Override
    public List<Dept> getAll(int pageNum, int pageSize) {
        //int offset = (pageNum-1)*pageSize;
        return dao.getAll(pageNum,pageSize);
    }

    @Override
    public int getUserCount() {
        return dao.getUserCount();
    }


}
