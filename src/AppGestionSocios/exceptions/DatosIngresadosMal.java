package AppGestionSocios.exceptions;

public class DatosIngresadosMal extends Exception {
    @Override
    public String toString() {
        return "Ingresar una opcion del 1 - 6";
    }
}
