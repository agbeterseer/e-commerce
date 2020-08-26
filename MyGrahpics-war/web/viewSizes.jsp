<%-- 
    Document   : viewSizes
    Created on : Dec 5, 2015, 11:31:05 AM
    Author     : JPT TERSOO AGBE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@include  file="lookup.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>view Sizes</title>
         <script language="javascript"  src="js/paging.js" type="text/javascript"></script>
   <script type="text/javascript">
      checked = false;
      function checkedAll () {
        if (checked === false){checked = true;}else{checked = false;}
	for (var i = 0; i < document.getElementById('myform').elements.length; i++) {
	  document.getElementById('myform').elements[i].checked = checked;
	}
      }
    </script>
          <script type="text/javascript">
        function confirmation() {
	var answer = confirm("Are you Sure you want to remove Record?");
	if (answer)
            return true;
         else
            return false;
           }
        </script>
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport"/>
<meta content="" name="description"/>
<meta content="" name="author"/>
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css"/>
<link href="plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
<link href="plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css"/>
<link href="plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
<link href="plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css"/>
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL PLUGIN STYLES -->
<link href="plugins/gritter/css/jquery.gritter.css" rel="stylesheet" type="text/css"/>
<link href="plugins/bootstrap-daterangepicker/daterangepicker-bs3.css" rel="stylesheet" type="text/css"/>
<link href="plugins/fullcalendar/fullcalendar/fullcalendar.css" rel="stylesheet" type="text/css"/>
<link href="plugins/jqvmap/jqvmap/jqvmap.css" rel="stylesheet" type="text/css"/>
<!-- END PAGE LEVEL PLUGIN STYLES -->
<!-- BEGIN PAGE STYLES -->
<link href="admin/pages/css/tasks.css" rel="stylesheet" type="text/css"/>
<!-- END PAGE STYLES -->
<!-- BEGIN THEME STYLES -->
<link href="css/components.css" rel="stylesheet" type="text/css"/>
<link href="css/plugins.css" rel="stylesheet" type="text/css"/>
<link href="admin/layout/css/layout.css" rel="stylesheet" type="text/css"/>
<link href="admin/layout/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color"/>
<link href="admin/layout/css/custom.css" rel="stylesheet" type="text/css"/>
<!-- END THEME STYLES -->
<link rel="shortcut icon" href="favicon.ico"/>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<!-- DOC: Apply "page-header-fixed-mobile" and "page-footer-fixed-mobile" class to body element to force fixed header or footer in mobile devices -->
<!-- DOC: Apply "page-sidebar-closed" class to the body and "page-sidebar-menu-closed" class to the sidebar menu element to hide the sidebar by default -->
<!-- DOC: Apply "page-sidebar-hide" class to the body to make the sidebar completely hidden on toggle -->
<!-- DOC: Apply "page-sidebar-closed-hide-logo" class to the body element to make the logo hidden on sidebar toggle -->
<!-- DOC: Apply "page-sidebar-hide" class to body element to completely hide the sidebar on sidebar toggle -->
<!-- DOC: Apply "page-sidebar-fixed" class to have fixed sidebar -->
<!-- DOC: Apply "page-footer-fixed" class to the body element to have fixed footer -->
<!-- DOC: Apply "page-sidebar-reversed" class to put the sidebar on the right side -->
<!-- DOC: Apply "page-full-width" class to the body element to have full width page without the sidebar menu -->
<body class="page-header-fixed page-quick-sidebar-over-content">
<!-- BEGIN HEADER -->
<div class="page-header navbar navbar-fixed-top">
	<!-- BEGIN HEADER INNER -->
	<div class="page-header-inner">
		<!-- BEGIN LOGO -->
		<div class="page-logo">
			<a href="index.html">
			<img src="admin/layout/img/logo.png" alt="logo" class="logo-default"/>
			</a>
			<div class="menu-toggler sidebar-toggler hide">
				<!-- DOC: Remove the above "hide" to enable the sidebar toggler button on header -->
			</div>
		</div>
		<!-- END LOGO -->
		<!-- BEGIN RESPONSIVE MENU TOGGLER -->
		<a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse">
		</a>
		<!-- END RESPONSIVE MENU TOGGLER -->
		<!-- BEGIN TOP NAVIGATION MENU -->
		<div class="top-menu">
			<ul class="nav navbar-nav pull-right">
				<!-- BEGIN NOTIFICATION DROPDOWN -->
				<li class="dropdown dropdown-extended dropdown-notification" id="header_notification_bar">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
					<i class="icon-bell"></i>
					<span class="badge badge-default">
					7 </span>
					</a>
				 
				</li>
				<!-- END NOTIFICATION DROPDOWN -->
				<!-- BEGIN INBOX DROPDOWN -->

				<!-- END INBOX DROPDOWN -->
				<!-- BEGIN TODO DROPDOWN -->

				<!-- END TODO DROPDOWN -->
				<!-- BEGIN USER LOGIN DROPDOWN -->
				<li class="dropdown dropdown-user">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
					<img alt="" class="img-circle hide1" src="../../assets/admin/layout/img/avatar3_small.jpg"/>
					<span class="username username-hide-on-mobile">
					Admin </span>
					<i class="fa fa-angle-down"></i>
					</a>
					<ul class="dropdown-menu">
						<li>
							<a href="viewuserprofile.jsp">
							<i class="icon-user"></i> My Profile </a>
						</li>
					<li class="divider">
						</li>
						<li>
							<a href="extra_lock.html">
							<i class="icon-lock"></i> Lock Screen </a>
						</li>
						<li>
							<a href="logout.jsp">
							<i class="icon-key"></i> Log Out </a>
						</li>
					</ul>
				</li>
				<!-- END USER LOGIN DROPDOWN -->
				<!-- BEGIN QUICK SIDEBAR TOGGLER -->
				<li class="dropdown dropdown-quick-sidebar-toggler">
					<a href="javascript:;" class="dropdown-toggle">
					<i class="icon-logout"></i>
					</a>
				</li>
				<!-- END QUICK SIDEBAR TOGGLER -->
			</ul>
		</div>
		<!-- END TOP NAVIGATION MENU -->
	</div>
	<!-- END HEADER INNER -->
</div>
<!-- END HEADER -->
<div class="clearfix">
</div>
<!-- BEGIN CONTAINER -->
<div class="page-container">
	<!-- BEGIN SIDEBAR -->
	<div class="page-sidebar-wrapper">
		<!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
		<!-- DOC: Change data-auto-speed="200" to adjust the sub menu slide up/down speed -->
		<div class="page-sidebar navbar-collapse collapse">
			<!-- BEGIN SIDEBAR MENU -->
			<ul class="page-sidebar-menu " data-auto-scroll="true" data-slide-speed="200">
				<!-- DOC: To remove the sidebar toggler from the sidebar you just need to completely remove the below "sidebar-toggler-wrapper" LI element -->
				<li class="sidebar-toggler-wrapper">
					<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
					<div class="sidebar-toggler">
					</div>
					<!-- END SIDEBAR TOGGLER BUTTON -->
				</li>
				<!-- DOC: To remove the search box from the sidebar you just need to completely remove the below "sidebar-search-wrapper" LI element -->
				<li class="sidebar-search-wrapper">

					<!-- END RESPONSIVE QUICK SEARCH FORM -->
				</li>
				<li class="start active open">
					<a href="javascript:;">
					<i class="icon-home"></i>
					<span class="title">Dashboard</span>
					
					<span class="arrow open"></span>
					</a>

				</li>
                		<li>
					<a href="javascript:;">
					<i class="icon-user"></i>
					<span class="title">User</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
                        <li>
							<a href="createuser.jsp">
							<i class="icon-tag"></i>
							Add User</a>
						</li>
        				<li>
							<a href="viewUsers.jsp">
							<i class="icon-home"></i>
							View Users</a>
						</li>
    					<li>
							<a href="resetPassord.jsp">
							<i class="icon-handbag"></i>
							Change Password</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="javascript:;">
					<i class="icon-basket"></i>
					<span class="title">ecommerce</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
                       <li>
							<a href="viewOrders.jsp">
							<i class="icon-tag"></i>
							Order View</a>
						</li>

						<li>
							<a href="">
							<i class="icon-home"></i>
							View Orders</a>
						</li>


						<li>
							<a href="addProducts.jsp">
							<i class="icon-handbag"></i>
							Products</a>
						</li>
						<li>
							<a href="seeAllData.jsp">
							<i class="icon-pencil"></i>
							Product Edit</a>
						</li>

                       	<li>
							<a href="seeAllSubData.jsp">
                          
							<i class="icon-pencil"></i>
							Add Sub Category</a>
						</li>
                        <li>
							<a href="seeAllSubData.jsp.jsp">
							<i class="icon-pencil"></i>
							Edit Sub Category</a>
						</li>
                    	</ul>
				</li>

				<!-- BEGIN FRONTEND THEME LINKS -->

				<!-- END FRONTEND THEME LINKS -->

				<li>
					<a href="javascript:;">
					<i class="icon-puzzle"></i>
					<span class="title">Others</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">



						<li>
							<a href="">
							details</a>
						</li>
					</ul>
				</li>
				<li class="heading">
					<h3 class="uppercase">Features</h3>
				</li>
				<li>
					<a href="javascript:;">
					<i class="icon-settings"></i>
					<span class="title">Settings</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="parameters.jsp">
                                <span class="selected"></span>
							parametars</a>
						</li>
						<li>
							<a href=" ">
							Form Layouts</a>
						</li>
				</ul>
				</li>
        		<li>
					<a href="javascript:;">
					<i class="icon-present"></i>
					<span class="title">Extra</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="addAboutUs.jsp">
							About Us</a>
						</li>
                        <li>
							<a href="viewAboutUs.jsp">
							Modify About Us</a>
						</li>
						<li>
							<a href="addContact.jsp">
							Contact Us</a>
						</li>
				</ul>
				</li>
				</ul>
			<!-- END SIDEBAR MENU -->
		</div>
	</div>
	<!-- END SIDEBAR -->
	<!-- BEGIN CONTENT -->
	<div class="page-content-wrapper">
		<div class="page-content">
      <%
       if(request.getParameter("delete") !=null ){
       String[] pk = request.getParameterValues("remove");
        System.out.println("pk1"+ pk);
        //int[] pk =Integer.parseInt(xi);
            if(pk != null) {
            //int intarray[] = new int[pk.length];
              //System.out.println("pk2"+ pk);
            try{
                for(int i = 0; i < pk.length; i++) {
               inl.removeSize((pk[i]));
           }
           }catch(Exception e){
            System.out.println("Error in remove" + e.getMessage());
            }
            }
            }
        %>
        <%
       List list = null; 
        //ArrayList list = new ArrayList();
        try{
            list = inl.viewAllSize();
        }catch(Exception ex){
        System.out.println(ex.getMessage());
        }
         %>
        <form action="" method="post" id="myform" name="myform">
        <table width="80%" border="0">
  <tr>
    <td width="89%">&nbsp;</td>
    <td width="11%"> <div class="col-md-6">
										<div class="btn-group">
											<button id="sample_editable_1_new" class="btn green">
											<a href="addSize.jsp">Add New </a><i class="fa fa-plus"></i>
											</button>
										</div>
									</div></td>
  </tr>
</table>

<table width="80%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="17" class="tableheader" >..::All Sizes ..</td>
    </tr>
</table>
<table width="80%" border="0" cellspacing="0" cellpadding="0" id="results"  class="table table-striped table-hover table-bordered" id="sample_editable_1">
  <tr class="tableheader">
    <td width="28%" height="20"><strong>Product Name</strong></td>
    <td width="20%"><strong>Property</strong></td>
    <td width="30%"><strong>Status</strong></td>
    <td width="30%"><strong>Price</strong></td>
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
    <td height="21" colspan="6"  bgcolor="#FFCC99">No Records Found</td>
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
                        Sizetablebean sh = (Sizetablebean)it.next();
			     if(count%2==0){
				 style = "even";
				 }else{
				 style = "odd";
				 }
                       // session.setAttribute("p", "viewFoldings.jsp");
  %>
  <tr class="<%=style%>">
      <td height="28" class="tab_lebel"><%=sh.getProductcode()%></td>
    <td><%=sh.getSizetab()%></td>
    <td><%=sh.getStatus()%></td>
    <td><%=sh.getPrice()%></td>
    <td><a href="modifySize.jsp?code=<%=sh.getCode()%>"><img src="img/edit.png" alt="no image"></a></td>
    <td>
      <input type="checkbox" name="remove" value="<%=sh.getCode()%>">   </td>
    </tr>
   <%
	count++;
  }
  %>
</table>
<table width="80%" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td width="92%"><%=h%>Record(s) Found</td>
          <td width="8%"><input type="submit" name="delete" id="delete" value="Remove" class="bot" onclick="return confirmation();"></td>
    </tr>
        <tr class="art-postmetadataheader">

        <td height="22"><div id="pageNavPosition2" align="justify">
      <script type="text/javascript"><!--
        var page = new Pager('results', 15);
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


		</div>
	</div>



	<!-- END CONTENT -->
	<!-- BEGIN QUICK SIDEBAR -->

	<!-- END QUICK SIDEBAR -->
</div>
<!-- END CONTAINER -->
<!-- BEGIN FOOTER -->
<div class="page-footer">
	<div class="page-footer-inner">
		<%=session.getAttribute("codee").toString()%> &copy; Inspirational Images. ALL Rights Reserved
	</div>
	<div class="scroll-to-top">
		<i class="icon-arrow-up"></i>
	</div>
</div>
<!-- END FOOTER -->
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="../../assets/global/plugins/respond.min.js"></script>
<script src="../../assets/global/plugins/excanvas.min.js"></script>
<![endif]-->
<script src="plugins/jquery-1.11.0.min.js" type="text/javascript"></script>
<script src="plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
<!-- IMPORTANT! Load jquery-ui-1.10.3.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
<script src="plugins/jquery-ui/jquery-ui-1.10.3.custom.min.js" type="text/javascript"></script>
<script src="plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
<script src="plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="plugins/jquery.cokie.min.js" type="text/javascript"></script>
<script src="plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
<script src="plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->

<script src="plugins/flot/jquery.flot.min.js" type="text/javascript"></script>
<script src="plugins/flot/jquery.flot.resize.min.js" type="text/javascript"></script>
<script src="plugins/flot/jquery.flot.categories.min.js" type="text/javascript"></script>
<script src="plugins/jquery.pulsate.min.js" type="text/javascript"></script>
<script src="plugins/bootstrap-daterangepicker/moment.min.js" type="text/javascript"></script>
<script src="plugins/bootstrap-daterangepicker/daterangepicker.js" type="text/javascript"></script>
<!-- IMPORTANT! fullcalendar depends on jquery-ui-1.10.3.custom.min.js for drag & drop support -->
<script src="plugins/fullcalendar/fullcalendar/fullcalendar.min.js" type="text/javascript"></script>
<script src="plugins/jquery-easypiechart/jquery.easypiechart.min.js" type="text/javascript"></script>
<script src="plugins/jquery.sparkline.min.js" type="text/javascript"></script>
<script src="plugins/gritter/js/jquery.gritter.js" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="scripts/metronic.js" type="text/javascript"></script>
<script src="admin/layout/scripts/layout.js" type="text/javascript"></script>
<script src="admin/layout/scripts/quick-sidebar.js" type="text/javascript"></script>

<script src="admin/pages/scripts/index.js" type="text/javascript"></script>
<script src="admin/pages/scripts/tasks.js" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<script>
jQuery(document).ready(function() {
   Metronic.init(); // init metronic core componets
   Layout.init(); // init layout
   QuickSidebar.init(); // init quick sidebar
  // Demo.init(); // init demo features
   Index.init();
   Index.initDashboardDaterange();
   Index.initJQVMAP(); // init index page's custom scripts
   Index.initCalendar(); // init index page's custom scripts
   Index.initCharts(); // init index page's custom scripts
   Index.initChat();
   Index.initMiniCharts();
   Index.initIntro();
   Tasks.initDashboardWidget();
});
</script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>