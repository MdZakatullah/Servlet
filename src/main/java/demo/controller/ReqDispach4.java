package demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reqDis4")
public class ReqDispach4 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user="abcd789";
		String pass="12345";
		
		String reqUser=req.getParameter(user);
		String reqPass=req.getParameter(pass);
		
		PrintWriter out=resp.getWriter();
		
		if(reqUser.equals(user) && reqPass.equals(pass)) {
			out.println("WELCOME !!!! to the page!");
		}
		else {
			out.println("INVALID user or password");
		}
	}

}
