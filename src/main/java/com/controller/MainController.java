package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ClassDao;
import com.dao.StudentDao;
import com.dao.SubjectDao;
import com.dao.TeacherDao;
import com.dao.Validate;
import com.dao.assigntdao;
import com.entity.ClassDetails;
import com.entity.*;
import com.entity.Subject;
import com.entity.Teacher;

@WebServlet("/MainController")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MainController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String page = request.getParameter("page");
		
		switch (page) {
		
		case "listofteacher":
			listofteacher(request, response);

			break;

		case "listofstudents":

			listofstudents(request, response);

			break;

		case "listofclass":

			listofclass(request, response);

			break;

		case "listofsubject":

			listofsubject(request, response);

			break;
			
		case "assignt":

			assignt(request, response);

			break;	

		default:

			request.getRequestDispatcher("error.jsp").forward(request, response);
			break;
		}
	}

	private void assignt(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("assignT.jsp").forward(request, response);
		
	}

	private void listofteacher(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		session.getAttribute("username");

		List<Teacher> subject = new TeacherDao().listteacher();
		request.setAttribute("listteacher", subject);
		request.getRequestDispatcher("teacher.jsp").forward(request, response);

	}

	private void listofsubject(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		session.getAttribute("username");

		List<Subject> subject = new SubjectDao().listsubject();
		request.setAttribute("listsubject", subject);
		request.getRequestDispatcher("subject.jsp").forward(request, response);

	}

	private void listofclass(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		session.getAttribute("username");

		List<ClassDetails> classset = new ClassDao().listclass();
		request.setAttribute("listclass", classset);
		request.getRequestDispatcher("class.jsp").forward(request, response);

	}

	private void listofstudents(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		session.getAttribute("username");

		List<Student> students = new StudentDao().liststudents();
		request.setAttribute("liststudents", students);
		request.getRequestDispatcher("student.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (Validate.adminlogin(username, password)) {
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
			response.setHeader("Pragma", "no-cache");
			response.setDateHeader("Expires", 0);
			out.print("Welcome, " + username);
			request.getSession().invalidate();
			HttpSession session = request.getSession(true);
			session.setMaxInactiveInterval(30);
			session.setAttribute("username", username);
			response.sendRedirect("panel.jsp");

		} else {

			out.print("<span style='color:red'>Incorrect Password</span>");
			response.sendRedirect("adminlogin.jsp");

		}
		
	}

}
