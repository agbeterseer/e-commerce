<%-- 
    Document   : uploadpics
    Created on : Apr 21, 2016, 10:41:52 AM
    Author     : JPT TERSOO AGBE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>upload picture</title>
    </head>
    <body>
        <%
            String code = session.getAttribute("code").toString();
            %>
      <h3 align="center">  Upload Passport </h3>
    <form action="uploadPicture?code=<%=code%>" method="post" enctype="multipart/form-data">
    <table width="49%" height="69" border="0" align="center">
  <tr>
    <td height="33" colspan="3">Upload Product Image</td>
    </tr>
  <tr>
    <td width="35%" height="28">Upload Picture</td>
    <td width="49%" align="center"><input type="file" name="file" /></td>
    <td width="16%"><input type="submit" value="upload" /></td>
    </tr>
</table>
 </form> 
    </body>
</html>
