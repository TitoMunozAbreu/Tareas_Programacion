package GestionVehiculos.Vehicles;

public class Truck extends Vehicle {
    private double carryingCapacity;
    private int numberAxles;

    public Truck(){}

    public Truck(String make, String model, int year, String licensePlate, char color, double weight, int numberWheels, double carryingCapacity, int numberAxles) {
        super(make, model, year, licensePlate, color, weight, numberWheels);
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
