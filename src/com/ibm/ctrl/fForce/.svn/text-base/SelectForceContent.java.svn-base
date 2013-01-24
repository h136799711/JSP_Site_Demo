package com.ibm.ctrl.fForce;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.ctrl.bForce.BaseForceServlet;
import com.ibm.model.Focusnews;

public class SelectForceContent extends BaseForceServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public SelectForceContent() {
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

		int focusId = Integer.parseInt(request.getParameter("id"));
		Focusnews focusnews = NewService().selectById(focusId);

		RequestDispatcher rd = request
				.getRequestDispatcher("frontSelectOneForce.jsp");

		request.setAttribute("focusnews", focusnews);
		rd.forward(request, response);
	}

}
