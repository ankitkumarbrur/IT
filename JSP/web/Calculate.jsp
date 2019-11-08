<%-- 
    Document   : Calculate
    Created on : 18 Oct, 2019, 10:05:23 AM
    Author     : c3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculation</title>
    </head>
    <body>
        <% String op=request.getParameter("op");
            int result=0;
            int op1=Integer.parseInt(request.getParameter("op1"));
            int op2=Integer.parseInt(request.getParameter("op2"));
            if(op.equals("add"))
            {
                result=op1+op2;
            }
            else if(op.equals("mul"))
            {
                result=op1*op2;
            }
            else if(op.equals("sub"))
            {
                result=op1-op2;
            }
         %>
         RESULT IS&nbsp;&nbsp;<%=result%>
    </body>
</html>
