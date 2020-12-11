<%-- 
    Document   : cprod
    Created on : 24 Oct, 2019, 2:56:41 PM
    Author     : c3
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Choose Product</title>
    </head>
    <body>
        Hello <% String un=request.getParameter("uname"); pageContext.setAttribute("un", un); %>
        ${un}
        <br/>
        <h1> Choose Product </h1>
        <form action="Shopping_prod.jsp">
            <input type="text" name="prod" required/> Enter Product <br/>
            <input type="submit" value="Submit"/>
        </form>
        <c:set var="uname" value="${un}" scope="session"/>     
    </body>
</html>
