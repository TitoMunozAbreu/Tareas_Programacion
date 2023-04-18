package AppGestionSocios;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<Socio> socios = new TreeSet<>();
        GestionSocios gestionSocios = new GestionSocios("socios.dat");
        gestionSocios.desplegarMenu();


    }
}
