package GestionVehiculos.Vehicles;

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

    public void openDoor(int cantidad){
        if(doorsOpened <= numberDoors){
            System.out.println("** "+ cantidad + " Puerta abierta **\n");
            doorsOpened += cantidad;
        }else{
            System.out.println("¡Todas las puertas se encuentran abiertas!\n");
        }
    }

    public void closeDoor(int cantidad){
        if(doorsOpened > 0){
            System.out.println("** " + cantidad + " Puerta cerrada **\n");
            doorsOpened -= cantidad;
        }else{
            System.out.println("¡Todas las puertas se encuentran cerradas!\n");
        }
    }

    @Override
    public boolean starEngine() {
        boolean starEngine = false;
        if(stopEngine() == false){
            System.out.println("** Motor encendido **");
            starEngine = true;
        }else{
            System.out.println("¡El motor ya se encuentre encendido!\n");
        }

        return starEngine;
    }

    @Override
    public void accelerate(int velocity) {

        if(starEngine()){
            if(getSpeed() <= velocity){
                System.out.println("** Coche a " + super.getSpeed() + "km/h **\n");
            }else{
                System.out.println("¡NO es posible acelerar mas, recuerda velocidad max del coche: " + super.getSpeed());
            }
        }else{
            System.out.println("¡El coche se encuentra apagado, imposible acelerar\n");
        }

    }

    @Override
    public boolean stopEngine() {
        boolean stopEngine = false;
        if(starEngine()){
            stopEngine = true;
        }else {
            System.out.println("¡El motor se encuentra apagado!");
        }
        return  stopEngine;
    }

    @Override
    public void park() {

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
