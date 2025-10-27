package Ejercicio03;

public class Vehiculo {
    private int id;
    private String marca;
    private String modelo;

    private static int incrementarId = 1;

    public Vehiculo() {
        this("","");
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.id = Vehiculo.incrementarId++;
    }

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

    @Override
    public String toString() {
        return "id=" + id + ", marca='" + marca + '\'' + ", modelo='" + modelo;
    }
}
