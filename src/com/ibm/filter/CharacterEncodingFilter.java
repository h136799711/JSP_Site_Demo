/**
 * 
 */
package com.ibm.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author admin
 * 
 */
public class CharacterEncodingFilter implements Filter {

	protected String encoding = null;
	protected FilterConfig filterConfig = null;
	protected boolean ignore = true;

	public void destroy() {
		this.encoding = null;
		this.filterConfig = null;
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		if (ignore || request.getCharacterEncoding() == null) {
			if (encoding != null)
				request.setCharacterEncoding(encoding);
		}
		chain.doFilter(request, response);

	}

	public void init(FilterConfig arg0) throws ServletException {
		this.filterConfig = arg0;// ��web.xml��ȡ�ò���
		this.encoding = this.filterConfig.getInitParameter("encoding");
		String value = this.filterConfig.getInitParameter("ignore");
		if (value == null) {
			ignore = true;
		} else if (value.equalsIgnoreCase("true")) {
			ignore = true;
		} else if (value.equalsIgnoreCase("yes")) {
			ignore = true;
		} else {
			ignore = false;
		}

	}

}
