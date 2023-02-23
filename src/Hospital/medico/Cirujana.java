package Hospital.medico;

public class Cirujana extends Medico {
    private double bonificacion;
    private double salarioBase;
    private int numeroPacientes;

    public Cirujana(){}

    public Cirujana(String nombre, String DNI, int numeroColegiado, int numeroPacientes) {
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
        //base de bonificacion
        this.setBonificacion(200);
        this.setSalarioBase(8333.33);
        super.setSueldo(this.getSalarioBase()+(this.getBonificacion()*this.getNumeroPacientes()));
    }

    @Override
    public String toString() {
        return super.toString() +
                "especialidad: " + this.getClass().getSimpleName() +  "\n" +
                "bonificacion = " + bonificacion + "\n" +
                "numeroPacientes = " + numeroPacientes + "\n" +
                "salario = " + super.getSueldo() + "\n";
    }
}
