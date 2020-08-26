<%-- 
    Document   : successemail
    Created on : Jun 16, 2016, 8:50:06 AM
    Author     : JPT TERSOO AGBE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=session.getAttribute("Message").toString()%></h1>
    </body>
</html>
