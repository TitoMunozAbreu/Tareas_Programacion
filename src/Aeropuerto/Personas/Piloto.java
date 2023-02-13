package Aeropuerto.Personas;

public class Piloto extends Persona{
    private double sueldo;
    private boolean vuelosInt;
    private Rango_Piloto rango;

    public Piloto(){}

    public Piloto(String nombre, String apellidos, String DNI, String email, double sueldo, boolean vuelosInt, Rango_Piloto rango) {
        super(nombre, apellidos, DNI, email);
        this.sueldo = sueldo;
        this.vuelosInt = vuelosInt;
        this.rango = rango;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isVuelosInt() {
        return vuelosInt;
    }

    public void setVuelosInt(boolean vuelosInt) {
        this.vuelosInt = vuelosInt;
    }

    public Rango_Piloto getRango() {
        return rango;
    }

    public void setRango(Rango_Piloto rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Sueldo = " + this.getSueldo() + "\n" +
                "VuelosInt = " + this.isVuelosInt() + "\n" +
                "Rango = " + this.getRango() + "\n";
    }
}
