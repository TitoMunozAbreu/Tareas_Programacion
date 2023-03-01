package Lista;

import java.util.Arrays;

public class Lista implements Cola {
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
    }
}
