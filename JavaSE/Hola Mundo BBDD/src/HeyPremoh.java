

import java.sql.*;

public class HeyPremoh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			// crea una instancia
			String driverClassName = "com.mysql.jdbc.Driver";

			// indica la url de la BBDD y accede
			String driverUrl = "jdbc:mysql://10.90.36.4/movieflix";
			String user = "newuser";
			String password = "1111";
			Class.forName(driverClassName);

			// establecer conexion
			con = DriverManager.getConnection(driverUrl, user, password);

			String query2 = "insert into peliculas (idpeliculas, nombre, estreno, categoria)"
					+ " values (69, la guarra de las galaxias, 1969, romance)";

			// create the mysql insert preparedstatement
			st.executeUpdate(query2);
			
			// crear un objeto statement
			st = con.createStatement();

			// lanzar la peticion SQL
			String query = "select * from empresa1.emp;";
			rs = st.executeQuery(query);

			// procesar los resultados
			while (rs.next()) {
				System.out.println(rs.getString(2));
			}

			// errores y excepciones
		} catch (ClassNotFoundException e) {
			System.out.println("No se encuentra el driver");

		} catch (SQLException e) {
			System.out.println("Excepcion SQL: " + e.getMessage());
			System.out.println("Estado SQL: " + e.getSQLState());
			System.out.println("Código del Error: " + e.getErrorCode());

			// liberar recuersos
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}



