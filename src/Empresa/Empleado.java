package Empresa;

public class Empleado extends Persona{
    private double salario;

    public Empleado() {}

    public Empleado(String nombre, String apellido, int edad, double salario) {
        super(nombre, apellido, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String mostrarInformacion() {
        return "Empleado: \n +"
                +"Nombre: " + super.getNombre() + "\n"
                +"Apellido: " + super.getApellido() + "\n"
                +"Edad: " + super.getEdad() + "\n"
                +"Salario: " + getSalario() + "\n";
    }
}
