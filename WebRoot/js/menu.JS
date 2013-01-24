var menuOffX=0	//菜单距连接文字最左端距离
var menuOffY=18	//菜单距连接文字顶端距离
var fo_shadows=new Array()
var linkset=new Array()
var ie4=document.all&&navigator.userAgent.indexOf("Opera")==-1
var ns6=document.getElementById&&!document.all
var ns4=document.layers
function openScript(url, width, height){
	var Win = window.open(url,"openScript",'width=' + width + ',height=' + height + ',resizable=1,scrollbars=yes,menubar=no,status=no' );
}
function showmenu(e,vmenu,mod){
	if (!document.all&&!document.getElementById&&!document.layers)
		return
	which=vmenu
	clearhidemenu()
	ie_clearshadow()
	menuobj=ie4? document.all.popmenu : ns6? document.getElementById("popmenu") : ns4? document.popmenu : ""
	menuobj.thestyle=(ie4||ns6)? menuobj.style : menuobj
	
	if (ie4||ns6)
		menuobj.innerHTML=which
	else{
		menuobj.document.write('<layer name=gui bgColor=#E6E6E6 width=165 onmouseover="clearhidemenu()" onmouseout="hidemenu()">'+which+'</layer>')
		menuobj.document.close()
	}
	menuobj.contentwidth=(ie4||ns6)? menuobj.offsetWidth : menuobj.document.gui.document.width
	menuobj.contentheight=(ie4||ns6)? menuobj.offsetHeight : menuobj.document.gui.document.height
	
	eventX=ie4? event.clientX : ns6? e.clientX : e.x
	eventY=ie4? event.clientY : ns6? e.clientY : e.y
	
	var rightedge=ie4? document.body.clientWidth-eventX : window.innerWidth-eventX
	var bottomedge=ie4? document.body.clientHeight-eventY : window.innerHeight-eventY
		if (rightedge<menuobj.contentwidth)
			menuobj.thestyle.left=ie4? document.body.scrollLeft+eventX-menuobj.contentwidth+menuOffX : ns6? window.pageXOffset+eventX-menuobj.contentwidth : eventX-menuobj.contentwidth
		else
			menuobj.thestyle.left=ie4? ie_x(event.srcElement)+menuOffX : ns6? window.pageXOffset+eventX : eventX
		
		if (bottomedge<menuobj.contentheight&&mod!=0)
			menuobj.thestyle.top=ie4? document.body.scrollTop+eventY-menuobj.contentheight-event.offsetY+menuOffY-23 : ns6? window.pageYOffset+eventY-menuobj.contentheight-10 : eventY-menuobj.contentheight
		else
			menuobj.thestyle.top=ie4? ie_y(event.srcElement)+menuOffY : ns6? window.pageYOffset+eventY+10 : eventY
	menuobj.thestyle.visibility="visible"
	ie_dropshadow(menuobj,"#999999",3)
	return false
}

function ie_y(e){  
	var t=e.offsetTop;  
	while(e=e.offsetParent){  
		t+=e.offsetTop;  
	}  
	return t;  
}  
function ie_x(e){  
	var l=e.offsetLeft;  
	while(e=e.offsetParent){  
		l+=e.offsetLeft;  
	}  
	return l;  
}  
function ie_dropshadow(el, color, size)
{
	var i;
	for (i=size; i>0; i--)
	{
		var rect = document.createElement('div');
		var rs = rect.style
		rs.position = 'absolute';
		rs.left = (el.style.posLeft + i) + 'px';
		rs.top = (el.style.posTop + i) + 'px';
		rs.width = el.offsetWidth + 'px';
		rs.height = el.offsetHeight + 'px';
		rs.zIndex = el.style.zIndex - i;
		rs.backgroundColor = color;
		var opacity = 1 - i / (i + 1);
		rs.filter = 'alpha(opacity=' + (100 * opacity) + ')';
		fo_shadows[fo_shadows.length] = rect;
	}
}
function ie_clearshadow()
{
	for(var i=0;i<fo_shadows.length;i++)
	{
		if (fo_shadows[i])
			fo_shadows[i].style.display="none"
	}
	fo_shadows=new Array();
}


function contains_ns6(a, b) {
	while (b.parentNode)
		if ((b = b.parentNode) == a)
			return true;
	return false;
}

function hidemenu(){
	if (window.menuobj)
		menuobj.thestyle.visibility=(ie4||ns6)? "hidden" : "hide"
	ie_clearshadow()
}

function dynamichide(e){
	if (ie4&&!menuobj.contains(e.toElement))
		hidemenu()
	else if (ns6&&e.currentTarget!= e.relatedTarget&& !contains_ns6(e.currentTarget, e.relatedTarget))
		hidemenu()
}

function delayhidemenu(){
	if (ie4||ns6||ns4)
		delayhide=setTimeout("hidemenu()",500)
}

function clearhidemenu(){
	if (window.delayhide)
		clearTimeout(delayhide)
}

function highlightmenu(e,state){
	if (document.all)
		source_el=event.srcElement
	else if (document.getElementById)
		source_el=e.target
	if (source_el.className=="menuitems"){
		source_el.id=(state=="on")? "mouseoverstyle" : ""
	}
	else{
		while(source_el.id!="popmenu"){
			source_el=document.getElementById? source_el.parentNode : source_el.parentElement
			if (source_el.className=="menuitems"){
				source_el.id=(state=="on")? "mouseoverstyle" : ""
			}
		}
	}
}

if (ie4||ns6)
document.onclick=hidemenu
function doSClick() {
	var targetId, srcElement, targetElement, imageId, imageElement;
	srcElement = window.event.srcElement;
	targetId = srcElement.id + "content";
	targetElement = document.all(targetId);
	imageId = srcElement.id;
	imageId = imageId.charAt(0);
	imageElement = document.all(imageId);
	if (targetElement.style.display == "none") {

		targetElement.style.display = "";
	} else {
		targetElement.style.display = "none";
	}
}
function doClick() {
	var targetId, srcElement, targetElement;
	srcElement = window.event.srcElement;
	targetId = srcElement.id + "_content";
	targetElement = document.all(targetId);
	if (targetElement.style.display == "none") {
		targetElement.style.display = "";
	} else {
		targetElement.style.display = "none";
	}
}

//HTML���˺���
function HTMLEncode(text)
{
	text = text.replace(/&/g, "&amp;") ;
	text = text.replace(/"/g, "&quot;") ;
	text = text.replace(/</g, "&lt;") ;
	text = text.replace(/>/g, "&gt;") ;
	text = text.replace(/'/g, "&#146;") ;

	return text ;
}
function bbimg(o){
	var zoom=parseInt(o.style.zoom, 10)||100;zoom+=event.wheelDelta/12;if (zoom>0) o.style.zoom=zoom+'%';
	return false;
}
function Dvbbs_ViewCode(replyid)
{
	var bodyTag="<html><head><style type=text/css>.quote{margin:5px 20px;border:1px solid #CCCCCC;padding:5px; background:#F3F3F3 }\nbody{boder:0px}.HtmlCode{margin:5px 20px;border:1px solid #CCCCCC;padding:5px;background:#FDFDDF;font-size:14px;font-family:Tahoma;font-style : oblique;line-height : normal ;font-weight:bold;}\nbody{boder:0px}</style></head><BODY bgcolor=\"#FFFFFF\" >";
	bodyTag+=document.getElementById('scode'+replyid).CodeText.value
	bodyTag+="</body></html>"
	preWin=window.open('preview','','left=0,top=0,width=550,height=400,resizable=1,scrollbars=1, status=1, toolbar=1, menubar=0');
	preWin.document.open();
	preWin.document.write(bodyTag);
	preWin.document.close();
	//preWin.document.title="�鿴��������";
	preWin.document.charset="UTF-8";
}
function overbg(tdbg){
tdbg.style.background='url(Images/item_over.gif)'
tdbg.style.border=' #9CA6C6 1px solid'
}
function outbg(tdbg){
tdbg.style.background='url(.Images/item_out.gif)'
tdbg.style.border=''
}
var information='<table width=80>\
<tr><td id=bookInformation onMouseOver=overbg(bookInformation) onMouseOut=outbg(bookInformation)><a href=#>����Ϣ����</a></td></tr>\
<tr><td id=bookPlace onMouseOver=overbg(bookPlace) onMouseOut=outbg(bookPlace)><a href=#>ͼ����λ��</a></td></tr>\
<tr><td id=readerSoft onMouseOver=overbg(readerSoft) onMouseOut=outbg(readerSoft)><a href=#>����������</a></td></tr>\
<tr><td id=readerInformation onMouseOver=overbg(readerInformation) onMouseOut=outbg(readerInformation)><a href=#>���߻���Ϣ</a></td></tr>\
</table>'


var bookManager='<table width=90>\
<tr><td id=addManager onMouseOver=overbg(addManager) onMouseOut=outbg(addManager)><a href=#>������</a></td></tr>\
<tr><td id=selectManager onMouseOver=overbg(selectManager) onMouseOut=outbg(selectManager)><a href=#>����ѯ</a></td></tr>\
<tr><td id=warnManager onMouseOver=overbg(warnManager) onMouseOut=outbg(warnManager)><a href=#>���Ԥ��</a></td></tr>\
<tr><td id=editSell onMouseOver=overbg(editSell) onMouseOut=outbg(editSell)><a href=#>���۹���</a></td></tr>\
<tr><td id=selectSell onMouseOver=overbg(selectSell) onMouseOut=outbg(selectSell)><a href=#>���۲�ѯ</a></td></tr>\
</table>'


var borrowBook='<table width=90>\
<tr><td id=managerBorrow onMouseOver=overbg(managerBorrow) onMouseOut=outbg(managerBorrow)><a href=#>�������</a></td></tr>\
<tr><td id=selectBorrow onMouseOver=overbg(selectBorrow) onMouseOut=outbg(selectBorrow)><a href=#>�����ѯ</a></td></tr>\
<tr><td id=managerBorrowLater onMouseOver=overbg(managerBorrowLater) onMouseOut=outbg(managerBorrowLater)><a href=#>ͼ��̽�</a></td></tr>\
</table>'


var lendBook='<table width=60>\
<tr><td id=managerLend onMouseOver=overbg(managerLend) onMouseOut=outbg(managerLend)><a href=bookBorrow.jsp>�������</a></td></tr>\
<tr><td id=selectLend onMouseOver=overbg(selectLend) onMouseOut=outbg(selectLend)><a href=bookRenew.jsp>�����ѯ</a></td></tr>\
</table>'


var analyse='<table width=90>\
<tr><td id=sellAnalyse onMouseOver=overbg(sellAnalyse) onMouseOut=outbg(sellAnalyse)><a href=#>��������</a></td></tr>\
<tr><td id=operationAnalyse onMouseOver=overbg(operationAnalyse) onMouseOut=outbg(operationAnalyse)><a href=#>���ķ���</a></td></tr>\
<tr><td id=bookAnalyse onMouseOver=overbg(bookAnalyse) onMouseOut=outbg(bookAnalyse)><a href=#>������</a></td></tr>\
</table>'


var operationRight='<table width=100>\
<tr><td id=operation onMouseOver=overbg(operation) onMouseOut=outbg(operation)><a href=#>����Ա����</a></td></tr>\
<tr><td id=operationPassword onMouseOver=overbg(operationPassword) onMouseOut=outbg(operationPassword)><a href=#>��������</a></td></tr>\
<tr><td id=operationManager onMouseOver=overbg(operationManager) onMouseOut=outbg(operationManager)><a href=#>Ȩ������</a></td></tr>\
</table>'


var help='<table width=100>\
<tr><td id=selectHelp onMouseOver=overbg(selectHelp) onMouseOut=outbg(selectHelp)><a href=#>����</a></td></tr>\
<tr><td id=edition onMouseOver=overbg(edition) onMouseOut=outbg(edition)><a href=#>����</a></td></tr>\
</table>'