package Aeropuerto.Test;

import Aeropuerto.Personas.*;
import Aeropuerto.Vuelos.Vuelo;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto("Concha", "Mango", "566645Y", "concha.marta@papaya.com", 2500.50, false, Rango_Piloto.AGUILA);
        Piloto piloto2 = new Piloto("Carmen", "Arroz", "566645Y", "carmen.arroz@papaya.com", 2050.50, false, Rango_Piloto.TANGO);
        Piloto piloto3 = new Piloto("Camila", "Pasta", "566645Y", "camila.pasta@papaya.com", 2160.70, false, Rango_Piloto.ALPHA);

        Azafato azafato1 = new Azafato("Bethooven", "P", "165165X", "bethoveen@papaya.com", 1570.70,new Idioma[]{Idioma.ESPAÑOL,Idioma.FRANCES});
        Azafato azafato2 = new Azafato("Bethooven", "P", "165165X", "bethoveen@papaya.com", 1570.70,new Idioma[]{Idioma.ESPAÑOL,Idioma.FRANCES});
        Azafato azafato3 = new Azafato("Bethooven", "P", "165165X", "bethoveen@papaya.com", 1570.70,new Idioma[]{Idioma.ESPAÑOL,Idioma.FRANCES});

        Pasajero pasajero1 = new Pasajero("Tamarindo", "rico", "654616X", "tamarindo@papaya.com", 456215);
        Pasajero pasajero2 = new Pasajero("Mora", "conLeche", "654616X", "mora@papaya.com", 456215);
        Pasajero pasajero3 = new Pasajero("Pepa", "loca", "654616X", "pepa@papaya.com", 456215);

        Trabajador trabajador1 = new Trabajador("Mango", "conSal", "6516516Y", "mango.conSal@papaya.com", 1100.60);
        Trabajador trabajador2 = new Trabajador("Cambur", "cremaCacahuete", "6516516Y", "cambur@papaya.com", 1100.60);
        Trabajador trabajador3 = new Trabajador("Pitaya", "conSal", "6516516Y", "pitaya@papaya.com", 1100.60);

        Vuelo vuelo = new Vuelo("Kiev", "Sevilla", LocalTime.of(12,30,0), LocalTime.of(16,15,0),piloto1);

        System.out.println(vuelo.toString());

        System.out.println(vuelo.getOrigen());

        vuelo.agregarPasajeros(pasajero1);
        vuelo.agregarPasajeros(pasajero2);
        vuelo.agregarPasajeros(pasajero3);




    }
}
