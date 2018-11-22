package control;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Pedido;


/**
 *
 * @author Antonio
 */
public class Peticion extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("--- dentro del servlet");
        try {
            // Vienes de la pagina 2 y vas a la 3
//                                             vvv hace que no cree sesion y redirija a la primera
            HttpSession ses = request.getSession(false);
            if (ses == null) {
                System.out.println("sesion nula");
                //response.encodeRedirectURL("restaurante.jsp");
                response.sendRedirect("restaurante.htdml");
                return;
            }

            // Paso 01
            //  - Recoger informacion
            //  - Guardarla en objeto
            String primero = request.getParameter("primero");
            String segundo = request.getParameter("segundo");
            String postre = request.getParameter("postre");

            // Guardo el pedido realizado
            Pedido pedido = new Pedido();
            pedido.setPrimero(primero);
            pedido.setSegundo(segundo);
            pedido.setPostre(postre);
            request.setAttribute("encargo", pedido);

            //--------------------------------------
            // Paso 2
            //   - Hablar con el "Experto" y pedir menus
            //   - Recoger información
            //   - Guardarla    
            //--------------------------------------
            // Paso 3
            //   - Ceder control                  
            RequestDispatcher view = request.getRequestDispatcher("pedidoRealizado.jsp");
            view.forward(request, response);
        } catch (Exception e) {
            System.out.println("--------------------  FALLO  -----------------------------");
            System.out.println(e.getMessage());
            System.out.println("----------------------------------------------------------");
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
