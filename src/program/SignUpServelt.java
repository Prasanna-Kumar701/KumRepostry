package program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignUpServelt")
public class SignUpServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 	String firstname = request.getParameter("Firstname");
	        String lastname = request.getParameter("Lastname");
	        String email = request.getParameter("Email");
	        String password = request.getParameter("Password");
	        String gender = request.getParameter("gender");
	        response.setContentType("/text/html");
	        PrintWriter out=response.getWriter();
	        
	        if("Prasanna".equals(firstname)||"Kumar".equals(lastname) || "Prasanna@gmail.com".equals(email)|| "Kumar@1".equals(email) && "male".equals(gender)) {
	        	System.out.println("Register Sucessfully");
	        }else {
	        	System.out.println("Fill correct");
	        }
	}

}
