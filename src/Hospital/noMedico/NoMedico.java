package Hospital.noMedico;

import Hospital.TrabajadorHospital;

public abstract class NoMedico extends TrabajadorHospital {

    public NoMedico(){}

    public NoMedico(String nombre, String DNI){
        super(nombre, DNI);
    }

    @Override
    public String toString() {
        return super.toString() +
                "cargo: " + this.getClass().getSimpleName() +  "\n" ;
    }
}
