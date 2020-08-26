<%-- 
    Document   : createuser
    Created on : Jun 9, 2011, 10:17:52 AM
    Author     : Terseer
--%>

<%@page import="javax.ejb.*,java.lang.*,javax.naming.InitialContext,javax.rmi.PortableRemoteObject,java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="sessions.*"%>
<%@page import="Entities.*"%>
 <%@include file="lookup.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>create user</title>
        
             <script type="text/ecmascript" language="javascript" src="js/validation.js"></script>
    </head>
    <body>
          <%
      

      %>
             
   
        <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String surname = request.getParameter("surname");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String gender = request.getParameter("gender");
        String position = request.getParameter("position");
        String nationality = request.getParameter("nationality");
        String stateoforigin = request.getParameter("stateoforigin");
        String lga = request.getParameter("lga");
        String homeaddress = request.getParameter("homeaddress");
        String fonenumber = request.getParameter("fonenumber");
        %>

        <%
        try {
            if (request.getParameter("button") !=null) {
               msg = inl.AddUser(username, password, position,"");
               //String username, String password, String role, String status
               style = "success";
               msg = inl.addStaff(username, firstname, lastname, gender, position, nationality, stateoforigin, lga, homeaddress, fonenumber, null,"");
               //String username, String firstName, String lastName, String gender, String position, String nationality, String stateOfOrigin, String lga, String homeAddress, String phoneNumber, String dateOfAppointment, byte[] passport, String whcode
               System.out.println("this my point of wahalaoooooo i don pass am");
               session.setAttribute("username", username);
             //  response.sendRedirect("printLoginDetails.jsp");

                //String username, String firstName, String lastName, String gender, String position, String nationality, String stateOfOrigin, String lga, String homeAddress, String phoneNumber, String dateOfAppointment, byte[] passport
            }
            } catch (Exception ex) {
            System.out.println(ex.getMessage());
            style = "error";
            }
        %>
        <form action="" method="post"  onsubmit="return validate(this);">
                        <fieldset style="width:600px;">
                            <legend class="tableheader"><strong>Login details</strong></legend>
                            <table width="100%" border="0"  cellpadding="0" cellspacing="0">
                                <tr>
                                    <td colspan="4" class="<%=style%>"><%=msg%></td>
                                </tr>
                                <tr>
                                  <td width="25%">&nbsp;</td>
                                    <td width="25%">&nbsp;</td>
                        <td width="45%">&nbsp;</td>
                                  <td width="5%">&nbsp;</td>
                                </tr>
                                <tr>
                                  <td class="tab_lebel">&nbsp;</td>
                                    <td class="tab_lebel">Username</td>
                                  <td><input type="text" style="width:200px;" name="username" id="username" value="<%=(request.getParameter("username") != null) ? request.getParameter("username") : new String("")%>"></td>
                                    <td>&nbsp;</td>
                                </tr>
                                <tr>
                                  <td>&nbsp;</td>
                                    <td>&nbsp;</td>
                                  <td><label></label></td>
                                    <td>&nbsp;</td>
                                </tr>
                                <tr>
                                  <td class="tab_lebel">&nbsp;</td>
                                    <td class="tab_lebel">Password</td>
                                    <td><input type="password" style="width:200px;" name="password" id="password" value="<%=(request.getParameter("password") != null) ? request.getParameter("password") : new String("")%>"></td>
                                    <td>&nbsp;</td>
                                </tr>
                                <tr>
                                  <td>&nbsp;</td>
                                    <td>&nbsp;</td>
                                    <td>&nbsp;</td>
                                    <td>&nbsp;</td>
                                </tr>
                            </table>
          </fieldset>
          
          <fieldset style="width:600px;" >
                            <legend class="tableheader"><strong>Personal Details</strong></legend>
                            <table width="100%" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td width="25%">&nbsp;</td>
                      <td width="25%">&nbsp;</td>
                      <td width="46%">&nbsp;</td>
                      <td width="4%">&nbsp;</td>
                  </tr>
                  <tr>
                    <td class="tab_lebel">&nbsp;</td>
                      <td class="tab_lebel">First name</td>
                      <td><label>
                              <input type="text" style="width:200px;" name="firstname" id="firstname" value="<%=(request.getParameter("firstname") != null) ? request.getParameter("firstname") : new String("")%>">
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
                    <td class="tab_lebel">&nbsp;</td>
                      <td class="tab_lebel">Last name</td>
                      <td><label>
                              <input type="text" style="width:200px;" name="lastname" id="lastname" value="<%=(request.getParameter("lastname") != null) ? request.getParameter("lastname") : new String("")%>">
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
                    <td class="tab_lebel">&nbsp;</td>
                      <td class="tab_lebel">Gender</td>
                      <td><label>
                      <select name="gender" id="gender" style="width:200px;">
                        <option value="MALE"<%=request.getParameter("gender") != null && request.getParameter("gender").equalsIgnoreCase("MALE") ? new String("selected") : new String("")%>>MALE</option>
                        <option value="FEMALE" <%=request.getParameter("gender") != null && request.getParameter("gender").equalsIgnoreCase("FEMALE") ? new String("selected") : new String("")%>>FEMALE</option>
                      </select>
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
                      <td>&nbsp;</td>
                      <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td class="tab_lebel">&nbsp;</td>
                      <td class="tab_lebel">Nationlatlity</td>
                      <td><label>
                              <input type="text" style="width:200px;" name="nationality" id="nationality" value="<%=(request.getParameter("nationality") != null) ? request.getParameter("nationality") : new String("")%>">
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
                    <td class="tab_lebel">&nbsp;</td>
                      <td class="tab_lebel">State of Origin</td>
                      <td><label>
                       <input type="text" style="width:200px;" name="stateoforigin" id="stateoforigin" value="<%=(request.getParameter("stateoforigin") != null) ? request.getParameter("stateoforigin") : new String("")%>">
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
                    <td class="tab_lebel">&nbsp;</td>
                      <td class="tab_lebel">Lga</td>
                      <td><label>
                         <input type="text" style="width:200px;" name="lga" id="lga" value="<%=(request.getParameter("lga") != null) ? request.getParameter("lga") : new String("")%>">
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
                    <td class="tab_lebel">&nbsp;</td>
                      <td height="23" class="tab_lebel">Home address</td>
                      <td><label>
                        <input type="text" style="width:200px;" name="homeaddress" id="homeaddress" value="<%=(request.getParameter("homeaddress") != null) ? request.getParameter("homeaddress") : new String("")%>">
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
                    <td class="tab_lebel">&nbsp;</td>
                      <td class="tab_lebel">Phone number</td>
                      <td><label>
                              <input type="text"  style="width:200px;" name="fonenumber" id="fonenumber" value="<%=(request.getParameter("fonenumber") != null) ? request.getParameter("fonenumber") : new String("")%>">
                          </label></td>
                      <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                      <td height="25">&nbsp;</td>
                    <td>&nbsp;</td>
                      <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td class="tab_lebel">&nbsp;</td>
                    <td class="tab_lebel">Position</td>
                    <td><label>
                            <select name="position" id="position" style="width:200px;" >
                        <option value="--select one--">--select one--</option>
                               <option value="ADMIN" <%=request.getParameter("position") != null && request.getParameter("position").equalsIgnoreCase("ADMIN") ? new String("selected") : new String("")%>>admin</option>
                      </select>
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
                    <td class="tab_lebel">&nbsp;</td>
                    <td class="tab_lebel"></td>
                    <td><label>

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
                    <td><input type="submit"  class="bot"  name="button" id="button"  value="Submit"  ></td>
                    <td>&nbsp;</td>
                  </tr>
              </table>
          </fieldset>
             
        </form>
       
    </body>
</html>
