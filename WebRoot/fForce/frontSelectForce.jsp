<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import="com.ibm.model.Focusnews"%>

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
					<td height="31" align="left" valign="middle"
						background="../fImage/place.jpg">
						&nbsp;&nbsp;&nbsp;当前位置&nbsp;&nbsp;&gt;&gt;&nbsp;&nbsp;焦点导读&nbsp;&nbsp;&gt;&gt;&nbsp;&nbsp;焦点新闻详细内容
					</td>
				</tr>
				<tr>
					<td height="630" align="center" valign="top"
						background="../fImage/botten.jpg">
						&nbsp;
						<table width="500" border="1" cellpadding="0" cellspacing="0">
							<tr>
								<td width="218">
									<div align="center">
										焦点新闻题目
									</div>
								</td>
								<td width="101">
									<div align="center">
										创建时间
									</div>
								</td>
							</tr>
							<% List<Focusnews> list = (List<Focusnews>)request.getAttribute("focusnewList"); %>
							<%if(list == null || list.size() == 0){ %>
							<tr>
								<td style="color: red; font-size: 24px;">
									没有数据
								</td>
							</tr>
							<%}else{ %>
							<c:forEach var="focusnews" items="${focusnewList}">
								<tr align="center">
									<td>
										<a href="SelectForceContent?id=${focusnews.focusId}" target="_parent">${focusnews.focusTitle}</a>
									</td>
									<td>
										${focusnews.focusPubtime}
									</td>
								</tr>
							</c:forEach>
							<%} %>

						</table>
						<form name="form" method="post" action="">
							<table width="480" border="0" cellpadding="0" cellspacing="0">
								<tr>
									<td height="33" align="right">
										<input type="button" name="Submit" value="返回"
											onClick="javasrcipt:history.go(-1);">
										&nbsp;&nbsp;
									</td>
								</tr>
							</table>
						</form>
					</td>
				</tr>
			</table>
			<iframe src="../fBottom.jsp" marginheight="0" marginwidth="0"
				scrolling="no" width="799" height="104"></iframe>
		</div>
	</body>
</html>
