<%-- 
    Document   : viewGrommet
    Created on : Dec 2, 2015, 7:38:00 PM
    Author     : JPT TERSOO AGBE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@include  file="lookup.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>view Grommet</title>
    </head>
    <body>
         <%
  //      if(request.getParameter("button") !=null){
      String code =request.getParameter("code");
         try{
           Grommetbean hg = inl.viewSingleGrommet(code);
           //addThreeHoleDrilling(new HelpthreeholeDrilling(threeholedriling,productsid,startingprice,description,status));
            //String id, String thdrilling, String productcode, String price, String descriptiion, String status
             //   style = msg;

      %>
        <form action="" method="get"><table width="100%" border="0">
    <tr>
        <td><a href="">Pervious</a></td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td><a href="modifyGrommet.jsp">Modify</a></td>
    </tr>
    <tr>
    <td>&nbsp;</td>
    <td>Product ID</td>
    <td><span class="form-body">
      <select name="productsid" id="productsid" disabled >
        <option value=" "><%=hg.getProductcode()%></option>
      </select>
    </span></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td width="34%">&nbsp;</td>
    <td width="18%">Grommet</td>
    <td width="27%"><label>
      <input type="text" name="perforation" id="perforation" value="<%=hg.getGrommetname()%>" readonly>
    </label></td>
    <td width="21%">&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Status</td>
    <td>
       <%=hg.getStatus()%>     </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Starting Price</td>
    <td><input type="text" name="startingprice" id="startingprice" value="<%=hg.getPrice()%>" readonly></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Description</td>
    <td><label>
      <textarea name="description" id="description" cols="45" rows="5" disabled><%=hg.getDesceiption()%></textarea>
    </label></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>

</table>
</form>
<%
        }catch(Exception ex){
        System.out.println(ex.getMessage());
        }
%>
    </body>
</html>
