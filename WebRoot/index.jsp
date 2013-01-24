<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>宇晨网络新闻中心前台首页</title>
		<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
		<script type="text/javascript" src="js/AjaxLoader.js"></script>
		<script type="text/javascript">
			$(function(){
//				console.log("request");
				var ajax1 = ajax.create();
				ajax1.init("news1");
				ajax1.request({url:"fNews/SelectNewsTop",data:{id:1},type:"POST"});
				var ajax2 = ajax.create();
				ajax2.init("news2");
				ajax2.request({url:"fNews/SelectNewsTop",data:{id:2},type:"POST"});
				var ajax3 = ajax.create();
				ajax3.init("news3");
				ajax3.request({url:"fNews/SelectNewsTop",data:{id:3},type:"POST"});
				var ajax4 = ajax.create();
				ajax4.init("news4");
				ajax4.request({url:"fNews/SelectNewsTop",data:{id:4},type:"POST"});
				var ajax5 = ajax.create();
				ajax5.init("news5");
				ajax5.request({url:"fNews/SelectNewsTop",data:{id:5},type:"POST"});
				var ajax6 = ajax.create();
				ajax6.init("news6");
				ajax6.request({url:"fNews/SelectNewsTop",data:{id:6},type:"POST"});
			});		
		</script>
	</head>
	<link rel="stylesheet" href="css/style.css">
	<body>
		<div align="center">
			<iframe src="fTop.jsp" marginheight="0" marginwidth="0"
				scrolling="no" width="800" height="226" frameborder="0"></iframe>
			<table width="800" height="678" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td width="216" rowspan="3" valign="top">
						<iframe src="fleft.jsp" style="min-height: 680px;"
							marginwidth="230" scrolling="no" width="100%" height="100%"
							frameborder="0" marginheight="0"></iframe>
					</td>
					<td height="216" valign="middle">
						<table width="584" height="224" border="0" cellpadding="0"
							cellspacing="0" background="fImage/rightOne.jpg">
							<tr>
								<td height="44">
									<table width="262" border="0" align="center" cellpadding="0"
										cellspacing="0">
										<tr>
											<td width="131" height="18">
												&nbsp;
											</td>
											<td width="134">
												<div align="right" class="word_white">
													<strong><a href="fNews/SelectNewsType?id=2"><font
															color="#FFFFFF">more...</font> </a> </strong>
												</div>
											</td>
										</tr>
									</table>
								</td>
								<td height="44">
									<table width="262" border="0" align="center" cellpadding="0"
										cellspacing="0">
										<tr>
											<td width="131" height="18">
												&nbsp;
											</td>
											<td width="134">
												<div align="right">
													<strong><a href="fNews/SelectNewsType?id=3"><font
															color="#FFFFFF">more...</font> </a> </strong>
												</div>
											</td>
										</tr>
									</table>
								</td>
							</tr>
							<tr>
								<td width="291" valign="top">
									<br>
									<table id="news2" width="234" border="0" align="center"
										cellpadding="0" cellspacing="0">

										<!-- 时政要闻插入点  -->

									</table>
								</td>
								<td width="291" valign="top">

									<br>
									<table id="news3" width="234" border="0" align="center"
										cellpadding="0" cellspacing="0">

										<!-- 经济动向插入点  -->

									</table>
									<br>
								</td>
							</tr>
						</table>



					</td>
				</tr>
				<tr>
					<td height="222">

						<table width="584" height="226" border="0" cellpadding="0"
							cellspacing="0" background="fImage/rightTwo.jpg">
							<tr>
								<td height="44">
									<table width="262" border="0" align="center" cellpadding="0"
										cellspacing="0">
										<tr>
											<td width="131" height="18">
												&nbsp;
											</td>
											<td width="134">
												<div align="right">
													<strong><a href="fNews/SelectNewsType?id=4"><font
															color="#FFFFFF">more...</font> </a> </strong>
												</div>
											</td>
										</tr>
									</table>
								</td>
								<td height="44">
									<table width="262" border="0" align="center" cellpadding="0"
										cellspacing="0">
										<tr>
											<td width="131" height="18">
												&nbsp;
											</td>
											<td width="134">
												<div align="right">
													<strong><a href="fNews/SelectNewsType?id=5"><font
															color="#FFFFFF">more...</font> </a> </strong>
												</div>
											</td>
										</tr>
									</table>
								</td>
							</tr>
							<tr>
								<td width="293" valign="top">

									<br>
									<table id="news4" width="234" border="0" align="center"
										cellpadding="0" cellspacing="0">
										<!-- 法制教育 -->

									</table>
									<br>
								</td>
								<td width="296" valign="top">
									<br>
									<table id="news5" width="234" border="0" align="center"
										cellpadding="0" cellspacing="0">

										<!-- 科学教育 -->


									</table>
									<br>
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td height="225">

						<table width="584" height="228" border="0" cellpadding="0"
							cellspacing="0" background="fImage/rightThree.jpg">
							<tr>
								<td height="42">
									<table width="262" height="30" border="0" align="center"
										cellpadding="0" cellspacing="0">
										<tr>
											<td width="131" height="23">
												&nbsp;
											</td>
											<td width="134">
												<div align="right">
													<strong><a href="fNews/SelectNewsType?id=6"><font
															color="#FFFFFF">more...</font> </a> </strong>
												</div>
											</td>
										</tr>
									</table>
								</td>
								<td height="42">
									<table width="262" height="30" border="0" align="center"
										cellpadding="0" cellspacing="0">
										<tr>
											<td width="131" height="18">
												&nbsp;
											</td>
											<td width="134">
												<div align="right">
													<strong><a href="fNews/SelectNewsType?id=1"><font
															color="#FFFFFF">more...</font> </a> </strong>
												</div>
											</td>
										</tr>
									</table>
								</td>
							</tr>
							<tr>
								<td width="293" valign="top">
									<br>
									<table id="news6" width="234" border="0" align="center"
										cellpadding="0" cellspacing="0">

										<!-- 社会现象 -->

									</table>
									<br>
									<br>
									<br>
								</td>
								<td valign="top">
									<br>
									<table id="news1" width="234" border="0" align="center"
										cellpadding="0" cellspacing="0">


										<!-- 娱乐天地 -->

									</table>
									<br>
									<br>
									<br>
								</td>
							</tr>
						</table>

					</td>
				</tr>
			</table>
			<iframe src="fBottom.jsp" marginheight="0" marginwidth="0"
				scrolling="no" width="799" height="104"></iframe>
		</div>
	</body>
</html>
