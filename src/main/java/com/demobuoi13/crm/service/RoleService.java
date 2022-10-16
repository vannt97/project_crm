package com.demobuoi13.crm.service;

import com.demobuoi13.crm.model.Role;
import com.demobuoi13.crm.repository.RolesRespository;

import java.util.List;

public class RoleService {
    private RolesRespository rolesRespository = new RolesRespository();

    public List<Role> getAllRoles(){
        return rolesRespository.getAllRole();
    }

    public boolean deleteRole(int id){
        return rolesRespository.deleteRoleById(id) > 0 ? true : false;
    }
}
