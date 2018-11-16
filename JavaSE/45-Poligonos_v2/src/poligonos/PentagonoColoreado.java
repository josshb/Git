package poligonos;

import datos_enum.Material;

/**
 * @author Antonio
 */
public class PentagonoColoreado extends PoligonoColoreado {

    private String firmaDisenador;

    public PentagonoColoreado() {
    }

    public PentagonoColoreado(String firmaDisenador, String color, Material material) {
        super(color, material, 5, 20);
        this.firmaDisenador = firmaDisenador;
    }

    public PentagonoColoreado(String firmaDisenador, String color, Material material, int incremento) {
        super(color, material, 5, incremento);
        this.firmaDisenador = firmaDisenador;
    }

    public String getFirmaDisenador() {
        return firmaDisenador;
    }

    public void setFirmaDisenador(String firmaDisenador) {
        this.firmaDisenador = firmaDisenador;
    }

    @Override
    public int getIncremento() {
        return super.getIncremento();
    }

    @Override
    public void setIncremento(int incremento) {
        super.setIncremento(incremento);
    }

    @Override
    public void aplicarIncremento() {
        super.aplicarIncremento();
    }

    @Override
    public String toString() {
        return "PentagonoColoreado{" + "firmaDisenador=" + firmaDisenador + super.toString() + '}';
    }
}
