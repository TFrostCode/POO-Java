package Ejercicio02;

public class Producto {
    private int id;
    private String nombre;
    private double precio;

    private static int idAutoincrementado = 1;

    public Producto() {
        this("",0);
    }

    public Producto(String nombre, double precio) {

        if(precio < 0){
            throw new IllegalArgumentException("El precio debe ser positivo");
        }

        this.nombre = nombre;
        this.precio = precio;
        this.id = Producto.idAutoincrementado++;
    }

    public double comprar(int cantidad) throws IllegalArgumentException{
        if(cantidad < 0){
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }

        return this.precio * cantidad;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio;
    }
}
