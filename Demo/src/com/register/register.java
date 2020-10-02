package com.register;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.register.dao.registerdao;

@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String first=request.getParameter("fname");
		String last=request.getParameter("lname");
		String name=first+last;
		String birth=request.getParameter("birthday");
		String gender =request.getParameter("gender");
		String phn=request.getParameter("phone");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		System.out.println("Name:"+" "+name+"\n"+"Birthday:"+" "+birth+"\n"+"Gender:"+" "+gender+"\n"+"Phone:"+" "+phn
				+"\n"+"Email:"+" "+email+"\n"+"Passsword:"+" "+pass);
		registerdao dao=new registerdao();
		if(dao.check(name,birth,gender,phn,email,pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("name",name);
			session.setAttribute("birthday",birth);
			session.setAttribute("gender",gender);
			session.setAttribute("phone",phn);
			session.setAttribute("email",email);
			session.setAttribute("pass",pass);
			if(dao.check1(name,pass)){
				response.sendRedirect("registered.jsp");
			}
			else {
				response.sendRedirect("register.html");
			}
		}
	else {
		response.sendRedirect("register.html");
		}
	}
}
