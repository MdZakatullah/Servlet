package demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class Login extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email="rahul123@gmail.com";
		String  pass="1234";
		
		String reqEmail=req.getParameter("email");
		String reqPass=req.getParameter("pass");
		
		PrintWriter out=res.getWriter();
		
		if(reqEmail.equals(email) && reqPass.equals(pass)) {
			out.println("WELCOME!!! user");
			
		}else {
			out.println("INVALID email or password");
		}
		
		out.println("doPost() executed");
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email="rahul123@gmail.com";
		String  pass="1234";
		
		String reqEmail=req.getParameter("email");
		String reqPass=req.getParameter("pass");
		
		PrintWriter out=res.getWriter();
		
		if(reqEmail.equals(email) && reqPass.equals(pass)) {
			out.println("WELCOME!!! user");
			
		}else {
			out.println("INVALID email or password");
		}
		
		out.println("doGet() executed");
	}	

	}



