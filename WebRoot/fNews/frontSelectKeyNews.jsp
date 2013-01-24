<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>宇晨网络新闻中心前台--新闻详细查询</title>
	</head>
	<link rel="stylesheet" href="../css/style.css">
	<body>
		<div align="center">
			<iframe src="../fTop.jsp" marginheight="0" marginwidth="0"
				scrolling="no" width="800" height="222" frameborder="0"></iframe>
			<table width="800" height="660" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td width="216" rowspan="2" valign="top">
						<iframe src="../fleft.jsp"  style="min-height:680px" marginwidth="230" scrolling="no"
							width="100%" height="100%" frameborder="0" marginheight="0"></iframe>
					</td>
					<td height="31" align="left" valign="middle"
						background="../fImage/place.jpg">
						&nbsp;&nbsp;&nbsp;当前位置&nbsp;&nbsp;&gt;&gt;&nbsp;&nbsp;新闻关键字查询
					</td>
				</tr>
				<tr>
					<td height="630" align="center" valign="top"
						background="../fImage/botten.jpg">
						<table width="100%" height="31"
							background="../fImage/newsSort.jpg">
							<tr>
								<td width="8%" height="25">
									&nbsp;
								</td>
								<td width="92%">
									<font color="#FFFFFF"> 全部新闻查询 </font>
								</td>
							</tr>
						</table>
						<br>
						<table width="480" border="1" cellpadding="0" cellspacing="0">
							<tr bgcolor="#CCCCCC">
								<td width="353">
									<div align="center">
										新闻标题
									</div>
								</td>
								<td width="111" height="19">
									<div align="center">
										新闻类型
									</div>
								</td>
							</tr>
							<!-- 搜索结果 -->
							<c:forEach items="${nvmList}" var="news">
								<tr>
									<td>
										&nbsp;
										<a href="#" target="_parent">${news.newsTitle}</a>
									</td>
									<td height="31" align="center">
										${news.newstypeName}
									</td>
								</tr>
							</c:forEach>


						</table>
						<table width="100%" border="0" cellpadding="0" cellspacing="0">
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
