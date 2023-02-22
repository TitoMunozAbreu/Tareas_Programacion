package Hospital;

public class Trabajador {
    private String nombre;
    private String DNI;
    private double sueldo;

    public Trabajador(){}

    public Trabajador(String nombre, String DNI, double sueldo){
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Nombre = " + this.getNombre() + "\n" +
                "DNI = " + this.getDNI() + "\n" +
                "sueldo = " + this.getSueldo() + "\n";
    }
}
