package com.piddubnyi.taskmanager.web.servlets;

import javax.servlet.http.*;
import javax.servlet.*;

public class HellowServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, java.io.IOException {
		java.io.PrintWriter out = resp.getWriter();
		String username = req.getParameter("username");
		out.println("Hellow " + username);
	};
}
