package Prueba_Interfaz;

import java.time.LocalTime;
import java.util.Arrays;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private String DNI;
    private long movil;
    private String email;
    private double siesta;
    private String[] asignaturas;

    //Constructor Alumno
    public Alumno(String nombre, String DNI, long movil, String email, double siesta, String[] asignaturas) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.movil = movil;
        this.email = email;
        this.siesta = siesta;
        this.asignaturas = asignaturas;
    }


    //Metodo que indica si el numero de telefono empieza por 6 o no
    public boolean isEmpiezaPorSeis(){
        boolean trueFalse = false;
        int contador = 8;
        int m = (int) movil;

        while (contador > 0){
            m /= 10;
            contador--;
        }

        if(m == 6){
            trueFalse = true;
        }
        return trueFalse;
    }

    // Getters y Setters
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

    public long getMovil() {
        return movil;
    }

    public void setMovil(long movil) {
        this.movil = movil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSiesta() {
        return siesta;
    }

    public void setSiesta(double siesta) {
        this.siesta = siesta;
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;
        Alumno alumno = (Alumno) o;
        return getDNI().equals(alumno.getDNI());
    }

    @Override
    public String toString() {
        return "\n Alumno " + "\n" +
                "nombre = " + nombre + "\n" +
                "movil = " + movil + "\n" +
                "email = " + email + "\n" +
                "siesta = " + siesta + "\n" +
                "asignaturas = " + Arrays.toString(asignaturas);
    }

    @Override
    public int compareTo(Alumno o) {
        return  Double.compare(o.getSiesta(), this.getSiesta());
    }
}
