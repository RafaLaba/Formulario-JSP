<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro Clientes</title>
</head>
<body align="center">
	
	
	<h2>Cadastro clientes:</h2>

	<form name="form1" method="Post" action="adicionarCadastro">
		<p><b>Nome</b>
			<input type="text" name="nome" placeholder="Nome Completo">
		</p><br>
	
		<p><b>CPF</b>
			<input type="text" name="cpf" placeholder="000.000.000-00">
		</p><br>
	
 		<p><b>CEP:</b>
 			<input type="text" name="cep" placeholder="00000-000"><br> 
 		</p><br>
	
		<input type="Submit" value="Enviar">
		<input type="Reset" value="Apagar">
	
	</form>

</body>
</html>