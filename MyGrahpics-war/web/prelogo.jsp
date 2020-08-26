<%-- 
    Document   : prelogo
    Created on : Dec 9, 2015, 10:32:08 AM
    Author     : JPT TERSOO AGBE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

 <%@include  file="lookupa.jsp" %>
<%
            try {
                downloadurl = inl.viewSingleProductad(session.getAttribute("str").toString()).getPix2();
                response.flushBuffer();
                response.setContentType("image/jpg");
                ServletOutputStream outputStream = response.getOutputStream();
                if (response.isCommitted()) {
                    if (downloadurl != null) {
                        outputStream.write(downloadurl);
                    } else {
                    }
                    response.flushBuffer();
                }
            } catch (IllegalStateException exx) {
            }
%>