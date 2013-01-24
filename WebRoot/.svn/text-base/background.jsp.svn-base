<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import="com.ibm.ViewModel.NewsViewModel"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
	<head>
		<base href="<%=basePath %>" />
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<title>宇晨网络新闻中心后台首页</title>
		<link rel="stylesheet" href="css/style.css">
	</head>
	<body>
		<div align="center">
			<iframe src="bTop.jsp" marginheight="0" marginwidth="0"
				scrolling="no" width="799" height="122"></iframe>
			<table width="800" border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td width="196" rowspan="2" valign="top">
						<iframe src="bleft.jsp" marginheight="0" marginwidth="0"
							scrolling="no" width="200" height="497"></iframe>
					</td>
					<td width="600" height="57" background="bImage/place.jpg">
						<table width="600" height="36" border="0" cellpadding="0"
							cellspacing="0">
							<tr>
								<td>
									&nbsp;&nbsp;当前位置提示&nbsp;&gt;&gt;&nbsp;后台首页
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
				<tr align="center">
					<td valign="top" background="bImage/big.jpg">
						<table width="601" border="0" cellpadding="0" cellspacing="0"
							background="bImage/placeNext.jpg">
							<tr>
								<td height="21">
									&nbsp;
								</td>
								<td>
									全部新闻查询
								</td>
							</tr>
						</table>
						<table width="500" border="1" cellpadding="0" cellspacing="0">
							<tr>
								<td width="54" height="27">
									<div align="center">
										编号
									</div>
								</td>
								<td width="145">
									<div align="center">
										标题
									</div>
								</td>
								<td width="78">
									<div align="center">
										类别
									</div>
								</td>
								<td width="78">
									<div align="center">
										最近修改时间
									</div>
								</td>
								<td width="126">
									<div align="center">
										操作
									</div>
								</td>
							</tr>

							<% List<NewsViewModel> list = (List<NewsViewModel>)request.getAttribute("nvmList"); %>
							<%if(list == null || list.size() == 0){ %>
							<tr style="text-align: center;">
								<td style="font-size: 80px; color: red; text-align: center;"
									colspan="5">
									没有新闻
								</td>
							</tr>
							<%}else{ %>
							<c:forEach var="nvm" items="${nvmList}">
								<tr>
									<td width="54" height="27">
										<div align="center">
											${nvm.newsId}
										</div>
									</td>
									<td width="145">
										<div align="center">
											${nvm.newsTitle}
										</div>
									</td>
									<td width="78">
										<div align="center">
											${nvm.newstypeName}
										</div>
									</td>
									<td width="78">
										<div align="center">
											${nvm.newsPubtime}
										</div>
									</td>
									<td width="126">
										<div align="center">
											<a style="margin-right: 10px;"
												href="bNews/UpdateNewsServlet?id=${nvm.newsId}"
												title="进入修改页面">修改</a><a
												href="bNews/DeleteNewsServlet?id=${nvm.newsId}"
												title="删除此条新闻">删除</a>
										</div>
									</td>
								</tr>
							</c:forEach>
							<%} %>



						</table>

						<table width="95%" border="0" cellpadding="0" cellspacing="0">
							<tr align="center">
								<td width="578" height="32"></td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<iframe src="fBottom.jsp" marginheight="0" marginwidth="0"
				scrolling="no" width="799" height="104"></iframe>
		</div>
	</body>
</html>
