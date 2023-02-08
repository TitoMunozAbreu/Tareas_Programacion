package VideoClub;

import java.time.LocalDate;

public class Cabecera extends Alquiler_pelicula{
    private Cliente cliente;
    private LocalDate fecha_entrega;

    public Cabecera(){}

    public Cabecera(Cliente cliente, LocalDate fecha_entrega) {
        this.cliente = cliente;
        fecha_entrega = fecha_entrega;
    }

    public Cabecera(int numero, Cliente cliente, LocalDate fecha_entrega) {
        super(numero);
        this.cliente = cliente;
        this.fecha_entrega = fecha_entrega;
    }

    public void insertarCabecera(){
        //TODO
    }

    public void eliminarCabecera(){
        //TODO
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(LocalDate fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }
}
