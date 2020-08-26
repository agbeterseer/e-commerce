<%-- 
    Document   : email
    Created on : Jun 30, 2016, 11:28:03 AM
    Author     : JPT TERSOO AGBE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page  import="Utill.*" %> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String maildetails = ""; 
        String email = "";
        //String username = "";
    
        %>
        <%
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
                                    EmailSenderl gms = new EmailSenderl("smtp.gmail.com", "info@inspirationalimagesltd.com", "inspirationalimages", "465", "info@inspirationalimagesltd.com", email, "true", "true", "true", "javax.net.ssl.SSLSocketFactory", "- WEB PAY", maildetails);
                                    mailstat = gms.send();
%>
    </body>
</html>
