<%-- 
    Document   : prod
    Created on : 24 Oct, 2019, 3:03:14 PM
    Author     : c3
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Info</title>
    </head>
    <body>
        <c:set var="pr" value="${param.prod}" scope="session"/>
        Hello ${sessionScope.uname} , you have ordered ${sessionScope.pr} .
        
    </body>
</html>
