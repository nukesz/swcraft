package org.swcraft.javaee.beans.pojo.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.swcraft.javaee.beans.pojo.services.HelloService;

@WebServlet("/hello")
public class WelcomeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private final HelloService service = new HelloService();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println(service.sayHello());
    }

}
