package Ejercicio01;

import java.util.Objects;

public class Empleado {
    private String DNI;
    private String nombre;
    private int edad;
    private Departamento departamento;
    private boolean teletrabajo;
    private Empresa empresa;

    private static double salarioBase = 1000;

    public Empleado(String DNI, String nombre, int edad, Departamento departamento, boolean teletrabajo, Empresa empresa) {

        try {
            Validator.validarDNI(DNI);
        } catch (Exception ex){
            throw new IllegalArgumentException(ex.getMessage());
        }

        if (empresa == null){
            throw new IllegalArgumentException("La empresa es obligatoria");
        }

        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
        this.teletrabajo = teletrabajo;
        this.empresa = empresa;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        try {
            Validator.validarDNI(DNI);
        } catch (Exception ex){
            throw new IllegalArgumentException(ex.getMessage());
        }
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public boolean isTeletrabajo() {
        return teletrabajo;
    }

    public void setTeletrabajo(boolean teletrabajo) {
        this.teletrabajo = teletrabajo;
    }

    public Empresa getEmpresa() {
        if (empresa == null){
            throw new IllegalArgumentException("La empresa es obligatoria");
        }
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public static double getSalarioBase() {
        return salarioBase;
    }

    public static void setSalarioBase(double salarioBase) {
        Empleado.salarioBase = salarioBase;
    }

    public double calcularSueldo(){
        double salario = Empleado.salarioBase;

        if(this.edad > 30){
            salario += 200;
        }

        salario += this.departamento.getPlus();

        if(this.teletrabajo){
            salario += 30;
        }

        return salario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(DNI, empleado.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(DNI);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", departamento=" + departamento +
                ", teletrabajo=" + teletrabajo +
                ", empresa=" + empresa +
                '}';
    }
}
