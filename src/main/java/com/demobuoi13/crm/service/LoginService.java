package com.demobuoi13.crm.service;

import com.demobuoi13.crm.model.User;
import com.demobuoi13.crm.repository.UserRespository;

import java.util.List;

public class LoginService {
    UserRespository userRespository = new UserRespository();

    public boolean checkLogin(String email, String password){

        List<User> list = userRespository.getUserByEmailAndPassword(email,password);
        if(list.size()>0){
            return  true;
        }else {
            return false;
        }
    }
}
