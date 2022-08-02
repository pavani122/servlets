package com.techouts.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	
	RequestDispatcher dispatcher=req.getRequestDispatcher("link.html");
	dispatcher.include(req, res);
	
	String name=req.getParameter("userName");
	String password=req.getParameter("password");
	if(password.equalsIgnoreCase("pavani810"))
	{
		pw.println("<h1>You are successfully logged in!</h1>");
		pw.println("<h1>Welcome,"+name+"</h1>");
		
		/*
		 * Cookie cookies=new Cookie("name",name); res.addCookie(cookies);
		 * pw.println("Login serv "+cookies.getValue());
		 */
		HttpSession session=req.getSession();
		session.setAttribute("name",name );
		

	}
	else
	{
		pw.println("<h1>error,username or password incorrect</h1>");
		req.getRequestDispatcher("link.html");
		dispatcher.include(req, res);

	}
	pw.close();
	}
}
