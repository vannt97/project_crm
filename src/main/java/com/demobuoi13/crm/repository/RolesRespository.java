package com.demobuoi13.crm.repository;

import com.demobuoi13.crm.config.MysqlConnection;
import com.demobuoi13.crm.model.Role;
import com.demobuoi13.crm.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RolesRespository {

    public List<Role> getAllRole(){
        List<Role> list = new ArrayList<>();
        try {
            String query = "select * from role ;";
            Connection connection = MysqlConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Role role = new Role(resultSet.getInt("id"),resultSet.getString("name_role"),resultSet.getString("description"));
                list.add(role);
            }
            connection.close();
        }catch (Exception e){
            System.out.println("Error get All Role: " + e.getMessage());
        }
        return list;
    }

    public int deleteRoleById(int id){
        int isDetele = 0;
        try {
            String query = "delete from role r where r.id = ?;";
            Connection connection = MysqlConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            isDetele = preparedStatement.executeUpdate();

            connection.close();
        }catch (Exception e){
            System.out.println("Error get All Role: " + e.getMessage());
        }

        return  isDetele;
    }
}
