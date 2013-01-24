package com.ibm.ctrl.bManager;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.model.UserInfo;

public class UpdateManagerServlet extends BaseManagerServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserInfo info = new UserInfo();
		info.setUserId(Integer.parseInt(request.getParameter("id")));
		UserInfo info2 = NewService().selectById(info.getUserId());
		RequestDispatcher rd = request
				.getRequestDispatcher("updateManagerResult.jsp");
		request.setAttribute("userInfo", info2);
		rd.forward(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserInfo info = new UserInfo();
		info.setUserId(Integer.parseInt(request.getParameter("userId")));
		info.setUserName(request.getParameter("userName"));
		info.setUserAccount(request.getParameter("account"));
		info.setUserPassword(request.getParameter("password"));
		if (NewService().update(info)) {
			request.getRequestDispatcher("SelectManagerServlet").forward(
					request, response);
		}
	}

}
