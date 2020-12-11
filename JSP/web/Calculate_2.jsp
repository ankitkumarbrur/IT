<%-- 
    Document   : Calculate2
    Created on : 18 Oct, 2019, 10:26:21 AM
    Author     : c3
--%>

<!-- RUN CALCULATE_MAIN.JSP -->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculation 2</title>
    </head>
    <body>
        RESULT IS&nbsp;&nbsp;
        
        <c:if test="${param.op.equals(\"add\")  }">
                ${param.op1+param.op2}
        </c:if>
        
         <c:if test="${param.op==\"mul\"}">
                ${param.op1*param.op2}
        </c:if>
        <c:if test="${param.op==\"sub\"}">
                ${param.op1-param.op2}
        </c:if>
         
    </body>
</html>