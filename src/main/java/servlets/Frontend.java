package servlets;

import org.eclipse.jetty.http.HttpStatus;
import templater.PageGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by user1 on 27.12.2016.
 */
public class Frontend extends HttpServlet {

    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        response.setStatus(HttpStatus.OK_200);
        String key = request.getParameter("key");

        response.getWriter().println(key);

    }
}
