package VideoClub;

public class Cuerpo extends Alquiler_pelicula{
    private String pelicula;

    public Cuerpo(){}

    public Cuerpo(String pelicula) {
        this.pelicula = pelicula;
    }

    public Cuerpo(int numero, String pelicula) {
        super(numero);
        this.pelicula = pelicula;
    }

    public void insertarCuerpo(){
        //TODO
    }

    public void eliminarCuerpo(){
        //TODO
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }
}
