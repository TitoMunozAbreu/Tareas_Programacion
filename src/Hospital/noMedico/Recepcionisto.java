package Hospital.noMedico;

public class Recepcionisto extends NoMedico {

    public Recepcionisto(){}

    public Recepcionisto(String nombre, String DNI) {
        super(nombre, DNI);
    }

    @Override
    public void calcularSueldo() {
        super.setSueldo(1500);
    }

    @Override
    public String toString() {
        return super.toString() +
                "salario = " + super.getSueldo() + "\n";
    }
}
