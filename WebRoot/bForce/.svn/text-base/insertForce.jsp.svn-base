<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<em> <script language="javascript" type="">
function Mycheck(){
if (forceForm.title.value=="")
{ alert("请输入焦点新闻标题！");forceForm.title.focus();return  false;}
if (forceForm.content.value=="")
{ alert("请输入焦点新闻内容！");forceForm.content.focus();return false;}
return true;
}
</script>
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
										&nbsp;当前位置提示&nbsp;&gt;&gt;&nbsp;焦点新闻管理&nbsp;&gt;&gt;&nbsp;焦点新闻添加
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
										添加焦点新闻
									</td>
								</tr>
							</table>
							<br>
							<form action="InsertForceServlet" method="post"
								onSubmit="return Mycheck()">
								<table width="415" border="1" cellpadding="0" cellspacing="0">
									<tr>
										<td width="75" height="30" align="center">
											新闻标题
										</td>
										<td width="334" align="center">
											&nbsp;&nbsp;
											<input name="focusTitle" size="50" type="text" />
										</td>
									</tr>
									<tr>
										<td height="275" align="center" valign="top">
											<br>
											新闻内容
										</td>
										<td>
											&nbsp;
											<textarea cols="42" rows="18" name="focusContent"> </textarea>
										</td>
									</tr>
								</table>
								<div>
									&nbsp;&nbsp;
								</div>
								<input type="submit" value="添加" />
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