package GestionVehiculos.Vehicles;

import GestionVehiculos.Exceptions.NotFoundException;

public class Car extends Vehicle {
    private int numberDoors;
    private int numberSeats;

    private int doorsOpened = 0;

    public Car(){}

    public Car(String make, String model, int year, String licensePlate, char color, double weight, int numberWheels, int numberDoors, int numberSeats, int speed) {
        super(make, model, year, licensePlate, color, weight, numberWheels, speed);
        this.numberDoors = numberDoors;
        this.numberSeats = numberSeats;
    }

    public void honk(){
        System.out.println("¡BEEP BEEP!\n");
    }

    public void openDoor(int cantidad) throws NotFoundException {
        if(doorsOpened <= numberDoors){
            System.out.println("** "+ cantidad + " Puerta abierta **\n");
            doorsOpened += cantidad;
        }else{
            throw new NotFoundException("¡Todas las puertas se encuentran abiertas!\n");
        }
    }

    public void closeDoor(int cantidad) throws NotFoundException{
        if(doorsOpened > 0){
            System.out.println("** " + cantidad + " Puerta cerrada **\n");
            doorsOpened -= cantidad;
        }else{
            throw new NotFoundException("¡Todas las puertas se encuentran cerradas!\n");
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
    public void accelerate(int velocity)throws NotFoundException {
        if(starEngine() && doorsOpened == 0){
            if(velocity <= super.getSpeed()){
                System.out.println("** Coche a " + super.getSpeed() + "km/h **\n");
            }else{
                throw new NotFoundException("¡Velocidad max del coche: " + super.getSpeed() + " km/h!\n");
            }
        }else{
            throw new NotFoundException("¡Debera encender antes el coche y cerrar las puertas\n");
        }
    }

    @Override
    public boolean stopEngine() throws NotFoundException {
        boolean stopEngine = false;
        if(starEngine()){
            stopEngine = true;
            System.out.println("** Apagando motor **\n");
        }else {
            throw new NotFoundException("¡El motor se encuentra apagado!");
        }
        return  stopEngine;
    }

    @Override
    public void park(){
        System.out.println("** Coche parkeado **\n");
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "NumberOfDoors =" + this.getNumberDoors() + "\n" +
                "NumberOfSeats =" + this.getNumberSeats() + "\n";
    }


}
