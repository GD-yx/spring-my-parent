package service;

import entity.Dept;

import java.util.List;

/**
 * @author 南八
 */
public interface DeptService {
    List<Dept> getAll(int pageNum,int pageSize);
    int getUserCount();
}
