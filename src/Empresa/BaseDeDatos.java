package Empresa;

public interface BaseDeDatos {

    public abstract void insertar(Persona p);

    public abstract void actualizar();

    public abstract void eliminar(String n);

}
