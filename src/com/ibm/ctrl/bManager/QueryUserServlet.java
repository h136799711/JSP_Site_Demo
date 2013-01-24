package com.ibm.ctrl.bManager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.model.UserInfo;

public class QueryUserServlet extends BaseManagerServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("userId"));
		UserInfo user = NewService().selectById(id);
		if (user != null) {
			request.setAttribute("user", user);
			request.getRequestDispatcher("updateManagerResult.jsp").forward(
					request, response);
		} else {
			response.sendRedirect("SelectManagerServlet");
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}
