import Ejercicio01.*;
import Ejercicio02.*;
import Ejercicio03.Coche;
import Ejercicio03.CocheDeportivo;
import Ejercicio03.Moto;
import Ejercicio03.Vehiculo;

public class Main {
    public static void main(String[] args) {

        try {
            Empresa empresa = new Empresa("123", "CASERITA10");
            Empleado empleado1 = new Empleado("12345428Z","Jack", 40, Departamento.DIRECCION, true, empresa);
            Empleado empleado2 = new Empleado("98764421Z","Arthur", 21, Departamento.INFORMATICA, false, empresa);

            System.out.println(empleado1 + "Su sueldo es: " + empleado1.calcularSueldo());
            System.out.println(empleado2+ "Su sueldo es: " + empleado2.calcularSueldo());

            Producto producto = new Producto("Producto1", 10);
            ProductoFresco productoFresco = new ProductoFresco("Producto2", 30, 4);
            ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado("Producto3", 50, 1);
            System.out.println(producto + "\n" + productoFresco + "\n" + productoRefrigerado);
            System.out.println( producto.comprar(10));
            System.out.println( productoFresco.comprar(10));
            System.out.println( productoRefrigerado.comprar(10));

            Vehiculo vehiculo = new Vehiculo("Seat", "Ibiza");
            Coche coche = new Coche("Tesla", "Modelo Y", 4);
            Moto moto = new Moto("Honda", "Superior", true);
            CocheDeportivo cocheDeportivo = new CocheDeportivo("Ferrari", "Maximus", 2, true);

            System.out.println(vehiculo);
            System.out.println(coche);
            System.out.println(moto);
            System.out.println(cocheDeportivo);
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}