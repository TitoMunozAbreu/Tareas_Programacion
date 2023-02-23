package Hospital.noMedico;

public class Enfermero extends NoMedico{

    public Enfermero(){}

    public Enfermero(String nombre, String DNI) {
        super(nombre, DNI);
    }

    @Override
    public void calcularSueldo() {
        super.setSueldo(2000);
    }

    @Override
    public String toString() {
        return super.toString() +
                "salario = " + super.getSueldo() + "\n";
    }
}
