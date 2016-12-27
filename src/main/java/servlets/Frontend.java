package servlets;

import org.eclipse.jetty.http.HttpStatus;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user1 on 27.12.2016.
 */
public class Frontend extends HttpServlet {
    private String login = "";
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setStatus(HttpStatus.OK_200);
        response.getWriter().println("<html><body>");
        response.getWriter().println(request.getParameter("key"));
        response.getWriter().println("</body></html>");
    }
}
