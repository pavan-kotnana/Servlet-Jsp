package com.navap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException ,IOException {
		
		PrintWriter out = response.getWriter();
		out.println("hi ");
	// ServletContext ctx = getServletContext();
	//String str = ctx.getInitParameter("name");  //this method gives the value of the specified attribute
	 ServletConfig cg = getServletConfig();
	 String str = cg.getInitParameter("name");
		out.println(str);
	
		
		
	}

}
