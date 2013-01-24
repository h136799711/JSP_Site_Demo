package com.ibm.ctrl.bAffiche;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.model.Notice;

public class DeleteAfficheServlet extends BaseAfficheServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public DeleteAfficheServlet() {
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
		int noId = Integer.parseInt(request.getParameter("id"));

		Notice entity = new Notice();
		entity.setNoId(noId);
		NewService().delete(entity);

		// RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		// rd.forward(request, response);
		response.sendRedirect("index.jsp");
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

		response.setContentType("text/html");
		int noId = Integer.parseInt(request.getParameter("id"));

		Notice entity = new Notice();
		entity.setNoId(noId);
		NewService().delete(entity);

		// RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		// rd.forward(request, response);
		response.sendRedirect("index.jsp");
	}

}
