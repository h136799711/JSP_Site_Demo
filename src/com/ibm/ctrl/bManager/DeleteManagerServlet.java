package com.ibm.ctrl.bManager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.model.UserInfo;

public class DeleteManagerServlet extends BaseManagerServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserInfo info = new UserInfo();
		info.setUserId(Integer.parseInt(request.getParameter("id")));
		NewService().delete(info);
		response.sendRedirect("SelectManagerServlet");
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
