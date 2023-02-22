package GestionVehiculos.Parking;

import GestionVehiculos.Exceptions.NotFoundParkingException;
import GestionVehiculos.Vehicles.Vehicle;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ParkingTicket {
    private  int ticketNumber;
    private LocalDateTime dateTime;
    private double amountDue;

    private double parkingFee;

    public ParkingTicket() {
        this.ticketNumber++;
        this.parkingFee = 10;
    }

    public void isGenerateTicket(LocalDateTime entrada, Vehicle vehicle) throws NotFoundParkingException {
        this.dateTime = entrada;
        System.out.println(" TICKET: \n" +
                                dateTime  + "\n" +
                                vehicle.toString() + "\n");

    }

    public double calculateFee(LocalDateTime salida, Vehicle vehicle){
        long horasParked = Duration.between(this.dateTime, salida).toHours();
        double totalFee = horasParked * parkingFee;

        System.out.print("PARKING FEE: ");

        return totalFee;

    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public double getParkingFee() {
        return parkingFee;
    }

    public void setParkingFee(double parkingFee) {
        this.parkingFee = parkingFee;
    }

    @Override
    public String toString() {
        return "ParkingTicket:" + "\n" +
                "TicketNumber = " + ticketNumber + "\n" +
                "AmountDue = " + amountDue + "\n" +
                "ParkingFee = " + parkingFee + "\n";
    }
}
