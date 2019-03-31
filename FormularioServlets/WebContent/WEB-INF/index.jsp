<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Formulario</title>
</head>
<body>
<h2>Cadastro</h2>

<form name="form2" method="post" action="/servlet1/processaRetangulo">
		<table>
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="nome" /></td>
			</tr>

			<tr>
				<td>Data de Nascimento:</td>
				<td><input type="date" name="datanasc"/></td>
			</tr>
			<tr>
				<td>email:</td>
				<td><input type="text" name="email"/></td>
			</tr>
			<tr>
				<td>Endereco:</td>
				<td><input type="text" name="endereco"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="reset" value="Limpar" /></td>
				<td><input type="submit" value="Enviar" /></td>
			</tr>

		</table>

	</form>

</body>
</html>
    
</body>
</html>
