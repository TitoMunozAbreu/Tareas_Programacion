package Aeropuerto.Personas;

public class Persona {
    private String nombre;
    private String apellidos;
    private String DNI;
    private String email;

    public Persona(){}

    public Persona(String nombre, String apellidos, String DNI, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nombre =" + this.getNombre() + "\n" +
                "Apellidos = " + this.getApellidos() + "\n" +
                "DNI = " + this.getDNI() + "\n" +
                "Email = " + this.getEmail() + "\n";
    }
}