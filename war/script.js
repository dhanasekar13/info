$(function(){
	/*$.ajax(function(){
		type:"GET",
		url:"g1",
		success:function(data){
			$("#main").append(data);
			
		}	
		
	});*/
	console.log("this is in script.js")
	var xh=new XMLHttpRequest();
	xh.onreadystatechange=function(){
		if(this.readyState==4&&this.status==200)
		{
			$("#main").append(xh.responseText);
		}
	};
xh.open("GET","g1",true);
xh.send();
	
});
