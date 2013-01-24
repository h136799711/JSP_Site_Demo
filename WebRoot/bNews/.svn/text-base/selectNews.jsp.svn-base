<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%@page import="com.ibm.model.News"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>宇晨网络新闻中心后台</title>
	</head>
	<link rel="stylesheet" href="../css/style.css">
	<body>
		<div align="center">
			<iframe src="../bTop.jsp" marginheight="0" marginwidth="0"
				scrolling="no" width="799" height="122"></iframe>
			<table width="800" height="465" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td width="196" rowspan="2" valign="top">
						<iframe src="../bleft.jsp" marginheight="0" marginwidth="0"
							scrolling="no" width="200" height="497"></iframe>
					</td>
					<td width="604" height="57" background="../bImage/place.jpg">
						<table width="601" height="36" border="0" cellpadding="0"
							cellspacing="0">
							<tr>
								<td>
									&nbsp;&nbsp;当前位置提示&nbsp;&gt;&gt;&nbsp;
								</td>
							</tr>
							<tr>
								<td>
									&nbsp;
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td height="400" align="center" valign="top"
						background="../bImage/big.jpg">
						<table width="601" border="0" cellpadding="2" cellspacing="0"
							style="margin-left: 10px">
							<tr>
								<td width="350px" align="center">
									新闻标题
								</td>
								<td width="80" align="center">
									新闻时间
								</td>
								<td width="80" align="center">
									操作
								</td>
							</tr>
							<% List<News> list = (List<News>)request.getAttribute("newsList"); %>
							<% if(list.size() == 0){ %>
							<tr align="center" style="font-size: 30px; color: red;">
								<td colspan="4">
									没有新闻!
								</td>
							</tr>
							<%}else{ %>
							<c:forEach var="news" items="${newsList}">
								<tr>
									<td align="center">
										<a href="SelectNewsDetailsServlet?id=${news.newsId}"
											title="点击查看详细"><c:out value="${news.newsTitle}"></c:out>
										</a>
									</td>
									<td align="center">
										<c:out value="${news.newsPubtime}"></c:out>
									</td>
									<td align="center">
										<a href="UpdateNewsServlet?id=${news.newsId}" title="修改此条新闻">修改</a>
										<a href="DeleteNewsServlet?id=${news.newsId}" title="删除此条新闻">删除</a>
									</td>

								</tr>
							</c:forEach>
							<%} %>
						</table>
						<a href="InsertNewsServlet?id=${param.id}" target="_parent">添加新闻</a>&nbsp;&nbsp;&nbsp;或者&nbsp;&nbsp;&nbsp;
						<a href="../bSort/SelectSortServlet">详细类别管理</a>

						<table width="100%" border="0" cellpadding="0" cellspacing="0">
							<tr align="center">
								<td width="578" height="27">
									<br>
								</td>
							</tr>
						</table>
						
					</td>
				</tr>
			</table>
		</div>
	</body>
</html>
