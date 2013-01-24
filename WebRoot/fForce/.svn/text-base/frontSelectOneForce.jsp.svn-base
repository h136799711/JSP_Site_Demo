<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>宇晨网络新闻中心前台--焦点新闻查询</title>
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
						<iframe src="../fleft.jsp" marginwidth="230" scrolling="no"
							width="100%" height="100%"  style="min-height:680px" frameborder="0" marginheight="0"></iframe>
					</td>
					<td height="31" align="left" valign="middle"
						background="../fImage/place.jpg">
						&nbsp;&nbsp;&nbsp;当前位置&nbsp;&nbsp;&gt;&gt;&nbsp;&nbsp;焦点导读&nbsp;&nbsp;&gt;&gt;&nbsp;&nbsp;焦点新闻详细内容
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
									<font color="#FFFFFF">题目：${focusnews.focusTitle}</font>
								</td>
							</tr>
						</table>
						<br>
						&nbsp;
						<table width="480" height="280" border="1" cellpadding="0"
							cellspacing="0">
							<tr>
								<td width="132" height="39" valign="middle">
									<div align="center">
										发布时间:
									</div>
								</td>
								<td width="342">
									${focusnews.focusPubtime}
								</td>
							</tr>
							<tr>
								<td height="440" valign="top">
									<br>
									<div align="center">
									具体内容
									</div>
								</td>
								<td valign="top">
										<textarea cols="42" rows="18" name="focusContent"
										readonly="readonly" style="width:100%;height:100%">${focusnews.focusContent}</textarea>
								</td>
							</tr>
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
