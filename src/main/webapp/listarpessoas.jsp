<%-- 
    Document   : listarpessoas
    Created on : 2 de out. de 2020, 22:05:27
    Author     : ismael
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de pessoas</title>
    </head>
    <body>
        <h1>Lista de pessoas</h1>
        
        <ul>
            <c:forEach items="${pessoas}" var="pessoa">
                <li>${pessoa.nome} ${pessoa.sobrenome}</li>
            </c:forEach>
        </ul>
        
    </body>
</html>
