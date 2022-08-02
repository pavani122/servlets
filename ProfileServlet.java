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

public class ProfileServlet extends HttpServlet {
	String name;
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	
	
	RequestDispatcher dispatcher=req.getRequestDispatcher("link.html");
	dispatcher.include(req, res);
	
	/*
	 * Cookie[] cookies=req.getCookies(); if(cookies != null) { name =
	 * cookies[0].getValue(); }
	 */
	
	HttpSession session=req.getSession();
	if(session!=null)
	{
	name=(String)session.getAttribute("name");
	}

	if(!name.equals(""))
	{
	pw.println("<h1>Welcome,"+name+"</h1>");
	}
	else
	{
		pw.println("<h1>please login first!!!</h1>");
		req.getRequestDispatcher("login.html");
		dispatcher.include(req, res);
	}
	pw.close();
    }
}