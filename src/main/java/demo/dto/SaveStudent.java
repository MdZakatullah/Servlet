package demo.dto;


import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import demo.dao.StudentDAO;

@WebServlet("/saveStudent")
public class SaveStudent extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String idCardNumber=req.getParameter("idCardNumber");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(idCardNumber);
		
		Student student =new Student();
		student.setId(id);
		student.setName(name);
		student.setEmail(email);
		student.setIdCardNumber(idCardNumber);
		
		StudentDAO dao=new StudentDAO();
		res.getWriter().println(dao.SaveStudent(student));
		
		
	}
	
	

}
