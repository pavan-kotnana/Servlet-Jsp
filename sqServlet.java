 package com.pavan;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class sqServlet extends HttpServlet
{	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	
		HttpSession session = req.getSession();
		int k = (int)session.getAttribute("k");
		k = k*k;
		PrintWriter out = res.getWriter();
		out.println("result is :" +k);
		
	}
	
	

}
