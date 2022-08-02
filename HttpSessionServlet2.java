package com.training;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HttpSessionServlet2 extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		HttpSession session=req.getSession();
		String name=(String)session.getAttribute("name");
		
		pw.println("<h1>Servlet2</h1>");
		pw.println("<h1>Welcome,"+name+"</h1>");
		
		

	}

}
