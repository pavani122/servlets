package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieSample extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	pw.println("<h1>Servlet1</h1>");
	String name=req.getParameter("userName");
	pw.println("<h1>Hello,"+name+"</h1>");
	pw.print("<form action='servlet2'>");  
	pw.print("<input type='submit' value='GoToServlet2'>");  
	pw.print("</form>");  
	
	Cookie c=new Cookie("userName",name);
    res.addCookie(c);
	
	}
}
