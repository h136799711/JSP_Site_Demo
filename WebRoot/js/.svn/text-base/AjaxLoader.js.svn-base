//必需导入jQuery
//此js用于异步请求数据到页面上
window.ajax = (function(){
	if(!window.jQuery){
		return "undefined";
	}
	var $ = jquery = window.jQuery;
	function _create(){
		return new ajaxLoader();
	}	
	function ajaxLoader(){
		var that = this;
		this.settings = {infoEleId:"ajaxLoader" };
		this.request = function (options){
			//console.log(that);
			$.ajax({
				url: options.url || "http://www.123456.com",
				type:options.type ||"GET",
				beforeSend: options.beforeSend || function(){
					$("#"+that.settings.infoEleId).text("载入中......");
				},
				data:options.data,
				error:options.error || function(XMLHttpRequest,textStatus,errorThrown){
					$("#"+that.settings.infoEleId).text("载入失败 -_- !");
				},
				success:options.success || function(data,textStatus){
					$("#"+that.settings.infoEleId).html(data);
				},
				complete:options.complete || function(XMLHttpRequest,textStatus){
				}
			});
		};
		this.init = function (settings){
			
			if(typeof(settings) === "undefined"){
				return ;
			}
			if(typeof(settings) !== "Object"){			
				settings = {	id: settings	};
			}
			
			that.settings.infoEleId = settings.id || that.settings.infoEleId;
		};
		
		this.create = _create;
	}
	return 	new ajaxLoader();
})(window);

