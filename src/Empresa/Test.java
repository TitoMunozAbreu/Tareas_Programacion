package Empresa;

public class Test {
    public static void main(String[] args) {
        //Incializar 3 objetos empleados
        Persona empleadoUno = new Empleado("Erche","Guevara", 50, 1500.50);
        Persona empleadoDos = new Empleado("San","Martin", 25, 2050.10);
        Persona empleadoTres = new Empleado("Hipatia","Alejandria", 30, 3500.90);

        //Incializar 3 objetos cliente
        Persona clienteUno = new Cliente("Mango","conSal", 26,TipoCliente.PREMIUN);
        Persona clienteDos = new Cliente("Papelon","conLimon", 26,TipoCliente.ESTANDAR);
        Persona clienteTres = new Cliente("Caña","deAzucar", 26,TipoCliente.ESTANDAR);

        //Incializar el objeto BDDpersonas
        BDDpersonas bDatos = new BDDpersonas();

        //Insertar datos de tipo cliente en la BDDpersonas
        bDatos.insertar(clienteUno);
        bDatos.insertar(clienteDos);
        bDatos.insertar(clienteTres);

        //Insertar datos de tipo empleado en la BDDpersonas
        bDatos.insertar(empleadoDos);
        bDatos.insertar(empleadoTres);
        bDatos.insertar(empleadoUno);

        //Comprobar que no permita ingresar objetos repetidos
        bDatos.insertar(clienteUno);
        bDatos.insertar(empleadoTres);

        //Eliminar datos de tipo empleado en la BDDpersonas
        bDatos.eliminar(empleadoUno);

        //Eliminar datos de tipo cliente en la BDDpersonas
        bDatos.eliminar(clienteTres);

        //Comprobar que no permita eliminar  objetos que NO existan
        bDatos.eliminar(empleadoUno);
        bDatos.eliminar(clienteTres);

        //Mostrar lista actualizado de tipo Personas en la BDDpersonas
        bDatos.actualizar();


    }

}
