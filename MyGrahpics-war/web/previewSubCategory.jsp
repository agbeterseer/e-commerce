<%-- 
    Document   : previewSubCategory
    Created on : Nov 29, 2015, 7:18:36 AM
    Author     : JPT TERSOO AGBE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@include  file="lookup.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>preview</title>
    </head>
    <body>
      <%
        try{


            String fgg = session.getAttribute("str").toString();
            System.out.println("this is the real place:" + fgg);

            String gc = "Gift Certificate";
            String ag = "";
           Subcategorybean hsc = inl.viewSingleSubcategory(fgg);

              // System.out.println("this is the real place too:" + psh.getProductsName());
              // System.out.println("show me this one please:" + Utill.CONFIG.getGift_Certificate());
             String agg = inl.compareString(hsc.getProductId(), Utill.CONFIG.getBooklets());
              //ag = inl.compareString(psh.getProductsName(), Utill.CONFIG.getDoor_Hanger());
             System.out.println("na soooooo form sessionBean" + agg);


            if(agg.equalsIgnoreCase(Utill.CONFIG.getBooklets())){

                 session.setAttribute("ag", session.getAttribute("str").toString());


        %>
    <form class="form-horizontal" role="form" method="get" enctype="multipart/form-data" action=""  >
                            <div class="form-body">
                            <table width="80%" border="0">
  <tr>
    <td colspan="2"></td>
    </tr>
  <tr>
    <td width="40%"><div align="right"><a href="<%=session.getAttribute("p").toString()%>">&lt;&lt;<strong>[Add Products]</strong></a></div></td>
    <td width="60%"> <a href="seeAllData.jsp?code=<%=hsc.getProductId()%>">View All Data </a></td>
  </tr>
  <tr>
    <td colspan="2"><img src="getGiftCertPix.jsp" alt="No Image" name="" width="800" height="600"/> </td>

    </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Product Name</label>
      <div class="col-md-9"><input name="productid" type="text" value="<%=hsc.getProductId()%>" readonly></div>
    </div></td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Size</label>
      <div class="col-md-9">
        <input name="size2" type="text" class="form-control" id="size" value="<%=hsc.getSize()%>" readonly>
      </div>
    </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Sub Category</label>
      <div class="col-md-9">
        <input name="input" type="text" value="<%=hsc.getSubcategory()%>" readonly>
      </div>
    </div></td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Pages</label>
      <div class="col-md-9">
        <input name="pages" type="text" class="form-control" id="pages" value="<%=hsc.getPages()%>" readonly>
      </div>
    </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Quantity</label>
      <div class="col-md-9">
        <input name="quantity" type="text" class="form-control" id="quantity"  value="<%=hsc.getQuantity()%>" readonly>
      </div>
    </div></td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Binding</label>
      <div class="col-md-9">
        <input name="sequentialnumberiang" type="text" class="form-control" id="sequentialnumberiang" value="<%=hsc.getBinding()%>" readonly>
      </div>
    </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Cover Paper</label>
      <div class="col-md-9">
        <input name="printedside3" type="text" class="form-control" id="printedside3" value="<%=hsc.getCoverpaper()%>" readonly>
      </div>
    </div></td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Binding Placement</label>
      <div class="col-md-9">
        <input name="startingnumber2" type="text" class="form-control" id="startingnumber2" value="<%=hsc.getBindplacement()%>" readonly>
      </div>
    </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Print Turnaround</label>
      <div class="col-md-9">
        <input name="printturnaround" type="text" class="form-control" id="printturnaround" value="<%=hsc.getPrintturnaround()%>" readonly>
      </div>
    </div></td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Paper Type</label>
      <div class="col-md-9">
        <input name="papertype" type="text" class="form-control" id="papertype" value="<%=hsc.getPapertype()%>" readonly>
      </div>
    </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Status</label>
      <div class="col-md-9">
        <select class="form-control" name="status3"  disabled>
          <option value=""> <%=hsc.getStatus()%></option>
        </select>
      </div>
    </div></td>
    <td>&nbsp;</td>
  </tr>
</table>

<div class="form-actions">
									<div class="row">
										<div class="col-md-offset-3 col-md-9"></div>
	  </div>
								</div>

                            </div>
                            </form>
                            <%
                            }
                      if(ag.equalsIgnoreCase(Utill.CONFIG.getDoor_Hanger())){
                              %>


                                  <form class="form-horizontal" role="form" method="get"  >
                            <div class="form-body">
                            <table width="80%" border="0">
  <tr>
    <td colspan="2"></td>
    </tr>
  <tr>
    <td><div align="right"><a href="<%=session.getAttribute("p").toString()%>">&lt;&lt;<strong>[Add Products]</strong></a></div></td>
    <td><a href="seeAllSubData.jsp?code=<%=hsc.getProductId()%>">View All Data </a></td>
  </tr>
  <tr>
    <td colspan="2"><img src="getGiftCertPix.jsp" alt="No Image" name="" width="800" height="600"/> </td>
  </tr>

  <tr>
    <td width="40%"><div class="form-group">
      <label class="col-md-3 control-label">Product Name</label>
      <div class="col-md-9">
        <input name="productname" type="text" class="form-control" readonly value="<%=hsc.getSize()%>">
      </div>
    </div>       </td>
    <td width="60%"><div class="form-group">
      <label class="col-md-3 control-label">Perforation</label>
      <div class="col-md-9">
        <input name="perforation" type="text" class="form-control" id="perforation" value="<%=hsc.getSize()%>" readonly>
      </div>
    </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Size</label>
      <div class="col-md-9">
        <input name="size" type="text" class="form-control" id="size" placeholder="Enter size" value="<%=hsc.getSize()%>">
      </div>
    </div></td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Quantity</label>
      <div class="col-md-9">
        <input name="quantity2" type="text" class="form-control" id="quantity2" value="">
      </div>
    </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Printed Side</label>
      <div class="col-md-9">
        <input name="printedside2" type="text" class="form-control" id="printedside2" value="<%=hsc.getPrintedside()%>">
      </div>
    </div></td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Paper Type</label>
      <div class="col-md-9">
        <input name="papertype3" type="text" class="form-control" id="papertype3"  value="<%=hsc.getPapertype()%>">
      </div>
    </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Status</label>
      <div class="col-md-9">
        <select class="form-control" name="status2">
          <option value="Enable"><%=hsc.getStatus()%></option>

        </select>
      </div>
    </div></td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Print Turnaround</label>
      <div class="col-md-9">
        <input name="printturnaround2" type="text" class="form-control" id="printturnaround2" value="<%=hsc.getPrintturnaround()%>">
      </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
                          </div>
                            </form>
                            <%
                            }
                           %>

                            <%
 if(ag.equalsIgnoreCase(Utill.CONFIG.getSales_Sheet())){
                              %>


                                  <form class="form-horizontal" role="form" method="get"  >
                            <div class="form-body">
                            <table width="80%" border="0">
  <tr>
    <td colspan="2"></td>
    </tr>
  <tr>
    <td width="40%"><div class="form-group">
      <label class="col-md-3 control-label">Product Name</label>
      <div class="col-md-9">
        <select name="productname"  class="form-control">
          <option value=" ">----Select one------</option>
          <%  try{ Iterator i = inl.viewAllInitialProducts().iterator();
                                                        while(i.hasNext()){
                                                  hlp = (HelpInitializeProducts) i.next();
           %>
          <option value="<%=hlp.getProductName()%>"<%=request.getParameter("productname") != null && request.getParameter("productname").equalsIgnoreCase(hlp.getProductName()) ? new String("selected") : new String("")%>><%=hlp.getProductName()+ " - " + hlp.getProductDefaultPrice()%></option>
          <%                                            }

                                                        }catch(Exception ex){
                                                System.out.println(ex.getMessage());
                                                        }
        %>
        </select>
      </div>
    </div>       </td>
    <td width="60%">&nbsp;</td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Size</label>
      <div class="col-md-9">
        <input name="size" type="text" class="form-control" id="size" placeholder="Enter size">
      </div>
    </div></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Quantity</label>
      <div class="col-md-9">
        <input name="quantity" type="text" class="form-control" id="quantity" placeholder="Enter Quantity">
      </div>
    </div></td>
    <td><div class="form-group">
      <label for="exampleInputFile" class="col-md-3 control-label">File input</label>
           <div class="col-md-9">
        <input type="file" name="fileField" id="exampleInputFile">
        <p class="help-block"> size should be at least 600x 500. </p>
      </div>
    </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Printed Side</label>
      <div class="col-md-9">
        <input name="printedside" type="text" class="form-control" id="printedside" placeholder="Enter Printed side">
      </div>
    </div></td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Perforation</label>
      <div class="col-md-9">
        <input name="perforation" type="text" class="form-control" id="perforation" placeholder="Enter Perforation">
      </div>
    </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Print Turnaround</label>
      <div class="col-md-9">
        <input name="printturnaround" type="text" class="form-control" id="printturnaround" placeholder="Enter Print turnaround">
      </div>
    </div></td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Envelops</label>
      <div class="col-md-9">
        <input name="envelops" type="text" class="form-control" id="envelops" placeholder="Enter Envelops">
      </div>
    </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">NumberLocation </label>
      <div class="col-md-9">
        <input name="numberlocation" type="text" class="form-control" id="numberlocation" placeholder="Enter Number lacation">
      </div>
    </div></td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Sequential Numbering</label>
      <div class="col-md-9">
        <input name="sequentialnumberiang" type="text" class="form-control" id="sequentialnumberiang" placeholder="Enter sequential numbering">
      </div>
    </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Starting Number</label>
      <div class="col-md-9">
        <input name="startingnumber" type="text" class="form-control" id="startingnumber" placeholder="Enter starting numbering">
      </div>
    </div></td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">3 Hole Drilling</label>
      <div class="col-md-9">
        <input name="threeholedrilling" type="text" class="form-control" id="threeholedrilling" placeholder="Enter 3 hole drilling">
      </div>
    </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Pages</label>
      <div class="col-md-9">
        <input name="pages" type="text" class="form-control" id="pages" placeholder="Enter pages">
      </div>
    </div></td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Binding</label>
      <div class="col-md-9">
        <input name="binding" type="text" class="form-control" id="binding" placeholder="Enter binding">
      </div>
    </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Cover Paper</label>
      <div class="col-md-9">
        <input name="coverpaper" type="text" class="form-control" id="coverpaper" placeholder="Enter Cover paper">
      </div>
    </div></td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Binding
      Placement</label>
      <div class="col-md-9">
        <input name="bindingplacement" type="text" class="form-control" id="bindingplacement" placeholder="Enter binding placement">
      </div>
    </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Status</label>
      <div class="col-md-9">
        <select class="form-control" name="status">
          <option value="Enable">Enable</option>
          <option value="Disabled">Disabled</option>
        </select>
      </div>
    </div>       </td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Paper Type</label>
      <div class="col-md-9">
        <input name="papertype" type="text" class="form-control" id="papertype" placeholder="Enter Folding">
      </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>


                            </div>
                            </form>
                            <%
                            }
                            }catch(Exception ex){
                            System.out.println();
                            }%>
</body>
</html>
