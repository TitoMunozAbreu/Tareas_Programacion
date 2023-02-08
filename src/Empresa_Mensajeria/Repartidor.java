package Empresa_Mensajeria;

import java.util.ArrayList;

/**
 * Clase Repartidor
 *
 * @version 1.0
 * @author Tito M
 */
public class Repartidor {
    private String nombre;
    private int DNI;
    EstadoDisponibilidad disponibilidad;
    TipoVehiculo vehiculo;
    //Atributo para almacenar diferentes paquetes
    ArrayList<Paquete> paquetes;

    /**
     * Constructor vacio
     */
    public Repartidor(){}

    /**
     * Constructor Repartidor, 3 parametros
     * @param nombre
     * @param DNI
     * @param vehiculo
     */
    public Repartidor(String nombre, int DNI, TipoVehiculo vehiculo) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.vehiculo = vehiculo;
        this.disponibilidad = EstadoDisponibilidad.DISPONIBLE;
        this.paquetes  = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public EstadoDisponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(EstadoDisponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public TipoVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(TipoVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * METODO getpaquete
     * @param id
     * @return Devuelve los datos de un paquete
     */
    public String getPaquete(int id) {
        //inicializar un string vacio
        String r = "";

        //recorrer el array de paquetes
        for(Paquete p:paquetes){
            //comprobar que el paquete existe en el arrays de paquetes
            if(p.getId() == id){
                //almacenar los datos del paquete en la variable
                r = p.toString();
            }else{
                //en caso que no exista el paquete en el arrays de paquete
                r = "El paquete id:  " + id + "no se encuentre asignado a este repartidor";
            }
        }
        return r;
    }

    /**
     * METODO getpaquetes
     * @return Devuelve un objeto tipo Paquete
     */
    public Paquete getPaquetes() {
        Paquete r = new Paquete();
        for(Paquete p:paquetes){
            r = p;
        }
        return r;
    }

    /**
     * METODO agregarPaquete
     * @param p
     * Almacena un paquete en el arrays paquetes
     */
    public void agegarPaquete(Paquete p) {
        this.paquetes.add(p);
        System.out.println("** Paquete asignado al repartidor **");
    }

    @Override
    public String toString() {
        return "\n" + "Repartidor:" + "\n" +
                "nombre = " + this.nombre + "\n" +
                "DNI = " + this.DNI + "\n" +
                "disponibilidad = " + this.disponibilidad + "\n" +
                "vehiculo = " + this.vehiculo + "\n";
    }
}
