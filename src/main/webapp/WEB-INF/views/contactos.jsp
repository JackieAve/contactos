<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body onload="loadlist();">
	<div class="container">
		<nav class="navbar navbar-default" role="navigation">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Contacto EMpresarial</a>
		</div>
		</nav>
	</div>

	<div class="container">
		<div class="table-responsive">
			<table class="table table-hover" id="table">
				<thead>
					<tr>
						<th>Nombre Completo</th>
						<th>Celular</th>
						<th>Dirección</th>
						<th>Departamento</th>
						<th>Extencion</th>
						<th>Tipo Usuario</th>
						<th>Editar</th>
						<th>Borrar</th>
					</tr>
				</thead>
			</table>
			
			
			<table class="table table-hover" id="table2">
				<thead>
					<tr>
						<th>id</th>
						<th>Rol</th>
					
					</tr>
				</thead>
			</table>
		</div>
	</div>

	<div class="container" style="margin-top: 5%">
		<div class="row">
			<div class="col-md-4">
				<div class="form-group">
					<label class="control-label col-sm-2" for="name"> <input
						type="hidden" id="user_id" /> Nombre:
					</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="name"
							placeholder="Ingresa tu(s) nombre(s)" name="name">
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="form-group">
					<label class="control-label col-sm-2" for="lastname1">
						Apellido Paterno: </label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="lastname1"
							placeholder="Ingresa Apellido Paterno" name="lastname1">
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="form-group">
					<label class="control-label col-sm-2" for="lastname2">
						Apellido Materno: </label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="lastname2"
							placeholder="Ingresa Apellido Materno" name="lastname2">
					</div>
				</div>
			</div>
		</div>


		<div class="row">
			<div class="col-md-6">
				<div class="form-group">
					<label class="control-label col-sm-2" for="pwd">Celular:</label>
					<div class="col-sm-10">
						<input type="number" class="form-control" id="celular"
							placeholder="Ingresa numero telefonico" name="celular">
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<label class="control-label col-sm-2" for="pwd">Direccion:</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="direccion"
							placeholder="Ingresa tu direccion" name="direccion">
					</div>
				</div>
			</div>
		</div>

		<div class="row" style="margin-top:1%">
			<div class="col-md-6">
				<div class="form-group">
					<label class="control-label col-sm-2" for="pwd">Tipo
						Usuario:</label>
					<div class="col-sm-10">
						<select class="form-control form-control-lg" id="typeUser" name="typeUser">
							<option>Seleccionar una opcion</option>
						</select> 
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<label class="control-label col-sm-2" for="pwd">Departamento:</label>
					<div class="col-sm-10">
						<select class="form-control form-control-lg" id="depart" name="depart">
							<option>Seleccionar una opcion</option>
						</select> 
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-md-12">
				<button onclick="submit();">Submit</button>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		data = "";

		submit = function() {

			$.ajax({
				url : 'saveOrUpdate2',
				type : 'POST',
				data : {
					user_id : $("#user_id").val(),
					nombre : $('#nombre').val(),
					movil : $('#movil').val(),
					email : $('#email').val(),
					direccion : $('#direccion').val()
				},
				success : function(response) {
					alert(response.message);
					load();
				}
			});
		}

		delete_ = function(id) {
			$.ajax({
				url : 'delete2',
				type : 'POST',
				data : {
					user_id : id
				},
				success : function(response) {
					alert(response.message);
					load();
				}
			});
		}

		edit = function(index) {
			$("#user_id").val(data[index].user_id);
			$("#nombre").val(data[index].nombre);
			$("#movil").val(data[index].movil);
			$("#email").val(data[index].email);
			$("#direccion").val(data[index].direccion);
		}

		load = function() {
			$
					.ajax({
						url : 'list2',
						type : 'POST',
						success : function(response) {
							data = response.data;
							$('.tr').remove();
							for (i = 0; i < response.data.length; i++) {
								$("#table")
										.append(
												"<tbody> <tr>"
														+ response.data[i].nombre
														+ " </td> <td> "
														+ response.data[i].movil
														+ " </td> <td> "
														+ response.data[i].email
														+ " </td> <td> "
														+ response.data[i].direccion
														+ " </td> <td> <a href='#' onclick= edit("
														+ i
														+ ");> <span class='glyphicon glyphicon-edit'></span></a></td>"
														+ "<td> <a href='#' onclick='delete_("
														+ response.data[i].user_id
														+ ");'> <span class='glyphicon glyphicon-remove-circle'></span></a></td>"
														+ "</tr>" + "</tbody>");
							}
						}
					});

		}

		loadlist = function() {
			$
					.ajax({
						url : 'list2',
						type : 'POST',
						success : function(response) {
							data = response.data;
							$('.tr').remove();
							for (i = 0; i < response.data.length; i++) {
								$("#table2")
										.append(
												"<tbody> <tr>"
														+ response.data[i].rolId
														+ " </td> <td> "
														+ response.data[i].nbRol
														+ " </td> "
														 + "</tbody>");
							}
						}
					});
		}
		
	</script>


</body>
</html>