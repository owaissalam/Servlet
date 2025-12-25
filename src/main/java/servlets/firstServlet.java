package servlets;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/first")
public class firstServlet implements Servlet{
	
	private ServletConfig servletConfig;

	@Override
	public void destroy() {
		System.out.println("Destroying Servlet");
		
	}
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Initializing Servlet");
		this.servletConfig = arg0;
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Service request");
		
		
	}
	
	//Non-lifecycle methods

	@Override
	public ServletConfig getServletConfig() {
		return servletConfig;
	}

	@Override
	public String getServletInfo() {
		return "Servlet created by : OwaisSalam";
	}

}
