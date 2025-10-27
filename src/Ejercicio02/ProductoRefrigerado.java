package Ejercicio02;

public class ProductoRefrigerado extends Producto{
    private int cajon;

    public ProductoRefrigerado() {
        this("",0,0);
    }

    public ProductoRefrigerado(String nombre, double precio, int cajon) {
        super(nombre, precio);
        this.cajon = cajon;
    }

    public int getCajon() {
        return cajon;
    }

    public void setCajon(int cajon) {
        this.cajon = cajon;
    }

    @Override
    public String toString() {
        return super.toString() + " cajon: " + this.cajon;
    }
}
