package GestionVehiculos.Vehicles;

import java.util.Objects;

public abstract class Vehicle implements VehiclesOperations {
    private String make;
    private String model;
    private int year;
    private String licensePlate;
    private char color;
    private double weight;
    private int numberWheels;
    private  int speed;

    public Vehicle(){}

    public Vehicle(String make, String model, int year, String licensePlate, char color, double weight, int numberWheels, int speed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
        this.color = color;
        this.weight = weight;
        this.numberWheels = numberWheels;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return getYear() == vehicle.getYear() && getColor() == vehicle.getColor() && Double.compare(vehicle.getWeight(),
                getWeight()) == 0 && getNumberWheels() == vehicle.getNumberWheels() && getSpeed() == vehicle.getSpeed() && Objects.equals(getMake(),
                vehicle.getMake()) && Objects.equals(getModel(),
                vehicle.getModel()) && Objects.equals(getLicensePlate(),
                vehicle.getLicensePlate());
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