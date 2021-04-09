<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Benvenuto! </h1>
<h2>Esegui login con pin  </h2>


<form action="doLogin.jsp" method="post">
<label>Pin</label>
<input type="password" name="pin"/>
<br/>
<input type="submit" name="pulsanteInvia" value="Accedi"/>

<a href="login.jsp">Login email e password</a>

</form>


</body>
</html>