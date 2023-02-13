package Aeropuerto.Personas;

public class Trabajador extends Persona {
    private double sueldo;

    public Trabajador(){}

    public Trabajador(String nombre, String apellidos, String DNI, String email, double sueldo) {
        super(nombre, apellidos, DNI, email);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Sueldo = " + sueldo + "\n";
    }
}
