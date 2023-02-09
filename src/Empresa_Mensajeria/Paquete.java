package Empresa_Mensajeria;

/**
 * Clase Paquete
 *
 * @version 1.0
 * @author Tito M
 */
public class Paquete {
    private String d_origen;
    private String d_destino;
    private double peso;
    private double costo;
    EstadoEntrega entrega;
    private int id = 1;

    /**
     * Constructor vacio
     */
    public Paquete(){}

    /**
     * Contrustor Paquete, con 4 parametros
     * @param d_origen
     * @param d_destino
     * @param peso
     * @param costo
     */
    public Paquete(String d_origen, String d_destino, double peso, double costo) {
        this.d_origen = d_origen;
        this.d_destino = d_destino;
        this.peso = peso;
        this.costo = costo;
        this.entrega = EstadoEntrega.NO_ENTREGADO;
        this.id = id++;
    }

    public String getD_origen() {
        return d_origen;
    }

    public void setD_origen(String d_origen) {
        this.d_origen = d_origen;
    }

    public String getD_destino() {
        return d_destino;
    }

    public void setD_destino(String d_destino) {
        this.d_destino = d_destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public EstadoEntrega getEntrega() {
        return entrega;
    }

    public void setEntrega(EstadoEntrega entrega) {
        this.entrega = entrega;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\n" + "Paquete:" + "\n" +
                "id = " + this.id + "\n" +
                "d_origen = " + this.d_origen + "\n" +
                "d_destino = " + this.d_destino + "\n" +
                "peso = " + this.peso + "\n" +
                "costo = " + this.costo + "\n" +
                "entrega = " + this.entrega + "\n";
    }
}
