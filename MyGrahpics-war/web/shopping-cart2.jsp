<%--
    Document   : shopping-cart
    Created on : Dec 27, 2015, 8:24:50 AM
    Author     : JPT TERSOO AGBE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@include file="lookupa.jsp" %>
   <%@page  import="Utill.*" %> 
<%!
//System.out.println()
String aag = "";
 String ag = "";
 String price = "";
 String Quantity = "";
 String qty = "";
 String passworddb = "";
 String username = "";
         String size = "";
         %><%
   String code = request.getParameter("code");
   //String price = request.getParameter("codf");
        // price = "";
         
        
   int totalva = 0;
    try{
                            
           price = session.getAttribute("price").toString();
   
            username = session.getAttribute("username").toString();
            
            ag = session.getAttribute("ag").toString();
                
            size = session.getAttribute("size").toString();
           Quantity = session.getAttribute("Quantity").toString();
           
          // passworddb = session.getAttribute("passworddb").toString();

      // hcm = new HelpCartMove(size,pages,coverpaper,papertype,binding,Quantity,printturnaround,price,ag,bindingplacement);
    
 %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Shopping cart | Inspirational Images</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta content="Inspirational Images description" name="description">
  <meta content="Inspirational Images keywords" name="keywords">
  <meta content="Inspirational Images" name="author">
  <meta property="og:site_name" content="-CUSTOMER VALUE-">
  <meta property="og:title" content="-CUSTOMER VALUE-">
  <meta property="og:description" content="-CUSTOMER VALUE-">
  <meta property="og:type" content="website">
  <meta property="og:image" content="-CUSTOMER VALUE-"><!-- link to image for socio -->
  <meta property="og:url" content="-CUSTOMER VALUE-">

  <link rel="shortcut icon" href="favicon.ico">

   <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700|PT+Sans+Narrow|Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all" rel="stylesheet" type="text/css">
  <!-- Fonts END -->
 <!-- Fonts START -->
   <!-- Fonts END -->
   

    <link href="6/js-image-slider.css" rel="stylesheet" type="text/css" />
    <script src="6/mcVideoPlugin.js" type="text/javascript"></script>
    <script src="6/js-image-slider.js" type="text/javascript"></script>

    	<link rel="stylesheet" href="mega-dropdown/css/reset.css"> <!-- CSS reset -->
	<link rel="stylesheet" href="mega-dropdown/css/style.css"> <!-- Resource style -->
	<script src="mega-dropdown/js/modernizr.js"></script> <!-- Modernizr -->
   
  <!-- Global styles START -->
  <link href="plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Global styles END -->

  <!-- Page level plugin styles START -->
  <link href="plugins/fancybox/source/jquery.fancybox.css" rel="stylesheet">
  <link href="plugins/carousel-owl-carousel/owl-carousel/owl.carousel.css" rel="stylesheet">
  <link href="plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css">
  <link href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" rel="stylesheet" type="text/css"><!-- for slider-range -->
  <link href="plugins/rateit/src/rateit.css" rel="stylesheet" type="text/css">
  <!-- Page level plugin styles END -->

  <!-- Theme styles START -->
  <link href="css/components.css" rel="stylesheet">
  <link href="layout/css/style.css" rel="stylesheet">
  <link href="pages/css/style-shop.css" rel="stylesheet" type="text/css">
  <link href="layout/css/style-responsive.css" rel="stylesheet">
  <link href="layout/css/themes/red.css" rel="stylesheet" id="style-color">
  <link href="layout/css/custom.css" rel="stylesheet">
    <script type="text/ecmascript" language="javascript" src="js/validation.js"></script>
  <!-- Theme styles END -->
</head>
<!-- Head END -->

<!-- Body BEGIN -->
<body class="ecommerce">
    <!-- BEGIN STYLE CUSTOMIZER -->
<%
 totalva = (new Integer(request.getParameter("price")).intValue() * 5/100) + new Integer(request.getParameter("price")).intValue();
System.out.println("totaL plus tax: " +totalva );
  String paymentcomment = request.getParameter("paymentcomment");
   String shiipingcomment = request.getParameter("shiipingcomment");
   String deliverymethod = request.getParameter("deliverymethod");
   String paymentmethod = request.getParameter("paymentmethod");
          String firstname = request.getParameter("firstname");
String company = request.getParameter("company");
String lastname = request.getParameter("lastname");
String address1 = request.getParameter("address1");
String address2 = request.getParameter("address2");
String email = request.getParameter("email");
String telphone = request.getParameter("telphone");
String city = request.getParameter("city");
String fax = request.getParameter("fax");
String postcode = request.getParameter("postcode");
String country = request.getParameter("country");
String password = request.getParameter("password");

String firstname2 = request.getParameter("firstname2");
String company2 = request.getParameter("company2");
String lastname2 = request.getParameter("lastname2");
String address3 = request.getParameter("address3");
String address4 = request.getParameter("address4");
String email2 = request.getParameter("email2");
String telphone2 = request.getParameter("telphone2");
String city2 = request.getParameter("city2");
String fax2 = request.getParameter("fax2");
String postcode2 = request.getParameter("postcode2");
String country2 = request.getParameter("country2");
String password2 = request.getParameter("password2");
String states2 = request.getParameter("states2");


try{
   //
  if (request.getParameter("checkoutb") !=null && firstname2 !=null && lastname2 !=null) {
//System.out.println("yellooooooo 2:==");
   if(request.getParameter("passworddb") !=null){ 
   //do nothing
  }else{
  String msdd = inl.AddUser(email2,password,"user","");
  }
   
 String sda = inl.addCustomers(email2, firstname2, lastname2, "", address3, address3, telphone2, states2, "", city2, "", city2, country2, null, postcode2);


  String bill = inl.addBilling("",firstname2,lastname2,email2,telphone2,"",fax2,address3,address4,city2,postcode2,country2,"",new Integer(totalva).toString(),null,"",email2);

  String delli = inl.addDeliveryAddress("",firstname2,lastname2,email2,telphone2,"",fax2,address3,address4,city2,postcode2,country2,"",deliverymethod,paymentmethod,shiipingcomment,paymentcomment,"");
 // String prop = size + ", "+ pages+ ", " + papertype + " ,"+ binding+ "," + bindingplacement+"," + coverpaper+"," + printturnaround;

String ord = inl.addOrder("",ag, "","",new Integer(totalva).toString(),deliverymethod,bill,delli,null,"","",email2);

//System.out.println("order0000000000000000000= "+  ord);
//System.out.println("bill0000000000000000000= "+  bill);

%>
 <%
String maildetails = "";
String mailstat = "";
                            //*************************SEND AN EMAIL********************************
                            maildetails = "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" height=\"100%\" width=\"100%\" id=\"bodyTable\">"
                                    + "<tr>"
                                    + "<td align=\"center\" valign=\"top\" bgcolor=\"#ccc\">"
                                    + "<table width=\"80%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\" id=\"emailContainer\">"
                                    + "<tr>"
                                    + "<td align=\"center\" valign=\"top\">"
                                    + "<table border=\"0\" cellpadding=\"20\" cellspacing=\"0\" width=\"100%\" id=\"emailHeader\">"
                                    + "<tr bgcolor=\"#003366\">"
                                    + "<td align=\"center\" valign=\"top\" style=\"color:#FFFFFF\">"
                                    + "<strong> INSPIRATIONAL IMAGES </strong>"
                                    //usmL.viewABranch(sessionLocal.getCurrentProductid().getBranchcode()).getBranchorganization()
                                    + "</td>"
                                    + "</tr>"
                                    + "</table>"
                                    + "</td>"
                                    + "</tr>"
                                    + "<tr>"
                                    + "<td align=\"center\" valign=\"top\">"
                                    + "<table border=\"0\" cellpadding=\"20\" cellspacing=\"0\" width=\"100%\" id=\"emailBody\">"
                                    + "<tr>"
                                    + "<td height=\"99\" valign=\"top\">"
                                    + "<p>Hello " + session.getAttribute("username").toString()+ ",</p>"
                                    + "<p>Your payment for " + inl.viewSingleSubcategory(ag).getSubcategory() + " via interswitch was done sucessfully</p>"
                                    + "<p>Amount: " + (new Integer(price).intValue() * 5/100) + new Integer(price).intValue() + "</p>"
                                    + "<p>Transaction reference: " + ord + "</p>"
                                    + "<p>Contact inf@inspirationalimagesltd.com for any enquiries</p>"
                                    + "<br />"
                                    + "<p>Yours Faithfully</p>"
                                    + "</td>"
                                    + "</tr>"
                                    + "</table>"
                                    + "</td>"
                                    + "</tr>"
                                    + "<tr>"
                                    + "<td align=\"center\" valign=\"top\">"
                                    + "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" id=\"emailFooter\">"
                                    + "<tr bgcolor=\"#000000\">"
                                    + "<td align=\"center\" style=\"color:#FFFFFF\"> inspirationalimagesltd.com &copy; 2016</td>"
                                    + "</tr>"
                                    + "</table>"
                                    + "</td>"
                                    + "</tr>"
                                    + "</table>"
                                    + "</td>"
                                    + "</tr>"
                                    + "</table>";
                        %>
                        
                        <%
                                    EmailSenderl gms = new EmailSenderl("smtp.gmail.com", "info@inspirationalimagesltd.com", "inspirationalimages", "465", "info@inspirationalimagesltd.com", email2, "true", "true", "true", "javax.net.ssl.SSLSocketFactory", "- WEB PAY", maildetails);
                                    mailstat = gms.send();
%>
    
    <%
    session.setAttribute("bill", bill);
   session.setAttribute("email", email2);
   session.setAttribute("postcode", postcode2);
   session.setAttribute("deliverymethod", deliverymethod);
   session.setAttribute("firstname", firstname2);
   session.setAttribute("lastname", lastname2);
   session.setAttribute("telphone", telphone);
   session.setAttribute("country", country2);
   session.setAttribute("city", city2);
  
   session.setAttribute("address3", address3);
   session.setAttribute("address4", address4);
  session.setAttribute("country", country2);
  session.setAttribute("paymentmethod", paymentmethod);
   session.setAttribute("ord", ord);
   session.setAttribute("delli", delli);


  

   response.sendRedirect("preview.jsp");

   }
  }catch(Exception ex){
  System.out.println(ex.getMessage());
  }

%>
    <!-- END BEGIN STYLE CUSTOMIZER -->

    <!-- BEGIN TOP BAR -->
    <div class="pre-header">
        <div class="container">
            <div class="row">
                <!-- BEGIN TOP BAR LEFT PART -->
                <div class="col-md-6 col-sm-6 additional-shop-info">
                    <ul class="list-unstyled list-inline">
                        <li><i class="fa fa-phone"></i><span><font color="red">HOT-LINE:+234 8034733069</font></span></li>
                        <!-- BEGIN CURRENCIES -->

                        <!-- END CURRENCIES -->
                        <!-- BEGIN LANGS -->

                        <!-- END LANGS -->
                    </ul>
                </div>
                <!-- END TOP BAR LEFT PART -->
                <!-- BEGIN TOP BAR MENU -->
                <div class="col-md-6 col-sm-6 additional-nav">
                    <ul class="list-unstyled list-inline pull-right">
                       <li><a href="index.jsp">Home</a></li>
                        <li><a href="aboutUs.jsp">About Us</a></li>
                        <li><a href="contactus.jsp">Contact Us</a></li>
                        <li><a href="shop-account.jsp">My Account</a></li>
                        <li><a href="login.jsp">Log In</a></li>
                    </ul>
                </div>
                   
                <!-- END TOP BAR MENU -->
            </div>
        </div>
    </div>
    <!-- END TOP BAR -->
<%
String searchcode = request.getParameter("searchcode");

if (request.getParameter("searchb") !=null){

    response.sendRedirect("shop-search-result.jsp");

}

%>
    <!-- BEGIN HEADER -->
   <div class="header">
      <div class="container">
	  	<div class="cd-dropdown-wrapper">
			<a class="cd-dropdown-trigger" href="#0">Online Printing</a>
			<nav class="cd-dropdown">
				<h2>Title</h2>
				<a href="#0" class="cd-close">Close</a>
				<ul class="cd-dropdown-content">
					<li>
						<form class="cd-search">
							<input type="search" placeholder="Search...">
						</form>
					</li>
					<li class="has-children">
						<a href="">Online Printing</a>

							<ul class="cd-secondary-dropdown is-hidden">
							<li class="go-back"><a href="#0">Menu</a></li>
							<li class="see-all"><a href="products.jsp">All Printing</a></li>
							<li class="has-children">
								<a href="">Printing Services</a>

								<ul class="is-hidden">
									<li class="go-back"><a href="#0">Online Printing</a></li>
									<li class="see-all"><a href="products.jsp">All Printing</a></li>
									<li>
										<a href="begincat.jsp?code=Booklets">Booklets</a>
									</li>
									<li><a href="brochur.jsp?code=Brochure">Brochure</a></li>
                                                                         <li><a href="catalogue.jsp?code=Catalogue">Catalog</a></li>
                                    <li class="has-children">
										<a href="#0">Calender</a>

										<ul class="is-hidden">
											<li class="go-back"><a href="#0">Printing Services</a></li>
											<li class="see-all"><a href="">All Printing</a></li>
											<li><a href="wallcalenders.jsp?code=Calender">Wall calender</a></li>
											<li><a href="tablecalender.jsp?code=Calenders">Table calender</a></li>

										</ul>
									</li>
									<li><a href="cal.jsp?code=CDCoversInlays">CD Covers / Inlays</a></li>
									<li><a href="begincat.jsp?code=Envelopes">Envelopes</a></li>
									<li class="has-children"><a href="flyer.jsp?code=Flyers">Flyers</a>

                                    <ul class="is-hidden">
											<li class="go-back"><a href="#0">Printing Services</a></li>
											<li class="see-all"><a href=" ">All Printing</a></li>
											<li><a href="flyer.jsp?code=Flyer">Flyers</a></li>
											 

										</ul>
                                    </li>


									<li><a href="cal2.jsp?code=Certificate">Certificate</a></li>
								</ul>
							</li>

							<li class="has-children">
								<a href="">Posters/Banners</a>

								<ul class="is-hidden">
									<li class="go-back"><a href="#0">Online Printing</a></li>
									<li class="see-all"><a href="products.jsp">All Printing</a></li>
									<li><a href="begincat.jsp?code=Canvasprinting">Canvas printing</a></li>

									<li class="has-children"><a href="">Roll-up Banners</a>
                                    	<ul class="is-hidden">
											<li class="go-back"><a href="#0">Posters/Banners</a></li>
											<li class="see-all"><a href=" ">All Printing</a></li>
											<li><a href="rollupb.jsp?code=RollupBanner">Roll-up Banners</a></li>
											<li><a href="rollupb.jsp?code=RollupBanners">Roll-up Banners Design 2</a></li>

										</ul>


                                    </li>
									<li><a href="cal.jsp?code=Windowgraphics">window graphics</a></li>
                                    <li class="has-children"><a href="begincat.jsp?code=Namebadges">Name badges</a>

                                    <ul class="is-hidden">
											<li class="go-back"><a href="#0">Posters/Banners</a></li>
											<li class="see-all"><a href=" ">All Printing</a></li>
											<li><a href="cal.jsp?code=Namebadges">Name badges</a></li>
											<li><a href="cal.jsp?code=Namebadge">Name badges Design 2</a></li>

										</ul>

                                    </li>

                                   <li><a href="cal.jsp?code=IDCards">ID CARDS</a></li>


								</ul>
							</li>

							<li class="has-children">
								<a href="">Printing Service</a>

								<ul class="is-hidden">
									<li class="go-back"><a href="#0">Online Printing</a></li>
									<li class="see-all"><a href="products.jsp">All Printing</a></li>
                                     <li><a href="cal.jsp?code=BusinessCard">Business Card</a></li>

									<li><a href="begincat.jsp?code=GreetingCards">Greeting CardS/Invitation</a></li>
									<li><a href="stickerlabel.jsp?code=LabelsStickers">labels & stickers</a></li>
									<li><a href="begincat.jsp?code=Letterhead">letterhead</a></li>

								</ul>
							</li>

							<li class="has-children">
								<a href="products.jsp">Printing Service</a>

								<ul class="is-hidden">
									<li class="go-back"><a href="#0">Online Printing</a></li>
									<li class="see-all"><a href="products.jsp">All Printing</a></li>

                                    <li><a href="luagagetag.jsp?code=LuagageTags">Luagage Tags</a></li>



								</ul>
							</li>
						</ul> <!-- .cd-secondary-dropdown -->
					</li> <!-- .has-children -->

					<li class="has-children">
						<a href="">Gift Items</a>

						<ul class="cd-secondary-dropdown is-hidden">
							<li class="go-back"><a href="#0">Menu</a></li>
							<li class="see-all"><a href="products.jsp">All Gift Items</a></li>
							<li class="has-children">
								<a href=" ">Gift Items</a>

								<ul class="is-hidden">
									<li class="go-back"><a href="#0">Gift Items</a></li>
									<li class="see-all"><a href="">All Printing</a></li>
									<li class="has-children"> <a href="#0">Mugs</a>
                                   <ul class="is-hidden">
											<li class="go-back"><a href="">Gift Items</a></li>
											<li class="see-all"><a href="">All Printing</a></li>
											<li><a href="cal.jsp?code=normalwhitemug">normal white mug</a></li>
											<li><a href="cal.jsp?code=colourchangingmug">colour changing mug</a></li>
                                                                                        <li><a href="cal.jsp?code=Twotone">Two tone</a></li>
											<li><a href="cal.jsp?code=Goldmug">Gold mug</a></li>
                                                                                        <li><a href="cal.jsp?code=beermug">beer mug</a></li>
											<li><a href="cal.jsp?code=beermugwithgoldring">beer mug- with gold ring</a></li>
                                                                                         <li><a href="cal.jsp?code=frosted">frosted</a></li>
										</ul>
                                    </li>

									<li class="has-children"><a href="">Pens</a>

                                    	<ul class="is-hidden">
											<li class="go-back"><a href="">Gift Items</a></li>
											<li class="see-all"><a href="">All Printing</a></li>
											<li><a href="cal.jsp?code=Pen">Pen</a></li>
											<li><a href="cal.jsp?code=Pens">Pens Design 2</a></li>

										</ul>
                                       </li>


									<li><a href="cal.jsp?code=KeyChains">Key Chains</a></li>

                                     <li class="has-children">
										<a href="#0">Note pads</a>
										<ul class="is-hidden">
											<li class="go-back"><a href="">Gift Items</a></li>
											<li class="see-all"><a href="">All Printing</a></li>
											<li><a href="begincat.jsp?code=NotePads">Normal back</a></li>
											<li><a href="begincat.jsp?code=NotePad">Hard Cover</a></li>

										</ul>
									<li class="has-children"><a href="#0">Goody bags</a>
                                    <ul class="is-hidden">
											<li class="go-back"><a href="">Gift Items</a></li>
											<li class="see-all"><a href="">All Printing</a></li>
											<li><a href="cal2.jsp?code=GoodyBage">Goody bag</a></li>
											<li><a href="cal2.jsp?code=GoodyBages">Goody bags Design 2</a></li>

										</ul>

                                    </li>
									<li class="has-children">
                                        <a href="#0">Mouse pad</a>
                                    <ul class="is-hidden">
											<li class="go-back"><a href="">Gift Items</a></li>
											<li class="see-all"><a href="">All Printing</a></li>
											<li><a href="cal.jsp?code=MOUSEpads">MOUSE pad</a></li>
											<li><a href="cal.jsp?code=MOUSEpad">MOUSE pad Design 2</a></li>

										</ul>

                                    </li>
								</ul>
							</li>

							<li class="has-children">
								<a href="">Gift Items</a>
								<ul class="is-hidden">
									<li class="go-back"><a href="#0">Online Printing</a></li>
									<li class="see-all"><a href="products.jsp">All Printing</a></li>
									<li><a href="begincat.jsp?code=Excercisebooks">Exercise Books</a></li>
									<li><a href="cal.jsp?code=PhoneCases">Phone Cases</a></li>
									<li  class="has-children">
                                        <a href="">Coasters</a>
                                            <ul class="is-hidden">
                                    <li class="go-back"><a href="#0">Gift Items</a></li>
											<li class="see-all"><a href="">All Printing</a></li>
											<li><a href="cal.jsp?code=Coasters">Coasters</a></li>
											<li><a href="cal.jsp?code=Coaster">Coaster Design 2</a></li>


                                            </ul>
                                    </li>

                                    <li><a href="cal2.jsp?code=Customisationof-T-shirts">Customisation of -T-shirts</a></li>
                                   <li><a href="cal2.jsp?code=ConferenceBag">Conference Bags</a></li>
                                   <li class="has-children">
										<a href="#0">Others</a>
										<ul class="is-hidden">
											<li class="go-back"><a href="#0">Gift Items</a></li>
											<li class="see-all"><a href="">All Printing</a></li>
											<li><a href="cal2.jsp?code=Schoolbag">School Bags</a></li>
											<li><a href="cal.jsp?code=WaterBottles">Water Bottles</a></li>
                                            <li><a href="cal.jsp?code=JERSEYS">JERSEYS</a></li>

										</ul>
									</li>
								</ul>
							</li>

                            <li class="has-children">
								<a href="">Printing</a>

								<ul class="is-hidden">
									<li class="go-back"><a href="#0">Online Printing</a></li>
									<li class="see-all"><a href="">All Printing</a></li>
									<li><a href="">Printing</a></li>

									<li class="has-children">
										<a href="#0">all Printing</a>

										<ul class="is-hidden">
											<li class="go-back"><a href="#0">Online Printing</a></li>
											<li class="see-all"><a href="products.jsp">All Printing</a></li>
											<li><a href="products.jsp">Printing</a></li>

										</ul>
									</li>

								</ul>
							</li>
						</ul> <!-- .cd-secondary-dropdown -->
					</li> <!-- .has-children -->

					<li class="has-children">
						<a href="">Photo Services</a>
						<ul class="cd-dropdown-icons is-hidden">
							<li class="go-back"><a href="#0">Menu</a></li>
							<li class="see-all"><a href="products.jsp">Browse Services</a></li>
							<li>
								<a class="cd-dropdown-item item-1" href="cal2.jsp?code=Photoprinting">
									<h3>Photo Printing</h3>
									<p>4x6,5x7,6x8, 8x10,8x12. etc</p>
								</a>
							</li>
							<li>
								<a class="cd-dropdown-item item-2" href="eventcoverage.jsp?code=Eventcoverages">
									<h3> Event Coverage
                                     </h3>
									<p>As specified... eg. 1Day </p>
								</a>
							</li>
                            <li>
								<a class="cd-dropdown-item item-3" href="cal.jsp?code=PasportPhotos">
									<h3>Passport Photos</h3>
									<p>4-in-one, 2-in-one, 8-in-one</p>
								</a>
							</li>
							<li>
								<a class="cd-dropdown-item item-4" href="cal2.jsp?code=Photoframes">
									<h3>Photo Frame</h3>
									<p>4x6,5x7,6x8,...,24x36. etc</p>
								</a>
							</li>
							<li>
								<a class="cd-dropdown-item item-5" href="cal2.jsp?code=Studioshotsmodelshots">
									<h3>Model Shot</h3>
									<p>1- HOUR, 2-HOUR, 3-HOUR. etc</p>
								</a>
							</li>

							<li>
								<a class="cd-dropdown-item item-6" href="photobook.jsp?code=Photobooks">
									<h3>Photo Books</h3>
									<p>Photo Books of various sizes 12x18</p>
								</a>
							</li>

							<li>
								<a class="cd-dropdown-item item-7" href="cal2.jsp?code=Homeservices">
									<h3>Home Service</h3>
									<p>Home service for 1-hour 2-hours etc..</p>
								</a>
							</li>

							<li>
								<a class="cd-dropdown-item item-8" href="cal2.jsp?code=Studioshotsmodelshots">
									<h3>Studio Shots </h3>
									<p>1- HOUR. etc</p>
								</a>
							</li>

						</ul> <!-- .cd-dropdown-icons -->
					</li> <!-- .has-children -->

					<li class="cd-divider"></li>
					<li><a href="uploadfile.jsp">Upload File</a></li>
					<li><a href="blog.jsp">Blog</a></li>
					<li><a href="products.jsp">All Printing </a></li>
				</ul> <!-- .cd-dropdown-content -->
			</nav> <!-- .cd-dropdown -->
           
		</div> <!-- .cd-dropdown-wrapper -->
        <!-- END NAVIGATION -->
            <p>
        <!-- E    </div>
ND NAVIGATION -->
 
       <!-- BEGIN TOP SEARCH -->
     
            <!-- END TOP SEARCH -->
            <div class="search-box" style=" padding-left: 750px; margin-top: -50px;">
                <form action="shop-search-result.jsp" method="post">
                  <div class="input-group">
                    <input type="text" placeholder="Search" class="form-control" style="width:300px;" name="lookfor">
                    <span class="input-group-btn" style=" padding-right: 190px;">
                      <button class="btn btn-primary" type="submit">Search</button>
                    </span>
                  </div>
                </form>
              </div> 
       <p></p>
      </div>
    </div>
    <!-- Header END -->

    <div class="main">
      <div class="container">
        <!-- BEGIN SIDEBAR & CONTENT -->
        <div class="row margin-bottom-40">
          <!-- BEGIN CONTENT -->
          <form id="form_sample_2" name="form1" method="post" action="" onsubmit="return validate(this);">
  
<table width="70%" border="0" align="center">
    <tr>
      <td colspan="2">DELIVERY ADDRESS</td>
      <td width="17%">&nbsp;</td>
      <td width="36%">&nbsp;</td>
    </tr>
    <tr>
      <td width="17%">First name:</td>
      <td width="30%"><label>
        <input type="text" name="firstname2" id="firstname2" />
      </label></td>
      <td>Address1:</td>
      <td><input type="text" name="address4" id="address3" /></td>
    </tr>
    <tr>
      <td>Lastname:</td>
      <td><input type="text" name="lastname2" id="lastname2" /></td>
      <td>Address2:</td>
      <td><label>
        <input type="text" name="address3" id="address4" />
      </label></td>
    </tr>
    <tr>
      <td>Email:</td>
      <td><input type="text" name="email2" id="email2" /></td>
      <td><p>Landmark</p></td>
      <td><label>
        <input type="text" name="city2" id="city2" />
      </label></td>
    </tr>
    <tr>
      <td>Telphone:</td>
      <td><input type="text" name="telphone2" id="telphone2" /></td>
      <td>Post Code:</td>
      <td><label>
        <input type="text" name="postcode2" id="postcode2" />
      </label></td>
    </tr>
    <tr>
      <td>State</td>
      <td><label>
        <select name="states2" id="states2">
          <option>...select one...</option>
          <option value="Lagos">Lagos</option>
        </select>
      </label></td>
      <td>Country:</td>
      <td><label>
        <select name="country2" id="country2">
          <option>...select one...</option>
          <option value="Nigeria">Nigeria</option>
        </select>
      </label></td>
    </tr>
    <% if(request.getParameter("passworddb") !=null){%>
    <%}else{%>
    <tr>
      <td>Password</td>
      <td><input type="password" name="password" id="password"></td>
      <td>Re-enter Password</td>
      <td><input type="password" name="password2" id="password2"></td>
    </tr>
    <%}%>
    
    <tr>
      <td></td>
      <td> 
                   </td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td colspan="2"><input type="checkbox" name="checkbox" id="checkbox" />
My billing delivery address are de-same</td>
      <td colspan="2"><label>
        <input type="checkbox" name="checkbox3" id="checkbox3" />
      </label>
      I have read and agree to the Privacy Policy</td>
    </tr>
    <tr>
      <td colspan="2">Payment Option<br/>
      <td>&nbsp;</td>
      <td>Payment Method</td>
    </tr>
    <tr>
      <td><select name="paymentmethod" id="paymentmethod">
        
          <option value="Pay On Delivery">Pay On Delivery</option>
        </select></td>
      <td>&nbsp;</td>
      <td></td>
      <td><select name="deliverymethod" id="deliverymethod">
        <option value="Free Shipping">Free Shipping</option>
        <option value="Pay On Delivery">Pay On Delivery</option>
      </select></td>
    </tr>
     <tr>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
  </table>

          <div class="col-md-12 col-sm-12">
            <h1>Shopping cart</h1>
            <div class="goods-page">
              <div class="goods-data clearfix">
                <div class="table-wrapper-responsive">
                <table summary="Shopping cart">
                  <tr>
                    <th class="goods-page-image">Image</th>
                    <th class="goods-page-description">Description</th>
                    <th class="goods-page-ref-no">Ref No</th>
                    <th class="goods-page-quantity">Quantity</th>
                    <th class="goods-page-price">Unit price</th>
                    <th class="goods-page-total" colspan="2">Total</th>
                  </tr>
                  <tr>
                    <td class="goods-page-image">
                      <a href="#"><img src="displayPicture?code=<%=ag%>" alt="no-image"></a>
                    </td>
                    <td class="goods-page-description">
                        <h3><a href="#"><%=inl.viewSingleSubcategory(ag).getSubcategory()%></a></h3>
                        <p><strong>Item 1</strong> - Properties: ; Size: <%=size%></p>
                      <em></em>
                    </td>
                    <td class="goods-page-ref-no">
                      <%=ag%>
                    </td>
                    <td class="goods-page-quantity">
                      <div class="">
                          <input id="" type="text" value="<%=session.getAttribute("Quantity").toString()%>" readonly class="form-control">
                      </div>
                    </td>
                    <td class="goods-page-price">
                      <strong> <span> N</span> <%=price%>  </strong>
                    </td>
                    <td class="goods-page-total">
                      <strong><span>N</span> <%=price%> </strong>
                    </td>
                    <td class="del-goods-col">
                      <a class="del-goods" href="#">&nbsp;</a>
                    </td>
                  </tr>

                </table>
                </div>

                <div class="shopping-total">
                  <ul>
                    <li>
                      <em>Sub total</em>
                      <strong class="price"><span>N</span><%=price%></strong>
                    </li>
                    <li>
                      <em>Shipping cost</em>
                      <strong class="price"><span>N</span>0.00</strong>
                    </li>
                      <li>
                      <em>VAT (5%)</em>
                      <strong class="price"><span>N</span><%=(new Integer(price).intValue() * 5/100)%></strong>
                    </li>
                    <li class="shopping-total-price">
                      <em>Total</em>
                      <strong class="price"><span>N</span> <%=(new Integer(price).intValue() * 5/100) + new Integer(price).intValue()%> </strong>
                    </li>
                  </ul>
                </div>
              </div>

              <button class="btn btn-default" type="submit" >Continue shopping <i class="fa fa-shopping-cart"></i></button>
              <button class="btn btn-primary" type="submit" name="checkoutb">Checkout <i class="fa fa-check"></i></button>
            </div>
          </div>
          </form>
          <!-- END CONTENT -->
        </div>

        <!-- END SIDEBAR & CONTENT -->

        <!-- BEGIN SIMILAR PRODUCTS -->
         <div class="row margin-bottom-40">
          <div class="col-md-12 col-sm-12">
            <h2>Most popular products</h2>
            <div class="owl-carousel owl-carousel4">
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="pages/img/works/letterhead2.jpg" class="img-responsive" alt="Letter Head">
                    <div>
                      <a href="pages/img/works/letterhead2.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Letter Head</a></h3>
                  <div class="pi-price">N30000.00</div>
                  <a href="#" class="btn btn-default add2cart">Add to cart</a>
                  <div class="sticker sticker-new"></div>
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="pages/img/works/Notepad_printocloud-1.jpg" class="img-responsive" alt="Notepad printocloud">
                    <div>
                      <a href="pages/img/works/Notepad_printocloud-1.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Notepad printocloud </a></h3>
                  <div class="pi-price">N30000.00</div>
                  <a href="#" class="btn btn-default add2cart">Add to cart</a>
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="pages/img/works/Flyer2.jpg" class="img-responsive" alt="Flayer">
                    <div>
                      <a href="pages/img/works/Flyer2.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Flyer </a></h3>
                  <div class="pi-price">N30000.00</div>
                  <a href="#" class="btn btn-default add2cart">Add to cart</a>
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="pages/img/works/cal-card.jpg" class="img-responsive" alt="Cards">
                    <div>
                      <a href="pages/img/works/cal-card.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Cards</a></h3>
                  <div class="pi-price">N30000.00</div>
                  <a href="#" class="btn btn-default add2cart">Add to cart</a>
                  <div class="sticker sticker-sale"></div>
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="pages/img/works/cal-card.jpg" class="img-responsive" alt="Cards">
                    <div>
                      <a href="pages/img/works/cal-card.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Cards</a></h3>
                  <div class="pi-price">N30000.00</div>
                  <a href="#" class="btn btn-default add2cart">Add to cart</a>
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="pages/img/works/cal-card.jpg" class="img-responsive" alt="Cards">
                    <div>
                      <a href="pages/img/works/cal-card.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Cards</a></h3>
                  <div class="pi-price">N30000.00</div>
                  <a href="#" class="btn btn-default add2cart">Add to cart</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- END SIMILAR PRODUCTS -->
      </div>
    </div>

    <!-- BEGIN STEPS -->

    <!-- END STEPS -->

    <!-- BEGIN PRE-FOOTER -->
    <div class="pre-footer">
      <div class="container">
        <div class="row">
          <!-- BEGIN BOTTOM ABOUT BLOCK -->
               <div class="col-md-3 col-sm-6 pre-footer-col">
            <h2>About us</h2>
                  <% try{
    //ArrayList list = new ArrayList();

    Iterator i = inl.viewAllCardSolt().iterator();
    while(i.hasNext()){
        Cardslotbean hcs = (Cardslotbean) i.next();
      // cuh = inl.viewAllContacts();
    %>
            <%=hcs.getCardslotname()%><br>


<%
    }
}catch(Exception ex){
System.out.println();
}    %>
          </div>
          <!-- END BOTTOM ABOUT BLOCK -->
 <div class="col-md-3 col-sm-6 pre-footer-col">
            <h2>Links</h2>
            <ul class="list-unstyled">
              <li><i class="fa fa-angle-right"></i> <a href="index.jsp">Home</a></li>
              <li><i class="fa fa-angle-right"></i> <a href="aboutUs.jsp">About Us</a></li>
              <li><i class="fa fa-angle-right"></i> <a href="trackorder.jsp">Order Tracking</a></li>
              <li><i class="fa fa-angle-right"></i> <a href="contactus.jsp">Contact Us</a></li>
               <li><i class="fa fa-angle-right"></i> <a href="paymentmethod.jsp">Payment Methods</a></li>
            </ul>
          </div>
          <!-- BEGIN BOTTOM CONTACTS -->
         <% try{
    //ArrayList list = new ArrayList();

    Iterator i = inl.viewAllHerms().iterator();
    while(i.hasNext()){
        Hermsbean hr = (Hermsbean) i.next();
      // cuh = inl.viewAllContacts();
    %>
          <!-- BEGIN TWITTER BLOCK -->
        <div class="col-md-3 col-sm-6 pre-footer-col">
            <h2>Our Contacts</h2>
            <address class="margin-bottom-40">
              <%=hr.getHermsname()%><br>
              <%=hr.getStatus()%> <br>
              <%=hr.getPrice()%>, <%=hr.getOfficeaddress()%><br>
              Phone: <%=hr.getProductcode()%><br>

              Email: <a href="mailto:info@inspirationalimagesltd.com"><%=hr.getEmail()%></a><br>
              Facebook: <a href="www.facebook.com/Inspirational-Images-ltd-1605269793122842/"> Join Us</a>

            </address>
          </div>

          <!-- END BOTTOM CONTACTS -->
            <%
              }
              }catch(Exception ex){
              System.out.println(ex.getMessage());
             } %>
          <!-- END BOTTOM CONTACTS -->

          <!-- BEGIN TWITTER BLOCK -->
           
          <!-- END TWITTER BLOCK -->
        </div>
      </div>
    </div>
        <hr>
        <div class="row">
          <!-- BEGIN SOCIAL ICONS -->
          <div class="col-md-6 col-sm-6">
            <ul class="social-icons">
              <li><a class="rss" data-original-title="rss" href="#"></a></li>
              <li><a class="facebook" data-original-title="facebook" href="#"></a></li>
              <li><a class="twitter" data-original-title="twitter" href="#"></a></li>
              <li><a class="googleplus" data-original-title="googleplus" href="#"></a></li>
              <li><a class="linkedin" data-original-title="linkedin" href="#"></a></li>
              <li><a class="youtube" data-original-title="youtube" href="#"></a></li>
              <li><a class="vimeo" data-original-title="vimeo" href="#"></a></li>
              <li><a class="skype" data-original-title="skype" href="#"></a></li>
            </ul>
          </div>
          <!-- END SOCIAL ICONS -->
          <!-- BEGIN NEWLETTER -->
          <div class="col-md-6 col-sm-6">
            <div class="pre-footer-subscribe-box pull-right">
              <h2>Newsletter</h2>
              <form action="#">
                <div class="input-group">
                  <input type="text" placeholder="youremail@mail.com" class="form-control">
                  <span class="input-group-btn">
                    <button class="btn btn-primary" type="submit">Subscribe</button>
                  </span>
                </div>
              </form>
            </div>
          </div>
          <!-- END NEWLETTER -->
        </div>
      </div>
    </div>
    <!-- END PRE-FOOTER -->

    <!-- BEGIN FOOTER -->
    <div class="footer">
      <div class="container">
        <div class="row">
          <!-- BEGIN COPYRIGHT -->
          <div class="col-md-6 col-sm-6 padding-top-10">
         <%=session.getAttribute("codee").toString()%>&copy; Inspirational Images. ALL Rights Reserved. <a href="#">Privacy Policy</a> | <a href="#">Terms of Service</a>
            </div>
          <!-- END COPYRIGHT -->
          <!-- BEGIN PAYMENTS -->
          <div class="col-md-6 col-sm-6">
            <ul class="list-unstyled list-inline pull-right">
              <li><img src="layout/img/payments/western-union.jpg" alt="We accept Western Union" title="We accept Western Union"></li>
              <li><img src="layout/img/payments/american-express.jpg" alt="We accept American Express" title="We accept American Express"></li>
              <li><img src="layout/img/payments/MasterCard.jpg" alt="We accept MasterCard" title="We accept MasterCard"></li>
              <li><img src="layout/img/payments/PayPal.jpg" alt="We accept PayPal" title="We accept PayPal"></li>
              <li><img src="layout/img/payments/visa.jpg" alt="We accept Visa" title="We accept Visa"></li>
            </ul>
          </div>
          <!-- END PAYMENTS -->
        </div>
      </div>
    </div>
    <!-- END FOOTER -->

    <!-- BEGIN fast view of a product -->
    <div id="product-pop-up" style="display: none; width: 700px;">
            <div class="product-page product-pop-up">
              <div class="row">
                <div class="col-md-6 col-sm-6 col-xs-3">
                  <div class="product-main-image">
                    <img src="pages/img/works/cal-card.jpg" alt="Cards" class="img-responsive">
                  </div>
                  <div class="product-other-images">
                    <a href="#" class="active"><img alt="Berry Lace Dress" src="pages/img/products/model3.jpg"></a>
                    <a href="#"><img alt="cards" src="pages/img/works/cal-card.jpg"></a>
                    <a href="#"><img alt="Cards" src="pages/img/works/cal-card.jpg"></a>
                  </div>
                </div>
                <div class="col-md-6 col-sm-6 col-xs-9">
                  <h1>Cards</h1>
                  <div class="price-availability-block clearfix">
                    <div class="price">
                      <strong><span>N</span>47.00</strong>
                      <em>N<span>62.00</span></em>
                    </div>
                    <div class="availability">
                      Availability: <strong>In Stock</strong>
                    </div>
                  </div>
                  <div class="description">
                    <p>Details</p>
                  </div>
                  <div class="product-page-options">
                    <div class="pull-left">
                      <label class="control-label">Size:</label>
                      <select class="form-control input-sm">
                        <option>A4</option>
                        <option>A5</option>
                        <option>A3</option>
                      </select>
                    </div>

                  </div>
                  <div class="product-page-cart">
                    <div class="product-quantity">
                        <input id="product-quantity3" type="text" value="1" readonly class="form-control input-sm">
                    </div>
                    <button class="btn btn-primary" type="submit">Add to cart</button>
                    <a href="shop-item.html" class="btn btn-default">More details</a>
                  </div>
                </div>

                <div class="sticker sticker-sale"></div>
              </div>
            </div>
    </div>
    <!-- END fast view of a product -->

    <!-- Load javascripts at bottom, this will reduce page load time -->
    <!-- BEGIN CORE PLUGINS (REQUIRED FOR ALL PAGES) -->
    <!--[if lt IE 9]>
    <script src="../../assets/global/plugins/respond.min.js"></script>
    <![endif]-->
  <script src="plugins/jquery-1.11.0.min.js" type="text/javascript"></script>
    <script src="plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
    <script src="plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
     <script src="plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
    <!-- END CORE PLUGINS -->

    <!-- BEGIN PAGE LEVEL JAVASCRIPTS (REQUIRED ONLY FOR CURRENT PAGE) -->
    <script src="plugins/fancybox/source/jquery.fancybox.pack.js" type="text/javascript"></script><!-- pop up -->
    <script src="plugins/carousel-owl-carousel/owl-carousel/owl.carousel.min.js" type="text/javascript"></script><!-- slider for products -->
    <script src='plugins/zoom/jquery.zoom.min.js' type="text/javascript"></script><!-- product zoom -->
    <script src="plugins/bootstrap-touchspin/bootstrap.touchspin.js" type="text/javascript"></script><!-- Quantity -->
    <script src="plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
    <script src="plugins/rateit/src/jquery.rateit.js" type="text/javascript"></script>
    <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js" type="text/javascript"></script><!-- for slider-range -->
<script src="admin/pages/scripts/form-validation.js"></script>
    <script src="layout/scripts/layout.js" type="text/javascript"></script>

   
   <script src="mega-dropdown/js/jquery-2.1.1.js"></script>
<script src="mega-dropdown/js/jquery.menu-aim.js"></script> <!-- menu aim -->
<script src="mega-dropdown/js/main.js"></script> <!-- Resource jQuery -->
    <script type="text/javascript">
        jQuery(document).ready(function() {
            Layout.init();
            Layout.initOWL();
            Layout.initTwitter();
            Layout.initImageZoom();
            Layout.initTouchspin();
            Layout.initUniform();
            Layout.initSliderRange();
             FormValidation.init();
        });
    </script>
    <!-- END PAGE LEVEL JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>
<%
       
}catch(Exception ex){
       out.println();
       }
%>