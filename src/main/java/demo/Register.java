package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Register extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		
		res.setContentType("text/html");
		
		String idCardNumber=req.getParameter("idCardNumber");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(idCardNumber);
		
		PrintWriter out = res.getWriter();
		
		out.println("<h1>" +"Hello"+name+"</h1>");
		out.println("<h2>"+ "Thankyou for regitration" +"</h2>");
		out.println("<h2>"+ "your id is" +id+"</h2>");
		out.println("<h3>"+ "please verify your details email idCardNumber"+"</h3>");
		
	}

}
