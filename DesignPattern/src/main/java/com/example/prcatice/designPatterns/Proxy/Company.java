package com.example.prcatice.designPatterns.Proxy;

public class Company {

    private String companyName;
    private String companyAddress;
    private String ContactList;

    public Company(String companyName, String companyAddress, String contactList) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        ContactList = contactList;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getContactList() {
        return ContactList;
    }

    public void setContactList(String contactList) {
        ContactList = contactList;
    }
}
