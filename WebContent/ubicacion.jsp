<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <style>
       #map {
        height: 400px;
        width: 100%;
       }
    </style>
  </head>
  <body>
    <h3>My Google Maps Demo</h3>
    <div id="map"></div>
    <script>
var map;
var markersArray = [];
var image = 'img/';
var bounds = new google.maps.LatLngBounds();
var loc;

function init(){
    var mapOptions = { mapTypeId: google.maps.MapTypeId.ROADMAP };
    map =  new google.maps.Map(document.getElementById("map_canvas"), mapOptions);

    loc = new google.maps.LatLng("45.478294","9.123949");
    bounds.extend(loc);
    addMarker(loc, 'Event A', "active");

    bounds  = new google.maps.LatLngBounds();
    bounds.extend(loc);
    
    map.fitBounds(bounds);
    map.panToBounds(bounds);    
}

function addMarker(location, name, active) {          
    var marker = new google.maps.Marker({
        position: location,
        map: map,
        title: name,
        status: active
    });
}

$(function(){ init(); });
</script>
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCbJeelSVtJDIa45yWq4NQ9sWPUM22DGbM&callback=initMap">
    </script>
  </body>
</html>