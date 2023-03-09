package Telecomunicaciones;

import java.time.LocalDateTime;
import java.util.*;


public class TestLlamadas {
    public static void main(String[] args) {

        Llamada l1 = new Llamada(1,6,LocalDateTime.now(),LocalDateTime.now().plusHours(1),true,ZonaInterlocutor.DEU);
        Llamada l2 = new Llamada(2,7,LocalDateTime.now(),LocalDateTime.now().plusHours(2),true,ZonaInterlocutor.USA);
        Llamada l3 = new Llamada(3,8,LocalDateTime.now(),LocalDateTime.now().plusHours(3),true,ZonaInterlocutor.MA);
        Llamada l4 = new Llamada(4,9,LocalDateTime.now(),LocalDateTime.now().plusHours(4),true,ZonaInterlocutor.CHN);
        Llamada l5 = new Llamada(5,10,LocalDateTime.now(),LocalDateTime.now().plusHours(5),true,ZonaInterlocutor.VEN);

        //Almacenando las llamadas: unsorted ArrayList
        ArrayList<Llamada> llamadas = new ArrayList<>();
        llamadas.add(l5);
        llamadas.add(l4);
        llamadas.add(l3);
        llamadas.add(l2);
        llamadas.add(l1);

        //Collections.sort(llamadas);


        /*
        //Almacenando las llamadas: sorted TreeSet
        Set<Llamada> llamadas = new TreeSet<>();
        llamadas.add(l5);
        llamadas.add(l4);
        llamadas.add(l3);
        llamadas.add(l2);
        llamadas.add(l1);
        */

        //Implementando la interfaz Comparator
        Comparator<Llamada> sortedByLlamada = (Ll1,Ll2) -> Ll1.duracionMinutos() -Ll2.duracionMinutos();
        Comparator<Llamada> sortedByCoste = (Ll1,Ll2) -> (int) (Ll2.calcularCoste() - Ll1.calcularCoste());

        //Collections.sort(llamadas,sortedByLlamada);
        Collections.sort(llamadas,sortedByCoste);


        System.out.println(llamadas);




    }
}
