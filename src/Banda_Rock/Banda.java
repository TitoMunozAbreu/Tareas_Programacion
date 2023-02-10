package Banda_Rock;

import java.util.Arrays;

public class Banda {
    private String nombre;
    private int añoFundacion;
    Musico [] musicos;

    int contador_musicos = 0;

    public Banda(){}

    public Banda(String nombre, int añoFundacion) {
        this.nombre = nombre;
        this.añoFundacion = añoFundacion;
        this.musicos = new Musico[6];
    }

    public void agregarMusico(Musico musico){
        for (int i = contador_musicos; i < musicos.length;) {
            musicos[i] = musico;
            contador_musicos++;
            System.out.println("Bievenido!! "+ musicos[i].getNombre() +" rock and roll\n");
            break;
        }
    }

    public void sustituirBajista(Musico musico){
            musicos[1]= musico;
        System.out.println("Sustituido el bajista");

    }

    public String getBajista(){
        String nombre = "";
        for(Musico m:musicos){
            if(m.getInstrumento() == Instrumento.BAJO){
                nombre = m.getNombre();
                break;
            }else{
                nombre = "** No existen bajistas en la banda **\n";
            }
        }
        return nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoFundacion() {
        return añoFundacion;
    }

    public void setAñoFundacion(int añoFundacion) {
        this.añoFundacion = añoFundacion;
    }

    public Musico[] getMusicos() {
        return musicos;
    }

    public void setMusicos(Musico[] musicos) {
        this.musicos = musicos;
    }

    @Override
    public String toString() {
        return "Banda{" +
                 this.getNombre() +
                ", desde " + this.getAñoFundacion() + "}\n";
    }
}
