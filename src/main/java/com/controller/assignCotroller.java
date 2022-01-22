package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.assigntdao;
import com.entity.assignt;

@WebServlet("/assignCotroller")
public class assignCotroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public assignCotroller() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");

		switch (action) {
		case "assignteacher":

			assignteacher(request, response);
			break;

		default:
			break;
		}
	}

	private void assignteacher(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		session.getAttribute("username");

		int tid = Integer.parseInt(request.getParameter("tid"));
		String tname = request.getParameter("tname");
		String classname = request.getParameter("classname");

		assignt t = new assignt(tid, tname, classname);
		new assigntdao().subjectclass(t);
		request.getRequestDispatcher("panel.jsp").forward(request, response);

	}

}
