package com.demobuoi13.crm.controller;

import com.demobuoi13.crm.config.MysqlConnection;
import com.demobuoi13.crm.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "login", urlPatterns = "/login")
public class LoginPage extends HttpServlet {
//    webapp sẽ truy cập thông qua datasource để kết nối với database , bất kỳ ngôn ngữ nào cũng vậy
//    jdbc giúp webapp kết nối với database
//    phải tạo thêm thư mục config để cho set up, cấu hình cho project này.
//    controller đảm nhiệm các bước liên kết trang cho nhau. nó là một trang thực hiện một cái gì đó trong trang đó khi đc get hoặc post
//    hoặc cái gì đó nữa

//
//    thư mục config nó có trách nhiệm kết nối database có hàm để kết nối, và có thể kết nối nhiều database khác nhau
//    thư mục respository đảm nhiệm các câu lệnh query đến database và nó chứa các hàm để gọi và trả về một cái gì đó
//    thư mục service đảm nhiệm vai trò lấy dữ liệu từ respository đã query trước đó
//    controller => service => respository => datasource(mysql connection) => database
//    controller <= service <= respository <= datasource <= database

//    statement thực hiện những câu lệnh truy vấn sql không cần truyền tham số còn
//    preparedstatment thực hiện các câu lệnh truy vấn sql có truyền tham số
//    callablestatement dùng để thực thi hoặc sử dụng stored procedures


//    co the add nhiêu cookie, cứ coi nó là 1 đối tượng là đc
    private LoginService loginService = new LoginService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
//        Cookie cookie = new Cookie("email", email);
//        cookie.setMaxAge(20000);
//        resp.addCookie(cookie);

//        Cookie[] cookieArr = req.getCookies();
//        for (Cookie cookie1:cookieArr){
//            System.out.println(cookie1.getName() + "- value: " + cookie1.getValue());
//        }

//        yeu cau su dung session
//        session co the luu kieu du lieu object
        HttpSession session = req.getSession();
        session.setAttribute("infoUser",password);
        session.setMaxInactiveInterval(5*60);

        System.out.println(session.getAttribute("infoUser"));

        if(loginService.checkLogin(email,password)){
            System.out.println("dang nhap thanh cong");
        }else {
            System.out.println("dang nhap that bai");
        }
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
