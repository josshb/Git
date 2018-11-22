package control;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
String c = request.getParameter("color");
BeerExpert be = new BeerExpert();
List result = be.getBrands(c);
request.setAttribute("styles", result);
RequestDispatcher view = request.getRequestDispatcher("Result.jsp");
view.forward(request, response);
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