package AppGestionSocios.exceptions;

public class SocioNoExiste extends Exception{
    @Override
    public String toString() {
        return "Socio, NO EXISTE en el sistema";
    }
}
