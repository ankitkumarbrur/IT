<%-- 
    Document   : Welcome
    Created on : 18 Oct, 2019, 12:00:20 PM
    Author     : c3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <form>
            <input type="text" name="uname">
            <input type="submit" value="submit">
        </form>
        <%@ page import="java.util.Date" %>  
        
            <% Date d= new Date();
                int hr=d.getHours();%>
            <% if(request.getParameter("uname")!=null && hr <12 ) {%>
                Good Morning ${param.uname}
            <% }else if( request.getParameter("uname")!=null && hr >=12){ %>
                Good Afternoon ${param.uname}
            <% }else if( request.getParameter("uname")!=null && hr >=17 ){ %>
                Good Evening ${param.uname}
            <% }else if( request.getParameter("uname")!=null && hr >=20){%> 
                Good Night ${param.uname}
            <% } %> 
   
    </body>
</html>
