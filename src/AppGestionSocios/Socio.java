package AppGestionSocios;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements  Comparable<Socio>, Serializable {

    private static  final long serialVersionUID = 1L;
    private String DNI;
    private String nombre;
    private LocalDate fechaAlta;

    public Socio(){}

    public Socio(String DNI, String nombre, String fechaAlta){
        this.DNI = DNI;
        this.nombre = nombre;
        setFechaAlta(fechaAlta);


    }

    //Getters and Setter
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate f = LocalDate.parse(fechaAlta, formatter);
        this.fechaAlta = f;
    }

    public long fechaAntiguedad(){
        long antiguedad = ChronoUnit.DAYS.between(this.fechaAlta,LocalDate.now());
        return antiguedad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Socio)) return false;
        Socio socio = (Socio) o;
        return DNI.equals(socio.DNI);
    }

    @Override
    public int compareTo(Socio o) {
        return this.DNI.compareTo(o.DNI);
    }

    public int comparator(Socio o){
        return Long.compare(this.fechaAntiguedad(),o.fechaAntiguedad());
    }

    @Override
    public String toString() {
        return "\n Socio " + "\n" +
                "DNI = " + DNI +"\n" +
                "nombre = " + nombre +"\n" +
                "fehaAntiguedad = " + fechaAntiguedad() + "\n";
    }
}
