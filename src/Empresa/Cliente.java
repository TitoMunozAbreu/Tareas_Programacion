package Empresa;

public class Cliente extends Persona {
    TipoCliente tipo;

    public Cliente(){}

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

    @Override
    public String mostrarInformacion() {
        return "Cliente: \n +"
                +"Nombre: " + super.getNombre() + "\n"
                +"Apellido: " + super.getApellido() + "\n"
                +"Edad: " + super.getEdad() + "\n"
                +"Tipo CLiente: " + getTipo() + "\n";
    }


}
