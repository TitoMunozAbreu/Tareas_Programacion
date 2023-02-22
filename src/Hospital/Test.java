package Hospital;

public class Test {

    public static void main(String[] args) {
        Trabajador trabajador1 = new Medico("Frida", "146564Y", 2500, EspecialidadMedico.CIRUJANO, 5465, 5);
        Trabajador trabajador2 = new Medico("Cleopatra", "5689X", 2250.5, EspecialidadMedico.PEDIATRA, 1335, 10);
        Trabajador trabajador3 = new Medico("Julia", "4654X", 20505.9, EspecialidadMedico.CARDIOLOGA, 98465, 3);
        Trabajador trabajador4 = new NoMedico("Petra", "87653X", 1520, Cargo.ENFERMERA);
        Trabajador trabajador5 = new NoMedico("Concha", "32156X", 1520, Cargo.LIMPIADORES);
        Trabajador trabajador6 = new NoMedico("Carmen", "8626Y", 1510, Cargo.RECEPCIONISTO);

        System.out.println(trabajador1.toString());
        System.out.println(trabajador2.toString());
        System.out.println(trabajador3.toString());
        System.out.println(trabajador4.toString());
        System.out.println(trabajador5.toString());
        System.out.println(trabajador6.toString());

    }



}
