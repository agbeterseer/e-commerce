<%-- 
    Document   : shop-checkout2
    Created on : Dec 28, 2015, 2:42:10 PM
    Author     : JPT TERSOO AGBE
--%>
 <%@include file="lookupa.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Checkout | Inspirational Images</title>
          <script type="text/ecmascript" language="javascript" src="js/validation.js"></script>
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

 <!-- Fonts START -->
  <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700|PT+Sans+Narrow|Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all" rel="stylesheet" type="text/css">
  <!-- Fonts END -->

  <!-- Global styles START -->
  <link href="plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Global styles END -->

  <!-- Page level plugin styles START -->
  <link href="plugins/fancybox/source/jquery.fancybox.css" rel="stylesheet">
  <link href="plugins/carousel-owl-carousel/owl-carousel/owl.carousel.css" rel="stylesheet">
  <link href="plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css">
  <!-- Page level plugin styles END -->

  <!-- Theme styles START -->
  <link href="css/components.css" rel="stylesheet">
  <link href="layout/css/style.css" rel="stylesheet">
  <link href="pages/css/style-shop.css" rel="stylesheet" type="text/css">
  <link href="layout/css/style-responsive.css" rel="stylesheet">
  <link href="layout/css/themes/red.css" rel="stylesheet" id="style-color">
  <link href="layout/css/custom.css" rel="stylesheet">
  <!-- Theme styles END -->
</head>
<!-- Head END -->

<!-- Body BEGIN -->
<body class="ecommerce">
    <!-- BEGIN STYLE CUSTOMIZER -->

    <!-- END BEGIN STYLE CUSTOMIZER -->

    <!-- BEGIN TOP BAR -->
    <div class="pre-header">
        <div class="container">
            <div class="row">
                <!-- BEGIN TOP BAR LEFT PART -->
                 <!-- BEGIN TOP BAR LEFT PART -->
               <div class="col-md-6 col-sm-6 additional-shop-info">
                    <ul class="list-unstyled list-inline">
                      <li><i class="fa fa-phone"></i><span>+234 456 6717</span></li>
                        <li><i class="fa fa-envelope-o"></i><span></span></li>
                    </ul>
                </div>
                <div class="col-md-6 col-sm-6 additional-nav">
                    <ul class="list-unstyled list-inline pull-right">
                        <li><a href="">Home</a></li>
                        <li><a href="">About Us</a></li>
                        <li><a href="">Contact Us</a></li>
                   </ul>
                </div>
                 <img src="getBannerIndex.jsp" alt="Inspiration">
                <!-- END TOP BAR LEFT PART -->
                <!-- BEGIN TOP BAR MENU -->
                
                <!-- END TOP BAR MENU -->
            </div>
        </div>
    </div>
    <!-- END TOP BAR -->
    <%

     String ag = "";
 String codee = "";
   // String code = request.getParameter("code");
    //String codee = request.getParameter("codee");
    try{



         String Quantity = session.getAttribute("Quantity").toString();
         String size = session.getAttribute("size").toString();
         String pages = session.getAttribute("pages").toString();
         String papertype = session.getAttribute("papertype").toString();
         String binding = session.getAttribute("binding").toString();
         String bindingplacement = session.getAttribute("bindingplacement").toString();
         String coverpaper =  session.getAttribute("coverpaper").toString();
         String printturnaround = session.getAttribute("printturnaround").toString();
             ag = session.getAttribute("ag").toString();
              codee = session.getAttribute("codee").toString();
            

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
                                                                         <li><a href="catalogue.jsp?code=Catalogue">Catalogue</a></li>
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
      </div>
    </div>
    <!-- Header END -->
  
    <div class="main">
      <div class="container">
        <ul class="breadcrumb">
            <li><a href="index.html">Home</a></li>
            <li><a href="">Store</a></li>
            <li class="active">Checkout</li>
        </ul>
        <!-- BEGIN SIDEBAR & CONTENT -->
        <div class="row margin-bottom-40">
          <!-- BEGIN CONTENT -->
          <div class="col-md-12 col-sm-12">
            <h1>Checkout</h1>
            <!-- BEGIN CHECKOUT PAGE -->
            <div class="panel-group checkout-page accordion scrollable" id="checkout-page">

              <!-- BEGIN CHECKOUT -->
              
              <!-- END CHECKOUT -->

                 <%


 String price = "";
   String paymentcomment = request.getParameter("paymentcomment");
   String shiipingcomment = request.getParameter("shiipingcomment");
   String deliverymethod = request.getParameter("FlatShippingRate");
   String paymentmethod = request.getParameter("CashOnDelivery");
    try{


             ag = session.getAttribute("ag").toString();
              price = session.getAttribute("price").toString();





    String firstname = request.getParameter("firstname");
    String lastname = request.getParameter("lastname");
    String email = request.getParameter("email");
    String telephone = request.getParameter("telephone");
    String fax = request.getParameter("fax");
    String company = request.getParameter("company");
    String address1 = request.getParameter("address1");
    String address2 = request.getParameter("address2");
    String city = request.getParameter("city");
    String postcode = request.getParameter("post-code");
    String Country = request.getParameter("Country");
    String regionstate = request.getParameter("region-state");


    String firstnamed = request.getParameter("firstnamed");
    String lastnamed = request.getParameter("lastnamed");
    String emaild = request.getParameter("emaild");
    String telephoned = request.getParameter("telephoned");
     String faxd = request.getParameter("faxd");
    String companyd = request.getParameter("companyd");
    String address1d = request.getParameter("address1d");
    String address2d = request.getParameter("address2d");
    String cityd = request.getParameter("cityd");
    String postcoded = request.getParameter("post-coded");
    String Countryd = request.getParameter("Countryd");
    String regionstated = request.getParameter("region-stated");
    String username = "";
    String password = request.getParameter("password");
   if (request.getParameter("fina") !=null) {

    inl.AddUser(email,password,"user","");

    inl.addBilling(email,firstname,lastname,email,telephone,company,fax,address1,address2,city,postcode,Country,regionstate, "", null, null,"");
  //  inl.addBilling(email, firstname, lastname, email,  telephone, fax, company, address1, address2, city, postcode, Country, regionstate, ag, null, new Integer(totalva).toString(), "");
  
    inl.addDeliveryAddress(email,firstnamed,lastnamed,emaild,telephoned,companyd,faxd,address1d,address2d,cityd,postcoded,Countryd,regionstated,deliverymethod,paymentmethod,shiipingcomment,paymentcomment,"");
    
   // inl.addDeliveryAddress(email,firstnamed,lastnamed,emaild,telephoned,faxd,companyd,address1d,address2d,cityd,postcoded,Countryd,regionstated,deliverymethod,paymentmethod,shiipingcomment,paymentcomment,"");
   

//String username, String firstname, String lastname, String email, String telephone, String fax, String company, String address1, String address2, String city, String postcode, String country, String region,
    //String deliverymethod, String paymentmethod, String deliverycomment, String paymentcomment
            // ush String username, String firstname, String lastname, String email, String telephone, String fax, String company, String address1, String address2, String city, String postcode, String country, String region


}


                                %>
              <!-- BEGIN PAYMENT ADDRESS -->
              <div id="payment-address" class="panel panel-default">
                <div class="panel-heading">
                  <h2 class="panel-title">
                    <a data-toggle="collapse" data-parent="#checkout-page" href="#payment-address-content" class="accordion-toggle">
                      Step 2: Account &amp; Billing Details
                    </a>
                  </h2>
                </div>
                <div id="payment-address-content" class="panel-collapse collapse">
                  <div class="panel-body row">
                    <div class="col-md-6 col-sm-6">
                      <h3>Your Personal Details</h3>
                      <div class="form-group">
                        <label for="firstname">First Name <span class="require">*</span></label>
                        <input type="text" id="firstname"  name="firstname" class="form-control" value="<%=(request.getParameter("firstname") != null) ? request.getParameter("firstname") : firstname%>">
                      </div>
                      <div class="form-group">
                        <label for="lastname">Last Name <span class="require">*</span></label>
                        <input type="text" id="lastname" name="lastname" class="form-control" value="<%=(request.getParameter("lastname") != null) ? request.getParameter("lastname") : lastname%>">
                      </div>
                      <div class="form-group">
                        <label for="email">E-Mail <span class="require">*</span></label>
                        <input type="text" id="email"  name="email" class="form-control" value="<%=(request.getParameter("email") != null) ? request.getParameter("email") : email%>">
                      </div>
                      <div class="form-group">
                        <label for="telephone">Telephone <span class="require">*</span></label>
                        <input type="text" id="telephone" name="telephone" class="form-control" value="<%=(request.getParameter("telephone") != null) ? request.getParameter("telephone") : telephone%>">
                      </div>
                      <div class="form-group">
                        <label for="fax">Fax</label>
                        <input type="text" id="fax" name="fax" class="form-control" value="<%=(request.getParameter("fax") != null) ? request.getParameter("fax") : fax%>">
                      </div>

                      <h3>Your Password</h3>
                      <div class="form-group">
                        <label for="password">Password <span class="require">*</span></label>
                        <input type="password" id="password" name="password" class="form-control">
                      </div>
                      <div class="form-group">
                        <label for="password-confirm">Password Confirm <span class="require">*</span></label>
                        <input type="text" id="password-confirm" name="password-confirm" class="form-control">
                      </div>
                    </div>
                    <div class="col-md-6 col-sm-6">
                      <h3>Your Address</h3>
                      <div class="form-group">
                        <label for="company">Company</label>
                        <input type="text" id="company" name="company" class="form-control" value="<%=(request.getParameter("company") != null) ? request.getParameter("company") : company%>">
                      </div>
                      <div class="form-group">
                        <label for="address1">Address 1</label>
                        <input type="text" id="address1" name="address1" class="form-control" value="<%=(request.getParameter("address1") != null) ? request.getParameter("address1") : address1%>">
                      </div>
                      <div class="form-group">
                        <label for="address2">Address 2</label>
                        <input type="text" id="address2"  name="address2"class="form-control" value="<%=(request.getParameter("address2") != null) ? request.getParameter("address2") : address2%>">
                      </div>
                      <div class="form-group">
                        <label for="city">City <span class="require">*</span></label>
                        <input type="text" id="city"  name="city"class="form-control" value="<%=(request.getParameter("city") != null) ? request.getParameter("city") : city%>">
                      </div>
                      <div class="form-group">
                        <label for="post-code">Post Code <span class="require">*</span></label>
                        <input type="text" id="post-code" name="post-code" class="form-control" value="<%=(request.getParameter("post-code") != null) ? request.getParameter("post-code") : postcode%>">
                      </div>
                      <div class="form-group">
                        <label for="country">Country <span class="require">*</span></label>
                        <select class="form-control input-sm" id="country" name="Country">
                          <option value=""> --- Please Select --- </option>
                          <option value="244">Aaland Islands</option>
                          <option value="1">Afghanistan</option>
                          <option value="2">Albania</option>
                        </select>
                      </div>
                      <div class="form-group">
                        <label for="region-state">Region/State <span class="require">*</span></label>
                        <select class="form-control input-sm" id="region-state" name="region-state">
                          <option value=""> --- Please Select --- </option>
                          <option value="3513">Aberdeen</option>
                          <option value="3514">Aberdeenshire</option>
                          <option value="3515">Anglesey</option>
                        </select>
                      </div>
                    </div>
                    <hr>
                    <div class="col-md-12">
                      <div class="checkbox">
                        <label>
                          <input type="checkbox"> I wish to subscribe to the OXY newsletter.
                        </label>
                      </div>
                      <div class="checkbox">
                        <label>
                          <input type="checkbox" checked="checked"> My delivery and billing addresses are the same.
                        </label>
                      </div>
                      <button class="btn btn-primary  pull-right" type="submit" data-toggle="collapse" data-parent="#checkout-page" data-target="#shipping-address-content" id="button-payment-address">Continue</button>
                      <div class="checkbox pull-right">
                        <label>
                          <input type="checkbox"> I have read and agree to the <a title="Privacy Policy" href="#">Privacy Policy</a> &nbsp;&nbsp;&nbsp;
                        </label>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
               <!-- BEGIN SHIPPING ADDRESS -->
              <div id="shipping-address" class="panel panel-default">
                <div class="panel-heading">
                  <h2 class="panel-title">
                    <a data-toggle="collapse" data-parent="#checkout-page" href="#shipping-address-content" class="accordion-toggle">
                      Step 3: Delivery Details
                    </a>
                  </h2>
                </div>
                <div id="shipping-address-content" class="panel-collapse collapse">
                  <div class="panel-body row">
                    <div class="col-md-6 col-sm-6">
                      <div class="form-group">
                        <label for="firstname-dd">First Name <span class="require">*</span></label>
                        <input type="text" id="firstname-dd" class="form-control" name="firstnamed" value="<%=(request.getParameter("firstnamed") != null) ? request.getParameter("firstnamed") : firstnamed%>">
                      </div>
                      <div class="form-group">
                        <label for="lastname-dd">Last Name <span class="require">*</span></label>
                        <input type="text" id="lastname-dd" class="form-control" name="lastnamed" value="<%=(request.getParameter("lastnamed") != null) ? request.getParameter("lastnamed") : lastnamed%>">
                      </div>
                      <div class="form-group">
                        <label for="email-dd">E-Mail <span class="require">*</span></label>
                        <input type="text" id="email-dd" class="form-control" name="emaild" value="<%=(request.getParameter("emaild") != null) ? request.getParameter("emaild") : emaild%>">
                      </div>
                      <div class="form-group">
                        <label for="telephone-dd">Telephone <span class="require">*</span></label>
                        <input type="text" id="telephone-dd" class="form-control" name="telephoned" value="<%=(request.getParameter("telephoned") != null) ? request.getParameter("telephoned") : telephoned%>">
                      </div>
                      <div class="form-group">
                        <label for="fax-dd">Fax</label>
                        <input type="text" id="fax-dd" class="form-control" name="faxd" value="<%=(request.getParameter("faxd") != null) ? request.getParameter("faxd") : faxd%>" >
                      </div>
                      <div class="form-group">
                        <label for="company-dd">Company</label>
                        <input type="text" id="company-dd" class="form-control" name="companyd" value="<%=(request.getParameter("companyd") != null) ? request.getParameter("companyd") : company%>" >
                      </div>
                    </div>
                    <div class="col-md-6 col-sm-6">
                      <div class="form-group">
                        <label for="address1-dd">Address 1</label>
                        <input type="text" id="address1-dd" class="form-control" name="address1d" value="<%=(request.getParameter("address1") != null) ? request.getParameter("address1d") : address1d%>" >
                      </div>
                      <div class="form-group">
                        <label for="address2-dd">Address 2</label>
                        <input type="text" id="address2-dd" class="form-control" name="address2d" value="<%=(request.getParameter("address2d") != null) ? request.getParameter("address2d") : address2d%>">
                      </div>
                      <div class="form-group">
                        <label for="city-dd">City <span class="require">*</span></label>
                        <input type="text" id="city-dd" class="form-control" value="<%=(request.getParameter("cityd") != null) ? request.getParameter("cityd") : cityd%>">
                      </div>
                      <div class="form-group">
                        <label for="post-code-dd">Post Code <span class="require">*</span></label>
                        <input type="text" id="post-code-dd" class="form-control" value="<%=(request.getParameter("post-coded") != null) ? request.getParameter("post-coded") : postcoded%>">
                      </div>
                      <div class="form-group">
                        <label for="country-dd">Country <span class="require">*</span></label>

			<select name="countryd" id="select2_sample4" class="select2 form-control input-sm">
				<option value=""></option>
				<option value="AF">Afghanistan</option>
				<option value="AL">Albania</option>
				<option value="DZ">Algeria</option>
				<option value="AS">American Samoa</option>
				<option value="AD">Andorra</option>
				<option value="AO">Angola</option>
				<option value="AI">Anguilla</option>
				<option value="AQ">Antarctica</option>
				<option value="AR">Argentina</option>
				<option value="AM">Armenia</option>
				<option value="AW">Aruba</option>
				<option value="AU">Australia</option>
				<option value="AT">Austria</option>
				<option value="AZ">Azerbaijan</option>
				<option value="BS">Bahamas</option>
				<option value="BH">Bahrain</option>
				<option value="BD">Bangladesh</option>
				<option value="BB">Barbados</option>
				<option value="BY">Belarus</option>
				<option value="BE">Belgium</option>
				<option value="BZ">Belize</option>
				<option value="BJ">Benin</option>
				<option value="BM">Bermuda</option>
				<option value="BT">Bhutan</option>
				<option value="BO">Bolivia</option>
				<option value="BA">Bosnia and Herzegowina</option>
				<option value="BW">Botswana</option>
				<option value="BV">Bouvet Island</option>
				<option value="BR">Brazil</option>
				<option value="IO">British Indian Ocean Territory</option>
				<option value="BN">Brunei Darussalam</option>
				<option value="BG">Bulgaria</option>
				<option value="BF">Burkina Faso</option>
				<option value="BI">Burundi</option>
				<option value="KH">Cambodia</option>
				<option value="CM">Cameroon</option>
				<option value="CA">Canada</option>
				<option value="CV">Cape Verde</option>
				<option value="KY">Cayman Islands</option>
				<option value="CF">Central African Republic</option>
				<option value="TD">Chad</option>
				<option value="CL">Chile</option>
				<option value="CN">China</option>
				<option value="CX">Christmas Island</option>
				<option value="CC">Cocos (Keeling) Islands</option>
				<option value="CO">Colombia</option>
				<option value="KM">Comoros</option>
				<option value="CG">Congo</option>
				<option value="CD">Congo, the Democratic Republic of the</option>
				<option value="CK">Cook Islands</option>
				<option value="CR">Costa Rica</option>
				<option value="CI">Cote d'Ivoire</option>
				<option value="HR">Croatia (Hrvatska)</option>
				<option value="CU">Cuba</option>
				<option value="CY">Cyprus</option>
				<option value="CZ">Czech Republic</option>
				<option value="DK">Denmark</option>
				<option value="DJ">Djibouti</option>
				<option value="DM">Dominica</option>
				<option value="DO">Dominican Republic</option>
				<option value="EC">Ecuador</option>
				<option value="EG">Egypt</option>
				<option value="SV">El Salvador</option>
				<option value="GQ">Equatorial Guinea</option>
				<option value="ER">Eritrea</option>
				<option value="EE">Estonia</option>
				<option value="ET">Ethiopia</option>
				<option value="FK">Falkland Islands (Malvinas)</option>
				<option value="FO">Faroe Islands</option>
				<option value="FJ">Fiji</option>
				<option value="FI">Finland</option>
				<option value="FR">France</option>
				<option value="GF">French Guiana</option>
				<option value="PF">French Polynesia</option>
				<option value="TF">French Southern Territories</option>
				<option value="GA">Gabon</option>
				<option value="GM">Gambia</option>
				<option value="GE">Georgia</option>
				<option value="DE">Germany</option>
				<option value="GH">Ghana</option>
				<option value="GI">Gibraltar</option>
				<option value="GR">Greece</option>
				<option value="GL">Greenland</option>
				<option value="GD">Grenada</option>
				<option value="GP">Guadeloupe</option>
				<option value="GU">Guam</option>
				<option value="GT">Guatemala</option>
				<option value="GN">Guinea</option>
				<option value="GW">Guinea-Bissau</option>
				<option value="GY">Guyana</option>
				<option value="HT">Haiti</option>
				<option value="HM">Heard and Mc Donald Islands</option>
				<option value="VA">Holy See (Vatican City State)</option>
				<option value="HN">Honduras</option>
				<option value="HK">Hong Kong</option>
				<option value="HU">Hungary</option>
				<option value="IS">Iceland</option>
				<option value="IN">India</option>
				<option value="ID">Indonesia</option>
				<option value="IR">Iran (Islamic Republic of)</option>
				<option value="IQ">Iraq</option>
				<option value="IE">Ireland</option>
				<option value="IL">Israel</option>
				<option value="IT">Italy</option>
				<option value="JM">Jamaica</option>
				<option value="JP">Japan</option>
				<option value="JO">Jordan</option>
				<option value="KZ">Kazakhstan</option>
				<option value="KE">Kenya</option>
				<option value="KI">Kiribati</option>
				<option value="KP">Korea, Democratic People's Republic of</option>
				<option value="KR">Korea, Republic of</option>
				<option value="KW">Kuwait</option>
				<option value="KG">Kyrgyzstan</option>
				<option value="LA">Lao People's Democratic Republic</option>
				<option value="LV">Latvia</option>
				<option value="LB">Lebanon</option>
				<option value="LS">Lesotho</option>
				<option value="LR">Liberia</option>
				<option value="LY">Libyan Arab Jamahiriya</option>
				<option value="LI">Liechtenstein</option>
				<option value="LT">Lithuania</option>
				<option value="LU">Luxembourg</option>
				<option value="MO">Macau</option>
				<option value="MK">Macedonia, The Former Yugoslav Republic of</option>
				<option value="MG">Madagascar</option>
				<option value="MW">Malawi</option>
				<option value="MY">Malaysia</option>
				<option value="MV">Maldives</option>
				<option value="ML">Mali</option>
				<option value="MT">Malta</option>
				<option value="MH">Marshall Islands</option>
				<option value="MQ">Martinique</option>
				<option value="MR">Mauritania</option>
				<option value="MU">Mauritius</option>
				<option value="YT">Mayotte</option>
				<option value="MX">Mexico</option>
				<option value="FM">Micronesia, Federated States of</option>
				<option value="MD">Moldova, Republic of</option>
				<option value="MC">Monaco</option>
				<option value="MN">Mongolia</option>
				<option value="MS">Montserrat</option>
				<option value="MA">Morocco</option>
				<option value="MZ">Mozambique</option>
				<option value="MM">Myanmar</option>
				<option value="NA">Namibia</option>
				<option value="NR">Nauru</option>
				<option value="NP">Nepal</option>
				<option value="NL">Netherlands</option>
				<option value="AN">Netherlands Antilles</option>
				<option value="NC">New Caledonia</option>
				<option value="NZ">New Zealand</option>
				<option value="NI">Nicaragua</option>
				<option value="NE">Niger</option>
				<option value="NG">Nigeria</option>
				<option value="NU">Niue</option>
				<option value="NF">Norfolk Island</option>
				<option value="MP">Northern Mariana Islands</option>
				<option value="NO">Norway</option>
				<option value="OM">Oman</option>
				<option value="PK">Pakistan</option>
				<option value="PW">Palau</option>
				<option value="PA">Panama</option>
				<option value="PG">Papua New Guinea</option>
				<option value="PY">Paraguay</option>
				<option value="PE">Peru</option>
				<option value="PH">Philippines</option>
				<option value="PN">Pitcairn</option>
				<option value="PL">Poland</option>
				<option value="PT">Portugal</option>
				<option value="PR">Puerto Rico</option>
				<option value="QA">Qatar</option>
				<option value="RE">Reunion</option>
				<option value="RO">Romania</option>
				<option value="RU">Russian Federation</option>
				<option value="RW">Rwanda</option>
				<option value="KN">Saint Kitts and Nevis</option>
				<option value="LC">Saint LUCIA</option>
				<option value="VC">Saint Vincent and the Grenadines</option>
				<option value="WS">Samoa</option>
				<option value="SM">San Marino</option>
				<option value="ST">Sao Tome and Principe</option>
				<option value="SA">Saudi Arabia</option>
				<option value="SN">Senegal</option>
				<option value="SC">Seychelles</option>
				<option value="SL">Sierra Leone</option>
				<option value="SG">Singapore</option>
				<option value="SK">Slovakia (Slovak Republic)</option>
				<option value="SI">Slovenia</option>
				<option value="SB">Solomon Islands</option>
				<option value="SO">Somalia</option>
				<option value="ZA">South Africa</option>
				<option value="GS">South Georgia and the South Sandwich Islands</option>
				<option value="ES">Spain</option>
				<option value="LK">Sri Lanka</option>
				<option value="SH">St. Helena</option>
				<option value="PM">St. Pierre and Miquelon</option>
				<option value="SD">Sudan</option>
				<option value="SR">Suriname</option>
				<option value="SJ">Svalbard and Jan Mayen Islands</option>
				<option value="SZ">Swaziland</option>
				<option value="SE">Sweden</option>
				<option value="CH">Switzerland</option>
				<option value="SY">Syrian Arab Republic</option>
				<option value="TW">Taiwan, Province of China</option>
				<option value="TJ">Tajikistan</option>
				<option value="TZ">Tanzania, United Republic of</option>
				<option value="TH">Thailand</option>
				<option value="TG">Togo</option>
				<option value="TK">Tokelau</option>
				<option value="TO">Tonga</option>
				<option value="TT">Trinidad and Tobago</option>
				<option value="TN">Tunisia</option>
				<option value="TR">Turkey</option>
				<option value="TM">Turkmenistan</option>
				<option value="TC">Turks and Caicos Islands</option>
				<option value="TV">Tuvalu</option>
				<option value="UG">Uganda</option>
				<option value="UA">Ukraine</option>
				<option value="AE">United Arab Emirates</option>
				<option value="GB">United Kingdom</option>
				<option value="US">United States</option>
				<option value="UM">United States Minor Outlying Islands</option>
				<option value="UY">Uruguay</option>
				<option value="UZ">Uzbekistan</option>
				<option value="VU">Vanuatu</option>
				<option value="VE">Venezuela</option>
				<option value="VN">Viet Nam</option>
				<option value="VG">Virgin Islands (British)</option>
				<option value="VI">Virgin Islands (U.S.)</option>
				<option value="WF">Wallis and Futuna Islands</option>
				<option value="EH">Western Sahara</option>
				<option value="YE">Yemen</option>
				<option value="ZM">Zambia</option>
				<option value="ZW">Zimbabwe</option>
			</select>
                      </div>
                      <div class="form-group">
                        <label for="region-state-dd">Region/State <span class="require">*</span></label>
                        <select class="form-control input-sm" id="region-state-dd" name="region-stated">
                          <option value=""> --- Please Select --- </option>
                          <option value="3513">Abuja</option>
                          <option value="3514">Lagos</option>
                          <option value="3515">Benue</option>
                          <option value="3516">Enugu</option>
                        </select>
                      </div>
                    </div>
                    <div class="col-md-12">
                      <button class="btn btn-primary  pull-right" type="submit" id="button-shipping-address" data-toggle="collapse" data-parent="#checkout-page" data-target="#shipping-method-content">Continue</button>
                    </div>
                  </div>
                </div>
              </div>
              <!-- END SHIPPING ADDRESS -->

              <!-- BEGIN SHIPPING METHOD -->
              <div id="shipping-method" class="panel panel-default">
                <div class="panel-heading">
                  <h2 class="panel-title">
                    <a data-toggle="collapse" data-parent="#checkout-page" href="#shipping-method-content" class="accordion-toggle">
                      Step 4: Delivery Method
                    </a>
                  </h2>
                </div>
                <div id="shipping-method-content" class="panel-collapse collapse">
                  <div class="panel-body row">
                    <div class="col-md-12">
                      <p>Please select the preferred shipping method to use on this order.</p>
                      <h4>Shipping Method </h4>
                      <div class="radio-list">
                        <label>
                          <input type="radio" name="FlatShippingRate" value="FlatShippingRate"> Flat Shipping Rate
                        </label>
                        <label>
                          <input type="radio" name="FlatShippingRate" value="Free Shipping"> Free Shipping
                        </label>
                      </div>
                      <div class="form-group">
                        <label for="delivery-comments">Add Comments About Your Order</label>
                        <textarea id="delivery-comments" rows="8"  name="shiipingcomment"class="form-control"></textarea>
                      </div>
                      <button class="btn btn-primary  pull-right" type="submit" id="button-shipping-method" data-toggle="collapse" data-parent="#checkout-page" data-target="#payment-method-content">Continue</button>
                    </div>
                  </div>
                </div>
              </div>
              <!-- END SHIPPING METHOD -->

              <!-- BEGIN PAYMENT METHOD -->
              <div id="payment-method" class="panel panel-default">
                <div class="panel-heading">
                  <h2 class="panel-title">
                    <a data-toggle="collapse" data-parent="#checkout-page" href="#payment-method-content" class="accordion-toggle">
                      Step 5: Payment Method
                    </a>
                  </h2>
                </div>
                <div id="payment-method-content" class="panel-collapse collapse">
                  <div class="panel-body row">
                    <div class="col-md-12">
                      <p>Please select the preferred payment method to use on this order.</p>
                      <div class="radio-list">
                        <label>
                          <input type="radio" name="CashOnDelivery" value="CashOnDelivery"> Cash On Delivery
                        </label>
                         <label>
                          <input type="radio" name="CashOnDelivery" value="PickUp"> Pick Up
                        </label>
                        <label>
                          <input type="radio" name="CashOnDelivery" value="CallToDiscuss"> Call to Discuss Shipping
                        </label>
                      </div>
                      <div class="form-group">
                        <label for="delivery-payment-method">Add Comments About Your Order</label>
                        <textarea id="delivery-payment-method" rows="8" name="paymentcomment" class="form-control"></textarea>
                      </div>
                      <button class="btn btn-primary  pull-right" type="submit" id="button-payment-method" data-toggle="collapse" data-parent="#checkout-page" data-target="#confirm-content">Continue</button>
                      <div class="checkbox pull-right">
                        <label>
                          <input type="checkbox"> I have read and agree to the <a title="Terms & Conditions" href="#">Terms & Conditions </a> &nbsp;&nbsp;&nbsp;
                        </label>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <!-- END PAYMENT METHOD -->

              <!-- BEGIN CONFIRM -->
              <div id="confirm" class="panel panel-default">
                <div class="panel-heading">
                  <h2 class="panel-title">
                    <a data-toggle="collapse" data-parent="#checkout-page" href="#confirm-content" class="accordion-toggle">
                      Step 6: Confirm Order
                    </a>
                  </h2>
                </div>
                <div id="confirm-content" class="panel-collapse collapse">
                  <div class="panel-body row">
                    <div class="col-md-12 clearfix">
                      <div class="table-wrapper-responsive">
                      <table>
                        <tr>
                          <th class="checkout-image">Image</th>
                          <th class="checkout-description">Description</th>
                          <th class="checkout-model">Model</th>
                          <th class="checkout-quantity">Quantity</th>
                          <th class="checkout-price">Price</th>
                          <th class="checkout-total">Total</th>
                        </tr>
                        <tr>
                          <td class="checkout-image">
                           <a href="#"><img src="displayPicture?code=<%=codee%>" width="150" height="100" alt=""></a>
                          </td>
                          <td class="checkout-description">
                            <h3><a href="#"><%=papertype%></a></h3>
                            <p><strong>Item 1</strong> - Duration: <%=printturnaround%>; Size: <%=size%></p>
                            <em><%=coverpaper%></em>
                          </td>
                          <td class="checkout-model"><%=ag%></td>
                          <td class="checkout-quantity"><%=Quantity%></td>
                          <td class="checkout-price"><strong><span>N</span> <%=price%> </strong></td>
                          <td class="checkout-total"><strong><span>N</span> <%=price%> </strong></td>
                        </tr>

                      </table>
                      </div>
                      <div class="checkout-total-block">
                        <ul>
                          <li>
                            <em>Sub total</em>
                            <strong class="price"><span>N</span> <%=price%> </strong>
                          </li>
                          <li>
                            <em>Shipping cost</em>
                            <strong class="price"><span>N</span>0.00</strong>
                          </li>
                          <li>
                            <em>Eco Tax (-2.00)</em>
                            <strong class="price"><span>N</span>0.00</strong>
                          </li>
                          <li>
                            <em>VAT (5%)</em>
                            <strong class="price"><span>N</span> <%=(new Integer(price).intValue() * 5/100) %> </strong>
                          </li>
                          <li class="checkout-total-price">
                            <em>Total</em>
                            <strong class="price"><span>N</span> <%=(new Integer(price).intValue() * 5/100)%> </strong>
                          </li>
                        </ul>
                      </div>
                      <div class="clearfix"></div>
                      <button class="btn btn-primary pull-right" type="submit" id="button-confirm" name="fina">Confirm Order</button>
                      <button type="button" class="btn btn-default pull-right margin-right-20">Cancel</button>
                    </div>
                  </div>
                </div>
              </div>
              <!-- END CONFIRM -->
       <%

     }catch(Exception ex){
       System.out.println(ex.getMessage());
    }

     }catch(Exception ex){
              System.out.println(ex.getMessage());
          }
       %>
            </div>
            <!-- END CHECKOUT PAGE -->
          </div>
          <!-- END CONTENT -->
        </div>
        <!-- END SIDEBAR & CONTENT -->
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
              <li><i class="fa fa-angle-right"></i> <a href="#">Order Tracking</a></li>
              <li><i class="fa fa-angle-right"></i> <a href="#">Shipping & Returns</a></li>
              <li><i class="fa fa-angle-right"></i> <a href="contactus.jsp">Contact Us</a></li>
               <li><i class="fa fa-angle-right"></i> <a href="#">Payment Methods</a></li>
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

              Email: <a href="mailto:info@.com"><%=hr.getEmail()%></a><br>
              Skype: <a href="skype:skype"> <%=hr.getSkype()%></a>

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
            <ul class="social-footer list-unstyled list-inline pull-right">
              <li><a href="#"><i class="fa fa-facebook"></i></a></li>
              <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
              <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
              <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
              <li><a href="#"><i class="fa fa-twitter"></i></a></li>
              <li><a href="#"><i class="fa fa-skype"></i></a></li>
              <li><a href="#"><i class="fa fa-github"></i></a></li>
              <li><a href="#"><i class="fa fa-youtube"></i></a></li>
              <li><a href="#"><i class="fa fa-dropbox"></i></a></li>
            </ul>
          </div>
          <!-- END PAYMENTS -->
        </div>
      </div>
    </div>
    <!-- END FOOTER -->

    <!-- Load javascripts at bottom, this will reduce page load time -->
    <!-- BEGIN CORE PLUGINS(REQUIRED FOR ALL PAGES) -->
    <!--[if lt IE 9]>
    <script src="../../assets/global/plugins/respond.min.js"></script>
    <![endif]-->
    <script src="plugins/jquery-1.11.0.min.js" type="text/javascript"></script>
    <script src="plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
    <script src="plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="layout/scripts/back-to-top.js" type="text/javascript"></script>
    <script src="plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
    <!-- END CORE PLUGINS -->

    <!-- BEGIN PAGE LEVEL JAVASCRIPTS (REQUIRED ONLY FOR CURRENT PAGE) -->
 <script src="plugins/fancybox/source/jquery.fancybox.pack.js" type="text/javascript"></script><!-- pop up -->
    <script src="plugins/carousel-owl-carousel/owl-carousel/owl.carousel.min.js" type="text/javascript"></script><!-- slider for products -->
    <script src='plugins/zoom/jquery.zoom.min.js' type="text/javascript"></script><!-- product zoom -->
    <script src="bootstrap-touchspin/bootstrap.touchspin.js" type="text/javascript"></script><!-- Quantity -->
    <script src="plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>

    <script src="layout/scripts/layout.js" type="text/javascript"></script>
    <script src="pages/scripts/checkout.js" type="text/javascript"></script>
    
    <script type="text/javascript">
        jQuery(document).ready(function() {
            Layout.init();
            Layout.initOWL();
            Layout.initTwitter();
            Layout.initImageZoom();
            Layout.initTouchspin();
            Layout.initUniform();
            Checkout.init();
             FormValidation.init();
        });
    </script>
        <%


    %>
    <!-- END PAGE LEVEL JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>