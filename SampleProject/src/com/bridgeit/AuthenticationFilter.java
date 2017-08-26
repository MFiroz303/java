package com.bridgeit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 * Servlet implementation class Sample
 */
public class AuthenticationFilter implements Filter {
	
       private static final long serialVersionUID = 1L;
	
	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		PrintWriter out = response.getWriter();

	//	String username = request.getParameter("username");
		//String password = request.getParameter("password");
		//System.out.println(username);

		//if (username.equals("root") && password.equals("root")) {
			chain.doFilter(request, response);
	//	} else {
			//out.println("username And password is not correct");
		//}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	
}