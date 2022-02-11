package com.methodDemo;

public class Employee {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    private String name;
    private String department;

    public  Employee(Integer id, String name, String department){
        this.id=id;
        this.name=name;
        this.department=department;
    }
}
