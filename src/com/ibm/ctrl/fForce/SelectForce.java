package com.ibm.ctrl.fForce;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.ctrl.bForce.BaseForceServlet;
import com.ibm.model.Focusnews;

public class SelectForce extends BaseForceServlet {

	/**
	 * Constructor of the object.
	 */
	public SelectForce() {
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

		List<Focusnews> list = NewService().selectTop(5);

		Iterator<Focusnews> iter = list.iterator();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		while (iter.hasNext()) {
			Focusnews news = iter.next();
			out
					.println(" <table width='156' border='0' align='center' cellpadding='0' cellspacing='0'>"
							+ "<tr><td width='154'> <a href='fForce/SelectForceContent?id="
							+ news.getFocusId()
							+ "' target='_parent'>"
							+ news.getFocusTitle() + "</a></td></tr></table> ");
		}
		out.flush();
		out.close();
	}

}
