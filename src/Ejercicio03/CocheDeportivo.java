package Ejercicio03;

public class CocheDeportivo extends Coche{
    private boolean descapotable;

    public CocheDeportivo(int numeroPuertas, boolean descapotable) {
        super(numeroPuertas);
        this.descapotable = descapotable;
    }

    public CocheDeportivo(String marca, String modelo, int numeroPuertas, boolean descapotable) {
        super(marca, modelo, numeroPuertas);
        this.descapotable = descapotable;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    @Override
    public String toString() {
        return super.toString() + " descapotable=" + descapotable;
    }
}
