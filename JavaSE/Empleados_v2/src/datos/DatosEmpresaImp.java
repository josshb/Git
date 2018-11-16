package datos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import modelo.Director;
import modelo.Gerente;
import  modelo.Empleado;
import utilidades.LeerTeclado;

public class DatosEmpresaImp implements IDatosEmpresa {
	
    private List<Empleado> personal = new ArrayList<>();


    public List<Empleado> getPersonal() {
        return personal;
    }

    public void setPersonal(List<Empleado> personal) {
        this.personal = personal;
    }

    public void addEmpleado(Empleado e) {
        //42 lineas muy complicadas
        personal.add(e);
    }

    public void addEmpleado() {
        Empleado e = new Empleado();
        e.crearEmpleado();
        addEmpleado(e);
    }

    //Devuelve la posicion
    public int encontrarEmpleado(Empleado e) {
        int encontrado = -1;
        for (int i = 0; i < personal.size(); i++) {
            Empleado aux = personal.get(i);
            System.out.println("-- " + aux.getNombre());
            if (aux.equals(e)) {
                System.out.println("+++ encontrado!!");
                encontrado = i;
            }
        }

        return encontrado;
    }

    public void eliminarEmpleado() {
        System.out.println("-- Pido datos del objeto a eliminar");
        String nombre = LeerTeclado.leerLinea("Introduzca el nombre:");
        Empleado aux = new Empleado(nombre);
        this.eliminarEmpleado(aux);
    }

    public void eliminarEmpleado(Empleado e) {
        int pos = encontrarEmpleado(e);
        if (pos == -1) {
            //no encontrado
            System.out.println("-- No encontrado");
        } else {
            //encontrado
            System.out.println("-- encontrado y eliminado");
            personal.remove(pos);
        }
    }

    public void listarEmpleados() {
        for (Empleado e : personal) {
            System.out.println(e);
        }
    }

    public boolean existeEmpleado() {

        System.out.println("-- Pido datos del objeto a localizar");
        String nombre = LeerTeclado.leerLinea("Introduzca el nombre:");
        Empleado aux = new Empleado(nombre);
        return this.existeEmpleado(aux);

    }

    public boolean existeEmpleado(Empleado e) {
        boolean encontrado = false;
        int pos = encontrarEmpleado(e);

        if (pos == -1) {
            //no encontrado
            System.out.println("-- No encontrado");
        } else {
            //encontrado
            System.out.println("-- encontrado");
            encontrado = true;
        }
        return encontrado;
    }

    public void modificarEmpleado() {

        System.out.println("-- Pido datos del objeto a modificar");
        String nombre = LeerTeclado.leerLinea("Introduzca el nombre:");
        Empleado aux = new Empleado(nombre);
        
                int pos = encontrarEmpleado(aux);
        if (pos == -1) {
            //no encontrado
            System.out.println("-- No encontrado");
        } else {
            //encontrado
            System.out.println("-- encontrado");
             this.modificarEmpleado(personal.get(pos));
        }
    }

    public void modificarEmpleado(Empleado e) {
        System.out.println("-- Modificacion de datos");
        int seleccion = LeerTeclado.leerInt("¿Que dato desea modificar (1)Nombre, (2)Salario?:");
        if (seleccion == 1) {
            e.setNombre(LeerTeclado.leerLinea("Introduzca el nuevo nombre:"));
        } else if (seleccion == 2) {
            e.setSalario(LeerTeclado.leerDouble("Indique el nuevo salario:"));
        }
    }

    public void incentivarDirectores() {
        for (Empleado e : personal) {
            if (e instanceof Director) {
                ((Director) e).incentivar();
            }
        }
    }

    public void CasosDePrueba() {
        personal.add(new Empleado("Luis", 1000.0d, new Date()));
        personal.add(new Empleado("Antonio", 1200.0d, new Date()));
        personal.add(new Empleado("Maria", 1400.0d, new Date()));
        personal.add(new Gerente("Pedro", 3000.0d, new Date(), 5.0));
        personal.add(new Director("Olga", 6500.0d, new Date(), 10.0, true));
    }

    public void listado() {
        StringBuilder sb = new StringBuilder();
        for (Empleado e : personal) {
            sb.append(e.toString() + "\n");
        }
        System.out.println(sb.toString());
    }

}
