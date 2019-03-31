<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario</title>
</head>
<body>
<h3>Formulario</h3>
<form action="#" method="Post">
	<p>Nome
		<input type="text" name="nome" placeholder="Nome">
		<input type="text" name="sobrenome" placeholder="Sobrenome">
	</p>

	<p>CPF
		<input type="number" name="cpf" placeholder="CPF">
	</p>

	<p>Endereço:
		Cidade: <input type="text" name="cidade" placeholder="Cidade"><br>
		UF: 	<select name="UF">
			  <option value="PR">Paraná</option> 
			  <option value="SC" selected>Santa Catarina</option>
			  <option value="RS">Rio Grande do Sul</option>
			</select>
		<br>
		Bairro: <input type="text" name="bairro" placeholder="Bairro"><br>
		Rua: <input type="text" name="rua" placeholder="Rua"><br>
		Número: <input type="number" min="0" max="9999" name="numcasa" placeholder="Número da Residencia"><br>
	</p>
	
	<p>
		CEP: <input type="text" name="cep" placeholder="0"><br>
	</p>

	<input type="Submit" value="Enviar">
	<input type="Reset" value="Apagar">

</form>
    
    
</body>
</html>
