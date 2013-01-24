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
						gh
						<iframe src="../bleft.jsp" marginheight="0" marginwidth="0"
							scrolling="no" width="200" height="497"></iframe>
					</td>
					<td width="604" height="57" background="../bImage/place.jpg">
						<table width="600" height="56" cellpadding="0" cellspacing="0">
							<tr>
								<td>
									&nbsp;当前位置提示&nbsp;&gt;&gt;${newsVM.newstypeName}&gt;&gt;&nbsp;详细新闻查看
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

					<td height="450" align="center" valign="top">

						<table width="601" height="30px" border="0" cellpadding="0"
							cellspacing="0" background="../bImage/placeNext.jpg">

							<tr>
								<td width="100" style="width: 20%; text-align: center;">
									新闻题目:
								</td>
								<td width="324" align="center">
									&nbsp;&nbsp;
									<input readonly name="newsTitle" value="${newsVM.newsTitle}"
										size="50" type="text" />
								</td>
							</tr>
						</table>
						<table width="601" height="362" border="0" cellpadding="0"
							cellspacing="0">
							<tr>
								<td width="100" height="362" valign="top"
									style="width: 20%; text-align: center;">
									新闻内容:
								</td>
								<td>
									<textarea style="width: 90%; height: 100%;" readonly cols="42"
										rows="18" style="margin:0px;padding:0px;" name="newsContent">
            	${newsVM.newsContent}
            </textarea>
								</td>
							</tr>
							<tr>
								<td valign="top" style="width: 20%; text-align: center;">
									新闻类型:
								</td>
								<td>
									<label>
										${newsVM.newstypeName}
									</label>
								</td>
							</tr>
							<tr>
								<td valign="top" style="width: 20%; text-align: center;">
									新闻发布人:
								</td>
								<td>
									<label>
										${newsVM.userName}
									</label>
								</td>
							</tr>
							<tr>
								<td valign="top" style="width: 20%; text-align: center;">
									发布时间:
								</td>
								<td>
									<label>
										${newsVM.newsPubtime}
									</label>
								</td>
							</tr>
						</table>
						<input style="height: 2em;" type="button" name="Submit" value="返回"
							onClick="javascript:history.go(-1);">

					</td>
				</tr>
			</table>
		</div>
	</body>
</html>
