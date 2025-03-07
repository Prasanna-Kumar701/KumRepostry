package program;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");

        String formType = request.getParameter("formType");

        if (formType.equals("address")) {
            processAddressForm(request, response);
        } else if (formType.equals("education")) {
            processEducationForm(request, response);
        } else if (formType.equals("family")) {
            processFamilyForm(request, response);
        } else {
           
            PrintWriter out = response.getWriter();
            out.println("Unknown form type submitted.");
        }
    }

    private void processAddressForm(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String country = request.getParameter("country");

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Address Form Response</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Address Form Submission Details</h1>");
        out.println("<p>City: " + city + "</p>");
        out.println("<p>State: " + state + "</p>");
        out.println("<p>Country: " + country + "</p>");
        out.println("</body>");
        out.println("</html>");
    }

    private void processEducationForm(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String highestQualification = request.getParameter("highest-qualification");
        String passoutYear = request.getParameter("passout-year");
        String percentage = request.getParameter("percentage");

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Education Form Response</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Education Form Submission Details</h1>");
        out.println("<p>Highest Qualification: " + highestQualification + "</p>");
        out.println("<p>Passout Year: " + passoutYear + "</p>");
        out.println("<p>Percentage: " + percentage + "</p>");
        out.println("</body>");
        out.println("</html>");
    }

    private void processFamilyForm(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String fatherName = request.getParameter("father-name");
        String motherName = request.getParameter("mother-name");
        String noOfSiblings = request.getParameter("no-of-siblings");

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Family Form Response</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Family Form Submission Details</h1>");
        out.println("<p>Father Name: " + fatherName + "</p>");
        out.println("<p>Mother Name: " + motherName + "</p>");
        out.println("<p>No. of Siblings: " + noOfSiblings + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
