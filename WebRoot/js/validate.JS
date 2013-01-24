function checkEmpty(form){
for(i=0;i<form.length;i++){
if(form.elements[i].value==""){
alert("表单信息不能为空");
return false;
}
}
}
function selectKey(){
if(document.form.bigSort.value==""){
window.alert("请选择新闻类型");
return false;
}
return true;
}

function clockon(bgclock){
	if(window.parent != window.top){
		window = window.parent;
	}
	var now=new Date();
	var year=now.getYear();
	var month=now.getMonth();
	var date=now.getDate();
	var day=now.getDay();
	var hour=now.getHours();
	var minu=now.getMinutes();
	var sec=now.getSeconds();
	var week;
	month=month+1;
	if(month<10) month="0"+month;
	if(date<10) date="0"+date;
	if(hour<10) hour="0"+hour;
	if(minu<10) minu="0"+minu;
	if(sec<10) sec="0"+sec;
	var arr_week=new Array("星期日","星期一","星期二","星期三","星期四","星期五","星期六");
	week=arr_week[day];
	var time="";
	if(document.all){
		time=year+"年"+month+"月"+date+"日 "+week+" "+hour+":"+minu+":"+sec;
		bgclock.innerHTML=""+time+"";
	}else{
		time=(year+1900)+"年"+month+"月"+date+"日 "+week+" "+hour+":"+minu+":"+sec;		
		document.getElementById("bgclock").innerHTML = ""+time+"";
	}
	var timer=setTimeout("clockon(bgclock)",200);
} 

function check(){
	
if(document.form1.account.value==""){
window.alert("请输入账号");
return false;
}
if(document.form1.password.value==""){
window.alert("请输入密码");
return false;
}
return true;
}


