<%-- 
    Document   : modifyPrintTurnaround
    Created on : Dec 5, 2015, 9:03:24 AM
    Author     : JPT TERSOO AGBE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@include  file="lookup.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>modify Print Turnaround</title>
    </head>
    <body>
        <%
   try{
        String code  = request.getParameter("code");
        if(request.getParameter("button") !=null){
        String productsid = request.getParameter("productsid");
        String printturnaround = request.getParameter("printturnaround");
        String status = request.getParameter("status");
        String description = request.getParameter("description");
        String startingprice = request.getParameter("startingprice");


           inl.modifyPrintturarround(code, printturnaround,startingprice,productsid);
            response.sendRedirect("viewPrintTurnarounds.jsp");
         

}
      Printturnarroundbean ptah = inl.viewSinglePrintTunaround(code);

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
        <option value="<%=ptah.getProductid()%>"><%=ptah.getProductid()%></option>
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
    <td width="19%">Print Turnaround</td>
    <td width="46%">
      <input type="text" name="printturnaround" id="printturnaround" value="<%=ptah.getPrintType()%>">
    </td>
    <td width="12%">&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Status</td>
    <td><label>
      <select name="status" id="status">
          <option value="<%=ptah.getStatus()%>"><%=ptah.getStatus()%></option>
          <option  value="<%=Utill.CONFIG.getSET_STATUS()%>"><%=Utill.CONFIG.getSET_STATUS()%></option>
           <option  value="<%=Utill.CONFIG.getUNSET_STATUS()%>"><%=Utill.CONFIG.getUNSET_STATUS()%></option>
      </select>
    </label></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Starting Price</td>
    <td><input type="text" name="startingprice" id="startingprice" value="<%=ptah.getPrice()%>"> </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Description</td>
    <td><label>
      <textarea name="description" id="description" cols="45" rows="5"><%=ptah.getDel()%></textarea>
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
