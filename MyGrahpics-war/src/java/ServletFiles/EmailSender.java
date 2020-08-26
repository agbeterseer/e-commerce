/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletFiles;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import javax.ejb.EJB;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import sessions.photosessionLocal;

/**
 *
 * @author JPT TERSOO AGBE
 */
@WebServlet(name = "EmailSender", urlPatterns = {"/EmailSender"})
public class EmailSender extends HttpServlet {
    @EJB
    private photosessionLocal photosession;
     private String host;
    private String port;
    private String user;
    private String pass;
 private byte[] pic = null;
    //InspireLocal scl = null;
    TreeMap tmap = null;
    String msg = "";
    byte[] fileName = null;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
      public void init() {
        // reads SMTP server setting from web.xml file
        ServletContext context = getServletContext();
        host = context.getInitParameter("host");
        port = context.getInitParameter("port");
        user = context.getInitParameter("user");
        pass = context.getInitParameter("pass");
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  //
        HttpSession session = request.getSession();
            // Collect form variables
        // System.out.println("first pass");
        tmap = new TreeMap();

        // Create a session local object
        //scl = lookupInspireBean();
         FileItemFactory factory = new DiskFileItemFactory();

        // Create a new file upload handler
        ServletFileUpload upload = new ServletFileUpload(factory);
        List items = null;
        try {
            items = upload.parseRequest(request);
        } catch (FileUploadException ex) {
            ex.printStackTrace();
        }

        // Process the uploaded items
        Iterator iter = items.iterator();
        while (iter.hasNext()) {
            FileItem item = (FileItem) iter.next();

            if (item.isFormField()) {
                /*
                 *first check that the field is not empty
                 */
                try {
                    if (item.getString() != "" && item.getString() != null) {
                        tmap.put(item.getFieldName(), item.getString());
                    } else {
                        continue;
                    }
                } catch (Exception ex) {
                    System.out.println("Put: " + ex.getMessage());
                }
            } else {
                try {

                    // Process a file upload in memory
                    File tempfile = new File(item.getName());
                    fileName = item.get();
                    //InputStream ips = new ByteArrayInputStream(fileName);
                    //setPic(item.get());
                    setPic(fileName);

                } catch (Exception ex) {
                    System.out.println("GET");
                }
            }
        }


          try {
 //firstname lastname email telephone  fax password country region-state
            String firstname = (tmap.containsKey("firstname")) ? tmap.get("firstname").toString() : null;
          String lastname = (tmap.containsKey("lastname")) ? tmap.get("lastname").toString() : null;
         String email = (tmap.containsKey("email")) ? tmap.get("email").toString() : null;
         String telephone = (tmap.containsKey("telephone")) ? tmap.get("telephone").toString() : null;
         String fax = (tmap.containsKey("fax")) ? tmap.get("fax").toString() : null;
        // String firstname = (tmap.containsKey("firstname")) ? tmap.get("firstname").toString() : null;
        
            String blogtitle = (tmap.containsKey("blogtitle")) ? tmap.get("blogtitle").toString() : null;
          
           // String state = (tmap.containsKey("state")) ? tmap.get("state").toString() : null;

            // Attempty creating here     contactAddress = street + ", " + state + ", " + country; && name.length() > 0 && surname != null && surname.length() > 0
            if (blogtitle != null) {
               try {
               
                // String fullName = surname.toUpperCase() + ", " + othernames.toUpperCase();
                 //   photosession.addBlog("", blogtitle, details, "", "", "", "", "", getPic());
                    //String code, String blogtitle, String comment, Timestamp dateofpost, String category, String procductcode, String status, String others);
    
                session.setAttribute("p", "addBlog.jsp");
                response.sendRedirect("success.jsp");
                } catch (Exception ex) {
                        msg = ex.getMessage();
                        System.out.println("Exception: " + msg);
                    }
                    }
        } catch (Exception ex) {
            System.out.println("Get: " + ex.getMessage());
        }
     
    
    String recipient = request.getParameter("recipient");
        String subject = request.getParameter("subject");
        String content = request.getParameter("content");
 
        String resultMessage = "";
 
        try {
            photosession.sendMail(host, port, user, pass, recipient, subject,
                    content);
            resultMessage = "The e-mail was sent successfully";
        } catch (Exception ex) {
            ex.printStackTrace();
            resultMessage = "There were an error: " + ex.getMessage();
        } finally {
            request.setAttribute("Message", resultMessage);
            getServletContext().getRequestDispatcher("preview.jsp").forward(
                    request, response);
        }


        //response.setContentType("text/html;charset=UTF-8");
        
    }
   
 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // reads form fields
       
    }

    
    
    



    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
 public byte[] getPic() {
        return pic;
    }

    /**
     * @param pic the pic to set
     */
    public void setPic(byte[] pic) {
        this.pic = pic;
    }
}
