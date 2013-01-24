package com.ibm.ctrl.bNews;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.IServices.INewsTypeService;
import com.ibm.IServices.INewsViewModelService;
import com.ibm.MySqlDao.NewsTypeDAO;
import com.ibm.MySqlDao.NewsViewModelDAO;
import com.ibm.Services.NewsTypeService;
import com.ibm.Services.NewsViewModelService;
import com.ibm.ViewModel.NewsViewModel;
import com.ibm.model.News;
import com.ibm.model.NewsType;
import com.ibm.util.TimeParser;

public class UpdateNewsServlet extends BaseNewsServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public UpdateNewsServlet() {
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
	@SuppressWarnings("unchecked")
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int newsId = Integer.parseInt(request.getParameter("id"));

		INewsViewModelService service = new NewsViewModelService(
				new NewsViewModelDAO());
		INewsTypeService newstypeService = new NewsTypeService(
				new NewsTypeDAO());

		// ��Ҫ�������IDѡ�����ŵ�������Ϣ
		NewsViewModel newsVM = service.selectByNewsId(newsId);
		List<NewsType> list = newstypeService.select();

		RequestDispatcher rd = request.getRequestDispatcher("updateNews.jsp");
		request.setAttribute("newsVM", newsVM);
		request.setAttribute("newstypeList", list);
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

			int newsId = Integer.parseInt(request.getParameter("newsId"));
			int newstypeId = Integer.parseInt(request
					.getParameter("newstypeId"));
			String newsTitle = request.getParameter("newsTitle");
			String newsContent = request.getParameter("newsContent");
			Timestamp timestamp = TimeParser.getNow();

			News entity = new News();
			entity.setNewsId(newsId);
			entity.setNewstypeId(newstypeId);
			entity.setNewsPubtime(timestamp);
			entity.setNewsContent(newsContent);
			entity.setNewsTitle(newsTitle);

			if (NewService().update(entity)) {
				response.sendRedirect("SelectAllNewsServlet");
			} else {
				response.sendRedirect("../operationFailed.jsp");
			}

		} catch (Exception e) {
			response.sendRedirect("../operationFailed.jsp");
		}
	}

}
