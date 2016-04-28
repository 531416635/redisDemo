function adduser(){
	alert($("input name="))
	jQuery.ajax({
		type : 'post',
		url : '../user/addto.html',
		dataType : 'text',
		data : getParams(),
		success : function(html) {
			if(!publicrightcheck(html)){
				return;
			}
		 var json = eval('('+(html)+")");
         $j("#pressManager").html(json.html);
          total = json.total;
          rows = json.pageRows;
	      	//分页初始化
	      	pageinit();
		}
	});
}