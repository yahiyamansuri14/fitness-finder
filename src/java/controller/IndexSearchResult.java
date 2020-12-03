/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SearchCrudOperation;
import entity.Studio;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hp
 */
public class IndexSearchResult extends HttpServlet {

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
        Studio studio=new Studio();
        ArrayList<Studio> studioList;
        PrintWriter out=response.getWriter();
        SearchCrudOperation searchCrudOperation=new SearchCrudOperation();
        String city=request.getParameter("_city");
        String area=request.getParameter("_area");
        String fitness_option=request.getParameter("_fitness_place");
        studio.setS_city(city);
        studio.setS_hotlocation(area);
        studio.setCategory(fitness_option);
        if(fitness_option.equals("allfitnessoption")){
            studioList=searchCrudOperation.showForAllFitnessOption(studio);
        }else{
            studioList=searchCrudOperation.indexSearchResult(studio);
        }
        if(studioList!=null){
            HttpSession session=request.getSession();
            session.setAttribute("studioList",studioList);
            response.sendRedirect("_indexsearchresult.jsp");
        }else{
            HttpSession session=request.getSession();
            session.setAttribute("studioList", studioList);
            response.sendRedirect("_indexsearchresult.jsp");
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
