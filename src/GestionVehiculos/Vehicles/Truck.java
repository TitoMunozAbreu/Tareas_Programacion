package GestionVehiculos.Vehicles;

import GestionVehiculos.Exceptions.NotFoundException;

public class Truck extends Vehicle {
    private double carryingCapacity;
    private int numberAxles;

    public Truck(){}

    public Truck(String make, String model, int year, String licensePlate, char color, double weight, int numberWheels, double carryingCapacity, int numberAxles, int speed) {
        super(make, model, year, licensePlate, color, weight, numberWheels, speed);
        this.carryingCapacity = carryingCapacity;
        this.numberAxles = numberAxles;
    }

    public boolean isLoad() throws NotFoundException{
        boolean isLoad = false;
        if(!stopEngine()){
            isLoad = true;
            System.out.println("** Remolcando coche **\n");
        }else{
            throw new NotFoundException("¡Debes apagar el motor para realizar la carga!\n");
        }
        return isLoad;
    }

    public boolean isUnload() throws NotFoundException{
        boolean isUnload = false;
        if(!stopEngine()){
            isUnload = true;
            System.out.println("** Descargando coche remolcado **\n");
        }else{
            throw new NotFoundException("¡Debes apagar el motor para realizar la descarga!\n");
        }
        return isUnload;
    }

    public void tow(Vehicle vehicle) throws NotFoundException{
        if(isLoad() == false && isUnload() == true ){
                if(vehicle.getWeight() <= this.getCarryingCapacity()){
                    System.out.println("** Truck disponible **\n");
                }else{
                    throw new NotFoundException("!El peso del vehiculo supera la capacidad max de la truck!\n");
            }
        }else{
            throw new NotFoundException("!La truck no esta disponible!\n");
        }
    }

    @Override
    public boolean starEngine() throws NotFoundException {
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
    public void accelerate(int velocity) throws NotFoundException{
        if(starEngine()){
            super.setSpeed(velocity);
            System.out.println("** Truck a " + super.getSpeed() + "km/h **\n");
        }else {
            throw new NotFoundException("¡Debes encender antes la truck!\n");
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
    public void park() {System.out.println("** Truck parkeada **\n");}

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getNumberAxles() {
        return numberAxles;
    }

    public void setNumberAxles(int numberAxles) {
        this.numberAxles = numberAxles;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "CarryingCapacity = " + this.getCarryingCapacity() + "\n" +
                "NumberofAxles = " + this.getNumberAxles() + "\n";
    }
}
