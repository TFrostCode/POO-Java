package Ejercicio03;

public class Coche extends Vehiculo{
    private int numeroPuertas;

    public Coche(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + " numeroPuertas=" + numeroPuertas;
    }
}
