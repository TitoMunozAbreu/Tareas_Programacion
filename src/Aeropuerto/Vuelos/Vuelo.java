package Aeropuerto.Vuelos;

import Aeropuerto.Personas.Azafato;
import Aeropuerto.Personas.Pasajero;
import Aeropuerto.Personas.Piloto;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Vuelo {
    private String origen;
    private String destino;
    private LocalTime timeOrigen;
    private LocalTime timeLlegada;
    Piloto piloto;
    Set<Pasajero> pasajeros;

    public Vuelo(){}

    public Vuelo(String origen, String destino, LocalTime timeOrigen, LocalTime timeLlegada, Piloto piloto) {
        this.origen = origen;
        this.destino = destino;
        this.timeOrigen = timeOrigen;
        this.timeLlegada = timeLlegada;
        this.piloto = piloto;
        this.pasajeros = new HashSet<>();
    }

    public void agregarPasajeros(Pasajero pasajero){
        pasajeros.add(pasajero);
        System.out.println("** Pasajero agregado al vuelo **");
    }

    public String tiempoVuelo(LocalTime t1, LocalTime t2){
        long tiempoVuelo = Duration.between(t1,t2).toHours();
        return tiempoVuelo + " ";
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Set<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Set<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public LocalTime getTimeOrigen() {
        return timeOrigen;
    }

    public void setTimeOrigen(LocalTime timeOrigen) {
        this.timeOrigen = timeOrigen;
    }

    public LocalTime getTimeLlegada() {
        return timeLlegada;
    }

    public void setTimeLlegada(LocalTime timeLlegada) {
        this.timeLlegada = timeLlegada;
    }

    @Override
    public String toString() {
        return "Vuelo" + "\n" +
                "Origen = " + this.getOrigen() + "\n" +
                "Destino = " + this.getDestino() + "\n" +
                "TiempoVuelo = " + tiempoVuelo(this.getTimeOrigen(),this.getTimeLlegada()) + "\n" +
                "Piloto = " + this.getPiloto() + "\n" +
                "Pasajeros = " + pasajeros + "\n";
    }
}
