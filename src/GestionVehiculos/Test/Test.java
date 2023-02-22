package GestionVehiculos.Test;

import GestionVehiculos.DataBase.JDBC;
import GestionVehiculos.Parking.ParkingLot;
import GestionVehiculos.Parking.ParkingTicket;
import GestionVehiculos.Vehicles.*;

public class Test {
    public static void main(String[] args) {
        //Inicializar objetos tipo Car
        Vehicle car1 = new Car("Ford", "Focus", 2020, "568-YHJ", 'A', 1050.2,4,5,5,120);
        Vehicle car2 = new Car("Seat", "Ibiza", 1990, "123-DFB", 'R', 1360.80,4,3,4,100);
        Vehicle car3 = new Car("Renault", "renault", 2010, "165-SFA", 'V', 1130.50,4,4,5,180);

        //Inicializar objetos tipo Bus
        Vehicle bus1 = new Bus("Volkswagen", "Bus1", 1960, "651-DFB", 'R', 4500, 6, 15,5,80 );
        Vehicle bus2 = new Bus("IVECO", "Bus2", 2008, "562-HJK", 'R', 4500, 6, 5,3,80 );
        Vehicle bus3 = new Bus("Volkswagen", "Bus3", 2006, "132-DFD", 'R', 4500, 6, 4,2,80 );

        //Inicializar objetos tipo Moto
        Vehicle moto1 = new Motorcycle("Yamaha","AX4", 2021,"UIO-879", 'M', 410.5,2,150,60);
        Vehicle moto2 = new Motorcycle("BWM","SDF", 2023,"TRQ-132", 'M', 300,2,150,60);

        //Inicializar objetos tipo Truck
        Vehicle truck1 = new Truck("Zuzuki","zki", 2022,"UIO-879", 'M', 2500,6,3590.5,2,110);

        //Inicializar objetos tipo Parking
        ParkingLot parkingLot = new ParkingLot(8);
        ParkingTicket parkingTicket = new ParkingTicket();

        //Inicializar objeto JDBC
        JDBC jdbc = new JDBC();

        //Inciar conexion a jdbc
        jdbc.connect();

        //Insertar un objeto a la BD vehicle
        jdbc.create(car3);





    }
}
