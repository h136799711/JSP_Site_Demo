package com.ibm.ctrl.bManager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.model.UserInfo;

public class InsertManagerServlet extends BaseManagerServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("account").length() <= 0
				|| request.getParameter("password").length() <= 0
				|| request.getParameter("username").length() <= 0) {
			response.sendRedirect("insertManager.jsp");
		} else {
			String Account = request.getParameter("account");
			String PassWord = request.getParameter("password");
			String UserName = request.getParameter("username");

			// ��乫�����
			UserInfo entity = new UserInfo();
			entity.setUserAccount(Account);
			entity.setUserPassword(PassWord);
			entity.setUserName(UserName);

			NewService(false).add(entity);

			response.sendRedirect("SelectManagerServlet");
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
