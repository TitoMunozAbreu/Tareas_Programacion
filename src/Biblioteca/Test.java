package Biblioteca;

public class Test {
    public static void main(String[] args) {
        Libro libroUno = new Libro("Papaya", "Melon", 5, 0);

        System.out.println(libroUno.prestamoLibro());
        System.out.println(libroUno.devolucionLibro());

        System.out.println(libroUno.devolucionLibro());
    }
}
