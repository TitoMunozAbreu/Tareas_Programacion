package Empresa;

import java.util.Objects;

/**
 * Clase abstracta Persona
 * @version 1.0
 * @author Tito M
 */
public abstract class Persona  {
    private String nombre;
    private String apellido;
    private int edad;

    /**
     * Constructor vacio
     */
    public Persona(){}

    /**
     * Constructor Persona, con 3 parametros
     * @param nombre
     * @param apellido
     * @param edad
     */
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    /**
     * Metodo Abstracto
     * @return
     */
     public abstract String mostrarInformacion();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo equals
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        if (!this.nombre.equals(other.nombre)) {
            return false;
        }
        return this.apellido.equals(other.apellido);
    }


}
