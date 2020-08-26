<%-- 
    Document   : productsErrorpage
    Created on : Nov 25, 2015, 4:19:27 PM
    Author     : JPT TERSOO AGBE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error page</title>
    </head>
    <body>
        <%
try{

     String sss = session.getAttribute("Record").toString();
      if(sss !=null){


      %>
          

                <table width="496" height="154" border="0" align="center" class="container" style="border: solid 1px #CCCCCC;">
         <tr>
            <td colspan="2"><strong><%=sss%></strong></td>
          </tr>

          <tr>
            <td height="15" colspan="2"> <a href="<%=session.getAttribute("p").toString()%>">&lt;&lt;<strong>[previous page]</strong></a></td>
          </tr>
        </table>

            <%}
      }catch(Exception ex){
      System.out.println(ex.getMessage());
      }%>
    </body>
</html>
