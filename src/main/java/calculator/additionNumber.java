package calculator;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class additionNumber extends HttpServlet {
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		PrintWriter out =res.getWriter();
		
		out.println("the addition of two numbers is :"+k);
	}

}
