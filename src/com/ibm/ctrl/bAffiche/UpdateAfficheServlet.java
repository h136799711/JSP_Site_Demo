package com.ibm.ctrl.bAffiche;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.model.Notice;

public class UpdateAfficheServlet extends BaseAfficheServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public UpdateAfficheServlet() {
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

		int no_id = Integer.parseInt(request.getParameter("id"));
		Notice notice = NewService().selectById(no_id);
		request.setAttribute("notice", notice);

		RequestDispatcher rd = request
				.getRequestDispatcher("updateAffiche.jsp");
		rd.forward(request, response);
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
		if (request.getParameter("id") == null) {
			response.sendRedirect("index.jsp");
		}

		int noId = Integer.parseInt(request.getParameter("id"));
		String noTitle = request.getParameter("title");
		String noContent = request.getParameter("content");

		Notice entity = new Notice();
		entity.setNoId(noId);
		entity.setNoTitle(noTitle);
		entity.setNoContent(noContent);

		NewService().update(entity);

		response.sendRedirect("UpdateAfficheServlet?id="
				+ request.getParameter("id"));

	}

}
