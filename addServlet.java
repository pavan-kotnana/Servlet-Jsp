package com.pavan;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

@SuppressWarnings("serial")
public class addServlet extends HttpServlet {
//we need to use method in java to do something.servlet provides service
	//below instead of service method we can use doGet &doPost menthods for get/post requests accordingly
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
			Cookie cookie = new Cookie("k",k+"");
			res.addCookie(cookie);
			res.sendRedirect("sq");
	
	}

}
