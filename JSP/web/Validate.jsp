<%-- 
    Document   : Validate
    Created on : 18 Oct, 2019, 11:39:51 AM
    Author     : c3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validation</title>
    </head>
    <body>
        You entered:<br>     
        Name: <c:out value="${param.userName}" /><br>     
        Birth Date: <c:out value="${param.birthDate}" /><br>     
        Email Address: <c:out value="${param.emailAddr}" /><br>     
        Gender: <c:out value="${param.gender}" /><br>    
        Lucky Number: <c:out value="${param.luckyNumber}" /><br>     
        Favorite Food: <c:forEach items="${paramValues.food}" var="current">
        <c:out value="${current}" />&nbsp;</c:forEach>
    </body>
</html>
