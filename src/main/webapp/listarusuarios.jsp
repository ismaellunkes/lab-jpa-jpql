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
        <title>Lista de usuarios</title>
    </head>
    <body>
        <h1>Lista de usuarios</h1>
        
        <ul>                            
            <c:forEach items="${usuarios}" var="usuario">
                <li>${usuario.username} ${usuario.password}</li>
            </c:forEach>
        </ul>
        
    </body>
</html>
