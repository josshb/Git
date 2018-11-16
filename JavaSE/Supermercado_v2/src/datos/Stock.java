package datos;

/**
 *
 * @author Antonio Santos
 */
import modelo.Producto;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import utilidades.Datos;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Stock {

	private List<Producto> stock;

	public Stock() {
		stock = new ArrayList<>();
	}

	public List<Producto> getStock() {
		return stock;
	}

	public void setStock(ArrayList<Producto> stock) {
		this.stock = stock;
	}

	public void ListarProductos() {

		System.out.println("-- LISTADO DE PRODUCTOS --");
		for (Producto producto : stock) {
			System.out.println(producto);
		}
	}

	public boolean AñadirProducto(Producto p) {
		stock.add(p);
		return true;
	}

	public boolean AñadirProducto() {

		Producto p = new Producto();
		p.crearProducto();
		stock.add(p);
		return true;

		// return (stock.add(Factoria.CrearProducto()));
	}

	public int busquedaCodigo(int cod) throws Exception {

		if (stock.isEmpty()) {
			throw new Exception("   No hay stock.");
		} else {
			int a = -1;
			for (Producto p : stock) {
				if (p.getCodigo() == cod) {
					a = stock.indexOf(p);
				}
			}
			return a;
		}
	}

	public boolean eliminarProducto() throws Exception {
		int codigo = Datos.recogeInt("   Indica el código del producto a eliminar");
		return eliminarProducto(codigo);
	}

	public boolean eliminarProducto(int cod) throws Exception {

		int a = busquedaCodigo(cod);

		if (a == -1) {
			System.out.println("   El supermercado no tiene ese producto");
			return false;
		}
		stock.remove(a);
		System.out.println("   Producto eliminado");
		return true;
	}

	public boolean CantidadesProducto() throws Exception {
		int codigo = Datos.recogeInt("   Indica el código del producto del que quieres saber la cantidad");
		return CantidadesProducto(codigo);
	}

	public boolean CantidadesProducto(int cod) throws Exception {
		if (stock.isEmpty()) {
			throw new Exception("   No hay stock.");
		} else {
			int a = -1;
			for (Producto p : stock) {
				if (p.getCodigo() == cod) {
					int cant = p.getCantidad();
					String name = p.getNombre();
					System.out.println(name + " (" + cant + " unidades)");
				}
			}
			return true;
		}

	}

	public boolean CantidadesMenores(int limite) throws Exception {
		if (stock.isEmpty()) {
			throw new Exception("   No hay stock de nada.");
		} else {
			int a = -1;
			for (Producto p : stock) {
				if (p.getCantidad() <= limite) {
					int cant = p.getCantidad();
					String name = p.getNombre();
					System.out.println(name + " (" + cant + " unidades)");
					a = 0;
				}
			}
			if (a == -1) {
				System.out.println("   Lo siento. No tenemos ese producto");
			}
			return true;
		}

	}

	public void serializarStock() {
		// Por defecto
		this.serializarStock("listado_stock.dat");
	}

	public void serializarStock(String fichero) {
		System.out.println("-- serializando");
		try (
				FileOutputStream f = new FileOutputStream(fichero); 
				ObjectOutputStream s = new ObjectOutputStream(f)) {
			s.writeObject(stock);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deSerializarStock() {
		// Por defecto
		this.deSerializarStock("listado_stock.dat");
	}

	public void deSerializarStock(String fichero) {
		System.out.println("-- Deserializando");
		try {
			File fich = new File(fichero);
			FileInputStream f = new FileInputStream(fich);
			try (ObjectInputStream s = new ObjectInputStream(f)) {
				stock = (ArrayList<Producto>) s.readObject();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void CasosDePrueba() {
		stock.add(new Producto(1, "Leche", "Lacteos", 18));
		stock.add(new Producto(2, "Manzanas", "Frutas", 38));
		stock.add(new Producto(3, "Jamon York", "Embutidos", 3));
		stock.add(new Producto(4, "Guisantes", "Congelados", 40));
		stock.add(new Producto(5, "Galletas", "Desayuno", 4));
		stock.add(new Producto(6, "Queso", "Lacteos", 5));
		stock.add(new Producto(7, "Zumos", "Bebidas", 15));
	}

	@Override
	public String toString() {
		return "   Stock{" + "stock=" + stock + '}';
	}
}
