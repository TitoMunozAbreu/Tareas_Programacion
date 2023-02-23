package Hospital.medico;

public class Cardiologa extends Medico{
    private double bonificacion = 180;
    private double salarioBase = 5833.33;
    private int numeroPacientes;

    public Cardiologa(){}

    public Cardiologa(String nombre, String DNI, int numeroColegiado, int numeroPacientes) {
        super(nombre, DNI, numeroColegiado);
        this.numeroPacientes = numeroPacientes;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getNumeroPacientes() {
        return numeroPacientes;
    }

    public void setNumeroPacientes(int numeroPacientes) {
        this.numeroPacientes = numeroPacientes;
    }

    @Override
    public void calcularSueldo() {
        double calcularSueldo = this.getSalarioBase()+(this.getBonificacion()*this.getNumeroPacientes());
        super.setSueldo(calcularSueldo);
    }

    @Override
    public String toString() {
        return super.toString() +
                "especialidad: " + this.getClass().getSimpleName() +  "\n" +
                "bonificacion = " + this.getBonificacion() + "\n" +
                "numeroPacientes = " + this.getNumeroPacientes() + "\n" +
                "salario = " + super.getSueldo() + "\n";
    }
}
