package ru.test.filters;


import javax.servlet.*;
import java.io.IOException;

public class Filter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter 2 initialized");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 2: before servlet");
        filterChain.doFilter(servletRequest,servletResponse); //передали управление далее...
        System.out.println("Filter 2: after servlet");
    }

    @Override
    public void destroy() {
        System.out.println("Filter 2 destroyed");
    }
}
