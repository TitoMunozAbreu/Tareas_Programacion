package GestionVehiculos.Vehicles;

import GestionVehiculos.Exceptions.NotFoundException;

public class Motorcycle extends Vehicle {
    private int engineSize;


    public Motorcycle(){}

    public Motorcycle(String make, String model, int year, String licensePlate, char color, double weight, int numberWheels, int engineSize, int speed) {
        super(make, model, year, licensePlate, color, weight, numberWheels, speed);
        this.engineSize = engineSize;
    }

    public void revEngine(){
        //TODO
    }

    public void PopWheelie() throws NotFoundException{
        if(starEngine()){
            System.out.println("** PopWheelie **\n");
        }else{
            throw new NotFoundException("¡Debes encender el motor!\n");
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
    public void accelerate(int velocity) throws NotFoundException {
        if(starEngine()){
            super.setSpeed(velocity);
            System.out.println("** Moto a " + super.getSpeed() + "km/h **\n");
        }else {
            throw new NotFoundException("¡Debes encender antes la moto!\n");
        }
    }

    @Override
    public boolean stopEngine()throws NotFoundException {
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
        System.out.println("** Moto parkeada **\n");
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" +
                "engineSize=" + engineSize + "\n";
    }
}
