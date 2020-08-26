<%-- 
    Document   : success
    Created on : Apr 19, 2011, 3:42:29 PM
    Author     : johnson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@include  file="lookup.jsp" %>
<%

String regno=session.getAttribute("str").toString();

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Success Page</title>
    <link rel="stylesheet" href="css/style.css" type="text/css" media="screen" />
    <!--[if IE 6]><link rel="stylesheet" href="css/style.ie6.css" type="text/css" media="screen" /><![endif]-->
    <!--[if IE 7]><link rel="stylesheet" href="css/style.ie7.css" type="text/css" media="screen" /><![endif]-->
</head>
    <body>
       <table width="496" height="154" border="0" align="center" class="container" style="border: solid 1px #CCCCCC;">
         <tr>
            <td colspan="2"><strong><%=regno%></strong></td>
          </tr>
         
          <tr>
            <td height="15" colspan="2"> <a href="<%=session.getAttribute("p").toString()%>">&lt;&lt;<strong>[previous page]</strong></a></td>
          </tr>
        </table>
    <h1>&nbsp;</h1>
</body>
</html>

