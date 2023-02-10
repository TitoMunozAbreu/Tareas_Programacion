package Banda_Rock;

public class Musico {
    private String nombre;
    private String dni;
    private double sueldo;
    private Instrumento instrumento;
    private Disponibilidad disponible;

    public Musico(){}

    public Musico(String nombre, String dni, double sueldo, Instrumento instrumento, Disponibilidad disponible) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.instrumento = instrumento;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    public Disponibilidad getDisponible() {
        return disponible;
    }

    public void setDisponible(Disponibilidad disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Musico: " + "\n" +
                "Nombre = " + this.getNombre() + "\n" +
                "Dni = " + this.getDni() + "\n" +
                "Sueldo = " + this.getSueldo() + "\n" +
                "Instrumento = " + this.getInstrumento() + "\n" +
                "Disponible = " + this.getDisponible() + "\n";
    }
}
