package com.entity;

import javax.validation.constraints.*;
import java.util.Date;

/**
 * @author 南八
 */
public class Student {
    private Integer id;
    @NotEmpty
    @Size(min = 1,max = 10)
    private String name;
    private Integer sex;
    @Min(0)
    private Integer age;
    private String address;
    private String phone;
    @FutureOrPresent
    private Date hiredate;
    private Integer deptid;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", hiredate=" + hiredate +
                ", deptid=" + deptid +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Student() {
    }

    public Student(Integer id, @NotEmpty @Size(min = 1, max = 10) String name, Integer sex, @Min(0) Integer age, String address, String phone, @FutureOrPresent Date hiredate, Integer deptid) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.hiredate = hiredate;
        this.deptid = deptid;
    }
}
