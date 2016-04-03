package org.swcraft.javaee.beans.pojo.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.swcraft.javaee.beans.pojo.services.Cache;

@WebServlet("/firstcontainer")
public class FirstContainerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private final Cache cache = Cache.getInstance();
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
		cache.add("first");
        response.getWriter().println(cache.getData());
    }
	
}