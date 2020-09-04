package com.BNGtest.www.controller;

import com.BNGtest.www.po.Manager;
import com.BNGtest.www.service.ManagerService;
import com.BNGtest.www.service.impl.ManagerServiceImpl;
import com.google.gson.Gson;

import javax.management.DynamicMBean;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ManagerServlet extends HttpServlet {

    ManagerService managerService = new ManagerServiceImpl();
    public static Manager realManager;

    protected void loginById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = (String) req.getParameter("username");
        String passWord = (String) req.getParameter("password");
        boolean b = managerService.login(userName,passWord);
        realManager = managerService.queryManagerById(userName);
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("result",b);
        Gson gson = new Gson();
        String json = gson.toJson(resultMap);
        resp.getWriter().write(json);
    }

    protected void loginByEmail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = (String) req.getParameter("username");
        String passWord = (String) req.getParameter("password");
        boolean b = false;
        HttpSession session = req.getSession();
        String verCode = String.valueOf( session.getAttribute("verCode"));
        System.out.println(session.getAttribute("verCode"));
        System.out.println(passWord.trim().equals(verCode));
        if (passWord.trim().equals(verCode)){
            realManager = managerService.queryManagerByEmail(userName);
            if (realManager!=null){
                b = true;
            }
        }
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("result",b);
        Gson gson = new Gson();
        String json = gson.toJson(resultMap);
        resp.getWriter().write(json);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        Method method = null;
        try {
            method = this.getClass().getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);
            method.invoke(this,req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
