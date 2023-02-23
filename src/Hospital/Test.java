package Hospital;

import Hospital.medico.Cardiologa;
import Hospital.medico.Cirujana;
import Hospital.medico.Medico;
import Hospital.medico.Pediatra;
import Hospital.noMedico.Enfermero;
import Hospital.noMedico.Limpiador;
import Hospital.noMedico.Recepcionisto;

public class Test {

    public static void main(String[] args) {
        TrabajadorHospital t1 = new Cardiologa("Cleopatra","546654X", 12354, 8);
        TrabajadorHospital t2 = new Pediatra("Frida","8743324X", 9875, 5);
        TrabajadorHospital t3 = new Cirujana("Elisa","654234Y", 654, 2);
        TrabajadorHospital t4 = new Enfermero("Violeta","97845X");
        TrabajadorHospital t5 = new Limpiador("Grecia","465123Y");
        TrabajadorHospital t6 = new Recepcionisto("Francia","5648X");

        TrabajadorHospital[] empleados = {t1, t2, t3, t4, t5, t6};
        for(TrabajadorHospital empleado : empleados){
            empleado.calcularSueldo();
            System.out.println(empleado.toString());
        }

        //Acceder a los metodos del objeto Cardiologa a traves del casting
        System.out.println("Bonificacion de " + t1.getNombre() + " " + ((Cardiologa)t1).getBonificacion());





    }



}
