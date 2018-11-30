<%@ page import="java.util.*"%>
<%@ page import="java.lang.System"%>
<!DOCTYPE html>
<html>
<head>
<title>Cervezas v3</title>
<meta charset="UTF-8">
</head>
<body>
	<h1>Cervezas v3. JSP con recomendaciones sobre cervezas</h1>
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