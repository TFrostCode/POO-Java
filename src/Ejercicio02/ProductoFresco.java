package Ejercicio02;

public class ProductoFresco extends Producto{
    private int diasCaducidad;

    public ProductoFresco() {
        this("",0,0);
    }

    public ProductoFresco(String nombre, double precio, int diasCaducidad) {
        super(nombre, precio);
        this.diasCaducidad = diasCaducidad;
    }

    public int getDiasCaducidad() {
        return diasCaducidad;
    }

    public void setDiasCaducidad(int diasCaducidad) {
        this.diasCaducidad = diasCaducidad;
    }

    @Override
    public double comprar(int cantidad) throws IllegalArgumentException{

        double precioFinal = super.comprar(cantidad);

        if (this.diasCaducidad >= 3 && this.diasCaducidad <= 5){
            precioFinal *= 0.6;
        } else if (this.diasCaducidad < 3) {
            precioFinal *= 0.3;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return super.toString() + " diasCaducidad: " + this.diasCaducidad;
    }
}
