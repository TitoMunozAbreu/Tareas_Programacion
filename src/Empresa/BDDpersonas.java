package Empresa;

import java.util.ArrayList;

/**
 * Clase BDDpersonas implementa BaseDeDatos
 * @version 1.0
 * @author Tito M
 */
public class BDDpersonas implements BaseDeDatos{
    ArrayList<Persona> personas;

    /**
     * Constructor BDDpersonas
     * Inicializa el ArrayList personas
     */
    public BDDpersonas(){
        this.personas = new ArrayList<>();
    }

    /**
     * Metodo insertar
     * @param p
     * Inserta objetos tipo persona, no permite objetos duplicados
     */
    @Override
    public void insertar(Persona p) {
        //Recorremos el arraylist personas
        for(int i = 0; i <= personas.size(); i++){
            //comprobar si personas contine el objeto Persona p
            if(!personas.contains(p)){
                //Agregar el nuevo objeto a la lista personas
                this.personas.add(p);
                //Mostrar resultado
                System.out.println("** "+ p.getNombre() + ": Ingresado a la BDDpersonas **\n");
            }else{//Mostrar en caso constrario que el objeto ya se encuentre ingresado
                System.out.println("** NO se permite duplicar datos. "+ p.getNombre()
                                    + " se encuentra registrado en la BDDpersonas **\n");
            }
            break;
        }
    }

    /**
     * Metodo actualizar
     * muestra los datos actualizados del arrayList personas
     */
    @Override
    public void actualizar() {
        for(Persona p:personas){
            System.out.println(p.mostrarInformacion());
        }
    }

    /**
     * Metodo eliminar
     * @param p
     * Elimina objetos tipo persona
     */
    @Override
    public void eliminar(Persona p) {
        //Recorremos el arraylist personas
        for (int i = 0; i < personas.size(); i++) {
            //comprobar si personas contine el objeto Persona p
            if(personas.contains(p)){
                //Almacenar el indice del objeto persona, que se encuentra en la lista  personas
                int n = personas.indexOf(p);
                //Eliminar el objeto de la lista personas
                personas.remove(n);
                //Mostrar el resultado
                System.out.println("** "+ p.getNombre() + " Eliminado de la BDDpersonas**\n");
            }else {//Mostrar en caso constrario que el objeto NO exista en la lista personas
                System.out.println("** "+ p.getNombre() + " NO existe en la BDDpersonas**\n");
            }
            break;
        }
    }
}
