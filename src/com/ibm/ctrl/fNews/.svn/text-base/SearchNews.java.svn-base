package com.ibm.ctrl.fNews;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.IServices.INewsTypeService;
import com.ibm.MySqlDao.NewsTypeDAO;
import com.ibm.Services.NewsTypeService;
import com.ibm.ViewModel.NewsViewModel;
import com.ibm.ctrl.bNews.BaseNewsServlet;
import com.ibm.model.News;

public class SearchNews extends BaseNewsServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String keywords = request.getParameter("keywords");

		if (keywords == null || keywords.length() == 0) {
			response.sendRedirect("frontSelectKeyNews.jsp");
		}

		List<News> list = null;
		if (request.getParameter("newstypeId") == null) {
			list = NewService().selectByKeywords(keywords);
		} else {
			try {
				int newstypeId = Integer.parseInt(request
						.getParameter("newstypeId"));
				list = NewService().selectByKeywords(keywords, newstypeId);
			} catch (Exception e) {
				list = NewService().selectByKeywords(keywords);
			}
		}

		List<NewsViewModel> nvmList = new ArrayList<NewsViewModel>();
		Iterator<News> iter = list.iterator();
		INewsTypeService service = new NewsTypeService(new NewsTypeDAO());
		while (iter.hasNext()) {
			News news = iter.next();
			NewsViewModel nvm = new NewsViewModel();
			String newstypeName = service.selectById(news.getNewstypeId())
					.getNewstypeName();
			nvm.setNewsContent(news.getNewsContent());
			nvm.setNewsId(news.getNewsId());
			nvm.setNewsPubtime(news.getNewsPubtime());
			nvm.setNewsTitle(news.getNewsTitle());
			nvm.setNewstypeId(news.getNewstypeId());
			nvm.setNewstypeName(newstypeName);
			nvmList.add(nvm);
		}

		RequestDispatcher rd = request
				.getRequestDispatcher("frontSelectKeyNews.jsp");
		request.setAttribute("nvmList", nvmList);
		rd.forward(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.flush();
		out.close();
	}

}
