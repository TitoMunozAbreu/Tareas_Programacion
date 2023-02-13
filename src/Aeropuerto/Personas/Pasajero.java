package Aeropuerto.Personas;

public class Pasajero extends Persona{
    private int pasaporte;

    public Pasajero(){}

    public Pasajero(String nombre, String apellidos, String DNI, String email, int pasaporte) {
        super(nombre, apellidos, DNI, email);
        this.pasaporte = pasaporte;
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Pasaporte = " + pasaporte + "\n";
    }
}
