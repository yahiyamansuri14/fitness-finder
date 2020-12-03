/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.StudioCrudOperation;
import dao.StudioRequestCrud;
import entity.Owner;
import entity.Studio;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;
import utility.IdGenerator;

/**
 *
 * @author hp
 */
public class AddStudio extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    IdGenerator idg=new IdGenerator();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, FileUploadException, ClassNotFoundException, SQLException {
        String s1="",s2="",s3="",s4="",s5="",s6="",s7="",s8="",s9="",s10="",s11="";
        byte b[]=null;
        DiskFileItemFactory factory=new DiskFileItemFactory();
        ServletFileUpload upload=new ServletFileUpload(factory);
        List<FileItem> items=upload.parseRequest(new ServletRequestContext(request));
        Studio studio=new Studio();
        for(FileItem item:items){
            String str=item.getFieldName();
            if(str.equals("owner_id")){
                s1=item.getString();
            }else if(str.equals("s_name")){
                s2=item.getString();
            }else if(str.equals("s_address")){
                s3=item.getString();
            }else if(str.equals("s_state")){
                s4=item.getString();
            }else if(str.equals("s_city")){
                s5=item.getString();
            }else if(str.equals("s_contact")){
                s6=item.getString();
            }else if(str.equals("workout_avail")){
                s7=item.getString();
            }else if(str.equals("amenities")){
                s8=item.getString();
            }else if(str.equals("s_hotlocation")){
                s9=item.getString();
            }else if(str.equals("distance_hotlocation")){
                s10=item.getString();
            }else if(str.equals("category")){
                s11=item.getString();
            }else if(str.equals("image")){
                b=item.get();
            }
            
        }//end of for-each loop
        String id=idg.studioIdGenerator();
        //adding data to studio object
        studio.setStudio_id(id);
        studio.setImage(b);
        studio.setOwner_id(s1);
        studio.setS_name(s2);
        studio.setS_address(s3);
        studio.setS_state(s4);
        studio.setS_city(s5);
        studio.setS_contact(s6);
        studio.setWorkout_avail(s7);
        studio.setAmenities(s8);
        studio.setS_hotlocation(s9);
        studio.setDistance_hotlocation(s10);
        studio.setCategory(s11);
        //calling crud operation methods
        StudioCrudOperation studioCrudOperation =new StudioCrudOperation();
        int j=studioCrudOperation.addStudio(studio);
        if(j!=0){
            HttpSession session=request.getSession();
            session.setAttribute("studioID", studio.getStudio_id());
            response.sendRedirect("success.jsp");
        }else{
            HttpSession session=request.getSession();
            session.setAttribute("studioID", studio.getStudio_id());
            response.sendRedirect("error.jsp");
        }
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
        try {
            processRequest(request, response);
        } catch (FileUploadException ex) {
            Logger.getLogger(AddStudio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddStudio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddStudio.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (FileUploadException ex) {
            Logger.getLogger(AddStudio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddStudio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddStudio.class.getName()).log(Level.SEVERE, null, ex);
        }
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
