<%-- 
    Document   : index
    Created on : 17 Oct, 2019, 3:09:00 PM
    Author     : c3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <% int n= Integer.parseInt(request.getParameter("n"));
           for(int i=1;i<=n;i++){
               for(int j=1;j<=i;j++){
        %>
        <%=j%>
        <%}%>
        <br/>
        <%}%>
    </body>
</html>
