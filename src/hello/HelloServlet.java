package hello;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public HelloServlet() {
        System.out.println("===> HelloServlet ����");
    }
    
    public void init() throws ServletException {
    	System.out.println("---> init() ����");
    }
    
//    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    	System.out.println("---> service() ����");
//    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("---> doGet() ����");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("---> doPost() ����");
    }
    
    public void destroy() {
    	System.out.println("---> destroy() ����");
    }

}
