package com.ibm.ctrl.fAffiche;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.ctrl.bAffiche.BaseAfficheServlet;
import com.ibm.model.Notice;

public class SelectAfficheContent extends BaseAfficheServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public SelectAfficheContent() {
		super();
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int no_id = Integer.parseInt(request.getParameter("id"));
		Notice notice = NewService().selectById(no_id);
		request.setAttribute("notice", notice);

		RequestDispatcher rd = request
				.getRequestDispatcher("selectAfficheContent.jsp");
		rd.forward(request, response);
	}

}
