package Prueba_Interfaz;

import java.util.Arrays;

public class ListaAlumnos implements Cola {

    private Alumno[] alumnos;

    public ListaAlumnos(Alumno[] alumnos){
        this.alumnos = alumnos;
    }

    @Override
    public Alumno[] metodoEncolar(Alumno alumno) {
        Alumno[] a = Arrays.copyOf(alumnos, alumnos.length + 1);
        System.arraycopy(alumnos,0,a,0,alumnos.length);
        a[a.length-1] = alumno;

        this.alumnos = a;

        return this.alumnos;
    }

    @Override
    public Alumno[] metodoDesencolar() {
        Alumno[] a = Arrays.copyOf(alumnos, alumnos.length-1);
        System.arraycopy(alumnos, 1, a, 0, a.length);

        this.alumnos = a;

        return  this.alumnos;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }
}
