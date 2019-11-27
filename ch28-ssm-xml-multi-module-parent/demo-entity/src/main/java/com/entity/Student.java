package com.entity;

import lombok.Data;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * @author 南八
 */
@Data
public class Student {

    private Integer id;
    @NotEmpty
    @Size(min = 1,max = 10)
    private String name;
    private String address;
    @FutureOrPresent
    private Date hiredate;

}
