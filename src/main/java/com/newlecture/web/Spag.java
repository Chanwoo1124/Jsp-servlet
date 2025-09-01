package com.newlecture.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/spag")
public class Spag extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
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
		
		Map<String, Object> notice = new HashMap<String, Object>();
		notice.put("id", 1);
		notice.put("title", "EL은좋아요");
				
		String[] names = {"newlec","dragon"};
		request.setAttribute("result", result);
		request.setAttribute("names", names);
		request.setAttribute("notice", notice);
		
		
		//forward 현재 작업한 내용을 이어갈때 사용
		//redirect 현재 작업한 내용과 상관없이 새로운 요청을 할때 
		RequestDispatcher dispatcher = request.getRequestDispatcher("spag.jsp");
		dispatcher.forward(request, response);
		
		

	}
}