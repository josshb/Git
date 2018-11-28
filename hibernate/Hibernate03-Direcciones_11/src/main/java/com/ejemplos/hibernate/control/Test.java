package com.ejemplos.hibernate.control;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ejemplos.hibernate.model.Persona;
import com.ejemplos.hibernate.model.Direccion;

import com.ejemplos.hibernate.util.HibernateUtils;
import com.ejemplos.hibernate.util.JdbcUtils;
import com.ejemplos.hibernate.util.Provincias;
import com.ejemplos.hibernate.util.Simulaciones;




/**
 * @author: Antonio Santos
 *
 */

public class Test {

	public static void main(String[] args) {
		
		//Datos de prueba
        Persona p1 = new Persona("Antonio","Santos"+ Simulaciones.sufijoNombre());
        
        // Simulamos una direccion
        int zip =Simulaciones.randBetween(1, 50000);
        Direccion d1 = new Direccion("Calle" + Simulaciones.sufijoNombre(), zip, Provincias.getProvincia(""+zip));
        
        //Guardo la relacion. En mi caso es bidireccional
        p1.setDireccion(d1);
        d1.setPersonaId(p1);
		
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
        JdbcUtils.ejecutaQuery("select * from relacion_11_direccion");        

	}

}
