package ru.test.filters;


import javax.servlet.*;
import java.io.IOException;

public class Filter1 implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter 1 initialized");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 1: before servlet");
        filterChain.doFilter(servletRequest,servletResponse); //передали управление далее...
        System.out.println("Filter 1: after servlet");
    }

    @Override
    public void destroy() {
        System.out.println("Filter 1 destroyed");
    }
}
