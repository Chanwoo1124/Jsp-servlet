package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add") 
public class add extends HttpServlet {
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		
		int x_int = Integer.parseInt(x);
		int y_int = Integer.parseInt(y);
		int result = x_int + y_int;
		out.println("덧셈 결과 :"+result);
		
		
		
	}
}	
