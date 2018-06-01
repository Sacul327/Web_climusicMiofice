<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      margin-top:20px;
      border-radius: 10px;
    }
    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
    #addcart{
    	display: inline;
    }
    
  </style>
</head>
<body>
<div class="container-fluid bg-3 text-center"> 
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" disabled>Lista Usuarios</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <span class="navbar-toggler-icon"></span>
    </div>
  </div>
</nav>

<div class="jumbotron">
  <div class="container text-center">
    <div id="listproducto" class="list-group">
						<button  type="button"
							class="list-group-item list-group-item-action">
							Cras justo odio</button>
						<button type="button"
							class="list-group-item list-group-item-action">Dapibus
							ac facilisis in</button>
						<button type="button"
							class="list-group-item list-group-item-action">Morbi leo
							risus</button>
						<button type="button"
							class="list-group-item list-group-item-action">Porta ac
							consectetur ac</button>
						
					</div>
					<div id="addcart" class="input-group mb-3">
  						<div class="input-group-prepend">
    					<button class="btn btn-outline-secondary" type="button">Add to cart</button>
  							</div>
  							<input type="text" class="form-control" placeholder="N° de producto" aria-label="" aria-describedby="basic-addon1">
					</div>
  </div>
</div>
  
<div class="container-fluid bg-3 text-center">    
  <h3>Some of my Work</h3><br>
  
</div><br>
</div>
<footer class="container-fluid text-center">
  <p>Footer Text</p>
</footer>

</body>
</html>