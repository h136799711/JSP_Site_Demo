package com.ibm.ctrl.bForce;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.model.Focusnews;

public class UpdateForceServlet extends BaseForceServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public UpdateForceServlet() {
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

		int id = Integer.parseInt(request.getParameter("id"));
		Focusnews news = NewService().selectById(id);

		if (news.getFocusId() == Integer.MIN_VALUE) {
			response.sendRedirect("../operationFailed.jsp");
		} else {
			request.setAttribute("news", news);
			request.getRequestDispatcher("updateForce.jsp").forward(request,
					response);
		}
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

		int focusId = Integer.parseInt(request.getParameter("focusId"));
		String focusTitle = request.getParameter("focusTitle");
		String focusContent = request.getParameter("focusContent");

		Focusnews news = new Focusnews();
		news.setFocusId(focusId);
		news.setFocusTitle(focusTitle);
		news.setFocusContent(focusContent);

		if (NewService().update(news)) {
			response.sendRedirect("index.jsp");
		} else {
			response.sendRedirect("../operationFailed.jsp");
		}

	}

}
