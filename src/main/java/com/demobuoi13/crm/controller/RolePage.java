package com.demobuoi13.crm.controller;

import com.demobuoi13.crm.model.Role;
import com.demobuoi13.crm.service.RoleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "rolepage", urlPatterns = {"/role"})
public class RolePage extends HttpServlet {
    private RoleService roleService = new RoleService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Role> list = roleService.getAllRoles();
        req.setAttribute("roles", list);

        req.getRequestDispatcher("/rolepage.jsp").forward(req,resp);
    }
}
