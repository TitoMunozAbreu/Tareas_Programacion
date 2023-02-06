package VideoClub;

import java.time.LocalDate;

public class Fecha_Entrega {
    private LocalDate fecha;

    public  Fecha_Entrega(){}

    public Fecha_Entrega(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
