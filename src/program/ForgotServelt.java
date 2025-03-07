package program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForgotServelt
 */
@WebServlet("/ForgotServelt")
public class ForgotServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Email= request.getParameter("Email");
		String MobileNo = request.getParameter("Mobile No");
		response.setContentType("/text/html");
		PrintWriter out= response.getWriter();
		if("Email".equals(Email)&& "Mobile No".equals(MobileNo)) {
			System.out.println("Password is Sucessfully reset");
		}else {
			System.out.println("Try Again");
		}
	}

}
