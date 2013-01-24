<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="css/style.css">
<script src="js/validate.JS"></script>
<script type="text/javascript">
		function login(){
			var account = document.getElementById("userAccount").value;
			var password = document.getElementById("userPassword").value;			
			window.top.location = ("bManager/CheckManagerServlet?account="+account+"&password="+password);
		};
	
</script>
<body onLoad="clockon(bgclock);">
	<form style="margin: 0px;" name="form1" action=""
		onSubmit="return check()">
		<table width="800" height="23" border="0" cellpadding="0"
			cellspacing="0" background="fImage/landWhite.jpg">
			<tr>
				<td width="208">
					&nbsp;&nbsp;账号:
					<input type="text" id="userAccount" name="account">
				</td>
				<td width="184">
					密码:
					<input type="password" id="userPassword" name="password">
				</td>
				<td width="87">
					<input type="button" onclick="login();" name="submit" value="登录后台">
				</td>
				<td width="62">
					<input type="reset" name="clean" value="清除信息">
				</td>
				<td width="259" align="center">
					<div id="bgclock"></div>
				</td>
			</tr>
		</table>
	</form>
	<table width="800" height="7" border="0" cellpadding="0"
		cellspacing="0" background="fImage/landGrey.jpg">
		<tr>
			<td>
				&nbsp;
			</td>
		</tr>
	</table>
	<table width="800" height="159" border="0" cellpadding="0"
		cellspacing="0" background="fImage/two.jpg">
		<tr>
			<td width="627">
				&nbsp;
			</td>
			<td width="173" valign="top">
				<table width="157" height="137" border="0" cellpadding="0"
					cellspacing="0">
					<tr>
						<td width="68" height="48">
							&nbsp;
						</td>
						<td width="89" valign="bottom">
							<a
								href="javascript:window.external.AddFavorite('http://www.mingrisoft.com','明日科技')"><b>收藏本站</b>
							</a>
						</td>
					</tr>
					<tr>
						<td height="33">
							&nbsp;
						</td>
						<td valign="bottom">
							<a href="#"
								onClick="this.style.behavior='url(#default#homepage)';this.sethomepage('http://www.mingrisoft.com')"><b>设为首页</b>
							</a>
						</td>
					</tr>
					<tr>
						<td height="31">
							&nbsp;
						</td>
						<td valign="bottom">
							<a href="mailto:zdq-0412@163.com"><b>联系我们</b>
							</a>
						</td>
					</tr>
					<tr>
						<td height="31">
							&nbsp;
						</td>
						<td valign="bottom">
							<a href="fNews\frontSelectTodayNews.jsp" target="_blank"><b>今日新闻</b>
							</a>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<table width="800" height="26" border="0" cellpadding="0"
		cellspacing="0" background="fImage/three.jpg">
		<tr>
			<td width="216">
				&nbsp;
			</td>
			<td width="584" align="center">
				<strong> <a href="index.jsp" target="_parent"><font
						color="#FFFFFF">首页</font>
				</a>&nbsp;|&nbsp; <a href="fNews\SelectNewsType?id=2" target="_parent"><font
						color="#FFFFFF">时政</font>
				</a>&nbsp;|&nbsp; <a href="fNews\SelectNewsType?id=3" target="_parent"><font
						color="#FFFFFF">经济</font>
				</a>&nbsp;|&nbsp; <a href="fNews\SelectNewsType?id=4" target="_parent"><font
						color="#FFFFFF">法制</font>
				</a>&nbsp;|&nbsp; <a href="fNews\SelectNewsType?id=5" target="_parent"><font
						color="#FFFFFF">科学</font>
				</a>&nbsp;|&nbsp; <a href="fNews\SelectNewsType?id=6" target="_parent"><font
						color="#FFFFFF">社会</font>
				</a>&nbsp;|&nbsp; <a href="fNews\SelectNewsType?id=1" target="_parent"><font
						color="#FFFFFF">娱乐</font>
				</a>&nbsp;</strong>
			</td>
		</tr>
	</table>
</body>
