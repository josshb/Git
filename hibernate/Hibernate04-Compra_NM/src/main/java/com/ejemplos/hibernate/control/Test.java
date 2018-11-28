package com.ejemplos.hibernate.control;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ejemplos.hibernate.model.Carrito;
import com.ejemplos.hibernate.model.Producto;

import com.ejemplos.hibernate.util.HibernateUtils;
import com.ejemplos.hibernate.util.JdbcUtils;


/**
 * @author: Antonio Santos
 *
 */

public class Test {

	public static void main(String[] args) {
		
        // Creo unos casos de prueba
        Carrito carrito = new Carrito();
        carrito.carritoPrueba();
        Producto prod1 = new Producto();
        prod1.productoPrueba();
        Producto prod2 = new Producto();
        prod2.productoPrueba();
      
        //monto el juego de productos
        Set<Producto> productos = new HashSet<Producto>();
        productos.add(prod1);
        productos.add(prod2);
        System.out.println("--- Listado Productos: "+productos);        

        //Guardo la relacion
        carrito.setProductoSet(productos);

		
        Session session = HibernateUtils.getSession();
        Transaction tx = null;
        
        try {
            tx = session.beginTransaction();
            session.save(carrito);
            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e.getMessage());
            e.getMessage();
        } finally {
            session.close();
        }
        
        // Comprobacion
        JdbcUtils.ejecutaQuery("select * from relacion_nm_carrito");
        JdbcUtils.ejecutaQuery("select * from relacion_nm_producto");
        JdbcUtils.ejecutaQuery("select * from relacion_nm_carrito_producto");        

	}

}
