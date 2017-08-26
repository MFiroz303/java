package com.bridgeit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Auth
 */
// @WebServlet("/Auth")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		System.out.println(userName);

		if (userName.equals("root") && password.equals("root")) {
			System.out.println("User Found/....");
		} else {
			System.out.println("username And password is not correct");
		}
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		if (userName.equals("root") && password.equals("root")) {
			out.print("<br>Welcojme to Hello Servlet</br>");
		} else {
			out.print("<br>ERROR</br>" + "<br>Entered Wrong UserName or password</br>");
		}
	}

}
