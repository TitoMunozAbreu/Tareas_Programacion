package GestionVehiculos.Parking;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ParkingTicket {
    private  int ticketNumber;
    private LocalDateTime dateTime;
    private double amountDue;

    public ParkingTicket(){}

    public ParkingTicket(int ticketNumber, LocalDateTime dateTime, double amountDue) {
        this.ticketNumber = ticketNumber;
        this.dateTime = dateTime;
        this.amountDue = amountDue;
    }

    public void generateTicket(){
        //TODO
    }

    public void calculateFee(){
        //TODO
    }


}
