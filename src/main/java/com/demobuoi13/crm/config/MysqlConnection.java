package com.demobuoi13.crm.config;

import java.sql.Connection;
import java.sql.DriverManager;

//thu muc config nay có nhiệm vụ kết nối với nhiều database hoặc 1 database
public class MysqlConnection {

    public static Connection getConnection()  {
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/project_crm","root","qweedc@123");
            System.out.println("Ket noi thanh cong");
        }catch (Exception e){
            System.out.println("Error connect database " + e.getMessage());
        }

        return  connection;
    }
}
