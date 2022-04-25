package com.spring.boot.demo.dao;

import com.spring.boot.demo.pojo.Department;
import com.spring.boot.demo.pojo.employee;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Repository
public class departmentDao {

    private static Map<Integer,employee> employees = null;
    static{
        employees  = new HashMap<Integer, employee>();
        employees.put(1001,new employee(1001,1,"se","111@qq.com",new Department(1,"市场部")));
        employees.put(1002,new employee(1002,1,"hb","123@qq.com",new Department(2,"组织部")));
        employees.put(1003,new employee(1003,0,"zhangsan","111@163.com",new Department(3,"研发部")));
        employees.put(1004,new employee(1004,1,"lisi","888@qq.com",new Department(4,"测试部")));
    }

    public Integer getDepartmentIdById(Integer id){
        return  employees.get(id).getDepartment().getId();
    }
    public String getDepartmentName(Integer id){
        return employees.get(id).getDepartment().getDepartmentName();
    }
}
