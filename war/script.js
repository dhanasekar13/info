$(function(){
	/*$.ajax(function(){
		type:"GET",
		url:"g1",
		success:function(data){
			$("#main").append(data);
			
		}	
		
	});*/
	
	var xh=new XMLHttpRequest();
	xh.onreadystatechange=function(){
		if(this.readyState==4&&this.status==200)
		{
			g(xh.responseText);
			//$("#main").append(xh.responseText);
		}
	};
xh.open("GET","g1",true);
xh.send();
	
});

function g(o)
{
	//have to take the h to json value to make the individual 
var gh=$("#h").val();
if(gh==1)
	{console.log("this is the first block"+o);
	 obj=JSON.parse(o);
	 for (i=0;i<obj.length;i++){//	console.log(obj[i].b);
	/*$("#a").append(obj[i].n);
	$("#b").append(obj[i].b);
	$("#c").append(obj[i].pre);
	$("#d").append(obj[i].new);*/
		 $("#main").append(obj[i].b);
	 
	 }
	/*var i=new Object();
	 i=JSON.parse(h);
console.log(i);*/
	
	}
if(gh==2)
	{console.log("this is the second block"+o);
	
	/*var i=JSON.parse(h);
	console.log(i);*/

	 obj=JSON.parse(o);
	console.log();
	}

}