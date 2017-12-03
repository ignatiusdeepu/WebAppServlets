package org.avco.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewCourseController extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		System.out.println(request.getParameter("courseId"));
	
	}
	
	public Double getExchangeRate(String srcCurrency,String destCurr){
		return 1.1;
	}
}
