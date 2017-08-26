package com.bridgeit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleRequest
 */

public class SampleRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		             throws ServletException ,IOException {
	
	resp.setContentType("text/html");
	PrintWriter printWriter=resp.getWriter();
	
	String userName=req.getParameter("username");
	String password=req.getParameter("password");
	
	printWriter.println("welcome: " +userName);
	printWriter.println("welcome: " +password);
	}
}