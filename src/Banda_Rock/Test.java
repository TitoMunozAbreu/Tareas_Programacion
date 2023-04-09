package Banda_Rock;

public class Test {

    public static void main(String[] args) {
        Musico m1 = new Musico("Er che", "75489D", 1200.50,Instrumento.GUITARRA,Disponibilidad.ENTRE_SEMANA);
        Musico m2 = new Musico("Fidel", "58655X", 500.85,Instrumento.BAJO,Disponibilidad.FINES_SEMANA);
        Musico m3 = new Musico("Bolivar", "55662Y", 900.70,Instrumento.BATERIA,Disponibilidad.ENTRE_SEMANA);
        Musico m4 = new Musico("Chavez", "75489S", 750.60,Instrumento.PIANO,Disponibilidad.FINES_SEMANA);
        Musico m5 = new Musico("Evo", "73256X", 1560.30,Instrumento.MICROFONO,Disponibilidad.ENTRE_SEMANA);
        Musico m6 = new Musico("PepeMujica", "59954Y", 300.30,Instrumento.ARMONICA,Disponibilidad.FINES_SEMANA);

        Banda banda = new Banda("Heroes de la Herencia",2003);

        //Mostrar datos de la banda
        System.out.println(banda.toString());

        //Ingresar Musicos
        banda.agregarMusico(m1);
        banda.agregarMusico(m2);
        banda.agregarMusico(m3);
        banda.agregarMusico(m4);
        banda.agregarMusico(m5);
        banda.agregarMusico(m6);

        //GetBajista
        System.out.println(banda.getBajista());

        Musico m7 = new Musico("Ana", "58655X", 500.85,Instrumento.BAJO,Disponibilidad.FINES_SEMANA);

        //Sustituir bajista
        banda.sustituirBajista(m7);

        System.out.println(banda.getBajista());


    }

}
