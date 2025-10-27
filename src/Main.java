import Ejercicio01.*;
public class Main {
    public static void main(String[] args) {

        try {
            Empresa empresa = new Empresa("123", "CASERITA10");
            Empleado empleado1 = new Empleado("12345428Z","Jack", 40, Departamento.DIRECCION, true, empresa);
            Empleado empleado2 = new Empleado("98764421Z","Arthur", 21, Departamento.INFORMATICA, false, empresa);

            System.out.println(empleado1 + "Su sueldo es: " + empleado1.calcularSueldo());
            System.out.println(empleado2+ "Su sueldo es: " + empleado2.calcularSueldo());
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}