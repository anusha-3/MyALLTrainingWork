package p1;

public class Seat {
    private char row;
    private int column;
    private boolean bookingStatus;
    private Passenger passenger;

    public Seat(char row, int column, boolean bookingStatus, Passenger passenger) {
        this.row = row;
        this.column = column;
        this.bookingStatus = bookingStatus;
        this.passenger = passenger;
    }

    public char getRow() {
        return row;
    }

    public void setRow(char row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    @Override
    public String toString(){
        return "Seat{" +
                "Row: "+ row +
                ", Column: " + column +
                ", Booking Status: "+ bookingStatus+
                ", Passenger: " + passenger.toString() +
                "}";
    }
}
