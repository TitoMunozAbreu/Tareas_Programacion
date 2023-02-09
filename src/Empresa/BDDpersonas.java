package Empresa;

import java.util.ArrayList;

public class BDDpersonas implements BaseDeDatos{
    ArrayList<Persona> personas;

    public BDDpersonas(){
        this.personas = new ArrayList<>();
    }


    @Override
    public void insertar(Persona p) {
        this.personas.add(p);
        System.out.println("** "+ p.getNombre() + ": Ingresado a la BDDpersonas **\n");
        /*
        for(Persona persona:personas){
            if(!persona.getNombre().equals(p.getNombre())){
                this.personas.add(p);

            }
        }*/
    }

    @Override
    public void actualizar() {
        for(Persona p:personas){
            System.out.println(p.mostrarInformacion());
        }
    }

    @Override
    public void eliminar(String n) {
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getNombre().equals(n)){
                personas.remove(i);
                System.out.println("** "+ personas.get(i).getNombre() + " Eliminado de la BDDpersonas**\n");
                break;
            }else {
                System.out.println("** "+ n + " NO existe en la BDDpersonas**\n");
            }
        }
    }
}
