package com.spring.boot.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class employee {
    private Integer id;
    private Integer gender;
    private String lastName;
    private String email;
    private Date birth;
    private Department department;

    public employee(Integer id, Integer gender, String lastName, String email,Department department) {
        this.id = id;
        this.gender = gender;
        this.lastName = lastName;
        this.email = email;
        this.birth = new Date();
        this.department = department;
    }
}
