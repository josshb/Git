package com.ejemplos.hibernate.control;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ejemplos.hibernate.model.Persona;
import com.ejemplos.hibernate.model.Telefonos;

import com.ejemplos.hibernate.util.HibernateUtils;
import com.ejemplos.hibernate.util.JdbcUtils;
import com.ejemplos.hibernate.util.Simulaciones;


/**
 * @author: Antonio Santos
 *
 */

public class Test {

	public static void main(String[] args) {
		
		//Datos de prueba
        Persona p1 = new Persona("Antonio","Santos"+ Simulaciones.sufijoNombre());
        System.out.println(p1);

		
        // Creamos los objetos y sus relaciones.
        System.out.println("-- Creando objetos de prueba");
        Set<Telefonos> list1 = new HashSet<Telefonos>();
        list1.add(new Telefonos().simularTelefono());
        list1.add(new Telefonos().simularTelefono());
        System.out.println(list1);        
        
        p1.setTelefonos(list1);
        System.out.println(p1);

        Session session = HibernateUtils.getSession();
        Transaction tx = null;
        
        try {
            tx = session.beginTransaction();
            session.save(p1);
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
        JdbcUtils.ejecutaQuery("select * from persona");
        JdbcUtils.ejecutaQuery("select * from relacion_1n_telefono");        

	}

}
