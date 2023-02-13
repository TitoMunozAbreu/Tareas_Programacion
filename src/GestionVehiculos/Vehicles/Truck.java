package GestionVehiculos.Vehicles;

public class Truck extends Vehicle {
    private double carryingCapacity;
    private int numberAxles;

    public Truck(){}

    public Truck(String make, String model, int year, String licensePlate, char color, double weight, int numberWheels, double carryingCapacity, int numberAxles, int speed) {
        super(make, model, year, licensePlate, color, weight, numberWheels, speed);
        this.carryingCapacity = carryingCapacity;
        this.numberAxles = numberAxles;
    }

    public void load(){
        //TODO
    }

    public void unload(){
        //TODO
    }

    public void tow(){
        //TODO
    }

    @Override
    public boolean starEngine() {
        return false;
    }

    @Override
    public void accelerate(int velocity) {

    }

    @Override
    public boolean stopEngine() {
        return false;
    }

    @Override
    public void park() {

    }

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
