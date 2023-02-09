package GestionVehiculos.Vehicles;

public class Car extends Vehicle {
    private int numberDoors;
    private int numberSeats;

    public Car(){}

    public Car(String make, String model, int year, String licensePlate, char color, double weight, int numberWheels, int numberDoors, int numberSeats) {
        super(make, model, year, licensePlate, color, weight, numberWheels);
        this.numberDoors = numberDoors;
        this.numberSeats = numberSeats;
    }

    public void honk(){
        //TODO
    }

    public void openDoor(){
        //TODO
    }

    public void closeDoor(){
        //TODO
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
