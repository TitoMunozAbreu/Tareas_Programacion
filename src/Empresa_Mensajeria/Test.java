package Empresa_Mensajeria;

public class Test {

    public static void main(String[] args) {
        //Crear 3 objetos Paquete
        Paquete p1 = new Paquete("Sevilla", "Barcelona", 1.5,15.85);
        Paquete p2 = new Paquete("Madrid", "Valencia", 7.9,60.10);
        Paquete p3 = new Paquete("Lugo", "Bilbao", 20.3,100.15);

        //Crear 3 objetos Repartidor
        Repartidor r1 = new Repartidor("Er Che", 5658, TipoVehiculo.MOTO);
        Repartidor r2 = new Repartidor("Fidel", 1234, TipoVehiculo.CAMION);
        Repartidor r3 = new Repartidor("Bolivar", 9874, TipoVehiculo.BICICLETA);

        //Crear Objeto Empresa
        EmpresaMensajeria em = new EmpresaMensajeria("Papaya");

        //Ingresar los paquetes a la empresaMensajeria
        em.agregarPaquete(p1);
        em.agregarPaquete(p2);
        em.agregarPaquete(p3);

        System.out.println();

        //Ingresar los repartidores a la empresaMensajeria
        em.agregarRepartidor(r1);
        em.agregarRepartidor(r2);
        em.agregarRepartidor(r3);

        System.out.println();

        //Asignar un paquete al repartidor disponible
        em.asignarPaquete(p1.getId());

        System.out.println();

        //Entregar paquete, cambiar estado del paquete y repartidor
        em.entregarPaquete(p1.getId());

        System.out.println();
        //Listado de paquetes de la empresaMensajeria
        em.imprimirPaquetes();

        System.out.println();
        //Listado de repartidores de la empresaMensajeria
        em.imprimirRepartidores();

    }
}
