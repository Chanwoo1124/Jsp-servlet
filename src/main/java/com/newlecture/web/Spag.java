package com.newlecture.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/spag")
public class Spag extends HttpServelet{
	private void doGet(HttpServletRequest request, HttpServletResponse resp) {
		  
		int num = 0;
		String num_ = request.getParameter("n");
		if (num_ != null && !num_.equals("")){
			num = Integer.parseInt(num_);
		}
		
		String result;
		if (num % 2 != 0){
			result = "홀수";
		}else{
			result = "짝수";
		}
		//redirect 새로운 요청
		//forward 
		RequestDispatcher dispatcher = request.getRequestDispatcher("spag.jsp");
		dispatcher.forward(request, resp);
	}
}