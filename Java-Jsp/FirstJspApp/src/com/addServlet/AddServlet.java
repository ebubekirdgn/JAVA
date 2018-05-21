package com.addServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

 

public class AddServlet extends HttpServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 
		int i =Integer.parseInt(req.getParameter("s1"));
		int j =Integer.parseInt(req.getParameter("s2"));
		
		int mul = i+j;
		
		System.out.println("Result is : " + mul);
	}
}
