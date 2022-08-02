package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	pw.println("<h1>Servlet2</h1>");
	

	Cookie[] cookies=req.getCookies();
	boolean flag=false;
	String name="";
	if(cookies==null)
	{
		pw.print("<h1>You are new user go to homepage and submit</h1>");
	}
	else
	{
	for(Cookie c: cookies)
	{
		String tname=c.getName();
		if(tname.equals("userName"))
		{
			flag=true;
			name=c.getValue();
		}
	}
	}
	if(flag)
	{
	pw.println("<h2>Welcome back,"+name);
	pw.print("<h3>ThankYou");
	}
	}
}