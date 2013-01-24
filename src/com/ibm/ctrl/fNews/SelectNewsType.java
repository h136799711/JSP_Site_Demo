package com.ibm.ctrl.fNews;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.ctrl.bNews.BaseNewsServlet;
import com.ibm.model.News;

public class SelectNewsType extends BaseNewsServlet {

	/**
	 * The doGet method of the servlet. <br>
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
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strId = request.getParameter("id");

		if (strId == null || strId.isEmpty()) {
			response.sendRedirect("../operationFailed.jsp");
		}

		int typeid = Integer.parseInt(strId);

		List<News> list = NewService().selectByTypeId(typeid);

		RequestDispatcher rd = request
				.getRequestDispatcher("selectBigSort.jsp");
		request.setAttribute("newsList", list);
		rd.forward(request, response);
	}

}
