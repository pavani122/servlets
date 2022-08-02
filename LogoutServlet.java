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

public class LogoutServlet extends HttpServlet {
		
		@Override
		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
		{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("link.html");
		dispatcher.include(req, res);
		
		/*
		 * Cookie cookies=new Cookie("name",""); res.addCookie(cookies);
		 */
		
		HttpSession session=req.getSession();
		session.setAttribute("name","" );


		
		pw.println("<h1>You are successfully logged out!!!</h1>");
	
		
		}
}
