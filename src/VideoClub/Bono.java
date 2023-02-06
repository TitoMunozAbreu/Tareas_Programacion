package VideoClub;

import java.time.LocalDate;

public class Bono {
    private double credito;
    private LocalDate periodo;
    private double costo;

    public Bono(){}

    public Bono(double credito, LocalDate periodo, double costo) {
        this.credito = credito;
        this.periodo = periodo;
        this.costo = costo;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public LocalDate getPeriodo() {
        return periodo;
    }

    public void setPeriodo(LocalDate periodo) {
        this.periodo = periodo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
