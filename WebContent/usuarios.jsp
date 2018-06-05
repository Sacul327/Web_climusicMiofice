<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>AddUser</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link href="css/usuarioscss.css" rel="stylesheet">

</head>
<body>
<div class="container-fluid bg-3"> 
<nav class="navbar navbar-inverse">
 
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" disabled>Lista Usuarios</a>

    </div>
    <div class="collapse navbar-collapse" id="navbarColor01">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item"><a class="nav-link" href="pantalla_ventas_admin.jsp" >ventas</a></li>
			<li class="nav-item disabled"><a class="nav-link" href="usuarios.jsp" >Administrar Usuarios</a></li>
		</ul>
	</div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <span class="navbar-toggler-icon"></span>
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
					<Form class="form-horizontal">
  							
  							<input type="text" class="form-control" placeholder="N° de producto" aria-label="" aria-describedby="basic-addon1">
  							<div class="input-group-prepend">
    					<button id="botonquitar" class="btn btn-primary btn-block" type="button">Quitar usuario</button>
  							</div>
					</form>
  </div>
</div>
 <h3>Agregar usuario</h3>
<div class="container-fluid bg-3">
			<form class="form-horizontal" action="ServletUsuarios" method="post">
				
					<div class="form-row col-md-6">
						<label for="inputNombre">Nombre:</label> <input name="nombre" type="text"
							class="form-control" id="inputNombre" placeholder="nombre...">
					</div>
					<div class="form-row col-md-6">
						<label for="inputApellido">Apellido :</label> <input
							name="apellido" type="text" class="form-control" id="inputApellido"
							placeholder="Apellido...">
					</div>
				<div class="form-row col-md-6">
					<label for="inputDocumento">Documento :</label> <input type="text"
						name="documento" class="form-control" id="inputDocumento" placeholder="N° Documento...">
				</div>
				<div class="form-row col-md-6">
					<label for="inputEmail">Email :</label> <input type="email"
						name="email" class="form-control" id="inputEmail"
						placeholder="Email...">
				</div>
				<div class="form-row col-md-6">
					<label for="inputContrasenia">Contraseña :</label> <input type="password"
						name="contrasena" class="form-control" id="inputContrasenia" placeholder="Contraseña...">
				</div>
				<div class="form-row col-md-6">
					<label for="inputPrivilegio">Privilegio :</label> <input type="text"
						name="privilegio" class="form-control" id="inputPrivilegio"
						placeholder="Ingrese: admin O vendedor">
				</div>
				<button id="adduser" class="btn btn-lg btn-info " type="submit">Agregar usuario</button>
			</form>

		</div>
</div>


</body>
</html>