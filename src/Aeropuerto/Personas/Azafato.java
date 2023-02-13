package Aeropuerto.Personas;

import java.util.Arrays;

public class Azafato extends Persona{
    private double sueldo;
    private Idioma[] idiomas;

    public Azafato(){}

    public Azafato(String nombre, String apellidos, String DNI, String email, double sueldo, Idioma[] idiomas) {
        super(nombre, apellidos, DNI, email);
        this.sueldo = sueldo;
        this.idiomas = idiomas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Idioma[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(Idioma[] idiomas) {
        this.idiomas = idiomas;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "sueldo=" + sueldo + "\n" +
                "Idioma=" + Arrays.toString(idiomas) + "\n";
    }
}
