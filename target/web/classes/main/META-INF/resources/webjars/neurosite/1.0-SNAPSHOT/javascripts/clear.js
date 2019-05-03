var example = document.getElementById("example"),
			    ctx     = example.getContext('2d');
var c = example.getBoundingClientRect();
var ispressed = false;

var sizeOfDot = 9;

	function clearP(){
	ctx.fillStyle = 'white';
	ctx.fillRect(0, 0, example.width, example.height);
	}

	function paint(){if(ispressed){
	    putDot();
	}
	}

	function pressed(){
	ispressed = true;
	}
	function noPressed(){
    	ispressed = false;
    	getArr();
    	}

	function putDot(){
	//pressed();
    	var e = event;

        var posX = e.clientX - c.left - 6;
        var posY = e.clientY - c.top - 7;

	    ctx.fillStyle = 'black'
	    ctx.beginPath();
	    ctx.arc(posX, posY, sizeOfDot, 0, 2 * Math.PI)
	    ctx.fill();
	    ctx.stroke();
	}

	function getArr(){
	    var arr = "";
        ispressed = false;
	    


	    for (var i = 0; i < 784; i++){
	        var hex = summ(i);
	        arr += hex + " ";
	    }


	    var xmlhttp = new XMLHttpRequest();
	    xmlhttp.open("POST", "http://localhost:9000/arr",false);

		xmlhttp.send(arr);
		document.getElementById("aaa").innerHTML = xmlhttp.responseText;
	}

	function summ(num){

		var h = 10;
		var x = (num % 28) * h;
		var y = Math.floor(num/28) * h;
		var summ = 0.0;

		for(var j = 0; j < 10; j++){
			for(var k=0; k< 10; k++){
				var p = ctx.getImageData(x+j, y+k, 1, 1).data;
				   var hex = (p[0]+ p[1]+ p[2])/3;
				   summ += hex;
			}
		}

		return summ / 100.0;
	}


	function httpGet(theUrl)
    {
        var xmlHttp = new XMLHttpRequest();
        xmlHttp.open( "GET", theUrl, false ); // false for synchronous request
        xmlHttp.send( null );
        return xmlHttp.responseText;
    }


