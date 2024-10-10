package p1;

import java.util.Random;

public class Flight {
    private String sourceAirport;
    private String destinationAirport;
    private Seat[] seat = new Seat[10];
    private int index = 0;

    public Flight(String sourceAirport, String destinationAirport) {
        this.sourceAirport = sourceAirport;
        this.destinationAirport = destinationAirport;
    }
    public boolean doSeatBooking(Passenger passenger){
        boolean bookingStatus = false;
        if(passenger != null){

            seat[index] = new Seat('a', index+1, true,passenger);
            index++;
            bookingStatus = true;
        }
        return bookingStatus;
    }
    public void displayFlightBookingStatus(){
        for(int i=0; i < seat.length; i++){
            if(seat[i]!=null && seat[i].isBookingStatus()){
                System.out.println(seat[i].toString());
            }
            else {
                System.out.println("Seat A" + (i+1) + " is Free");
            }
        }
    }
    @Override
    public String toString() {
        return "Flight{"+
                "Source: " + sourceAirport +
                ", Destination: " + destinationAirport +
                "}";
    }
}
