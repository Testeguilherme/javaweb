<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="/gerenciador/novaEmpresa" method="post">
		
		Nome: <input type="text" name="nome"/>
		Data abertura: <input type="text" name="data" />
		
		
		<input type="submit"/>
	
	</form>

</body>
</html>