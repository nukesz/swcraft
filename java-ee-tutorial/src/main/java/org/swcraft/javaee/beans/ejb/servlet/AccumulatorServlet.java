package org.swcraft.javaee.beans.ejb.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.swcraft.javaee.beans.ejb.services.IncrementerServiceBean;

@WebServlet("/accEJB")
public class AccumulatorServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @EJB
    IncrementerServiceBean incrementerService;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println(incrementerService.getNext());
    }

}