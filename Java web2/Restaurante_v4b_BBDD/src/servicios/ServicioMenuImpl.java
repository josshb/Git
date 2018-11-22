package servicios;

import datos.DAOMenu;
import datos.DAOMenuImpl;
import modelo.MenuDia;

public class ServicioMenuImpl implements ServicioMenu {
	
	private DAOMenu daomenu = new DAOMenuImpl();

	public MenuDia consultarMenuDia() {
		return daomenu.consultarMenuDia();
	}

}
