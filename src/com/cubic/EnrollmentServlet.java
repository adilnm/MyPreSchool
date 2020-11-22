package com.cubic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Enrollment")
public class EnrollmentServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter pw=response.getWriter();
		
		String name=request.getParameter("childName");
		String age=request.getParameter("childAge");
		String program=request.getParameter("program");
		pw.println(name+" Who is "+age+" years old is enrolled in "+program+" program");
	}

}
