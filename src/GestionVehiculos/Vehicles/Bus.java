package GestionVehiculos.Vehicles;

import GestionVehiculos.Exceptions.NotFoundException;

public class Bus extends Vehicle {
    private int numberSeats;
    private int numberStandingPassengers;

    int capacityPassangers = numberSeats + numberStandingPassengers;

    int passanger;

    public Bus(){}

    public Bus(String make, String model, int year, String licensePlate, char color, double weight, int numberWheels, int numberSeats, int numberStandingPassengers, int speed) {
        super(make, model, year, licensePlate, color, weight, numberWheels, speed);
        this.numberSeats = numberSeats;
        this.numberStandingPassengers = numberStandingPassengers;
    }

    public void pickUp(int p){
        if(capacityPassangers > 0){
            System.out.println("** Pasajero ha sido recogido en la parada **\n");
            capacityPassangers--;
            passanger++;
        }else{
            System.out.println("¡El bus esta en su capacidad max!");
        }
    }

    public void dropOff(){
        if(passanger > 0){
            System.out.println("** Pasajero se ha bajado en la parada **\n");
            passanger--;
            capacityPassangers++;
        }else{
            System.out.println("¡No hay pasajeros en el bus!");
        }
    }

    public void announceStop(){
        if(passanger > 0){
            System.out.println("** Anuncio de parada **\n");
        }else{
            System.out.println("¡No hay pasajeros en el bus!");
        }
    }

    @Override
    public boolean starEngine() throws NotFoundException{
        boolean starEngine = false;
        if(stopEngine() == false){
            System.out.println("** Motor encendido **\n");
            starEngine = true;
        }else{
            throw new NotFoundException("¡El motor ya se encuentre encendido!\n");
        }
        return starEngine;
    }

    @Override
    public void accelerate(int velocity) throws NotFoundException {
        if(starEngine()){
            super.setSpeed(velocity);
            System.out.println("** Bus a " + super.getSpeed() + "km/h **\n");
        }else {
            throw new NotFoundException("¡Debes encender antes el bus!\n");
        }
    }

    @Override
    public boolean stopEngine() throws NotFoundException {
        boolean stopEngine = false;
        if(starEngine()){
            stopEngine = true;
            System.out.println("** Apagando motor **\n");
        }else {
            throw new NotFoundException("¡El motor se encuentra apagado!\n");
        }
        return  stopEngine;
    }

    @Override
    public void park() {
        System.out.println("** Coche parkeado **\n");
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public int getNumberStandingPassengers() {
        return numberStandingPassengers;
    }

    public void setNumberStandingPassengers(int numberStandingPassengers) {
        this.numberStandingPassengers = numberStandingPassengers;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "numberOfSeats=" + this.getNumberSeats() + "\n" +
                ", numberStandingPassengers=" + this.getNumberStandingPassengers() + "\n";
    }
}
