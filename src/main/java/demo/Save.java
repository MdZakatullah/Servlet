package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/save")
public class Save extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Hello world");
		
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String email=req.getParameter("email");
		
		res.setContentType("text/html");  //this method is used to modified the content type of the response by default content type of a response text
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(age);
		
		PrintWriter out = res.getWriter();
		
		out.write("<body bgcolor=cyan>");
		out.println("<h1>"+id+"</h1>");
		
		out.println(id);
		out.println(name);
		out.println(email);
		out.println(age);
		
		out.write("</body>");
	}

}
