<%-- 
    Document   : addProducts
    Created on : Nov 15, 2015, 3:49:45 PM
    Author     : JPT TERSOO AGBE
--%>

<%@page import="javax.ejb.*,java.lang.*,javax.naming.InitialContext,javax.rmi.PortableRemoteObject,java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@include  file="lookup.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>Products</title>
         <script type="text/ecmascript" language="javascript" src="js/validation.js"></script>
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
					<ul class="dropdown-menu">
						<li>
							<p>
								 You have 0 new notifications
							</p>
						</li>
						<li>
							<ul class="dropdown-menu-list scroller" style="height: 250px;">
								<li>
									<a href="#">
									<span class="label label-sm label-icon label-success">
									<i class="fa fa-plus"></i>
									</span>
									New user registered. <span class="time">
									Just now </span>
									</a>
								</li>


							</ul>
						</li>
						<li class="external">
							<a href="#">
							See all notifications <i class="m-icon-swapright"></i>
							</a>
						</li>
					</ul>
				</li>
				<!-- END NOTIFICATION DROPDOWN -->
				<!-- BEGIN INBOX DROPDOWN -->

				<!-- END INBOX DROPDOWN -->
				<!-- BEGIN TODO DROPDOWN -->

				<!-- END TODO DROPDOWN -->
				<!-- BEGIN USER LOGIN DROPDOWN -->
				<li class="dropdown dropdown-user">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
					<img alt="" class="img-circle hide1" src=""/>
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
							<a href="">
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
					<span class="selected"></span>
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
							<a href="startProducts.jsp">
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
                                <span class="selected"></span>
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
        String productsid = request.getParameter("productsid");
        String productname = request.getParameter("productname");
        String startingprice = request.getParameter("startingprice");
        if(productsid !="" && productname !=null && startingprice !=null && startingprice !="" && request.getParameter("submitb") !=null){
        try{
       String code = inl.addSubcategory("", productsid, productname, startingprice, null);
        session.setAttribute("code", code);
        response.sendRedirect("uploadpics.jsp");
       
        }catch(Exception ex){
        System.out.println(ex.getMessage());
        }
        }

        %>
 
     
<form class="form-horizontal" role="form" action=""  method="post">
        <div class="form-body">
            <div class="form-group">

										<label class="col-md-3 control-label">Product Name</label>
										<div class="col-md-9">
       <select name="productsid" id="productsid" class="form-control">
            <option value=" ">----Select one------</option>
          <%  try{ Iterator i = inl.viewAllInitialProducts().iterator();
                                                        while(i.hasNext()){
                                                 Initializeprodutsbean hlp = (Initializeprodutsbean) i.next();
           %>
          <option value="<%=hlp.getProductName()%>"<%=request.getParameter("productsid") != null && request.getParameter("productsid").equalsIgnoreCase(hlp.getProductName()) ? new String("selected") : new String("")%>><%=hlp.getProductName()%></option>
          <%                                            }

                                                        }catch(Exception ex){
                                                System.out.println(ex.getMessage());
                                                        }
        %>
        </select>
        </div>
									</div>
                 <table width="80%" border="0">
  <tr>
    <td width="48%">
<div class="form-group">

										<label class="col-md-3 control-label">Sub Category Name<span class="required">
										* </span></label>
										<div class="col-md-9">
		<input type="text" class="form-control" placeholder="Enter Sub Category Name" name="productname">
										</div>
									</div>      </td>
    <td width="52%"> 
<div class="form-group">
										<label class="col-md-3 control-label">Product Type<span class="required">
										* </span></label>
										<div class="col-md-9">
											<input type="text" class="form-control" placeholder="Enter Product Type" name="producttype">
										</div>
									</div>    </td>
  </tr>
  <tr>
    <td><div class="form-group">
										<label class="col-md-3 control-label">Description</label>
										<div class="col-md-9">
											<textarea class="form-control" rows="3" name="description" disabled></textarea>
										</div>
									</div></td>
    <td><div class="form-group">

										<label class="col-md-3 control-label">Starting Number</label>
										<div class="col-md-9">
											<input type="text" class="form-control" placeholder="Enter startingnumber" name="startingnumber" readonly>
										</div>
									</div>   </td>
  </tr>
  <tr>
    <td> </td>
    <td><div class="form-group">
									<label class="col-md-3 control-label">Rounded Corners</label>
										<div class="col-md-9">
											<input type="text" class="form-control" placeholder="Enter rounded corners" name="roundedcorners" readonly>
										</div>
									</div>   </td>
  </tr>
  <tr>
    <td><div class="form-group">
										<label for="exampleInputFile" class="col-md-3 control-label">File input<span class="required">
										* </span></label>
										<div class="col-md-9"> 
											<input type="file"  name="fileFiled" id="exampleInputFile">
											<p class="help-block">
												 some help text here.											</p>
										</div>							</div></td>
    <td><div class="form-group">

										<label class="col-md-3 control-label">Cardslot</label>
										<div class="col-md-9">
											<input type="text" class="form-control" placeholder="Enter cardslot" name="cardslot" readonly>
										</div>
									</div>   </td>
  </tr>
  <tr>
    <td><div class="form-group">
										<label class="col-md-3 control-label">Hole Driling</label><div class="col-md-9">
											<input name="holedriling" type="text" class="form-control" id="holedriling" placeholder="Enter Folding" readonly>
										</div>
									</div></td>
    <td><div class="form-group">

										<label class="col-md-3 control-label">Tree Hole Drilling</label>
										<div class="col-md-9">
											<input type="text" class="form-control" placeholder="Enter treeholedrilling" name="treeholedrilling" readonly>
										</div>
									</div>   </td>
  </tr>
  <tr>
    <td><div class="form-group">
										<label class="col-md-3 control-label">Printed Side</label>
										<div class="col-md-9">
											<input type="text" class="form-control" placeholder="Enter Printed Side" name="printedside" readonly>
										</div>
									</div></td>
    <td><div class="form-group">

										<label class="col-md-3 control-label">Canvas Wrapping</label>
										<div class="col-md-9">
											<input type="text" class="form-control" placeholder="Enter canvaswrapping" name="canvaswrapping" readonly>
										</div>
									</div>   </td>
  </tr>
  <tr>
    <td> <div class="form-group">
										<label class="col-md-3 control-label">Minimum Quantity </label>
<div class="col-md-9">
											<input name="size" type="text" class="form-control" id="size" placeholder="enter Quantity" >
										</div>
									</div></td>
    <td><div class="form-group">

										<label class="col-md-3 control-label">Grommets</label>
										<div class="col-md-9">
											<input type="text" class="form-control" placeholder="Enter gromements" name="gromements" readonly>
										</div>
									</div>   </td>
  </tr>
  <tr>
    <td><div class="form-group">
										<label class="col-md-3 control-label">printturnaround</label>
										<div class="col-md-9">
											<input type="text" class="form-control" placeholder="Enter printturnaround" name="printturnaround" readonly>
										</div>
							  </div>                              </td>
    <td><div class="form-group">

										<label class="col-md-3 control-label">Herms</label>
										<div class="col-md-9">
											<input type="text" class="form-control" placeholder="Enter herms" name="herms" readonly>
										</div>
									</div>   </td>
  </tr>
  <tr>
    <td><div class="form-group">
										<label class="col-md-3 control-label">Envelops</label>
										<div class="col-md-9">
											<input type="text" class="form-control" placeholder="Enter envelops" name="envelops" readonly>
										</div>
							  </div></td>
    <td><div class="form-group">

										<label class="col-md-3 control-label">polepucket</label>
										<div class="col-md-9">
											<input type="text" class="form-control" placeholder="Enter polepucket" name="polepucket" readonly>
										</div>
									</div>   </td>
  </tr>
  <tr>
    <td><div class="form-group">
										<label class="col-md-3 control-label">Numbering Location</label>
										<div class="col-md-9">
							 <input type="text" class="form-control" placeholder="Enter Numbering Location" name="numberinglocation" readonly>
										</div>
							  </div>								</td>
    <td><div class="form-group">

										<label class="col-md-3 control-label">Bindplacement</label>
										<div class="col-md-9">
											<input type="text" class="form-control" placeholder="Enter bindplacement" name="bindplacement" readonly>
										</div>
									</div>   </td>
  </tr>
  <tr>
    <td><div class="form-group">
										<label class="col-md-3 control-label">Sequential numbering</label>
										<div class="col-md-9">
											<input type="text" class="form-control" placeholder="Enter sequential numbering" name="sequentialnumbering" readonly>
										</div>
							  </div></td>
    <td><div class="form-group">

										<label class="col-md-3 control-label">Binding</label>
										<div class="col-md-9">
											<input type="text" class="form-control" placeholder="Enter binding" name="binding" readonly>
										</div>
									</div> </td>
  </tr>
  <tr>
    <td><div class="form-group">
										<label class="col-md-3 control-label">Coverpapers</label>
										<div class="col-md-9">
											<input type="text" class="form-control" placeholder="Enter coverpapers" name="coverpapers" readonly>
										</div>
							  </div></td>
    <td><div class="form-group">
										<label class="col-md-3 control-label">pages</label>
										<div class="col-md-9">
											<input type="text" class="form-control" placeholder="Enter pages" name="pages" readonly>
										</div>
							  </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
										<label class="col-md-3 control-label">Hole location</label><div class="col-md-9">
											<input name="holelocation" type="text" class="form-control" id="holelocation" placeholder="Enter papertype" readonly>
										</div>
							  </div></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td><div class="form-group">
										<label class="col-md-3 control-label">Perforation</label>
										<div class="col-md-9">
											<input type="text" class="form-control" placeholder="Enter perforation" name="perforation" readonly>
										</div>
							  </div></td>
    <td><div class="form-group">
										<label class="col-md-3 control-label">Ink Color</label>
										<div class="col-md-9">
										  <select class="form-control" name="inkcolor">
                                            <option value="Red">Red</option>
                                            <option value="Blue">Blue</option>
                                            <option value="Black">Black</option>
                                          </select>
										</div>
							  </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Print Turnaround</label>
      <div class="col-md-9">
        <input type="text" class="form-control" placeholder="Enter printturnaround" name="printturnaround2" readonly>
      </div>
    </div></td>
<td><div class="form-group">
										<label class="col-md-3 control-label">Paper type</label>
										<div class="col-md-9">
											<input type="text" class="form-control" placeholder="Enter papertype" name="papertype" readonly>
										</div>
							  </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Lamitnation</label>
      <div class="col-md-9">
        <input name="lamination" type="text" class="form-control" id="lamination" placeholder="Enter lamination" readonly>
      </div>
    </div></td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Tabbing</label>
      <div class="col-md-9">
        <input name="tabbing" type="text" class="form-control" id="tabbing" placeholder="Enter tabbing" readonly>
      </div>
    </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Canvas Cut</label>
      <div class="col-md-9">
        <input name="canvascut" type="text" class="form-control" id="canvascut" placeholder="Enter canvas cut" readonly>
      </div>
    </div></td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Interior Paper</label>
      <div class="col-md-9">
        <input name="interiopaper" type="text" class="form-control" id="interiopaper" placeholder="Enter interiopaper" readonly>
      </div>
    </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Interio Colour</label>
      <div class="col-md-9">
        <input name="interiocolor" type="text" class="form-control" id="interiocolor" placeholder="Enter interiocolor" readonly>
      </div>
    </div></td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Folding</label>
      <div class="col-md-9">
        <input name="foldiing" type="text" class="form-control" id="foldiing" placeholder="Enter folding" readonly>
      </div>
    </div></td>
  </tr>
  <tr>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Starting price</label>
      <div class="col-md-9">
        <input name="startingprice" type="text" class="form-control" id="startingprice" placeholder="Enter startin price" >
      </div>
    </div></td>
    <td><div class="form-group">
      <label class="col-md-3 control-label">Size </label>
      <div class="col-md-9">
        <input name="sizecut" type="text" class="form-control" id="sizecut" placeholder="Enter size cut" >
      </div>
    </div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
<div class="form-actions">
		<div class="row">
										<div class="col-md-offset-3 col-md-9">
											<button type="submit" class="btn green" name="submitb">Submit</button>
											<button type="button" class="btn default">Cancel</button>
										</div>
									</div>
								</div>
                                </div>
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
        <%=session.getAttribute("codee").toString()%> &copy; Inspirational Images. ALL Rights Reserved.
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
<script src="admin/pages/scripts/form-validation.js"></script>
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
   FormValidation.init();
});
</script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>