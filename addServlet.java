package com.pavan;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class addServlet extends HttpServlet {
//we need to use method in java to do something.servlet provides service
	//below instead of service method we can use doGet &doPost menthods for get/post requests accordingly
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
	//	PrintWriter out =res.getWriter();
	 //   out.println("result is : "+ k);
	 // res.getWriter().println("result is :" + k);   // optional we can also directly use this
	
	RequestDispatcher rd =req.getRequestDispatcher("sq");
	//RequestDispatcher is a interface so we can't instantiate it.
	req.setAttribute("k", k);
	rd.forward(req, res);
	//to share data between 2 servlets we use concept of session management
	 //since there is also req obj in sqservlet we are inputting k data to it.
	}

}
