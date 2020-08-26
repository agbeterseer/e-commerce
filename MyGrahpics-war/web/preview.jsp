<%--
    Document   : shopping-cart
    Created on : Dec 27, 2015, 8:24:50 AM
    Author     : JPT TERSOO AGBE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@include file="lookupa.jsp" %>

<html><head>
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
  <link href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" rel="stylesheet" type="text/css"><!-- for slider-range -->
  <link href="plugins/rateit/src/rateit.css" rel="stylesheet" type="text/css">
  <!-- Page level plugin styles END -->

<link rel="stylesheet" href="mega-dropdown/css/reset.css"> <!-- CSS reset -->
	<link rel="stylesheet" href="mega-dropdown/css/style.css"> <!-- Resource style -->
	<script src="mega-dropdown/js/modernizr.js"></script> <!-- Modernizr -->

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

                    </ul>
                </div>
                    
                <!-- END TOP BAR MENU -->
            </div>
        </div>
    </div>
    <!-- END TOP BAR -->

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
        <!-- BEGIN SIDEBAR & CONTENT -->
        <div class="row margin-bottom-40">
          <!-- BEGIN CONTENT -->
          <%
try{
  //System.out.println("bill====inside Preview" + bill);
   // Billingbean hb = inl.viewSingleBilling(session.getAttribute("bill").toString());

//Deliverydetailsbean hd = inl.viewSingleDelivery(session.getAttribute("delli").toString());
 //System.out.println("after delli==== inside preview" + delli);
 %>

          <form id="form_sample_2" name="form1" method="post" action="">
  <table width="70%" border="0" align="center" cellpadding="3" cellspacing="3">
      <tr> <td style="background-color:fuchsia"> <font size="+2"> Order Placed Successfully </font></td></tr>
    <tr>
      <td colspan="3"></td>
      </tr>
  </table>
<table width="70%" border="0" align="center">
     <tr>
      <td width="17%">&nbsp;</td>
      <td width="30%">&nbsp;</td>
      <td width="17%">&nbsp;</td>
      <td width="36%">&nbsp;</td>
    </tr>
  </table>

          <div class="col-md-12 col-sm-12">
            <h1> </h1>
            <div class="goods-page">
              <div class="goods-data clearfix">
                <div class="table-wrapper-responsive">
                <table summary="Shopping cart">
                  <tr>
                    <th class="goods-page-image"></th>
                    <th class="goods-page-description"></th>
                    <th class="goods-page-ref-no"></th>
                    <th class="goods-page-quantity"></th>
                    <th class="goods-page-price"> </th>
                    <th class="goods-page-total" colspan="2"></th>
                  </tr>
                  <tr>
                    <td class="goods-page-image">
                     
                    </td>
                    <td class="goods-page-description">
                        <h3><a href="#"></a></h3>
                        <p></p>
                      <em></em>
                    </td>
                    <td class="goods-page-ref-no">
                    
                    </td>
                    <td class="goods-page-quantity">
                      <div class="">
                          <input id="" type="text" value="" readonly class="form-control">
                      </div>
                    </td>
                    <td class="goods-page-price">
                      <strong>  </strong>
                    </td>
                    <td class="goods-page-total">
                      <strong> </strong>
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
                      <em></em>
                      <strong class="price"><span></span></strong>
                    </li>
                    <li>
                      <em></em>
                      <strong class="price"><span></span></strong>
                    </li>
                     <li>
                      <em></em>
                      <strong class="price"><span></span></strong>
                    </li>
                    <li class="shopping-total-price">
                      <em></em>
                      <strong class="price"><span></span>  </strong>
                    </li>
                  </ul>
                </div>
              </div>

               
            </div>
          </div>
          </form>
 <%
}catch(Exception ex){
System.out.println();
}
%>
          <!-- END CONTENT -->
        </div>

        <!-- END SIDEBAR & CONTENT -->

        <!-- BEGIN SIMILAR PRODUCTS -->
         
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
    <!-- BEGIN CORE PLUGINS (REQUIRED FOR ALL PAGES) -->
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
