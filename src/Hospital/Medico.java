package Hospital;

public class Medico extends Trabajador {
    EspecialidadMedico especialidadMedico;
    int numeroColegiado;
    int numeroPacientes;

    public Medico(){}

    public Medico(String nombre, String DNI, double sueldo, EspecialidadMedico especialidadMedico, int numeroColegiado, int numeroPacientes){
        super(nombre, DNI, sueldo);
        this.especialidadMedico = especialidadMedico;
        this.numeroColegiado = numeroColegiado;
        this.numeroPacientes = numeroPacientes;
    }

    public EspecialidadMedico getEspecialidadMedico() {
        return especialidadMedico;
    }

    public void setEspecialidadMedico(EspecialidadMedico especialidadMedico) {
        this.especialidadMedico = especialidadMedico;
    }

    public int getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(int numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    public int getNumeroPacientes() {
        return numeroPacientes;
    }

    public void setNumeroPacientes(int numeroPacientes) {
        this.numeroPacientes = numeroPacientes;
    }

    @Override
    public String toString() {
        return "Medico: " + "\n" +
                super.toString() +
                "especialidad = " + this.getEspecialidadMedico() +
                "numero colegiado = " + numeroColegiado + "\n " +
                "numero pacientes = " + numeroPacientes + "\n";
    }
}
