<%-- 
    Document   : Pattern2
    Created on : 17 Oct, 2019, 4:07:52 PM
    Author     : c3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pattern</title>
    </head>
    <body>
        <c:forEach var = "i" begin = "1" end = "${param.n}">
            <c:forEach var = "j" begin = "1" end = "${i}">
                <c:out value = "${j}"/>&nbsp;
            </c:forEach>
        <br/>
        </c:forEach>
    </body>
</html>
