package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Processing doGet req by third Servlet");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Accepting data from browser and printing it
		String message = req.getParameter("message");
		System.out.println("Form submitted");
		System.out.println("Message : " + message);
		
		//Sending data to browser
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		Date date = new Date(1);
		writer.print("<h1>Form submitted </h1>");
		writer.print("""
				<h2>Message : %s</h2>
				<h3>Current date is : %s</h3>
				""".formatted(message, date));
		
		
	}

}
