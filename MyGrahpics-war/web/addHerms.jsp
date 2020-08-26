<%-- 
    Document   : addHerms
    Created on : Dec 2, 2015, 6:50:30 PM
    Author     : JPT TERSOO AGBE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@include  file="lookup.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>add Herms</title>
    </head>
    <body>
        <%
        if(request.getParameter("button") !=null){
        String productsid = request.getParameter("productsid");
        String herms = request.getParameter("herms");
        String status = request.getParameter("status");
        String description = request.getParameter("description");
        String startingprice = request.getParameter("startingprice");

        try{
           msg = inl.addHerms("", herms, productsid, startingprice, description, status,"","","","");
           //code, herms, productsid, startingprice, description, status,"","","",""

           response.sendRedirect("viewHerms.jsp");
       // String sequentialtnubmer, String productcode, String price, String description, String status
        }catch(Exception ex){
        System.out.println(ex.getMessage());
        }
}
        %>
        <form action="" method="post"><table width="60%" border="0">
  <tr>
  <td>&nbsp;</td>
    <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td><a href="viewHerms.jsp">Previous</a></td>
  </tr>
  <tr>
    <td colspan="4" style="<%=style%>"><%=msg%></td>
    </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Product ID</td>
    <td><span class="form-body">
      <select name="productsid" id="productsid" >
        <option value=" ">----Select one------</option>
        <%  try{ Iterator i = inl.viewAllSubCategoris().iterator();
                                                        while(i.hasNext()){
                                                 Subcategorybean hsc = (Subcategorybean) i.next();
         %>
        <option value="<%=hsc.getCode()%>"<%=request.getParameter("productsid") != null && request.getParameter("productsid").equalsIgnoreCase(hsc.getCode()) ? new String("selected") : new String("")%>><%=hsc.getSubcategory()%></option>
        <%                                            }

                                                      }catch(Exception ex){
                                                System.out.println(ex.getMessage());
                                                      }
        %>
      </select>
    </span></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td width="23%">&nbsp;</td>
    <td width="19%">Herms</td>
    <td width="46%">
      <input type="text" name="herms" id="herms" value="">    </td>
    <td width="12%">&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Status</td>
    <td><label>
        <select name="status" id="status">
         <option value="">.....select on .....</option>
          <option  value="<%=Utill.CONFIG.getSET_STATUS()%>"><%=Utill.CONFIG.getSET_STATUS()%></option>
           <option  value="<%=Utill.CONFIG.getUNSET_STATUS()%>"><%=Utill.CONFIG.getUNSET_STATUS()%></option>
      </select>
    </label></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Starting Price</td>
    <td><input type="text" name="startingprice" id="startingprice" value=""></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Description</td>
    <td><textarea name="description" id="description" cols="45" rows="5"></textarea></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td><label>
      <input type="submit" name="button" id="button" value="Submit">
    </label></td>
    <td>&nbsp;</td>
  </tr>
</table>
</form>
    </body>
</html>
