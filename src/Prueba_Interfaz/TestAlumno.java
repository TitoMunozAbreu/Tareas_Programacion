package Prueba_Interfaz;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;

public class TestAlumno {
    public static void main(String[] args) {
        // Lista de asignaturas
        String[] asignaturas = {"BBDD PrimeroDAM", "Programacion PrimeroDAM", "Entorno PrimeroDam"};
        //Lista de alumnos
        Alumno[] alumnos = {
                    new Alumno("Fidel","1234",618998028,"fidel@papaya.es", 2, asignaturas),
                    new Alumno("Bolivar","3456",789520256,"bolivar@papaya.es", 5, asignaturas),
                    new Alumno("Cristina","7890",658978652,"cristina@papaya.es", 1, asignaturas),
                    new Alumno("Ala","6357",987564235,"ala@papaya.es", 10, asignaturas)
                            };

        System.out.println("Empieza el numero por 6?: " + alumnos[0].isEmpiezaPorSeis());
        System.out.println("Empieza el numero por 6?: " + alumnos[1].isEmpiezaPorSeis());
        //Mostrar alumnos
        System.out.println("\t ** LISTA DE ALUMNOS SIN ORDENAR **");
        System.out.println(Arrays.toString(alumnos));

        //Ordernas lista por siesta
        System.out.println("\t \n ** LISTA DE ALUMNOS ORDENADOS POR HRS SIESTA **");
        Arrays.sort(alumnos);
        System.out.println(Arrays.toString(alumnos));

        Comparator<Alumno> orderedByPhone = (m1,m2) -> (int) (m1.getMovil()-m2.getMovil());

        //Ordernas lista por telefono
        System.out.println("\t \n ** LISTA DE ALUMNOS ORDENADOS POR MOVIL **");
        Arrays.sort(alumnos,orderedByPhone);
        System.out.println(Arrays.toString(alumnos));

        ListaAlumnos listaAlumnos = new ListaAlumnos(alumnos);

        listaAlumnos.metodoEncolar(new Alumno("ConchitaMango","6546",987564235,"conchita@papaya.es", 2, asignaturas));

        //Imprimir lista encolando alumnos
        System.out.println("\t \n ** ENCOLAR ALUMNOS **");
        System.out.println(Arrays.toString(listaAlumnos.getAlumnos()));

        listaAlumnos.metodoDesencolar();
        //Imprimir lista desencolando alumnos
        System.out.println("\t \n ** DESENCOLAR ALUMNOS **");
        System.out.println(Arrays.toString(listaAlumnos.getAlumnos()));

    }
}
