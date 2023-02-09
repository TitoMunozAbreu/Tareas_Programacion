package Empresa;

/**
 * Clase Empleado extiende de Persona
 * @version 1.0
 * @author Tito M
 */
public class Empleado extends Persona{
    private double salario;

    /**
     * Constructor vacio
     */
    public Empleado() {}

    /**
     * Constructor Empleado, con 4 parametros
     * @param nombre
     * @param apellido
     * @param edad
     * @param salario
     */
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

    /**
     *Metodo abstracto
     * @return devuelve los datos del empleado
     */
    @Override
    public String mostrarInformacion() {
        return "Empleado: \n +"
                +"Nombre: " + super.getNombre() + "\n"
                +"Apellido: " + super.getApellido() + "\n"
                +"Edad: " + super.getEdad() + "\n"
                +"Salario: " + getSalario() + "\n";
    }
}
