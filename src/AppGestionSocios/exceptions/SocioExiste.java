package AppGestionSocios.exceptions;

public class SocioExiste extends Exception{
    @Override
    public String toString() {
        return "Socio, YA EXISTE en el sistema";
    }
}
