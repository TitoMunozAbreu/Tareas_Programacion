package Lista;

import java.util.Arrays;
import java.util.Scanner;

public class Lista implements Cola, Pila {
    Integer[] tabla;
    int contador = 0;

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
        Integer[] tablaUpdated = new Integer[tabla.length-1];
        System.arraycopy(tabla, 1, tablaUpdated, 0, tablaUpdated.length);
        this.tabla = tablaUpdated;
        return tabla;

    }

    public void introducirNumerosCola(){
        Scanner sc = new Scanner(System.in);
        int n = 0;


        do {
            System.out.print("Introducir numero a la cola: ");
            n = sc.nextInt();
            if(n >= 0){
                this.encolamos(n);
                contador++;
            }else{
                sc.close();
                System.out.println(Arrays.toString(this.tabla) + "\n");
            }

        }while (n >= 0);
    }
    public void desencolarTodos(){
        System.out.println(" ** Desencolando la cola ** \n");

        while (contador > 0){
            this.desencolamos();
            System.out.println(Arrays.toString(this.tabla));
            contador--;
        }

        System.out.println(" ** Cola desencolada ** \n");
    }

}
