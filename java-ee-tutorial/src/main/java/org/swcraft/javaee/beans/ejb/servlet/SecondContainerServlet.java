package org.swcraft.javaee.beans.ejb.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.swcraft.javaee.beans.ejb.services.CacheBean;

@WebServlet("/secondcontainerEJB")
public class SecondContainerServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @EJB
    CacheBean cache;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        cache.add("second");
        response.getWriter().println(cache.getData());
    }

}