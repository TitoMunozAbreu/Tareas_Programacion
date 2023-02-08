package Empresa_Mensajeria;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase EmpresaMensajeria
 *
 * @version 1.0
 * @author Tito M
 */
public class EmpresaMensajeria {
    private String nombre;
    List<Paquete> paquetes;
    List<Repartidor> repartidores;

    /**
     * Constructor vacio
     */
    public EmpresaMensajeria(){}

    /**
     * Constructor EmpresaMensajeria, 1 parametro
     * @param nombre
     */
    public EmpresaMensajeria(String nombre) {
        this.nombre = nombre;
        this.paquetes = new ArrayList<Paquete>();
        this.repartidores = new ArrayList<Repartidor>();
    }

    /**
     * METODO agregarPaquete al arrays paquetes
     * @param p
     */
    public void agregarPaquete(Paquete p){
        paquetes.add(p);
        System.out.println("** Paquete ingresado al sistema **");
    }

    /**
     * METODO agregarRepartidor al arrays repartidores
     * @param r
     */
    public void agregarRepartidor(Repartidor r){
        repartidores.add(r);
        System.out.println("** Repartidor ingresado al sistema **");
    }

    /**
     * METODO ASIGNAR PAQUETE
     * @param p parametro tipo entero
     * Asigna un paquete a un repartidor disponible. Si no hay repartidores disponibles,
     * debe imprimir un mensaje indicándolo.
     */
    public void asignarPaquete(int id){
        //Recorrer el arrays repartidores
        R:for (Repartidor r:repartidores){
            //Comprobar la disponibilidad del repartidor
            if(r.getDisponibilidad() == EstadoDisponibilidad.DISPONIBLE){
                System.out.println("Repartidor: "+ r.getNombre() + " disponible");
                //Recorrer el arrays paquetes
                for(Paquete paq: paquetes){
                    //Comprobar que el paquete existe en la lista de paquetes
                    if(paq.getId() == id){
                        //Asignar paquete al repartidor
                        r.agegarPaquete(paq);
                    }else{
                        //En caso que no ingrese el paquete
                        System.err.println("** El Paquete no se encuentra agregado al sistema **");
                    }
                    //Finalizar el bucle
                    break R;
                }
            }else {
                //En caso que no existan repartidores disponibles
                System.err.println("** ¡En este momento NO hay repartidores disponibles! **");
            }
        }

    }

    /**
     * METODO entregarPaquete
     * @param id parametro tipo entero
     * Marca un paquete como entregado y cambia el estado de disponibilidad del repartidor
     * a "No disponible" hasta que se complete la entrega.
     */
    public void entregarPaquete(int id){
        //Recorrer el arrays repartidores
        for (Repartidor r: repartidores){
            //Comprobar que el paquete existe en la lista de paquetes del repartidor
            if(r.getPaquetes().getId() == id){
                //Cambiar el estado del paquete a entregado
                r.paquetes.get(id).setEntrega(EstadoEntrega.ENTREGADO);
                //Cambiar el estado del repartidor a NO disponible
                r.setDisponibilidad(EstadoDisponibilidad.NO_DISPONIBLE);
                System.out.println("** Paquete en entrega **");
            }else{
                //En caso que no existan paquetes en la lista de repartidores
                System.err.println("** El Paquete no se encuentra agregado al sistema **");
            }
            break;
        }
    }

    /**
     * METODO imprimirPaquetes
     * Devuelve un listado de los paquetes
     */
    public void imprimirPaquetes(){
        System.out.println(paquetes.toString());
    }

    /**
     * METODO imprimirRepartidores
     * Devuelve un listado de los repartidores
     */
    public void imprimirRepartidores(){
        System.out.println(repartidores.toString());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
