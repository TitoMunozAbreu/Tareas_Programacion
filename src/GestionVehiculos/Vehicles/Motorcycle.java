package GestionVehiculos.Vehicles;

public class Motorcycle extends Vehicle {
    private int engineSize;


    public Motorcycle(){}

    public Motorcycle(String make, String model, int year, String licensePlate, char color, double weight, int numberWheels, int engineSize) {
        super(make, model, year, licensePlate, color, weight, numberWheels);
        this.engineSize = engineSize;
    }

    public void revEngine(){
        //TODO
    }

    public void PopWheelie(){
        //TODO
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
