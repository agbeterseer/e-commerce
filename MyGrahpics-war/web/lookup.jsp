<%-- 
    Document   : lookup
    Created on : Oct 1, 2014, 4:40:57 AM
    Author     : Terseer
--%>

<%@page import="javax.naming.InitialContext"%>
<%@page import="sessions.photosessionLocal"%>
<%@page import="java.util.List"%>
<%@page import="Entities.*"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>

<%!
    photosessionLocal inl = null;
    String msg = "";
    String style = "";
    public void jspInit(){
        
        try{
            
            InitialContext ic = new InitialContext();
            
            inl = (photosessionLocal)ic.lookup("java:app/MyGrahpics-ejb/photosession");
            
            
        }catch(Exception ep){
            
        }
        
    }
    
    public void jspDestroy(){
        inl = null;
    }
    
    %>