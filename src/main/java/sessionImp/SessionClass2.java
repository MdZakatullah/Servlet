package sessionImp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session2")
public class SessionClass2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		
		String id=(String)session.getAttribute("id");
		session.removeAttribute("id");
		
		String name=(String)session.getAttribute("name");
		session.removeAttribute("name");
		
		String email=(String)session.getAttribute("email");
		session.removeAttribute("email");
		session.setMaxInactiveInterval(1200);
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		out.println(id);
		out.write("<h1>");
		out.println(name);
		out.write("</h1>");
		out.println(email);
		
		
		out.println("ID is = "+id);
		out.println("NAME is = "+name);
		out.println("EMAIL is = "+email);
	}

}
