package com.demobuoi13.crm.model;

public class User {
//    id int not null auto_increment,
//    name varchar(255) not null,
//    phone_number varchar(10) not null,
//    address varchar(255),
//    email varchar(100) not null,
//    password varchar(100) not null,
//    role_id int not null,

    private int id;
    private String name;
    private String phoneNumber;
    private String address;
    private String email;
    private String password;
    private int roleId;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
