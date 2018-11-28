package com.ejemplos.hibernate.control;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ejemplos.hibernate.model.Persona;
import com.ejemplos.hibernate.util.HibernateUtils;
import com.ejemplos.hibernate.util.JdbcUtils;

import com.ejemplos.hibernate.util.Simulaciones;

/**
 * @author: Antonio
 *
 */

public class Test {

	public static void main(String[] args) {
		
		//OBJETOS DE PRUEBA                           vv sufijo para que sea random
		Persona p1 = new Persona("Antonio43","Santos"+ Simulaciones.sufijoNombre());
        System.out.println(p1);
        
        Persona p2 = new Persona("Paul","Allen"+ Simulaciones.sufijoNombre());
        System.out.println(p2); 
        
        //Operaciones en BBDD
        // objeto especializado en trabajar bbdd nivel de objeto
        Session session = HibernateUtils.getSession();
        Transaction tx = null;
        //transaccion o lo hago todo o nada
        try {
            tx = session.beginTransaction();

            session.save(p1);
            session.save(p2);            
            // si esta todo bien lo haces y si no tx.rollback
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

	}

}
