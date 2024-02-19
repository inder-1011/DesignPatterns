package com.example.prcatice.BharatPe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Employee e = new Employee(1,"Arun",1);
        Employee e1 = new Employee(2,"inder",2);
        Employee e2 = new Employee(3,"akku",3);
        Employee e3 = new Employee(4,"shashi",40);
        Employee e4 = new Employee(5,"tarun",50);
        Employee e5 = new Employee(3,"akku1",6);
        Employee e6 = new Employee(4,"shash2",7);
        Employee e7 = new Employee(5,"tarun3",8);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e1);
        employeeList.add(e5);
        employeeList.add(e6);
        employeeList.add(e7);

        List<Employee> result = employeeList.stream().sorted(Comparator.comparingDouble(n->-n.getSalary())).limit(5).collect(Collectors.toList());
        double re = result.get(4).getSalary();

        System.out.println(re);
    }

}
