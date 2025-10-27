package Ejercicio03;

public class Moto extends Vehiculo{
    private boolean sidecar;

    public Moto(boolean sidecar) {
        this.sidecar = sidecar;
    }

    public Moto(String marca, String modelo, boolean sidecar) {
        super(marca, modelo);
        this.sidecar = sidecar;
    }

    public boolean isSidecar() {
        return sidecar;
    }

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }

    @Override
    public String toString() {
        return super.toString() + " sidecar=" + sidecar;
    }
}
