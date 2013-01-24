package com.ibm.ctrl.bForce;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.model.Focusnews;
import com.ibm.util.SessionKeys;
import com.ibm.util.TimeParser;

public class InsertForceServlet extends BaseForceServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public InsertForceServlet() {
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

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
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

		String focusTitle = request.getParameter("focusTitle");
		String focusContent = request.getParameter("focusContent");
		Timestamp timestamp = TimeParser.getNow();
		request.getSession().setAttribute(SessionKeys.USERID, 123);
		int userId = (Integer) (request.getSession()
				.getAttribute(SessionKeys.USERID));
		Focusnews news = new Focusnews();
		news.setUserId(userId);
		news.setFocusTitle(focusTitle);
		news.setFocusContent(focusContent);
		news.setFocusPubtime(timestamp);

		if (NewService().add(news)) {
			response.sendRedirect("index.jsp");
		} else {
			response.sendRedirect("../operationFailed.jsp");
		}

	}

}
