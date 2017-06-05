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
	 for (i=0;i<obj.length;i++){
		 var iu=""+
			 "<br><br><h3>user is     - <tr><td>"+obj[i].n+"</td></tr></h3><br>"+
		 	"The blog details --<br><tr><td><textarea id='ab2' name='txt4' cols='70' rows='30' >"+obj[i].b+"</textarea></td></tr> <br>"+
		 	"The previous comment<br><tr><td>"+obj[i].pre+"</td></tr><br>";

		 
		 $("#a").before(iu);
		 //	console.log(obj[i].b);
	/*$("#a").append(obj[i].n);
	$("#b").append(obj[i].b);
	$("#c").append(obj[i].pre);
	$("#d").append(obj[i].new);*/
		 
	 
	 }
	/*var i=new Object();
	 i=JSON.parse(h);
console.log(i);*/
	
	}
if(gh==2)
	{console.log("this is the second block"+o);
	obj=JSON.parse(o);
	 for (i=0;i<obj.length;i++){
		 var iu="<br><br><h3>user is    -<br><tr><td>"+obj[i].n+"</td></tr> </h3><br>"+
		 	"The blog details --<br><tr><td>"+"<textarea id='ab1' name='txt2' cols='70' rows='20'>"+obj[i].b+"</textarea></td></tr><br>"+
		 	"The previous comment<br><tr><td>"+obj[i].pre+"</td></tr><br>"+
		 	"<h3>Add your comment -- </h3><br><tr><td><textarea id='ab' name='txt1' cols='60' rows='20' ></textarea></td></tr>";
		 	
		 
		 $("#c1").before(iu);
	/*var i=JSON.parse(h);
	console.log(i);*/

	 obj=JSON.parse(o);
	console.log();
	}
	}
}