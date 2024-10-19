package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookingService {
	
	private ArrayList<Ticket> allTicket = new ArrayList<Ticket>();
	int position = 0;
	final int maxTicket = 50;
	
	public boolean bookTicket(Audiance audiance, int bookingID) {
		if(position < maxTicket) {
			String ticketID;
			int seatNumber = position+1;
			Random random = new Random();
			int n = 10+random.nextInt(90);
			ticketID = ""+bookingID+seatNumber+n;
			Ticket ticket = new Ticket(bookingID, ticketID, seatNumber, audiance);
			allTicket.add(ticket);
			
			System.out.println(ticket);
			position++;
			return true;
		}
		return false;		
		
	}
	
	public ArrayList<Ticket> getBookTicketInfo(int bookingID) {
		ArrayList<Ticket> temp = new ArrayList<Ticket>();
		for(Ticket ticket : allTicket) {
			if(ticket.getBookingID() == bookingID) {
				
				temp.add(ticket);
			}
		}
		
		return temp;
	}
	
	public ArrayList<Ticket> showAllTicket(){
		
		return allTicket;
		
	}

}
