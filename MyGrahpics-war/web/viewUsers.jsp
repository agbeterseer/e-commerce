<%-- 
    Document   : viewUsers
    Created on : Nov 21, 2015, 1:50:21 PM
    Author     : JPT TERSOO AGBE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@include  file="lookUp.jsp"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>view All Users</title>
        <script type="text/javascript">
        function confirmation() {
	var answer = confirm("Are you Sure you want to remove Record?");
	if (answer)
            return true;
         else
            return false;
           }
        </script>
    </head>
    <body>
       <%
       if(request.getParameter("delete") !=null ){
       String[] pk = request.getParameterValues("remove");
        System.out.println("pk1"+ pk);
        //int[] pk =Integer.parseInt(xi);
            if(pk != null) {
            //int intarray[] = new int[pk.length];
               System.out.println("pk2"+ pk);
            try{
                for(int i = 0; i < pk.length; i++) {
              // msg = scl.rremoveStock(new Integer(pk[i]));

           }
           }catch(Exception e){
            System.out.println("Error in remove" + e.getMessage());
            }
            }
            }
        %>
        <%
        //ArrayList list = new ArrayList();
        try{
            list = inl.viewAllProducts();
        }catch(Exception ex){
        System.out.println();
        }
         %>
        <form action="" method="post" id="myform" name="myform">
<table width="80%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="17" class="tableheader" >..::All Products..</td>
    </tr>
</table>
<table width="80%" border="0" cellspacing="0" cellpadding="0" id="results">
  <tr class="tableheader">
    <td width="28%" height="20"><strong>User Name</strong></td>
    <td width="20%"><strong>Role</strong></td>
    <td width="30%"><strong>Status</strong></td>
    <td width="13%"><strong>[Modify]</strong></td>
    <td width="9%">
      <input type="checkbox" name="checkall2" onClick="checkedAll();">    </td>
    </tr>
      <%
                if(list != null) {
            try{
                if(list.isEmpty()) {
       %>
  <tr>
    <td height="21" colspan="5"  bgcolor="#FFCC99">No Records Found</td>
    </tr>
    <%
                }else{
                    Iterator it = list.iterator();
                    int h = 0;
      %>
      <%
                   int count = 0;
                while(it.hasNext()){
                        h++;
                        ush = (UserHelper)it.next();
			     if(count%2==0){
				 style = "even";
				 }else{
				 style = "odd";
				 }
  %>
  <tr class="<%=style%>">
    <td height="28" class="tab_lebel"><%=ush.getUsername()%></td>
    <td><%=ush.getRole()%></td>
    <td><%=ush.getStatus()%></td>
    <td><a href="modifyUserRecords.jsp?code=<%=ush.getUsername()%>"><img src="img/edit.png" alt="no image"></a></td>
    <td>
      <input type="checkbox" name="remove" value="<%=psh.getProductsId()%>">   </td>
    </tr>
   <%
	count++;
  }
  %>
</table>
<table width="80%" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td width="92%"><%=h%>Record(s) Found</td>
          <td width="8%"><input type="submit" name="delete" id="delete" value="Remove" class="bot"></td>
    </tr>
        <tr class="art-postmetadataheader">

        <td height="22"><div id="pageNavPosition2" align="justify">
      <script type="text/javascript"><!--
        var page = new Pager('results', 25);
        page.init();
        page.showPageNav('page', 'pageNavPosition2');
        page.showPage(1);
//--></script>
    </div></td>
       <td></td>
    </tr>
  </table>
  <%
        list.clear();
        }
        }catch(Exception ex){
        System.out.println("Oops! an Exception Occured!! due to: " + ex.getMessage());
        }
        }
		%>
</form>
    </body>
</html>
