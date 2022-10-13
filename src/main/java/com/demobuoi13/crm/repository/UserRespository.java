package com.demobuoi13.crm.repository;

import com.demobuoi13.crm.config.MysqlConnection;
import com.demobuoi13.crm.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserRespository {
//    thuc hiện kết nối cần String query
//    đối với lấy giá trị nào đó dùng select => excuteQuery
//    còn insert,update, delete => excuteUpdate
//    khi mở thì nên đóng lại
    public List<User> getUserByEmailAndPassword(String email, String password){
        List<User> userList = new ArrayList<User>();
        try {
            String query = "select * from user u where u.email=? and u.password=?;";
            Connection connection = MysqlConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,email);
            preparedStatement.setString(2,password);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                User user = new User();
                user.setEmail(resultSet.getString("email"));
                user.setId(resultSet.getInt("id"));
                user.setAddress(resultSet.getString("address"));
                user.setName(resultSet.getString("name"));
                user.setPhoneNumber(resultSet.getString("phone_number"));
                user.setRoleId(resultSet.getInt("role_id"));
                userList.add(user);
            }

            connection.close();

        }catch (Exception e){
            System.out.println("Error get User: " + e.getMessage());
        }
        return userList;
    }
}
