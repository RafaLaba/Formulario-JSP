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
	
<!-- 		<p><b>Endereço:</b></b><br><br> -->
<!-- 			Cidade: <input type="text" name="cidade" placeholder="Cidade"><br><br> -->
<!-- 			UF: 	<select name="UF"> -->
<!-- 				  <option value="PR">Paraná</option>  -->
<!-- 				  <option value="SC" selected>Santa Catarina</option> -->
<!-- 				  <option value="RS">Rio Grande do Sul</option> -->
<!-- 				</select> -->
<!-- 			<br><br> -->
<!-- 			Bairro: <input type="text" name="bairro" placeholder="Bairro"><br><br> -->
<!-- 			Rua: <input type="text" name="rua" placeholder="Rua"><br><br> -->
<!-- 			Número: <input type="number" min="0" max="9999" name="numcasa" placeholder="000"><br><br> -->
<!-- 		</p><br> -->
		
<!-- 		<p> -->
<!-- 			<b>CEP:</b> <input type="text" name="cep" placeholder="00000-000"><br> -->
<!-- 		</p><br> -->
	
		<input type="Submit" value="Enviar">
		<input type="Reset" value="Apagar">
	
	</form>

</body>
</html>