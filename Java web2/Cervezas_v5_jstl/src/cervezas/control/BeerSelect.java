package cervezas.control;

import cervezas.domain.Cerveza;
import cervezas.modelo.BeerExpert;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;

/**
 *
 * @author Antonio Santos
 */
@WebServlet(
        name = "BeerSelect",
        urlPatterns = {"/SelectBeer.do"},
        asyncSupported = false
)
public class BeerSelect extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	//PASO 01: Recoger informacion
        String c = request.getParameter("color");
        BeerExpert be = new BeerExpert();
        
        //PASO 02: Recopilar la respuesta
        List<Cerveza> result = be.getBrands(c);
        request.setAttribute("styles", result);
        
        //PASO 03: Salir      
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
        //request.getRequestDispatcher("result.jsp").forward(request, response);
        
    }

    
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
