package com.employees.employees.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


@WebFilter("/login")
public class LoginFilter extends HttpFilter {
    private static final Logger FILTER_LOGGER = Logger.getLogger("FilterLogger");

    @Override
    public void init() throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    protected void doFilter(HttpServletRequest req,
                            HttpServletResponse res,
                            FilterChain chain) throws IOException, ServletException {
        FILTER_LOGGER.entering("LoginFilter", "doFilter()");

        HttpSession httpSession = req.getSession();
        FILTER_LOGGER.log(Level.INFO, "getting username and password from user");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        chain.doFilter(req, res);

    }
}
