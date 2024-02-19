package com.example.prcatice.designPatterns.Proxy;

import com.example.prcatice.BharatPe.Employee;

import java.util.ArrayList;
import java.util.List;

public class CompanyListImpl implements ContactList{
    @Override
    public List<Employee> getContactList() {
        return getList();
    }

    private static List<Employee> getList(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add( new Employee(1,"Arun",1));
        employeeList.add( new Employee(2,"inder",1));
        employeeList.add( new Employee(3,"Akku",1));
        return employeeList;

    }
}
