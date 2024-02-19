package com.example.prcatice.designPatterns.Proxy;

import com.example.prcatice.BharatPe.Employee;

import java.util.List;

public class ContactListProxy implements ContactList{
    private ContactList contactList;
    @Override
    public List<Employee> getContactList() {
        if(contactList==null){
            contactList =new CompanyListImpl();
        }
        return contactList.getContactList();
    }
}
