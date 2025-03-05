package program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServelt")
public class LoginServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String Email=request.getParameter("Email");
	String Password=request.getParameter("Password");
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	if("Prasanna@email".equals("email") && "12345@1".equals("Password"))
	{
		System.out.println("Login Sucess");
	}else {
		
	}System.out.println("Failed to Login");
	}
	
	}


