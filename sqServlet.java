 package com.pavan;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/sq")
public class sqServlet extends HttpServlet
{	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int k = 0;
		Cookie cookies[] = req.getCookies();
		for (Cookie c : cookies) {
			if (c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}

		k = k * k;
		PrintWriter out = res.getWriter();
		out.println("result is :" + k);
		
	}
	
	

}
