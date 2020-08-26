<%-- 
    Document   : modifyPaperType
    Created on : Dec 1, 2015, 2:42:26 PM
    Author     : JPT TERSOO AGBE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@include  file="lookup.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>modify Paper Type</title>
    </head>
    <body>
   <%
   try{
        String code  = request.getParameter("code");
        if(request.getParameter("button") !=null){
        String productsid = request.getParameter("productsid");
        String papertype = request.getParameter("papertype");
        String status = request.getParameter("status");
        String description = request.getParameter("description");
        String startingprice = request.getParameter("startingprice");

    
           inl.modifyPaperType(code, papertype, description, productsid);
           //String paperTypeId, String paperName, String description, String productName
response.sendRedirect("viewpapertypes.jsp");
            //PaperTypeHelper(String paperTypeId, String paperName, String description, String status, String del, String productName, String price) {

                style = msg;

}
      Papertypebean pthh = inl.viewSinglePaperType(code);
       
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
        <option value="<%=pthh.getProductName()%>"><%=pthh.getProductName()%></option>
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
    <td width="19%">Paper Type</td>
    <td width="46%">
      <input type="text" name="papertype" id="papertype" value="<%=pthh.getPaperName()%>">
    </td>
    <td width="12%">&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Status</td>
    <td><label>
      <select name="status" id="status">
          <option value="<%=pthh.getStatus()%>"><%=pthh.getStatus()%></option>
          <option  value="<%=Utill.CONFIG.getSET_STATUS()%>"><%=Utill.CONFIG.getSET_STATUS()%></option>
           <option  value="<%=Utill.CONFIG.getUNSET_STATUS()%>"><%=Utill.CONFIG.getUNSET_STATUS()%></option>
      </select>
    </label></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Starting Price</td>
    <td><input type="text" name="startingprice" id="startingprice" value="<%=pthh.getPrice()%>"> </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>Description</td>
    <td><label>
      <textarea name="description" id="description" cols="45" rows="5"><%=pthh.getDescription()%></textarea>
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
