/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletFiles;

import Entities.Blogbean;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sessions.photosessionLocal;

/**
 *
 * @author JPT TERSOO AGBE
 */
@WebServlet(name = "displayBlogPic", urlPatterns = {"/displayBlogPic"})
public class displayBlogPic extends HttpServlet {
@EJB
    private photosessionLocal photosession;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       try {
                String code = request.getParameter("code");
           
            System.out.println("na get pix pix pix pix " + code);
           
if(code!=null ){
                //downloadurl
                        Blogbean hsc = photosession.viewSingleBlog(code);
                
                response.flushBuffer();
                response.setContentType("image/jpg");
                ServletOutputStream outputStream = response.getOutputStream();
                if (response.isCommitted()) {
                   // if (code != null) {
                        outputStream.write(hsc.getPic());
                   // } else {
                        
                   // }
                    response.flushBuffer();
                }
}
             
             } catch (IllegalStateException exx) {
            }
       
           // out.close();
        
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
        processRequest(request, response);
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

}
