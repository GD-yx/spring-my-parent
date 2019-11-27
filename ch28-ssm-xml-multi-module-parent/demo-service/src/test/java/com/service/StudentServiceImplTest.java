package com.service;


import com.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:service-spring.xml")
public class StudentServiceImplTest {
    @Autowired
    private StudentService service;

    @Test
    public void getAll(){
        List<Student> result = service.getAll(1,3);
        for (Student student : result) {
            System.out.println("student = " + student);
        }
    }
}
