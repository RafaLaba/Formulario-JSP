<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formulario Cadastro</title>
</head>
<body>
<h2>Cadastro:</h2>

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