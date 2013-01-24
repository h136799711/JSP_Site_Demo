package com.ibm.ctrl.bNews;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.IServices.INewsTypeService;
import com.ibm.MySqlDao.NewsTypeDAO;
import com.ibm.Services.NewsTypeService;
import com.ibm.model.NewsType;

public class GetNewsCountByType extends BaseNewsServlet {

	private static final long serialVersionUID = 1L;

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

		INewsTypeService newsTypeService = new NewsTypeService(
				new NewsTypeDAO());

		List<NewsType> list = newsTypeService.select();

		Iterator<NewsType> iter = list.iterator();
		String txtReply = "";
		String tmp = null;
		if (list == null || list.size() == 0) {
			txtReply = "没有数据";
		}
		while (iter.hasNext()) {
			NewsType newsType = iter.next();
			tmp = newsType.getNewstypeName() + " 共"
					+ NewService().getCountByTypeId(newsType.getNewstypeId())
					+ "条  ";

			txtReply += "<a href='fNews/selectBigSort.jsp?id="
					+ newsType.getNewstypeId()
					+ "' style='margin:10px;' title='点击查看此类新闻'>" + tmp + "</a>";
		}

		response.setContentType("text/html;charset=utf-8;");

		PrintWriter out = response.getWriter();
		out.println(txtReply);
		out.flush();
		out.close();

	}

}
