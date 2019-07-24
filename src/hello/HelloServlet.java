package hello;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	
    protected void doGet(HttpServletRequest request, 
    		             HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("---> doGet() ½ÇÇà");
    	System.out.println(request.getMethod());
    	System.out.println(request.getRequestURI());
    	System.out.println(request.getProtocol());
    	System.out.println(request.getHeader("User-Agent"));
    	System.out.println(request.getParameter("id"));
    }

}
