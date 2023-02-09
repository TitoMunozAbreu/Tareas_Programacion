package Empresa;

public class Test {
    public static void main(String[] args) {
        Persona empleadoUno = new Empleado("Erche","Guevara", 50, 1500.50);
        Persona empleadoDos = new Empleado("San","Martin", 25, 2050.10);
        Persona empleadoTres = new Empleado("Hipatia","Alejandria", 30, 3500.90);

        Persona clienteUno = new Cliente("Mango","conSal", 26,TipoCliente.PREMIUN);
        Persona clienteDos = new Cliente("Papelon","conLimon", 26,TipoCliente.ESTANDAR);
        Persona clienteTres = new Cliente("Caña","deAzucar", 26,TipoCliente.ESTANDAR);

        BDDpersonas bDatos = new BDDpersonas();

        bDatos.insertar(empleadoUno);
        bDatos.insertar(empleadoDos);
        bDatos.insertar(empleadoTres);

        bDatos.insertar(clienteUno);
        bDatos.insertar(clienteDos);
        bDatos.insertar(clienteTres);

        bDatos.eliminar(empleadoUno.getNombre());

        bDatos.actualizar();


    }

}
