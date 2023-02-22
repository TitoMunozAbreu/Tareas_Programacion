package Hospital;

public class NoMedico extends Trabajador{
    Cargo cargo;

    public NoMedico(){}

    public NoMedico(String nombre, String DNI, double sueldo, Cargo cargo){
        super(nombre, DNI, sueldo);
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "NO medico: " + "\n" +
                super.toString() +
                "cargo = " + this.getCargo() + "\n";
    }
}
