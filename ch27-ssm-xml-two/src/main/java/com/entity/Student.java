package com.entity;

import lombok.*;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * @author 南八
 */
/*@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString*/
@Data
public class Student {
    Integer id;
    @NotEmpty
    @Size(min = 1,max = 10)
    String name;
    String address;
    @FutureOrPresent
    Date hiredate;

   /* @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", hiredate=" + hiredate +
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Student(Integer id, String name, String address, Date hiredate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.hiredate = hiredate;
    }

    public Student() {
    }*/
}
