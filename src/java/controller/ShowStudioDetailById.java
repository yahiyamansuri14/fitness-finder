/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.StudioCrudOperation;
import entity.Studio;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hp
 */
public class ShowStudioDetailById extends HttpServlet {

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
        response.setContentType("image/gif");
        Studio studio=new Studio();
        StudioCrudOperation studioCrudOperation=new StudioCrudOperation();
        String studio_id=request.getParameter("id");
        studio.setStudio_id(studio_id);
        studio=studioCrudOperation.showStudioDetailById(studio);
        /*Testing purpose works fine
        PrintWriter out=response.getWriter();
        out.println(studio.getWorkout_avail());
        out.println(studio.getS_city());
        out.println(studio.getS_name());
         
        
        ServletOutputStream sout=response.getOutputStream();
        sout.write(studio.getImage());
        
        //out.println(studio.getImage());
        out.close();
       */
        if(studio!=null){
            HttpSession session=request.getSession();
            session.setAttribute("studio",studio);
            response.sendRedirect("_studiodetailsbyid.jsp");
        }else{
            HttpSession session=request.getSession();
            session.setAttribute("studio",studio);
            response.sendRedirect("error404.jsp");
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
