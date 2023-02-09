package GestionVehiculos.Vehicles;

public abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private String licensePlate;
    private char color;
    private double weight;
    private int numberWheels;

    public Vehicle(){}

    public Vehicle(String make, String model, int year, String licensePlate, char color, double weight, int numberWheels) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
        this.color = color;
        this.weight = weight;
        this.numberWheels = numberWheels;
    }

    public void star(){
        //TODO
    }

    public void stop() {
        //TODO
    }

    public void park(){
        //TODO
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    @Override
    public String toString() {
        return "Vehicle:" + "\n" +
                "Make = " + this.getMake() + "\n" +
                "Model = " + this.getModel() + "\n" +
                "Year = " + this.getYear() + "\n" +
                "LicensePlate = " + this.getLicensePlate() + "\n" +
                "Color = " + this.getColor() + "\n" +
                "Weight = " + this.getWeight() + "\n" +
                "NumberWheels=" + this.getNumberWheels() + "\n" ;
    }
}