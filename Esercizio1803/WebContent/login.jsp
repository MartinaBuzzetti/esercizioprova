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
<h2>Esegui login </h2>


<form action="doLogin.jsp" method="post">
<label>Email</label>
<input type="text" name="email"/>
<br/>
<label>Password</label>
<input type="password" name="password"/>
<br/>
<input type="submit" name="pulsanteInvia" value="Accedi"/>

<a href="login_by_pin.jsp">Login con pin</a>
</form>

</body>
</html>