<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!-- 公告详细查询  -->

<script src="js/validate.JS"></script>
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
									&nbsp;当前位置提示&nbsp;&gt;&gt;&nbsp;信息公告管理&nbsp;&gt;&gt;&nbsp;信息公告详细查询
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
									详细查询公告信息
								</td>
							</tr>
						</table>
						<br>
						<table width="415" border="1" cellpadding="0" cellspacing="0">
							<tr>
								<td width="75" height="30" align="center">
									公告标题
								</td>
								<td width="334">
									&nbsp;&nbsp;
									<label>
										${notice.noTitle }
									</label>
								</td>

							</tr>
							<tr>
								<td height="275" align="center" valign="top">
									<br>
									公告内容
								</td>
								<td valign="top">
									&nbsp;
									<textarea cols="42" rows="18" name="content"
										readonly="readonly"> ${notice.noContent }</textarea>
								</td>
							</tr>
							<tr>
								<td height="30" align="center">
									创建时间
								</td>
								<td>
									&nbsp;&nbsp;${notice.noPubtime }
								</td>
							</tr>
						</table>
						<table width="415">
							<tr>
								<td align="right">
									<form name="form" method="post" action="">
										<input type="button" name="Submit" value="返回"
											onClick="javascript:history.go(-1);">
									</form>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</div>
	</body>
</html>
