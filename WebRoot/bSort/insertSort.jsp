<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
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
						<table width="600" height="56" cellpadding="0" cellspacing="0">
							<tr>
								<td>
									&nbsp;当前位置提示&nbsp;&gt;&gt;&nbsp;时政要闻&nbsp;&gt;&gt;&nbsp;详细类别管理&nbsp;&gt;&gt;&nbsp;添加类别
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
									添加类别信息
								</td>
							</tr>
						</table>
						<form action="InsertSortServlet" method="post">
							<table width="415" border="0">
								<tr align="right">
									<td>
										<a href="javascript:history.go(-1);">返回上一层</a>
									</td>
								</tr>
							</table>
							<table width="415" border="1" cellpadding="0" cellspacing="0">
								<tr>
									<td width="125" height="30" align="center">
										类别名称
									</td>
									<td width="284">
										&nbsp;&nbsp;&nbsp;
										<input type="text" name="newstypename" value="" size="40" />
									</td>
								</tr>
							</table>
							<br>
							<br />
							<input type="submit" value="添加" />
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="reset" value="重置" />
						</form>
				</tr>
			</table>
		</div>
	</body>
</html>
