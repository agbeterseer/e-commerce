<%-- 
    Document   : modifyInteriorcolor
    Created on : Dec 2, 2015, 6:17:03 PM
    Author     : JPT TERSOO AGBE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@include  file="lookup.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>modify Interior color</title>
    </head>
    <body>
      <%
   try{
        String code  = request.getParameter("code");
        if(request.getParameter("button") !=null){
        String productsid = request.getParameter("productsid");
        String interiorpaper = request.getParameter("interiorpaper");
        String status = request.getParameter("status");
        String description = request.getParameter("description");
        String startingprice = request.getParameter("startingprice");


           inl.modifyInteriorColor(code, interiorpaper, productsid, startingprice, description);
            response.sendRedirect("viewIteriorColors.jsp");
            //String id, String interiorcolorname, String productcode, String price, String description
            //PaperTypeHelper(String paperTypeId, String paperName, String description, String status, String del, String productName, String price) {

                style = msg;

}
      Interiorcolorbean hc = inl.viewSingleInteriorColor(code);

        %>
        <form action="" method="post"><table width="60%" border="0">
  <tr>
    <td colspan="4" style="<%=style%>"><%=msg%></td>
    </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Product ID</td>
    <td><span class="form-body">
      <select name="productsid" id="productsid" >
        <option value="<%=hc.getProductcode()%>"><%=hc.getProductcode()%></option>
        <%  try{ Iterator i = inl.viewAllInitialProducts().iterator();
                                                        while(i.hasNext()){
                                                 Initializeprodutsbean hlp = (Initializeprodutsbean) i.next();
           %>
        <option value="<%=hlp.getProductName()%>"<%=request.getParameter("productsid") != null && request.getParameter("productsid").equalsIgnoreCase(hlp.getProductName()) ? new String("selected") : new String("")%>><%=hlp.getProductName()+ " - " + hlp.getProductDefaultPrice()%></option>
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
    <td width="19%">Interior Color</td>
    <td width="46%">
      <input type="text" name="interiorpaper" id="interiorpaper" value="<%=hc.getInteriorcolorname()%>">
    </td>
    <td width="12%">&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Status</td>
    <td><label>
      <select name="status" id="status">
          <option value="<%=hc.getStatus()%>"><%=hc.getStatus()%></option>
          <option  value="<%=Utill.CONFIG.getSET_STATUS()%>"><%=Utill.CONFIG.getSET_STATUS()%></option>
           <option  value="<%=Utill.CONFIG.getUNSET_STATUS()%>"><%=Utill.CONFIG.getUNSET_STATUS()%></option>
      </select>
    </label></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Starting Price</td>
    <td><input type="text" name="startingprice" id="startingprice" value="<%=hc.getPrice()%>"> </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Description</td>
    <td><label>
      <textarea name="description" id="description" cols="45" rows="5"><%=hc.getDescription()%></textarea>
    </label></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td><label>
      <input type="submit" name="button" id="button" value="Modify">
    </label></td>
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
