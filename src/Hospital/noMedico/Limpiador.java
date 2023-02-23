package Hospital.noMedico;

public class Limpiador  extends NoMedico{
    public Limpiador(){}

    public Limpiador(String nombre, String DNI) {
        super(nombre, DNI);
    }

    @Override
    public void calcularSueldo() {
        super.setSueldo(1100);
    }

    public String toString() {
        return super.toString() +
                "salario = " + super.getSueldo() + "\n";
    }


}
