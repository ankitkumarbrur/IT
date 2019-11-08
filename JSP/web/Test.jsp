<%-- 
    Document   : Test
    Created on : 18 Oct, 2019, 3:36:27 PM
    Author     : c3
--%>

<%@page import="org.apache.tomcat.util.http.fileupload.RequestContext"%>
<%@page import="org.apache.catalina.core.ApplicationContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test</title>
    </head>
    <body>
        <%
            int i=10;
            pageContext.setAttribute("p", i);
            session.setAttribute("s", "session");
            Cookie ck=new Cookie("name","Ankit");
            session.setAttribute("user","Kumar");  
            response.addCookie(ck);
            application.setAttribute("p", "ankit");
            request.setAttribute("p", "Brur");
        %>
        ${p}    <br/>
        ${pageScope.p}
        ${sessionScope.user}
        ${s}
        ${applicationScope.name}
        ${requestScope.p}
    </body>
</html>
