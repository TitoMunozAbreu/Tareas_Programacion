package Biblioteca;

public class Libro {

    private String tituloLibro;
    private String autor;

    //cantidad de libros disponibles
    private int numeroEjemplares;

    //cantidad de libros prestados
    private int numeroEjemplares_Prestados;

    /**
     * Constructor por defecto.
     */
    public Libro(){}

    /**
     * Constructor con parámetros.
     */
    public Libro(String tituloLibro, String autor, int numeroEjemplares, int numeroEjemplares_Prestados) {
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplares_Prestados = numeroEjemplares_Prestados;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroEjemplares_Prestados() {
        return numeroEjemplares_Prestados;
    }

    /**
     * Método préstamo
     */
    public boolean prestamoLibro(){
        boolean r = false;
        if(this.getNumeroEjemplares() > 0){
            this.numeroEjemplares_Prestados += 1;
            System.out.println("** Disfruta del libro **");
            r = true;
        }else{
            r = false;
            System.out.println("** NO existen ejemplares disponibles **");
        }

        return r;
    }

    /**
     * Método devolución
     */
    public boolean devolucionLibro(){
        boolean r = false;
        if(getNumeroEjemplares_Prestados() > 0){
            this.numeroEjemplares_Prestados -= 1;
            r = true;
            System.out.println("** El libro ha sido devuelto exitosamente** ");
        }else{
            r = false;
            System.out.println("** Este libro NO ha sido prestado **");
        }
        return r;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "tituloLibro='" + tituloLibro + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroEjemplares=" + numeroEjemplares +
                ", numeroEjemplares_Prestados=" + numeroEjemplares_Prestados +
                '}';
    }

}
