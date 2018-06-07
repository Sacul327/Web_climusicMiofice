<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="com.Climusic.Daos.ProductoDao"%>
<%@ page import="com.Climusic.Productos.Productos" %>
<%@ page import="java.util.List"%>
<%@ page import="org.springframework.jdbc.CannotGetJdbcConnectionException" %>
<%@ page import="org.springframework.dao.DataAccessException" %>
<%@ page import="org.apache.catalina.core.ApplicationContextFacade" %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Ventas</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="css/bootstrap.min.css">

<script
	src="js/bootstrap.min.js"
	></script>
<script
	src="js/jquery.min.js"></script>
<script
	src="js/bootstrap.min.js"></script>
<link href="css/pantalladVentas.css" rel="stylesheet">
</head>
<body>
	<!-- NAVBAR -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark"> <a
		class="navbar-brand" href=""><h2>Climusic</h2></a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarColor01" aria-controls="navbarColor01"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarColor01">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item disabled"><a class="nav-link" href="" >ventas</a></li>
			<li class="nav-item"><a class="nav-link" href="usuarios.jsp" >Administrar Usuarios</a></li>
		</ul>
	</div>
	</nav>
	<form action="Carrito" method="post">
	<div class="container-fluid">
		<div class="row content">
			<div class="col-sm-5 sidenav">
				<!-- <h1>Climusic</h1> -->
				<!-- DropDown -->
				<div class="dropdown">
					<a id="dpinstrumentos" class="btn btn-secondary dropdown-toggle" href="#" role="button"
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
			<!-- Lista Carrito -->
				<div id="cart" class="list-group">
 					 <button type="button" class="list-group-item list-group-item-action active">Compras listas para facturar</button>
					 <button type="button" class="list-group-item list-group-item-action" disabled>fender</button>
					 <button type="button" class="list-group-item list-group-item-action" disabled>base guitarra</button>
					 <button type="button" class="list-group-item list-group-item-action" disabled>correa</button>
					 <button type="button" class="list-group-item list-group-item-action" disabled>puas</button>
				</div>
			<!-- Drop from cart -->
				<div id="addcart" class="input-group mb-3">
  						<div class="input-group-prepend">
    					<button class="btn btn-outline-secondary" type="button">drop from cart</button>
  						</div>
  						<input type="text" class="form-control" aria-label="" aria-describedby="basic-addon1" placeholder="N° de producto">
				</div>
				


			</div>
			<!--Vert Layout derecha -->
			<div class="col-sm-5">
				<Form class="form-horizontal" id="">
					<table class="table table-striped " id="tabla">
						<thead>
							<tr>
								<th>Id</th>
								<th>Nombre</th>
								<th>Apellido</th>
								<th>Documento</th>
							</tr>
						</thead>
						<tbody>
							<%
							  ApplicationContext app = new ClassPathXmlApplicationContext("Spring.xml");
							  ProductoDao productodao = (ProductoDao) app.getBean("ProductoDao");
								
									try {
										List<Productos> pro = productodao.buscarTodos();
										for (Productos pro2 : pro) {
							%>
							<tr>
								<td><%=pro2.getMarca()%></td>
								<td><%=pro2.getModelo()%></td>
								<td><%=pro2.getPrecio()%></td>
								<td><%=pro2.getStock()%></td>
								<td><%=pro2.getColor()%></td>
								<td><%=pro2.getTipo()%></td>
								<td><%=pro2.getTipo_detalle()%></td>
							</tr>
							<%
								}
									} catch (CannotGetJdbcConnectionException ex) {
										ex.printStackTrace();
									} catch (DataAccessException e) {
										e.printStackTrace();
									}
								
								((ClassPathXmlApplicationContext) app).close();
							%>

						</tbody>
					</table>
				</form>
			<!-- navegador para la lista -->
			
					<!-- Lista de productos Stockdentro del nav -->
					
							<!-- Agregar al carro codigo -->
							<div id="addcart" class="input-group mb-3">
								<div class="input-group-prepend">
									<button class="btn btn-outline-secondary" type="button">Add
										to cart</button>
								</div>
								<input type="text" class="form-control"
									placeholder="N° de producto" aria-label=""
									aria-describedby="basic-addon1">
							</div>
							<!-- Descripcion de los productos -->
							<div class="card" style="width: 18rem;">
								<div class="card-body">
									<h5 class="card-title">Descripcion del producto :</h5>
									<h6 class="card-subtitle mb-2 text-muted">Card subtitle</h6>
									<p class="card-text">Some quick example text to build on
										the card title and make up the bulk of the card's content.</p>
									<a href="#" class="card-link">Card link</a> <a href="#"
										class="card-link">Another link</a>
								</div>
							</div>
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