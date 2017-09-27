package co.simplon.poleEmploi.decouverte.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {

	private String messageGet;
	private String messagePut;

	public void init() throws ServletException {
		messageGet = "Hello ";
		messagePut = "Bonjour ";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String message = messageGet;
		String parametre = request.getParameter("nom");
		if (parametre != null) {
			message += parametre;
		} else {
			message += "World";
		}

//		response.setContentType("text/html");
//
//		PrintWriter out = response.getWriter();
//		out.println("<h1>" + message + "</h1>");
		
		request.setAttribute("message", message);
		this.getServletContext().getRequestDispatcher("/WEB-INF/hello.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String message = messagePut;
		String parametre = request.getParameter("nom");
		if (parametre != null && !parametre.isEmpty() ) {
			message += parametre.toUpperCase();
		} else {
			message += "World";
		}

		request.setAttribute("message", message);
//		response.setContentType("text/html");
//
//		PrintWriter out = response.getWriter();
//		out.println("<h1>" + message + "</h1>");
		this.getServletContext().getRequestDispatcher("/WEB-INF/hello.jsp").forward(request, response);
	}

	public void destroy() {

	}
}
