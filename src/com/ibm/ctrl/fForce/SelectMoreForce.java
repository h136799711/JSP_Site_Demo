package com.ibm.ctrl.fForce;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.ctrl.bForce.BaseForceServlet;
import com.ibm.model.Focusnews;

public class SelectMoreForce extends BaseForceServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public SelectMoreForce() {
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

		List<Focusnews> list = NewService().select();

		RequestDispatcher rd = request
				.getRequestDispatcher("frontSelectForce.jsp");

		request.setAttribute("focusnewList", list);
		rd.forward(request, response);

	}

}
