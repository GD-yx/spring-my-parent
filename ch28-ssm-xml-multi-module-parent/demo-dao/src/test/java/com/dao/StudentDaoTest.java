package com.dao;

import com.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:dao-spring.xml")
public class StudentDaoTest {
    @Autowired
    private StudentDao dao;
    @Test
    public void getAll(){
        List<Student> studentDaos = dao.getAll(1,3);
        for (Student studentDao : studentDaos) {
            System.out.println("studentDao = " + studentDao);
        }
    }
}
