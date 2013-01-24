<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><html>
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
									&nbsp;&nbsp;&nbsp;当前位置提示&nbsp;&gt;&gt;&nbsp;时政要闻&nbsp;&gt;&gt;&nbsp;详细类别管理
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
									新闻类别查询
								</td>

							</tr>
						</table>
						<table width="100%" border="0" cellpadding="0" cellspacing="0">
							<c:choose>
								<c:when test="${NewsTypeList==null}">
									<tr style="text-align: center; font-weight: bold; color: red;">
										<td colspan="4">
											<c:out value="没有新闻类型数据"></c:out>
										</td>
									</tr>
								</c:when>
								<c:otherwise>
									<c:forEach var="newstype" items="${NewsTypeList}">
										<tr align="center">
											<td align="center" style="witdh: 10px">
												<c:out value="${newstype.newstypeId }" />
											</td>
											<td>
												<a href="selectContent.jsp" target="_parent"><c:out
														value="${newstype.newstypeName }" />
												</a>
											</td>
											<td style="witdh: 20px">
												<br>
												<br>
											</td>
											<td style="witdh: 20px">
												<a href="UpdateSortServlet?id=${newstype.newstypeId }">修改</a>&nbsp;&nbsp;
												<a href="DeleteSortServlet?id=${newstype.newstypeId }">
													删除</a>
											</td>
										</tr>
									</c:forEach>
								</c:otherwise>
							</c:choose>


						</table>
						<a href="insertSort.jsp" target="_parent">添加</a>&nbsp;&nbsp;&nbsp;或者&nbsp;&nbsp;&nbsp;
						<a href="javascript:history.go(-1);">返回</a>
					</td>
			</table>
		</div>
	</body>
</html>
