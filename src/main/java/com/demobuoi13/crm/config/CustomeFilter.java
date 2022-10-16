package com.demobuoi13.crm.config;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
//cai filter nay giong nhu cách cửa đến với servlet khi mình request tới trang đó thì phải đến cái này
//có 2 cách dùng filter để lọc
// cách 1 dùng xml
//cách 2 dùng anitonation - mình dùng cách 2
public class CustomeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("check filter");

//        httpSerletrequest la con cua thằng ServletRequest và response cũng vậy

//      mình ép kiểu như này là dùng đc thuộc tính HttepServletRequest và resposne
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        HttpServletResponse response = (HttpServletResponse) servletResponse;
//
//        HttpSession session = request.getSession();
//        if(session.getAttribute("isLogin") != null && !session.getAttribute("isLogin").equals("")){
//            boolean isLogin = (boolean) session.getAttribute("isLogin");
//
//            if(isLogin){
//                if(request.getServletPath().equals("/login")){
//                    response.sendRedirect(request.getContextPath() + "/home");
//                }else {
//                    filterChain.doFilter(request,response);
//                }
//            }
//        }else {
//            if(request.getServletPath().equals("/login")){
//                filterChain.doFilter(request,response);
//            }else {
//                response.sendRedirect(request.getContextPath() + "/login");
//            }
//        }

        filterChain.doFilter(servletRequest,servletResponse);
    }
}
