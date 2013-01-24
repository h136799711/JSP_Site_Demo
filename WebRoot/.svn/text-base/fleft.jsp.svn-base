<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<link rel="stylesheet" href="css/style.css">
<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="js/AjaxLoader.js"></script>
<script type="text/javascript">
	$(function(){
		var ajaxFocusnews = ajax.create();
		ajaxFocusnews.init("FocusNews");
		ajaxFocusnews.request({url:"fForce/SelectForce",type:"POST"});
		
		var ajaxAffiche = ajax.create();
		ajaxAffiche.init("Affiche");
		ajaxAffiche.request({url:"fAffiche/SelectAffiche",type:"POST"});
		
		
		$("#search").bind("click",function(){
			var keywords = document.getElementById("keywords").value;
			var newstypeId = document.getElementById("newstypeId").value;
			console.log(newstypeId);
			if(typeof(keywords) === "undefined" || keywords == ""){
				alert("请输入查询的关键字");
				return ;
			}
			var url ;
			if(typeof(newstypeId) === "undefined" || newstypeId == ""){
				url = "fNews/SearchNews?keywords="+keywords;
			}else{
				url = "fNews/SearchNews?keywords="+keywords+"&newstypeId="+newstypeId;
			}
			
			window.top.location = url;
			
		});
		

		
	});
</script>
<table width="216" height="660" border="0" cellpadding="0"
	cellspacing="0">
	<tr>
		<td height="121">

			<table width="216" height="98" border="0" cellpadding="0"
				cellspacing="0" background="fImage/leftOne.jpg">
				<tr>
					<td height="37">
						&nbsp;
					</td>
				</tr>
				<tr align="center">
					<td height="84">
						关键字:
						<input id="keywords" name="key" type="text" size="20">
						<br>
						<br>

						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<select id="newstypeId">
							<option></option>
							<option value="1" style="background: #00FFFF">
								娱乐天地
							</option>
							<option value="2" style="background: #00FFFF">
								时政要闻
							</option>
							<option value="3" style="background: #00FFFF">
								经济动向
							</option>
							<option value="4" style="background: #00FFFF">
								法制教育
							</option>
							<option value="5" style="background: #00FFFF">
								科学文化
							</option>
							<option value="6" style="background: #00FFFF">
								社会现象
							</option>
						</select>
						<input type="button" value="搜索" id="search">
					</td>
				</tr>
			</table>


		</td>
	</tr>
	<tr>
		<td height="210">
			<table width="216" height="141" border="0" cellpadding="0"
				cellspacing="0" background="fImage/leftTwo.jpg">
				<tr>
					<td height="36">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td height="174">
						<marquee direction="up" height="170" onmouseout="this.start()"
							onmouseover="this.stop()" scrollAmount="2" scrollDelay="0"
							class="linkBlack">

							<div id="Affiche" align="center">
								<!-- 公告信息载入点 -->


							</div>


							<br>
						</marquee>


					</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td height="336">

			<table width="216" height="347" border="0" cellpadding="0"
				cellspacing="0" background="fImage/leftThree.jpg">
				<tr>
					<td height="38">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td id="FocusNews" height="288" valign="top">
						<br>
						<!-- 焦点新闻 载入点 -->


					</td>
				</tr>
				<tr>
					<td height="20" align="right">
						<a href="fForce/SelectMoreForce" style="font-size: 16px;"
							target="_parent""><strong>more...</strong>
						</a>&nbsp;&nbsp;
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
</table>
