package com.methodDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Method3 {

    private static class EmployeeDetail
    {   int id;
        String name;
        int Salary;

    }
    //For Employees having salary more that 10000 give 5% raise else give 7% raise.
    // Condition: You cannot collect the Stream. Also write the program in Functional stylepublic
    //
    public Stream<EmployeeDetail> giveSalaryHike(Stream<EmployeeDetail> employeeDetailStream) {
        employeeDetailStream.map(emp ->
           emp.Salary = emp.Salary > 10000 ? (int) (emp.Salary* 1.05) : (int) (emp.Salary* 1.07)
        );

        return employeeDetailStream;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"John","IT");
        Employee emp2 = new Employee(2,"Sam","IT");
        Employee emp3 = new Employee(3,"Mohan","QA");
        Employee emp4 = new Employee(4,"Vivek","Dev");
        List<Employee> empList = List.of(emp1,emp2,emp3,emp4);
        getDepartWiseEmpoyee(empList);

    }

    public static HashMap<String,Employee> getDepartWiseEmpoyee(List<Employee> empList) {
        HashMap<String,List<Employee>> map = new HashMap<>();
        empList.forEach(e->{
            List<Employee> list = new ArrayList<>();
            list.add(e);
            map.put(e.getDepartment(), list);
        });
        return null;
    }
}
