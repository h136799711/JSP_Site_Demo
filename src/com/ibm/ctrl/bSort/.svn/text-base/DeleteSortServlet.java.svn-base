package com.ibm.ctrl.bSort;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.model.NewsType;

public class DeleteSortServlet extends BaseSortServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String strId = request.getParameter("id");
		int NtypeId = Integer.parseInt(strId);
		System.out.print(NtypeId);
		NewsType Ntype = new NewsType();
		Ntype.setNewstypeId(NtypeId);
		NewService().delete(Ntype);
		response.sendRedirect("../bNews/SelectAllNewsServlet");
	}

}
