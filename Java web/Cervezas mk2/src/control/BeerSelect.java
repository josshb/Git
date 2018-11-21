package control;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.*;
import java.io.*;
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
Iterator it = result.iterator();
while (it.hasNext()) {
out.print("<p>prueba: " + it.next() + "</p>");
}
out.println("</body>");
out.println("</html>");
}
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
processRequest(request, response);
}
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
processRequest(request, response);
}
}