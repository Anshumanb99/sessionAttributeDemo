package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String myname=req.getParameter("name");
		String mypassword=req.getParameter("password");
		
		PrintWriter out=resp.getWriter();
		if(myname.equalsIgnoreCase("anshu") && mypassword.equalsIgnoreCase("123")) {
			//req.setAttribute("name_key", "anshuman");
			HttpSession session=req.getSession();
			session.setAttribute("name_key", "Anshuman");
			session.setAttribute("location_key", "India");
			session.setAttribute("gendere_key", "male");
			
			
			
			RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
	}else {
		resp.setContentType("text/html");
		out.print("<h1>Email password didnt match<h1>");
		RequestDispatcher rd=req.getRequestDispatcher("/index.html");
		rd.include(req, resp);
		
	}
	}

	
}
