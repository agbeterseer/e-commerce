<%-- 
    Document   : modifyGrommet
    Created on : Dec 2, 2015, 7:26:52 PM
    Author     : JPT TERSOO AGBE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@include  file="lookup.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>modify Grommet</title>
    </head>
    <body>
        <%
   try{
        String code  = request.getParameter("code");
        if(request.getParameter("button") !=null){
        String productsid = request.getParameter("productsid");
        String herms = request.getParameter("herms");
        String status = request.getParameter("status");
        String description = request.getParameter("description");
        String startingprice = request.getParameter("startingprice");


           msg = inl.modifyGrommet(new HelpGrommet(code, herms, productsid, startingprice, description, status));
           response.sendRedirect("viewGrommets.jsp");
            //PaperTypeHelper(String paperTypeId, String paperName, String description, String status, String del, String productName, String price) {
            style = msg;

        }
       hg = inl.viewSingleGrommet(code);

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
        <option value="<%=hg.getProductcode()%>"><%=hg.getProductcode()%></option>
        <%  try{ Iterator i = inl.viewAllInitialProducts().iterator();
                                                        while(i.hasNext()){
                                                  hlp = (HelpInitializeProducts) i.next();
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
    <td width="19%">Grommet</td>
    <td width="46%">
      <input type="text" name="herms" id="herms" value="<%=hg.getGrommetname()%>">
    </td>
    <td width="12%">&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Status</td>
    <td><label>
      <select name="status" id="status">
          <option value="<%=hg.getStatus()%>"><%=hg.getStatus()%></option>
          <option  value="<%=Utill.CONFIG.getSET_STATUS()%>"><%=Utill.CONFIG.getSET_STATUS()%></option>
           <option  value="<%=Utill.CONFIG.getUNSET_STATUS()%>"><%=Utill.CONFIG.getUNSET_STATUS()%></option>
      </select>
    </label></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Starting Price</td>
    <td><input type="text" name="startingprice" id="startingprice" value="<%=hg.getPrice()%>"> </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Description</td>
    <td><label>
      <textarea name="description" id="description" cols="45" rows="5"><%=(request.getParameter("description") != null) ? request.getParameter("description") : hg.getDesceiption()%></textarea>
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
