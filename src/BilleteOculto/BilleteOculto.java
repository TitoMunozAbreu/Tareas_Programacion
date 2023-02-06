package BilleteOculto;

public class BilleteOculto {
    public static void main(String[] args) {
            //Declaramos el valor de las filas y columnas
            int fila = 8;
            int columna = 4;

            //Inicializamos la matriz
            char[][] matriz = new char[fila][columna];



            //Le agregamos un elemento vacio en todas las posiciones de la matriz
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[j].length; j++) {
                    matriz[i][j] = ' ';
                }
            }

            //Generar un numero radom para la fila
            int rfila = (int)(Math.random()* (fila-1) + 1);
            //Generar un numero radom para la columna
            int rcolumna =  (int)(Math.random()* (columna-1) + 1);

            //Guardar en la posicion random los ahorros del profesor
            matriz[rfila][rcolumna] = '€';

            //Recorrer la matriz
            for (int i = fila-1; i >= 0 ; i--) {
                //Imprimir la posicion de la fila
                System.out.print(i + "|");
                for (int j = 0; j < columna; j++) {
                    //Comprobar donde se encuentre los ahorros
                    if(i != rfila && j != rcolumna){
                        //mostrar vacia la matriz
                        System.out.print(matriz[i][j]);
                    }else{
                        //muestra la ubicacion de los ahorros del profesor
                        System.out.print("\t" + matriz[i][j]);
                    }
                }
                System.out.println();
            }

            //Facilitar la posicion de las columnas en la matriz
            for (int k = 0; k < columna; k++) {
                System.out.print("\t_");
            }
            System.out.println();
            for (int k = 0; k < columna; k++) {
                System.out.print("\t" + k  );
            }

            //PEDAZO E CONCHITA E MANGO!!!!


    }
}