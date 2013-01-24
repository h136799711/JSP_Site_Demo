package com.ibm.ctrl.bSort;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.model.NewsType;

public class UpdateSortServlet extends BaseSortServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

		int newstype_id = Integer.parseInt(request.getParameter("id"));
		NewsType Ntype = NewService().selectById(newstype_id);
		RequestDispatcher rd = request.getRequestDispatcher("updateSort.jsp");
		request.setAttribute("Ntype", Ntype);
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

		int newstype_id = Integer.parseInt(request.getParameter("id"));
		String newstypeName = request.getParameter("newstypeName");

		NewsType Ntype = new NewsType();
		Ntype.setNewstypeName(newstypeName);
		Ntype.setNewstypeId(newstype_id);

		NewService().update(Ntype);

		response.sendRedirect("UpdateSortServlet?id=" + Ntype.getNewstypeId());
	}

}
