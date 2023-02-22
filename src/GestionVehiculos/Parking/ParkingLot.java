package GestionVehiculos.Parking;
import GestionVehiculos.Exceptions.NotFoundParkingException;
import GestionVehiculos.Vehicles.Vehicle;

import java.util.ArrayList;

public class ParkingLot {
    private int numberPakingSpaces;
     ArrayList<Vehicle> vehicles;

     int disponiblidadParking = numberPakingSpaces;

     public ParkingLot(){}

    public ParkingLot(int numberPakingSpaces) {
        this.numberPakingSpaces = numberPakingSpaces;
        this.vehicles = new ArrayList<>();
    }

    public void parkVehicle(Vehicle vehicle) throws NotFoundParkingException {// hacer boolean
        for (int i = 0; i < vehicles.size(); i++) {
            if(!vehicles.contains(vehicle)){
                vehicles.add(vehicle);
                disponiblidadParking --;
                System.out.println(" ** "+ vehicle.getClass() + " ingresando al parking **\n");
                break;
            }else {
                throw new NotFoundParkingException(" !"+ vehicle.getClass() + " ya se encuentra parkeado!\n");
            }
        }
    }

    public void retrieveVehicle(Vehicle vehicle) throws NotFoundParkingException{//hacer boolean
        for (int i = 0; i < vehicles.size(); i++) {
            if(vehicles.contains(vehicle)){
                int indice = vehicles.indexOf(vehicle);
                vehicles.remove(indice);
                System.out.println(" ** "+ vehicle.getClass() + " saliendo del parking **\n");
            }else{
                throw new NotFoundParkingException(" !"+ vehicle.getClass() + " NO se encuentra en el parking!\n");
            }
        }
    }

    public boolean checkAvailability() throws NotFoundParkingException{
         boolean checkAvailability = false;
         if(disponiblidadParking > 0){
            checkAvailability = true;
         }else{
             throw new NotFoundParkingException("!Parking Full!");
         }
        return checkAvailability;
    }

    public int getNumberPakingSpaces() {
        return numberPakingSpaces;
    }

    public void setNumberPakingSpaces(int numberPakingSpaces) {
        this.numberPakingSpaces = numberPakingSpaces;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "ParkingLot:" + "\n" +
                "NumberPakingSpaces = " + this.getNumberPakingSpaces() + "\n" +
                "Vehicles = " + this.getVehicles() + "\n";
    }
}
