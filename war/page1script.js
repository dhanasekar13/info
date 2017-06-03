
/**/
$("document").ready(function() {
$("#c_3_1").click(function(){
	var value=$("#c_2_1").val();
	g();
	$("#c1_1").prepend(value);
});	
	
});
function g(){
	$.ajax({
		type:"POST",
		url:"apppends",
		data:{value},
		contentType:"aplication/x-www-form-urlencoded",
		success:function(data){
			console.log(dat);
		}
		
	});
}