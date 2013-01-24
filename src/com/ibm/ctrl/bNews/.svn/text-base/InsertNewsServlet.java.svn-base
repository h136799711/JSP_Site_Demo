package com.ibm.ctrl.bNews;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.IServices.INewsTypeService;
import com.ibm.MySqlDao.NewsTypeDAO;
import com.ibm.Services.NewsTypeService;
import com.ibm.model.News;
import com.ibm.model.NewsType;
import com.ibm.util.SessionKeys;
import com.ibm.util.TimeParser;

public class InsertNewsServlet extends BaseNewsServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public InsertNewsServlet() {
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

		String strId = request.getParameter("id");
		System.out.println(strId);
		if (strId == null || strId.trim() == "") {
			response.sendRedirect("../operationFailed.jsp");
		}
		int typeId = Integer.parseInt(strId);
		INewsTypeService service = new NewsTypeService(new NewsTypeDAO());
		NewsType newstype = service.selectById(typeId);

		if (newstype.getNewstypeId() < 0) {
			response.sendRedirect("../operationFailed.jsp");
		}

		RequestDispatcher rd = request.getRequestDispatcher("insertNews.jsp");
		request.setAttribute("newstype", newstype);
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
		try {
			int newstypeId = Integer.parseInt(request
					.getParameter("newstypeId"));
			int userId = (Integer) (request.getSession()
					.getAttribute(SessionKeys.USERID));

			String newsTitle = request.getParameter("newsTitle");
			String newsContent = request.getParameter("newsContent");
			Timestamp timstamp = TimeParser.getNow();

			News news = new News();
			news.setNewstypeId(newstypeId);
			news.setNewsContent(newsContent);
			news.setNewsTitle(newsTitle);
			news.setNewsPubtime(timstamp);
			news.setUserId(userId);

			if (NewService().add(news)) {
				response.sendRedirect("SelectAllNewsServlet");
			} else {
				response.sendRedirect("../operationFailed.jsp");
			}

		} catch (Exception e) {
			response.sendRedirect("../operationFailed.jsp");
		}
	}

}
