package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add2") 
public class add2 extends HttpServlet {
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String[] num_ = request.getParameterValues("num");
//		String y = request.getParameter("y");
		
		int result = 0;
		for (int i=0; i<num_.length;i++) {
			int num = Integer.parseInt(num_[i]);
			result += num;
		}
//		int x_int = Integer.parseInt(x);
//		int y_int = Integer.parseInt(y);
//		int result = x_int + y_int;
		out.println("덧셈 결과 :"+result);
		
		
		
	}
}	
