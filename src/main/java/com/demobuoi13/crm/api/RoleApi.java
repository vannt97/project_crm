package com.demobuoi13.crm.api;

import com.demobuoi13.crm.model.User;
import com.demobuoi13.crm.payload.ResponseData;
import com.demobuoi13.crm.service.RoleService;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "apiRole" , urlPatterns = {"/api/role"})
public class RoleApi extends HttpServlet {
    private Gson gson = new Gson();
    private RoleService roleService = new RoleService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        boolean isSuccess = roleService.deleteRole(id);
        System.out.println("thanh cong"+ isSuccess);
        ResponseData responseData = new ResponseData();
        responseData.setStatus(200);
        responseData.setSuccess(isSuccess);
        responseData.setDescription(isSuccess ? "Xóa Thành công" : "Xóa Thất bại");


        PrintWriter out = resp.getWriter();
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        out.print(gson.toJson(responseData));
        out.flush();
    }
}
