<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import="com.ibm.model.UserInfo"%>
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
			<table width="800" height="465" border="1" cellpadding="0"
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
									&nbsp;&nbsp;&nbsp;当前位置提示&nbsp;&gt;&gt;&nbsp;用户管理
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
						<table width="601" border="0" cellpadding="0" cellspacing="0"
							background="../bImage/placeNext.jpg">
							<tr>
								<td height="21">
									&nbsp;
								</td>
								<td>
									用户查询
								</td>
							</tr>
						</table>
						<table width="500" border="1" cellpadding="0" cellspacing="0">
							<tr>
								<td width="77" height="27">
									<div align="center">
										账号
									</div>
								</td>
								<td width="218">
									<div align="center">
										姓名
									</div>
								</td>
								<td width="101">
									<div align="center">
										次数
									</div>
								</td>
								<td width="94">
									<div align="center">
										操作
									</div>
								</td>
							</tr>
							<% List<UserInfo> list = ((List<UserInfo>)request.getAttribute("userList")); %>

							<% if(list.size() == 0){ %>
							<tr style="text-align: center; font-weight: bold; color: red;">
								<td colspan="4">
									<c:out value="没有数据"></c:out>
								</td>
							</tr>

							<%}else{ %>
							<c:forEach var="user" items="${userList}">
								<tr align="center">
									<td align="center" style="witdh: 10px">
										<c:out value="${user.userAccount }" />
									</td>
									<td align="center" style="witdh: 10px">
										<c:out value="${user.userName }" />
									</td>
									<td align="center" style="witdh: 10px">
										<c:out value="0" />
									</td>
									<td style="witdh: 20px">
										<a href="UpdateManagerServlet?id=${user.userId}"
											target="_parent">修改</a>&nbsp;&nbsp;
										<a href="DeleteManagerServlet?id=${user.userId}"
											target="_parent"> 删除</a>
									</td>
								</tr>
							</c:forEach>
							<%} %>

						</table>
						<table width="100%" border="0" cellpadding="0" cellspacing="0">
							<tr align="center">
								<td width="578" height="37">
									[<%= list.size() %>]

								</td>
							</tr>
						</table>

					</td>
				</tr>
			</table>
		</div>
	</body>
</html>
