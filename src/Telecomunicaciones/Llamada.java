package Telecomunicaciones;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Llamada implements Comparable<Llamada> {
    private long numeroCliente;
    private long interlocutor;
    private boolean esSaliente;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private ZonaInterlocutor zona;
    private double[] tarifas;

    Map<ZonaInterlocutor, Double> zonaTarifas;

    public Llamada() {
    }

    public Llamada(long numeroCliente, long interlocutor, LocalDateTime inicio, LocalDateTime fin, boolean esSaliente, ZonaInterlocutor zona) {
        this.numeroCliente = numeroCliente;
        this.interlocutor = interlocutor;
        this.inicio = inicio;
        this.fin = fin;
        this.esSaliente = esSaliente;
        this.zona = zona;
        this.zonaTarifas = new TreeMap<>();
        this.tarifas = new double[5];

        //Invocar metodo en el constructor
        establecerTarifa();
    }

    //Establecer tarifas por zonas
    public void establecerTarifa() {
        //Ingresar:  zona (key), tarifa (value)
        zonaTarifas.put(ZonaInterlocutor.DEU, new Double(0.19));
        zonaTarifas.put(ZonaInterlocutor.USA, new Double(0.19));
        zonaTarifas.put(ZonaInterlocutor.MA, new Double(0.22));
        zonaTarifas.put(ZonaInterlocutor.CHN, new Double(0.60));
        zonaTarifas.put(ZonaInterlocutor.VEN, new Double(0.60));
    }

    public int duracionMinutos() {
        //Utilizamos la clase Duration para comparar el tiempo de las llamadas
        Duration duracionMinutos = Duration.between(inicio, fin);
        //Alamacenar en variable la diferencia en minutos
        int minutos = (int) duracionMinutos.toMinutes();

        return minutos;
    }

    public double calcularCoste() {
        //Instanciar con Set la clave
        Set<ZonaInterlocutor> keys = zonaTarifas.keySet();
        //variable calcularCoste
        double calcularCoste = 0;

        //Comprobar que la llamada esSaliente
        if (esSaliente) {
            //Recorrer la clave de las zonas
            for (ZonaInterlocutor z : keys) {
                //Comprobar que la clave coincida con la zona de la llamada realizada
                if (z.equals(this.zona)) {
                    calcularCoste = zonaTarifas.get(z) * duracionMinutos();
                }
            }
        } else {
            System.out.println("La llamada no aplica costos");
        }
        return calcularCoste;
    }

    @Override
    public String toString() {
        return "\n Llamada " + "\n" +
                "NumeroCliente = " + numeroCliente + "\n" +
                "NumeroInterlocutor = " + interlocutor + "\n" +
                "Inicio = " + inicio.format(DateTimeFormatter.ISO_TIME) + "\n" +
                "Duracion = " + this.duracionMinutos() + "\n" +
                "CosteLlamada=" + this.calcularCoste() + "\n";
    }


    public long getNumeroCliente() {
        return numeroCliente;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public Map<ZonaInterlocutor, Double> getZonaTarifas() {
        return zonaTarifas;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public ZonaInterlocutor getZona() {
        return zona;
    }


    @Override
    public int compareTo(Llamada o) {
        int result = Integer.compare((int) this.numeroCliente, (int) o.getNumeroCliente());
        if (result == 0) {
            result = this.inicio.compareTo(o.inicio);
        }

        return result;

    }


}




