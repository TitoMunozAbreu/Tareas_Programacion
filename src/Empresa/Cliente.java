package Empresa;

/**
 * Clase Cliente extiende de Persona
 * @version 1.0
 * @author Tito M
 */
public class Cliente extends Persona {
    TipoCliente tipo;

    /**
     * Constructor vacio
     */
    public Cliente(){}

    /**
     * Constructo Cliente, 4 parametros
     * @param nombre
     * @param apellido
     * @param edad
     * @param tipo
     */
    public Cliente(String nombre, String apellido, int edad, TipoCliente tipo) {
        super(nombre, apellido, edad);
        this.tipo = tipo;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    /**
     *Metodo abstracto
     * @return devuelve los datos del empleado
     */
    @Override
    public String mostrarInformacion() {
        return "Cliente: \n +"
                +"Nombre: " + super.getNombre() + "\n"
                +"Apellido: " + super.getApellido() + "\n"
                +"Edad: " + super.getEdad() + "\n"
                +"Tipo CLiente: " + getTipo() + "\n";
    }


}
