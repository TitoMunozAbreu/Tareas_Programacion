package VideoClub;

public class Cliente {
    private int codigo;
    private String nombre;
    private Bono bono;

    public Cliente(){}

    public Cliente(int codigo, String nombre, Bono bono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.bono = bono;
    }

    public void registrarCliente(){
        //TODO
    }

    public void registrar(){
        //TODO
    }

    public void modificarCliente(){
        //TODO
    }

    public void modificar(){
        //TODO
    }

    public void eliminarCliente(){
        //TODO
    }

    public void eliminar(){
        //TODO
    }

    public void insertar(){
        //TODO
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Bono getBono() {
        return bono;
    }

    public void setBono(Bono bono) {
        this.bono = bono;
    }
}
