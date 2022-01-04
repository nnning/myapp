package com.app.j2ee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        System.out.println(name);
        System.out.println(password);

        String html = null;
        if ("admin".equals(name) && "1234".equals(password))
            html = "<div style='color:green'>success</div>";
        else
            html = "<div style='color:red'>fails</div>";

        PrintWriter pw = response.getWriter();
        pw.println(html);

    }
}
