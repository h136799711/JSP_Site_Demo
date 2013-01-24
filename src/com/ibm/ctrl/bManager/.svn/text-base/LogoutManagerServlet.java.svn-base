package com.ibm.ctrl.bManager;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.util.SessionKeys;

public class LogoutManagerServlet extends BaseManagerServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public LogoutManagerServlet() {
		super();
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
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
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getSession().removeAttribute(SessionKeys.USERID);
		request.getSession().removeAttribute(SessionKeys.USERNAME);

		PrintWriter pw = response.getWriter();

		pw
				.print("<script type='text/javascript'>window.top.location = '../index.jsp';</script>");
		pw.flush();
		pw.close();

	}

}
