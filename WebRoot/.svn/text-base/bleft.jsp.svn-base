<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import="com.ibm.util.SessionKeys"%>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="css/style.css">
<!--script language='javascript'>alert('您已经与服务器断开');window.location.href='index.html';</script-->
<table width="199" border="0" align="center" cellpadding="0"
	cellspacing="0" style="min-height:680px">
	<tr>
		<td height="80" align="center">
			<table width="199" height="80" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td background="bImage/manager.jpg">
						<div align="center" style="">
							<% Object userName = request.getSession().getAttribute(SessionKeys.USERNAME); %>
							<%if(userName == null || userName.toString().trim().isEmpty()){ %>
							<script type="text/javascript">
					window.top.location = "operationFailed.jsp";
				</script>
							<%}else{ %>
							欢迎您,<%= userName.toString()%>
							<%} %>
						</div>
					</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td height="282" valign="top">
			<table width="199" align="center" cellpadding="0" cellspacing="0"
				background="bImage/newsSort.jpg">
				<tr align="center">
					<td height="22">
						&nbsp;
					</td>
				</tr>
				<tr align="center">
					<td height="26" valign="top">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="bNews/SelectNewsServlet?id=2" target="_parent">时政要闻管理</a>
					</td>
				</tr>

			</table>



			<table width="199" align="center" cellpadding="0" cellspacing="0"
				background="bImage/newsSort.jpg">

				<tr align="center">
					<td height="22">
						&nbsp;
					</td>
				</tr>
				<tr align="center">
					<td height="26" valign="top">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="bNews/SelectNewsServlet?id=3" target="_parent">经济动向管理</a>
					</td>
				</tr>

			</table>

			<table width="199" align="center" cellpadding="0" cellspacing="0"
				background="bImage/newsSort.jpg">

				<tr align="center">
					<td height="22">
						&nbsp;
					</td>
				</tr>
				<tr align="center">
					<td height="26" valign="top">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="bNews/SelectNewsServlet?id=5" target="_parent">科学教育管理</a>
					</td>
				</tr>

			</table>

			<table width="199" align="center" cellpadding="0" cellspacing="0"
				background="bImage/newsSort.jpg">

				<tr align="center">
					<td height="22">
						&nbsp;
					</td>
				</tr>
				<tr align="center">
					<td height="26" valign="top">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="bNews/SelectNewsServlet?id=4" target="_parent">法制教育管理</a>
					</td>
				</tr>

			</table>

			<table width="199" align="center" cellpadding="0" cellspacing="0"
				background="bImage/newsSort.jpg">

				<tr align="center">
					<td height="22">
						&nbsp;
					</td>
				</tr>
				<tr align="center">
					<td height="26" valign="top">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="bNews/SelectNewsServlet?id=6" target="_parent">社会现象管理</a>
					</td>
				</tr>

			</table>

			<table width="199" align="center" cellpadding="0" cellspacing="0"
				background="bImage/newsSort.jpg">

				<tr align="center">
					<td height="22">
						&nbsp;
					</td>
				</tr>
				<tr align="center">
					<td height="26" valign="top">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="bNews/SelectNewsServlet?id=1" target="_parent">娱乐天地管理</a>
					</td>
				</tr>

			</table>
		</td>
	</tr>
	<tr>
		<td height="67" align="center" background="bImage/otherSort.jpg">
			<table width="129" height="47" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td width="129">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td>
						<div align="center">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<a href="bAffiche/index.jsp" target="_parent">公告信息管理</a>
						</div>
					</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td height="66" align="center" background="bImage/otherSort.jpg">

			<table width="129" height="47" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td width="129">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td>
						<div align="center">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<a href="bForce/index.jsp" target="_parent">焦点导读管理</a>
						</div>
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
