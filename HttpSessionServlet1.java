package com.training;
import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HttpSessionServlet1 extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<h1>Servlet1</h1>");
		String name=req.getParameter("userName");
		
		HttpSession session=req.getSession();
		session.setAttribute("name",name);
		
		
		pw.println("<h1>Welcome,"+name+"</h1>");
		pw.println("<form action=submitName2>");
		pw.println("<input type='submit' value='GotoServlet2'>");
		pw.println("<form>");

	}

}
