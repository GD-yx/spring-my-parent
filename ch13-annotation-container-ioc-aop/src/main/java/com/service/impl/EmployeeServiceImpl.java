package com.service.impl;

import com.dao.EmployeeDao;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;

/**
 * @author 南八
 */
@Service
@Scope("singleton")
public class EmployeeServiceImpl implements EmployeeService {

    /**
     * 从spring 4.3之后,如果构造函数只有一个,spring
     * 会自动注入.就不需要额外再添加@Autowired注解
     *
     * 如果有多个构造函数,spring实例化对象时,就不知道用哪个构造函数
     * 所以至少在某一个构造函数上加Autowired注解以提示spring用哪一个
     * @param dao
     */
    @Autowired
    public EmployeeServiceImpl(EmployeeDao dao,CalcServiceImpl calcService) {
        System.out.println("-----debug: dao = " + dao  + " " + calcService);
    }

    public EmployeeServiceImpl(EmployeeDao dao) {
        System.out.println("-----debug: dao = " + dao  + " " );
    }
   /* @Autowired
    @Qualifier("employeeDaoImpl2")
    private EmployeeDao dao;*/

    @Autowired
    private List<EmployeeDao> employeeDaoList;

    @Autowired
    private Map<String ,EmployeeDao> employeeDaoMap;

    @Override
    public void update() {
        //dao.update();
    }
    @PostConstruct
    public void init(){
        System.out.println("init in serviceImpl---------");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy-----------");
    }

    public void displayAutowireCollectionInject(){
        for (EmployeeDao employeeDao:employeeDaoList){
            employeeDao.update();
        }
        System.out.println("----map");
        for (Map.Entry<String,EmployeeDao> entry:employeeDaoMap.entrySet()){
            System.out.println("-----debug: entry.getKey() + \"value: \"+ entry.getValue() = "
                    + entry.getKey() + "value: "+ entry.getValue());
        }
    }
}
