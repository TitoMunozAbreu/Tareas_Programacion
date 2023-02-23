package Hospital.medico;

import Hospital.TrabajadorHospital;

public abstract class Medico extends TrabajadorHospital {
    private int numeroColegiado;

    public Medico(){}

    public Medico(String nombre, String DNI, int numeroColegiado){
        super(nombre, DNI);
        this.numeroColegiado = numeroColegiado;
    }

    public int getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(int numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    @Override
    public abstract void calcularSueldo();

    @Override
    public String toString() {
        return "Medico: " + "\n" +
                super.toString() +
                "numero colegiado = " + numeroColegiado + "\n ";
    }

}
