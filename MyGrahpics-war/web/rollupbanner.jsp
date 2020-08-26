<%--
    Document   : startcalculate
    Created on : Nov 26, 2015, 11:10:32 AM
    Author     : JPT TERSOO AGBE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@include file="lookupa.jsp" %>
       <%
       
    String code = request.getParameter("code"); 
       try{
      //  code = session.getAttribute("code").toString();
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inspirational Images| Roll-Up Banner</title>
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
<body class="corporate">
    <!-- BEGIN STYLE CUSTOMIZER -->

    <!-- END BEGIN STYLE CUSTOMIZER -->

    <!-- BEGIN TOP BAR -->
    <!-- BEGIN TOP BAR -->
    <div class="pre-header">
        <div class="container">
            <div class="row">
                <div class="col-md-6 col-sm-6 additional-shop-info">
                    <ul class="list-unstyled list-inline">
                        <li><i class="fa fa-phone"></i><span><font color="red">HOT-LINE:+234 8034733069</font></span></li>
                        <!-- BEGIN CURRENCIES -->

                        <!-- END CURRENCIES -->
                        <!-- BEGIN LANGS -->

                        <!-- END LANGS -->
                    </ul>
                </div>
                <!-- BEGIN TOP BAR LEFT PART -->
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
			<a class="cd-dropdown-trigger" href="#0">Products</a>
			<nav class="cd-dropdown">
				<h2>Title</h2>
				<a href="#0" class="cd-close">Close</a>
				<ul class="cd-dropdown-content">
					<li>
                                            <form name="form1" class="cd-search" action="shop-search-result.jsp"  method="post">
                                                    <input type="search" placeholder="Search..." name="lookfor">
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
                                                                         <li><a href="catalogue.jsp?code=Catalog">Catalog</a></li>
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

									<li><a href="rollupb.jsp?code=RollupBanner">Roll-up Banners</a></li>
                                    	 
									<li><a href="cal.jsp?code=Windowgraphics">window graphics</a></li>
                                    <li class="has-children"><a href="cal.jsp?code=Namebadges">Name badges</a>

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
											<li><a href="begincat.jsp?code=NotePads">Note Pads</a></li>
										

										</ul>
									<li><a href="cal2.jsp?code=GoodyBages">Goody bag</a></li>
                               
									<li><a href="cal.jsp?code=MOUSEpad">MOUSE pad</a></li>
                                   
								</ul>
							</li>

							<li class="has-children">
								<a href="">Gift Items</a>
								<ul class="is-hidden">
									<li class="go-back"><a href="#0">Online Printing</a></li>
									<li class="see-all"><a href="products.jsp">All Printing</a></li>
									<li><a href="begincat.jsp?code=Excercisebooks">Exercise Books</a></li>
									<li><a href="cal.jsp?code=PhoneCases">Phone Cases</a></li>
									<li><a href="cal.jsp?code=Coasters">Coasters</a></li>
                                        
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
       <ul class="breadcrumb">
       <li><a href="index.jsp">Home</a></li>
       <li><a href="products.jsp"> Products</a></li><li class="active">  <%=inl.viewSingleSubcategory(code).getSubcategory()%></li>
       </ul>
        <div class="container">
        <div class="content-page">
                  <!-- BEGIN SIDEBAR & CONTENT -->
        <div class="row margin-bottom-40">
          <!-- BEGIN CONTENT -->
          <div class="col-md-12 col-sm-12">
            <div class="row margin-bottom-30">
                <!-- BEGIN CAROUSEL -->
               <%

             //  System.out.println("code inside startcalculate==" + code);
               //try{Iterator i = inl.viewAllSubCategoris(code).iterator();
                //while(i.hasNext()){
                try{

                                session.setAttribute("code", code);
                  String srt =  session.getAttribute("code").toString();

              hsc = inl.viewSingleSubcategory(code);
                 //hsc = (HelpSubCategory) i.next();
                 session.setAttribute("ag", hsc.getCode());
                  %>
                <div class="col-md-5 front-carousel" >
                  <div class="carousel slide" id="myCarousel">
                    <!-- Carousel items -->
                    <div class="carousel-inner">
                        <div style="padding-left:130px;"><h2><i><%=hsc.getSubcategory()%> </i><br/>
                    <font size="+1" color="#FF0000"><i>starting from N <%=hsc.getDefaultprice()%></i></font><br/>
                   </h2></div>
         <div class="item active"> <img alt="" src="displayPicture?code=<%=hsc.getCode()%>">
                  <div class="carousel-caption">
                      READY IN 1 TO 3 DAYS!<br/>

                     </div>

                      </div>
                    </div>

                    <!-- Carousel nav -->
                 </div>
                </div>
                  <!-- BEGIN CAROUSEL -->
                 <div class="col-md-7" >
            <div class="portlet-title">
               Step 1.  Begin Calculate Price
           </div>

            <div class="portlet-body form">
              <form class="form-horizontal"   action=""  method="post"  onsubmit="return validate(this);">
                  <% if (hsc.getProductId().equalsIgnoreCase(Utill.CONFIG.getRoll_up_Banners()) || hsc.getProductId().equalsIgnoreCase(Utill.CONFIG.getRoll_up_Banner()) ){ %>
                <div class="form-body">
                                                                                
                                                    <div class="form-group">
										<label class="control-label col-md-3">Paper Type <span class="required">
										* </span>
										</label>
										<div class="col-md-4">
											 <select class="form-control" name="papertype" onchange="this.form.submit();" style="width:200px;">

        <%  try{ Iterator i = inl.viewAllPaperTypeByProductName(session.getAttribute("ag").toString()).iterator();
                                                        while(i.hasNext()){
                                                            
                                                 Papertypebean pthh = (Papertypebean) i.next();
           %>
        <option value="<%=pthh.getPaperTypeId()%>"<%=request.getParameter("papertype") != null && request.getParameter("papertype").equalsIgnoreCase(pthh.getPaperTypeId()) ? new String("selected") : new String("")%>><%=pthh.getPaperName()%></option>
        <%                                            }

                                                        }catch(Exception ex){
                                                System.out.println(ex.getMessage());
                                                        }
        %>
      </select>
						</div>
									</div>
                                 

<%}else {  if (hsc.getProductId().equalsIgnoreCase(Utill.CONFIG.getCanvas_Printing())){

                response.sendRedirect("catcal.jsp");
      }
        }%>
                  <div class="form-group">
										<label class="control-label col-md-3">Quantity <span class="required">
										* </span>
										</label>
										<div class="col-md-4">
											 <select class="form-control" name="Quantity" onchange="this.form.submit();" style="width:200px;">

       <%  try{                   
                             Iterator i  = inl.viewAllQuatityBydescription(hsc.getCode()).iterator();
                              while(i.hasNext()){Quantitybean hq = (Quantitybean) i.next();
           %>
        <option value="<%=hq.getQty()%>"<%=request.getParameter("Quantity") != null && request.getParameter("Quantity").equalsIgnoreCase(hq.getQty()) ? new String("selected") : new String("")%>><%=hq.getQty()%></option>
        <%                                            }
                                                      }catch(Exception ex){
                                                System.out.println(ex.getMessage());
                                                      }
        %>
      </select>
									</div>
									</div>



                                     <div class="form-group">
										<label class="control-label col-md-3" style="background-color:silver">Estimated Total: <span class="required">
										 </span>
										</label>
										<div class="col-md-4">


                                             <%
     String Quantity = request.getParameter("Quantity");
     String size = request.getParameter("size");
     String pages = request.getParameter("pages");
     String papertype = request.getParameter("papertype");
     String binding = request.getParameter("binding");
     String bindingplacement = request.getParameter("bindingplacement");
     String coverpaper = request.getParameter("coverpaper");
     String printturnaround = request.getParameter("printturnaround");

      
String strims = "rimszz";
        try{
          //  session.setAttribute("Quantity", Quantity);
               
       
            session.setAttribute("Quantity", Quantity);
            session.setAttribute("binding", strims);
            session.setAttribute("bindingplacement", strims);
            session.setAttribute("coverpaper", strims);
            session.setAttribute("printturnaround", strims);
            session.setAttribute("size", strims);
            session.setAttribute("pages", strims); 
           session.setAttribute("papertype", strims);
            session.setAttribute("binding", strims);
            session.setAttribute("page", "shopping-cart.jsp");



//size pages papertype
         float sum = 0.0F;
       float total = 0.0F;
       int sumb = 0;
    if(request.getParameter("papertype")!=null || request.getParameter("Quantity")!=null){
        //System.out.println("pass this line now please===" + hq.getDescription());


        sumb = inl.computeCDLayers(hsc.getCode(), Quantity);
          String gsf = new Integer(sumb).toString();
            session.setAttribute("price", gsf);
            %>

                      <div class="pi-price" style="background-color:maroon; color:white">N<%=sumb%>.00</div><br/>
                      <a href="login.jsp?price=<%=sumb%>" class="btn btn-default add2cart">Add to cart</a>
         <%
          }else{

                session.setAttribute("price", hsc.getDefaultprice());
                session.setAttribute("size", hsc.getSizeandcut());
          %>
 <div class="pi-price" style="background-color:maroon; color:white">N<%=hsc.getDefaultprice()%>.00</div><br/>
  <a href="login.jsp?price=<%=hsc.getDefaultprice()%>" class="btn btn-default add2cart">Add to cart</a>

                                     <%}%>

<%  }catch(Exception ex){System.out.println();}%>

<%}catch(Exception ex){System.out.println();}%>

									</div>
									</div>






                                    </div>



              </form>
            </div>

          <!-- END SAMPLE FORM PORTLET-->
                </div>

                <!-- END CAROUSEL -->

                <!-- BEGIN PORTFOLIO DESCRIPTION -->
                <div class="col-md-7">
                  <h2>For custom size please contact us at</h2>

   <font size="+3" color="red" >info@inspirationalimagesltd.com</font>
<div  style="padding-left:100px; color:black;" >
   <p><font color="red">Need help ordering? Contact us today</font><br/>
@ + 234 8095434402, 234 8095434425 for assistance.</div>
                  <br>
                  <div class="row front-lists-v2 margin-bottom-15">
                  </div>
                </div>
                <!-- END PORTFOLIO DESCRIPTION -->
              </div>
        <!-- BEGIN  RECENT WORKS -->
        <!-- END RECENT WORKS -->
          </div>
          <!-- END CONTENT -->
        </div>
       <!-- BEGIN SIDEBAR & CONTENT -->
      </div>
          </div>
        <!-- BEGIN SERVICE BOX -->

        <!-- END SERVICE BOX -->

        <!-- BEGIN BLOCKQUOTE BLOCK -->

        <!-- END BLOCKQUOTE BLOCK -->

        <!-- BEGIN RECENT WORKS -->

        <!-- END RECENT WORKS -->

        <!-- BEGIN TABS AND TESTIMONIALS -->

        <!-- END TABS AND TESTIMONIALS -->

        <!-- BEGIN STEPS -->

        <!-- END STEPS -->

        <!-- BEGIN CLIENTS -->

        <!-- END CLIENTS -->
      </div>
    </div>

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
<%

 }catch(Exception ex){
   System.out.println(ex.getMessage());
   }
%>
