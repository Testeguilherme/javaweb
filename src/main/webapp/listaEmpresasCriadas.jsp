<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>

<%@ page import="java.util.List,br.com.alura.gerenciador.modelo.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista</title>
</head>
<body>

		<c:if test="${not empty empresa}">
				Empresa  ${empresa} cadastrada com sucesso!
		</c:if>
		<br><br>
		Lista de Empresas:
		<br>
		
		<ul>
			<c:forEach items="${listaEmpresas}" var="empresa">
				<li> 
					${empresa.nome} -
					<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
					<a href="/gerenciador/entrada?acao=MostraEmpresas&id=${empresa.id}">Editar </a>
					<a href="/gerenciador/entrada?acao=RemoveEmpresas&id=${empresa.id}"> Remover</a>
				</li>
				
			</c:forEach>
		</ul>
		
		<a href="/gerenciador/formEmpresa.jsp">Formulário</a>
</body>
</html>