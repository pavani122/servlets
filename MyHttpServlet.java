package com.techouts.sample;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHttpServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<h1>HttpServlet Sample</h1>");
		String name=req.getParameter("userName");
		String number=req.getParameter("userNumber");
		String email=req.getParameter("userMailId");
		String gender=req.getParameter("userGender");
		String qualification=req.getParameter("userQual");
		String agree=req.getParameter("userAgree");
		
		
		
		


	if(agree != null)
		{
			pw.println("<h2><b>Name:</b>"+name+"</h2>");
			pw.println("<h2><b>Number:</b>"+number+"</h2>");
			pw.println("<h2><b>Email:</b>"+email+"</h2>");
			pw.println("<h2><b>Gender:</b>"+gender+"</h2>");
			pw.println("<h2><b>Qualification</b> :"+qualification+"</h2>");
			
			req.setAttribute("country", "India");
			req.setAttribute("name", name);

			

			
			RequestDispatcher disp=req.getRequestDispatcher("success");
			disp.include(req, res);

		}
		else
	   {
		pw.print("<h1>Need to agree the terms & conditions</h1>");
			
		RequestDispatcher disp=req.getRequestDispatcher("/appForm.html");
		disp.include(req, res);	
		}


	}

}
