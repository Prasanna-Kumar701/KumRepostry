package program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResetServelt
 */
@WebServlet("/ResetServelt")
public class ResetServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String Email = request.getParameter("Email");
	String NewPassword = request.getParameter("New Passowrd");
	String ConfirmPassword = request.getParameter("Confirm Passowrd");
	response.setContentType("/text/html");
	PrintWriter out= response.getWriter();	
	

	if("Prasanna@gmail.com".equals(Email)&& "Prasanna@1".equals(NewPassword) && "Prasanna@1".equals(ConfirmPassword)) {
		System.out.println("Password Reset");
	}else {
		System.out.println("Try Again");
	}
}
}