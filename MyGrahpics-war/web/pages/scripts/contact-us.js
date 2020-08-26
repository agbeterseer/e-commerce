var ContactUs = function () {

    return {
        //main function to initiate the module
        init: function () {
			var map;
			$(document).ready(function(){
			  map = new GMaps({
				div: '#map',
	            lat: -13.004333,
				lng: -38.494333,
			  });
			   var marker = map.addMarker({
		            lat: -13.004333,
					lng: -38.494333,
		            title: 'Loop, Inc.',
		            infoWindow: {
		                content: "<b></b> <br>Nigeria"
		            }
		        });

			   marker.infoWindow.open(map, marker);
			});
        }
    };

}();