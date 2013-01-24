package com.ibm.ctrl.bManager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.model.UserInfo;
import com.ibm.util.SessionKeys;

public class CheckManagerServlet extends BaseManagerServlet {

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String userAccount = request.getParameter("account");
		String userPassword = request.getParameter("password");
		// System.out.println(userAccount);
		// System.out.println(userPassword);
		UserInfo userInfo = new UserInfo();
		if (NewService().checkBy(userAccount, userPassword, userInfo) == 0) {
			request.getSession().setAttribute(SessionKeys.USERID,
					userInfo.getUserId());
			request.getSession().setAttribute(SessionKeys.USERNAME,
					userInfo.getUserName());

			response.sendRedirect("../bNews/SelectAllNewsServlet");
			// request.getRequestDispatcher("../bNews/SelectAllNewsServlet").forward(request,
			// response);

		} else {
			response.sendRedirect("../index.jsp");
		}
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public CheckManagerServlet() {
		super();
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
