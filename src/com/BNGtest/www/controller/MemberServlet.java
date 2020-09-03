package com.BNGtest.www.controller;

import com.BNGtest.www.po.Member;
import com.BNGtest.www.service.MemberService;
import com.BNGtest.www.service.impl.MemberServiceImpl;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class MemberServlet extends HttpServlet {

    MemberService memberService = new MemberServiceImpl();
    public static Member realMember;

    protected void loginById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userName = (String) req.getParameter("username");
        String passWord = (String) req.getParameter("password");
        boolean b = memberService.login(userName,passWord);
        realMember = memberService.queryMemberById(userName);
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
