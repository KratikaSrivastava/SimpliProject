package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutController")
public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LogoutController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		logout(request, response);
	}

	private void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");

		switch (action) {

		case "destroy":

			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
			response.setHeader("Pragma", "no-cache");
			response.setDateHeader("Expires", 0);
			response.sendRedirect("adminlogin.jsp");
			HttpSession session = request.getSession(false);
			session.getAttribute("username");
			session.setAttribute("username", null);
			session.removeAttribute("username");
			session.invalidate();

			break;

		default:
			break;
		}

	}

}
