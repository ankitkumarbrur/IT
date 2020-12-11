<%-- 
    Document   : Calculate_
    Created on : 18 Oct, 2019, 10:39:33 AM
    Author     : c3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <h1>getParameter()</h1>
        <form action="Calculate_1.jsp">
            <input type="text" name="op1"/> Operand 1<br/>
            <input type="text" name="op2"/> Operand 2<br/>
            <input type="radio" value="add" name="op"/> ADD<br/>
            <input type="radio" value="mul" name="op"/> MUL<br/>
            <input type="radio" value="sub" name="op"/> SUB<br/>
            <input type="submit" value="submit"/>
        </form>
        <h1>Expression Language</h1>
        <form action="Calculate_2.jsp">
            <input type="text" name="op1"/> Operand 1<br/>
            <input type="text" name="op2"/> Operand 2<br/>
            <input type="radio" value="add" name="op"/> ADD<br/>
            <input type="radio" value="mul" name="op"/> MUL<br/>
            <input type="radio" value="sub" name="op"/> SUB<br/>
            <input type="submit" value="submit"/>
        </form>
    </body>
</html>
