<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<link href="css/pantalladVentas.css" rel="stylesheet">
<title>Ventas</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
	integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
	crossorigin="anonymous"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Set height of the grid so .sidenav can be 100% (adjust if needed) */
.row.content {
	height: 1500px
}

/* Set gray background color and 100% height */
.sidenav {
	background-color: #f1f1f1;
	height: auto;
}

/* Set black background color, white text and some padding */
footer {
	background-color: #555;
	color: white;
	padding: 15px;
}

/* On small screens, set height to 'auto' for sidenav and grid */
@media screen and (max-width: 767px) {
	.sidenav {
		height: auto;
		padding: 15px;
	}
	.row.content {
		height: auto;
	}
}
</style>
</head>
<body>
	<form action="Carrito" method="post">
	<div class="container-fluid">
		<div class="row content">
			<div class="col-sm-5 sidenav">
				<h1>Climusic</h1>
				<!-- DropDown -->
				<div class="dropdown">
					<a class="btn btn-secondary dropdown-toggle" href="#" role="button"
						id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> Instrumentos </a>

					<div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
						<a class="dropdown-item" href="#">Guitarra</a> 
						<a class="dropdown-item" href="#">Bajo</a> 
						<a class="dropdown-item"href="#">Bateria</a>
					</div>
				</div>
				</br>
				<!-- Checkbox -->
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<div class="input-group-text">
							<input type="checkbox"
								aria-label="Checkbox for following text input">
						</div>
					</div>
					<h4>Usa tarjeta</h4>
				</div>
				


			</div>
			<!--Vert Layout derecha -->
			<div class="col-sm-5">
					<table border="1">
						<tr>
							<th>Submission ID</th>
							<th>Form ID</th>
							<th>IP</th>
							<th>Name</th>
							<th>E-mail</th>
							<th>Message</th>
						</tr>
						<tr>
							<td>123456789</td>
							<td>12345</td>
							<td>123.555.789</td>
							<td>John Johnny</td>
							<td>johnny@example.com</td>
							<td>This is the message John sent you</td>
						</tr>
					</table>
					<!-- <div class="input-group">
        <input type="text" class="form-control" placeholder="Search Blog..">
        <span class="input-group-btn">
          <button class="btn btn-default" type="button">
            <span class="glyphicon glyphicon-search"></span>
          </button>
        </span>
      </div> -->
			</div>
		</div>
	</div>

	<footer class="container-fluid"> <input
		class="btn btn-primary" type="submit" value="Submit"> </footer>
</form>
</body>
</html>