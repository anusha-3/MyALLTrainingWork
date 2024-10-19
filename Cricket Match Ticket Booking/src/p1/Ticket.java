package p1;

import java.util.List;

public class Ticket {
	
	private int bookingID;
	private String ticketID;
	private int seatNumber;
	private Audiance audiance;
	
	
	public Ticket(int bookingID, String ticketID, int seatNumber, Audiance audiance) {
		super();
		this.bookingID = bookingID;
		this.ticketID = ticketID;
		this.seatNumber = seatNumber;
		this.audiance = audiance;
	}


	public int getBookingID() {
		return bookingID;
	}
	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}
	public String getTicketID() {
		return ticketID;
	}
	public void setTicketID(String ticketID) {
		this.ticketID = ticketID;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public Audiance getAudiance() {
		return audiance;
	}
	public void setAudiance(Audiance audiance) {
		this.audiance = audiance;
	}


	@Override
	public String toString() {
		return "Ticket [Booking ID=" + bookingID + ", Ticket ID=" + ticketID + ", Seat Number=" + seatNumber
				+ ", Audiance=" + audiance + "]";
	}
	
	
	
	

}
