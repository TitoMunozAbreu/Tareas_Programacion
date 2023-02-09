package GestionVehiculos.Parking;
import GestionVehiculos.Vehicles.Vehicle;

import java.util.ArrayList;

public class ParkingLot {
    private int numberPakingSpaces;
     ArrayList<Vehicle> vehicles;

     public ParkingLot(){}

    public ParkingLot(int numberPakingSpaces) {
        this.numberPakingSpaces = numberPakingSpaces;
        this.vehicles = new ArrayList<>();
    }

    public void parkVehicle(){
         //TODO
    }

    public void retrieveVehicle(){
        //TODO
    }

    public void checkAvailability(){
        //TODO
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
