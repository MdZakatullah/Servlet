package cookieImp2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie2")
public class CookieClass2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie cookie=new Cookie("gst","18%");
		Cookie cookie1=new Cookie("price","inINR");
		
		resp.addCookie(cookie);
		resp.addCookie(cookie1);
		
		resp.sendRedirect("cookie3");
		
		
	}


}
