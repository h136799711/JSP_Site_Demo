<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import="com.ibm.model.News"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>宇晨网络新闻中心前台--新闻类别查询</title>
	</head>
	<link rel="stylesheet" href="../css/style.css">
	<body>
		<div align="center">
			<iframe src="../fTop.jsp" marginheight="0" marginwidth="0"
				scrolling="no" width="800" height="222" frameborder="0"></iframe>
			<table width="800" height="660" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td width="216" rowspan="3" valign="top">
						<iframe src="../fleft.jsp"  style="min-height:680px" marginwidth="230" scrolling="no"
							width="100%" height="100%" frameborder="0" marginheight="0"></iframe>
					</td>
					<td height="31" colspan="2" align="left" valign="middle"
						background="../fImage/place.jpg">
						&nbsp;&nbsp;&nbsp;当前位置&nbsp;&nbsp;&gt;&gt;&nbsp;&nbsp;新闻类别查询
					</td>
				</tr>
				<tr>
					<td height="31" colspan="2" align="center" valign="middle"
						background="../fImage/newsSort.jpg">
						<font color="#FFFFFF"></font>
					</td>
				</tr>
				<tr>

					<td width="424" align="left" valign="top">

						<table width="514" cellpadding="0" cellspacing="0">

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
									<td width="20" height="20">
										<img src="../fImage/triangle.jpg" width="6" height="9">
									</td>
									<td width="150">
										<a href="SelectNewsContent?id=${news.newsId}" target="_parent">${news.newsTitle}</a>
									</td>
									<td width="150">
										<b>${news.newsPubtime}</b>
									</td>
									<td width="80">
										<img src="../fImage/new.gif">
									</td>
								</tr>
							</c:forEach>
							<%} %>




						</table>
						<table width="404" height="5" cellpadding="0" cellspacing="0">
							<tr>
								<td height="15">
									<hr>
								</td>
							</tr>
						</table>
						<table width="87%" border="0" cellpadding="0" cellspacing="0">
							<tr align="center">
								<td width="578" height="37">
								</td>
							</tr>
						</table>

					</td>
				</tr>
			</table>
			<iframe src="../fBottom.jsp" marginheight="0" marginwidth="0"
				scrolling="no" width="799" height="104"></iframe>
		</div>
	</body>
</html>
