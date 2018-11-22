package cervezas.control;

import cervezas.modelo.BeerExpert;
import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet("/SelectBeer.do")
public class BeerSelect extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Selector de cervezas v2</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Selector de cervezas v2</h1>");
        out.println("<p>Consejos para seleccionar una cerveza</p>");
        String c = request.getParameter("color");
        //out.println("<p>Ok. Te gusta la cerveza de color " + c + "</p>");
        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c);
        
        for(Object dato:result){
            out.print("<p>prueba: " + dato + "</p>");
        }
        out.println("</body>");
        out.println("</html>");
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


}
