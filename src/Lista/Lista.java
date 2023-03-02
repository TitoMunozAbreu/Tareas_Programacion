package Lista;

import java.util.Arrays;

public class Lista implements Cola, Pila {
    Integer[] tabla;

    public Lista() {
        tabla = new Integer[0];
    }


    @Override
    public Integer[] encolamos(int n) {
        Integer[] tablaUpdate = new Integer[tabla.length + 1];
        for (int i = 0; i < tabla.length ; i++) {
            tablaUpdate[i] = tabla[i];
        }
        tablaUpdate[tablaUpdate.length-1] = n;

        this.tabla = tablaUpdate;

        return tabla;
    }

    @Override
    public Integer[] desencolamos() {
        Integer [] tablaUpdate = new Integer[tabla.length - 1];

        for (int i = 0; i < tablaUpdate.length; i++) {
                tablaUpdate[i] = tabla[i+1];
        }
        this.tabla = tablaUpdate;

        return tabla;
    }


    @Override
    public Integer[] apilar(int n) {
        tabla = Arrays.copyOf(tabla, tabla.length +1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length-1);
        tabla[0] = n;

        return tabla;
    }

    @Override
    public Integer[] desapilar() {
        /*
        Integer[] tablaUpdate = new Integer[tabla.length-1];
        //copiar en la nueva tabla la vieja tabla desde la posicion 1
        for (int i = 0; i < tablaUpdate.length; i++) {
            tablaUpdate[i] = tabla[i+1];
        }
        this.tabla = tablaUpdate;

         */

        /* OPCION QUE FALTA MEJORAR para usar el metodo Arrays.copyOf*/
        Integer[] tablaUpdated = new Integer[tabla.length-1];
        System.arraycopy(tabla, 1, tablaUpdated, 0, tablaUpdated.length);
        this.tabla = tablaUpdated;
        return tabla;

    }





    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.encolamos(5);
        lista.encolamos(6);
        lista.encolamos(7);
        lista.encolamos(8);
        lista.encolamos(9);

        System.out.println(Arrays.toString(lista.tabla));
        lista.desencolamos();

        System.out.println(Arrays.toString(lista.tabla));

        lista.apilar(1);

        System.out.println(Arrays.toString(lista.tabla));

        lista.desapilar();

        System.out.println(Arrays.toString(lista.tabla));


    }


}
