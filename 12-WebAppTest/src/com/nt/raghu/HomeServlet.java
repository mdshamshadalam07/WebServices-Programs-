package com.nt.raghu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class HomeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req ,HttpServletResponse resp) 
			                                         throws ServletException ,IOException {
		System.out.println(req.getClass().getName());
		                          resp.getWriter().print("Check Cansole");
		
	}

}
