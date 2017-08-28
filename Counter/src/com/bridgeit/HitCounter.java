package com.bridgeit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HitsCounter
 */
public class HitCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private int hitCount;

	public void init() {
		// Reset hit counter.
		hitCount = 0;
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Set response content type
		response.setContentType("text/html");

		// This method executes whenever the servlet is hit
		// increment hitCount
		hitCount++;
		PrintWriter out = response.getWriter();
		String title = "Total Number of Hits";

		out.println(
				"<docType>\n" + "<html>\n" + "<head><title>" + title + "</title></head>\n" + "<h1 align = \"center\">"
						+ title + "</h1>\n" + "<h2 align = \"center\">" + hitCount + "</h2>\n" + "</body>" + "</html>");
	}
}
