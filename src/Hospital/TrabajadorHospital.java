package Hospital;

public abstract class TrabajadorHospital {
    private String nombre;
    private String DNI;
    private double sueldo;

    public TrabajadorHospital(){}

    public TrabajadorHospital(String nombre, String DNI){
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getSueldo(){
        return this.sueldo;
    }

    public  void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    public abstract void calcularSueldo();

    @Override
    public String toString() {
        return "Nombre = " + this.getNombre() + "\n" +
                "DNI = " + this.getDNI() + "\n";
    }
}
