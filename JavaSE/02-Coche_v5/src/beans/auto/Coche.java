package beans.auto;

import java.util.Objects;
import utilidades.LecturaDatos;

/**
* @author Antonio Santos
* 
**/
public class Coche {
/*
 * primero primerisimo los atributos
 * aunque tambien podria ir un metodo static
 *
 */
    private String marca;
    private String modelo;
    private String color;
    private String combustible;
    private int numPuertas;
    private int potencia;
    private int consumoGas;
/*
 * metodo vacio.
 */
    public Coche() {
    }
/*
 * metodo constructor* si no tuviera el creador de coches podria hacer en
 * la clase anterior new coche(string ferrari, string f50, string gasolina....)
 * definirlo al crearlo en la otra clase vaya
 * 
 */
    public Coche(String marca, String modelo, String color, String combustible, int numPuertas, int potencia, int consumoGas) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
        this.numPuertas = numPuertas;
        this.potencia = potencia;
        this.consumoGas = consumoGas;
    }
//getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getConsumoGas() {
        return consumoGas;
    }

    public void setConsumoGas(int consumoGas) {
        this.consumoGas = consumoGas;
    }

    
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", combustible=" + combustible + ", numPuertas=" + numPuertas + ", potencia=" + potencia + ", consumoGas (1-10)=" + consumoGas + '}';
    }

    /*
     * un metodo para igualar 
     */
    // ESTO QUE ES?
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coche other = (Coche) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
    }

    public void crearCoche() {
        System.out.println("CREADOR DE COCHES v1.0");

        this.setMarca(LecturaDatos.leerString("Digame la marca: "));
        this.setModelo(LecturaDatos.leerString("Digame el modelo: "));
        this.setCombustible(LecturaDatos.leerString("Digame combustible: "));

        // ...
    }

    public void imprimeInforme() {
        System.out.println(this.toString());
    }

}
