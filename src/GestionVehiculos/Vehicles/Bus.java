package GestionVehiculos.Vehicles;

public class Bus extends Vehicle {
    private int numberSeats;
    private int numberStandingPassengers;

    public Bus(){}

    public Bus(String make, String model, int year, String licensePlate, char color, double weight, int numberWheels, int numberSeats, int numberStandingPassengers) {
        super(make, model, year, licensePlate, color, weight, numberWheels);
        this.numberSeats = numberSeats;
        this.numberStandingPassengers = numberStandingPassengers;
    }

    public void pickUp(){
        //TODO
    }

    public void dropOff(){
        //TODO
    }

    public void announceStop(){
        //TODO
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
