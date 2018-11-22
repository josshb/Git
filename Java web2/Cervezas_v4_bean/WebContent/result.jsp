<%@ page import="java.util.*" %>
<%@ page import="cervezas.domain.*" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Cervezas v4</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    </head>
    <body>
        <h1>JSP con recomendaciones sobre cervezas v4</h1>
        <p>
            <%
                List<Cerveza> styles = (List<Cerveza>) request.getAttribute("styles");
                out.print("<p>");
                for(Cerveza v:styles){
                	out.print("<br>try: " + v.getNombre());
                }
                out.print("</p>");                
            %>
        </p>
    </body>
</html>