package demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import demo.dao.StudentDAO;
import demo.dto.Student;

@WebServlet("/getbyid")
public class GeTStudentById extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		StudentDAO dao=new StudentDAO();
		Student student =dao.getStudenttById(id);
		PrintWriter out=res.getWriter();
		out.println(student);
		
	}

}
