<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	session="true" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mensagens</title>

<link rel="stylesheet" href="css/styleMensagem.css">

</head>
<body>

	<!-- <%//String usuario = session.getAttribute(arg0)%> s-->

	<h1>Mini Whats</h1>
	<form action="ServletMensagem" method="POST">
		Mensagem: <input type="text" size="50" name="msg"><br /> <br />
		<input type="submit" value="Enviar">&nbsp&nbsp&nbsp&nbsp&nbsp
		<input type="reset" value="Limpar">
	</form>
</body>
</html>