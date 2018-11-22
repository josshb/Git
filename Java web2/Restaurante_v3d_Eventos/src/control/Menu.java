package control;

import datos.DAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.MenuDia;
import modelo.Usuario;

/**
 *
 * @author Antonio
 */
public class Menu extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("--- dentro del servlet Menu");
        try {

            // Paso 01
            //  - Recoger informacion
            //  - Guardarla en objeto
            String habitacion = request.getParameter("habitacion");
            String nombreCliente = request.getParameter("nombre");

            Usuario cliente = new Usuario();
            cliente.setHabitacion(habitacion);
            cliente.setNombre(nombreCliente);

            // Creo una sesion para pasar luego estos datos
            HttpSession sesion = request.getSession();
            // Guardo el usuario (creado con bean) en la sesion
            sesion.setAttribute("cliente", cliente);

                //--------------------------------------
            // Paso 2
            //   - Hablar con el "Experto" y pedir menus
            //   - Recoger información
            //   - Guardarla
            MenuDia menu = new DAO().consultarMenuDia();
            request.setAttribute("menuDia", menu);

                //--------------------------------------
            // Paso 3
            //   - Ceder control          
            RequestDispatcher view = request.getRequestDispatcher("mostrarMenu.jsp");
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
