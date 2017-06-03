
/**/
$("document").ready(function() {
$("#c_3_1").click(function(){
	
	var r1=$("#c_2_1").val();
	console.log(r1);
	$.ajax({
		type:"POST",
		url:"apppends",
		data: {
			requ:r1
			},
		success:function(data){
			
		}
		
	});
	/*var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	       // Typical action to be performed when the document is ready:
	       document.getElementById("c1_1").innerHTML = xhttp.responseText;
	    }
	};
	xhttp.open("GET", "apppends", true);
	xhttp.send(r1);*/
	$("#c1_1").prepend(r1);
});	
	
});