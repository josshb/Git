package control;

import model.formacion.Asignatura;
import model.formacion.Curso;
import model.formacion.Examen;
import model.humanos.Alumno;
import model.humanos.Persona;
import model.humanos.Profesor;

/**
 *
 * @author Antonio
 */
public class Test {

    public static void prueba1() {

        
        //Creamos los humanos
    	//Realmente en este ejercicio no sacamos mucho beneficio
    	//del polimorfirmo, porque los roles NO pueden intercambiarse
        Persona a1 = new Alumno("Pedro","M001");
        Persona a2 = new Alumno("Maria","M002");
        Persona p1 = new Profesor("Antonio");
        
        
        
        //Creamos datos del curso
        Curso c1 = new Curso("Curso inTalent Java");
        Asignatura as1 = new Asignatura("Java", (Profesor)p1);
        Asignatura as2 = new Asignatura("BBDD", (Profesor)p1);
        c1.addAsignatura(as1);
        c1.addAsignatura(as2);
        c1.addMatricula((Alumno)a1);
        c1.addMatricula((Alumno)a2);
        
        //Empiezo el curso y hago examen
        Examen ex = new Examen(as1);
        ex.redactarTexto();

        //Imprimo informacion
        System.out.println(c1);
        System.out.println("-------------");
        System.out.println(a1);
        System.out.println("-------------");        
        System.out.println(a2);
        System.out.println("-------------");        
        System.out.println(ex);

		 
    }
    
   


}
