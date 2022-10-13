package com.demobuoi13.crm.config;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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



        filterChain.doFilter(servletRequest,servletResponse);
    }
}
