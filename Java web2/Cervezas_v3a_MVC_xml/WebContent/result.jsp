<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Cervezas v3a</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    </head>
    <body>
        <h1>JSP con recomendaciones sobre cervezas v3a</h1>
        <p>
            <%
                List styles = (List) request.getAttribute("styles");
                Iterator it = styles.iterator();
                while (it.hasNext()) {
                    out.print("<br>try: " + it.next());
                }
            %>
        </p>
    </body>
</html>