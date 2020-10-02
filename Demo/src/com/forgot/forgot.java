package com.forgot;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.forgot.dao.forgotdao;

@WebServlet("/Forgot")
public class forgot extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name=request.getParameter("sname");
		String phn=request.getParameter("sphone");
		String email=request.getParameter("semail");
		String pass=request.getParameter("spass");
		System.out.println("Name:"+" "+name+"\n"+"\n"+"Phone:"+" "+phn
				+"\n"+"Email:"+" "+email+"\n"+"Passsword:"+" "+pass);
		forgotdao dao =new forgotdao();
		if(dao.check(name,phn,email,pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("name",name);
			session.setAttribute("phone", phn);
			session.setAttribute("email",email);
			session.setAttribute("pass",pass);
			if(dao.check1(name,pass)){
				response.sendRedirect("forgotted.jsp");
				}
			else {
				response.sendRedirect("forgot.html");
				}
			}
		else {
			response.sendRedirect("index.html");
		}
	}
}