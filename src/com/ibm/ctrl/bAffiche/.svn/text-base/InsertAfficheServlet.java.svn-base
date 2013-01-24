package com.ibm.ctrl.bAffiche;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.model.Notice;
import com.ibm.util.SessionKeys;
import com.ibm.util.TimeParser;

public class InsertAfficheServlet extends BaseAfficheServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3469450109799517538L;

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

		// request.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		Timestamp timestamp = TimeParser.getNow();
		// request.getSession().setAttribute(SessionKeys.userID,123);
		// ��session��ȡ���û�ID
		Object obj = request.getSession().getAttribute(SessionKeys.USERID);
		if (obj == null) {
			response.sendRedirect("selectAffiche.jsp?auth=0");
			return;
		}
		int userId = (Integer) obj;

		// ��乫�����
		Notice entity = new Notice();
		entity.setNoContent(content);
		entity.setNoTitle(title);
		entity.setNoPubtime(timestamp);
		entity.setUserId(userId);

		NewService(false).add(entity);

		response.sendRedirect("index.jsp");
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	@Override
	public void init() throws ServletException {
		// Put your code here
	}

}
