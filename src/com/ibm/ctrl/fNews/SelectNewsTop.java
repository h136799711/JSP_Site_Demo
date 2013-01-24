package com.ibm.ctrl.fNews;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.ctrl.bNews.BaseNewsServlet;
import com.ibm.model.News;

public class SelectNewsTop extends BaseNewsServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public SelectNewsTop() {
		super();
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
		int typeId = Integer.parseInt(request.getParameter("id"));
		int number = 5;
		// System.out.println("typeID : "+typeId);

		List<News> list = null;
		list = NewService().selectTop(number, typeId);
		Iterator<News> iter = list.iterator();
		String txtReply = "";
		String tmp = "";
		response.setContentType("text/html;charset=utf-8;");
		PrintWriter out = response.getWriter();

		while (iter.hasNext()) {
			News news = iter.next();
			tmp = "<tr ><td width='77' height='25'><a style='font-size:10px' href='' title='新闻发布时间' >["
					+ news.getNewsPubtime().toString().substring(0, 10)
					+ "]</a>"
					+ "</td><td width='115'><a style='font-size:12px' href='' title='点击查看新闻详细' >"
					+ news.getNewsTitle()
					+ "</a></td><td width='42'></td></tr>";

			txtReply += tmp;
		}
		if (txtReply.length() == 0) {
			txtReply = "没有新闻数据";
		}

		out.println(txtReply);
		out.flush();
		out.close();
	}

}
