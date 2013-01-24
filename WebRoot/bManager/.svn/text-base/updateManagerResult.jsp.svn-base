<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<em>
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
							&nbsp;p
							<iframe src="../bleft.jsp" marginheight="0" marginwidth="0"
								scrolling="no" width="200" height="497"></iframe>
						</td>
						<td width="604" height="57" background="../bImage/place.jpg">
							<table width="600" height="56" cellpadding="0" cellspacing="0">
								<tr>
									<td>
										&nbsp;当前位置提示&nbsp;&gt;&gt;&nbsp;用户管理
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
										用户修改
									</td>
								</tr>
							</table>
							<br>
							<form action="UpdateManagerServlet" method="post"
								onSubmit="return Mycheck()">
								<c:set value="${userInfo}" var="u"></c:set>
								<table width="415" border="1" cellpadding="0" cellspacing="0">
									<tr>
										<td colspan="2">
											<input type="hidden" name="userId" value="${u.userId }" />
										</td>
									</tr>
									<tr>
										<td width="75" height="30" align="center">
											账号
										</td>
										<td width="334" align="center">
											&nbsp;&nbsp;
											<input name="account" size="50" type="text"
												value="${u.userAccount}" />
										</td>
									</tr>
									<tr>
										<td width="75" height="30" align="center">
											密码
										</td>
										<td width="334" align="center">
											&nbsp;&nbsp;
											<input name="password" size="50" type="password"
												value="${u.userPassword}" />
										</td>
									</tr>
									<tr>
										<td width="75" height="30" align="center">
											姓名
										</td>
										<td width="334" align="center">
											&nbsp;&nbsp;
											<input name="userName" size="50" type="text"
												value="${u.userName}" />
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
	</html> </em>