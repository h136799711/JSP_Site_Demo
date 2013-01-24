<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

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
						<table width="600" height="56" cellpadding="0" cellspacing="0">
							<tr>
								<td>
									&nbsp;当前位置提示&nbsp;&gt;&gt;&nbsp;时政要闻&nbsp;&gt;&gt;&nbsp;修改新闻
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
						background="bImage/big.jpg">
						<table width="601" border="0" cellpadding="0" cellspacing="0"
							background="../bImage/placeNext.jpg">
							<tr>
								<td height="21">
									&nbsp;
								</td>
								<td>
									修改新闻信息
								</td>
							</tr>
						</table>
						<br>
						<form action="UpdateNewsServlet" method="post"
							onSubmit="return Mycheck()">
							<table width="415" border="1" cellpadding="0" cellspacing="0">
								<tr>
									<td>
										<input name="newsId" type="hidden" value="${newsVM.newsId}" />
									</td>
								</tr>
								<tr>
									<td width="75" height="30" align="center">
										新闻标题
									</td>
									<td width="334" align="center">
										&nbsp;&nbsp;
										<input name="newsTitle" value="${newsVM.newsTitle}" size="50"
											type="text" />
									</td>
								</tr>
								<tr>
									<td width="75" height="30" align="center">
										新闻类别
									</td>
									<td width="334">
										&nbsp;&nbsp;
										<select name="newstypeId">
											<c:forEach var="newstype" items="${newstypeList}">
												<c:choose>
													<c:when test="${newstype.newstypeId==newsVM.newstypeId}">
														<option value="${newstype.newstypeId}" selected="selected">
															${newstype.newstypeName}
														</option>
													</c:when>
													<c:otherwise>
														<option value="${newstype.newstypeId}">
															${newstype.newstypeName}
														</option>
													</c:otherwise>
												</c:choose>

											</c:forEach>

										</select>
									</td>
								</tr>
								<tr>
									<td height="275" align="center" valign="top">
										<br>
										新闻内容
									</td>
									<td>
										&nbsp;
										<textarea cols="42" rows="18" name="newsContent">
											<c:out value="${newsVM.newsContent}"></c:out>
										</textarea>
									</td>
								</tr>
								<tr>
									<td height="30" align="center">
										创建时间
									</td>
									<td>
										&nbsp;&nbsp;${newsVM.newsPubtime}
									</td>
								</tr>
								<tr>
									<td height="30" align="center">
										创建人名称
									</td>
									<td>
										&nbsp;&nbsp;${newsVM.userName}
									</td>
								</tr>
							</table>
							<div>
								&nbsp;&nbsp;
							</div>
							<input type="submit" value="修改" />
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="reset" value="清除" />
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="button" onClick="javascript:history.go(-1);"
								name="back" value="返回" />
						</form>
						<br>
					</td>
				</tr>
			</table>
		</div>
	</body>
</html>