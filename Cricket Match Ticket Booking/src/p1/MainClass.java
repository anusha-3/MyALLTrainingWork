package p1;
import java.util.*;

import org.w3c.dom.UserDataHandler;

import exception.ExceedsMaxTicketException;
import exception.PhoneNumberAlreadyRegisteredExcepion;

import java.io.*;


public class MainClass {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BookingService bookingService = new BookingService();
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        MainClass app = new MainClass();
        while (true) {

            System.out.println("1. Audiance Ticket Booking");
            System.out.println("2. View Ticket Booking Status ");
            System.out.println("3. Admin View Seat Reports");
            System.out.println("0. EXIT");
            System.out.println("========================");
            System.out.println("Enter Choice: ");

            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    app.bookTicket();
                    break;
                case 2:
                	app.showTicketByBookingID();
                    break;
                case 3:
                    app.showAllTickets();
                    break;
                    
                case 0:
                	System.exit(0);

                default:
                    System.out.println("Wrong Option");
                    break;
            }
        }
		
	}
	
	List<Audiance> allAudience = new ArrayList<Audiance>();
	
	public void bookTicket() throws Exception {
		
		System.out.println("Enter Phone Number: ");
		long phoneNumber = Long.parseLong(br.readLine());
		
		for(Audiance audience : allAudience) {
			if(audience.getPhoneNumber() == phoneNumber)
				throw new PhoneNumberAlreadyRegisteredExcepion(phoneNumber);
		}
		
		System.out.println("Number of Ticket you want to book: ");
		int ticketNumber = Integer.parseInt(br.readLine());
		if(ticketNumber > 5)
			throw new ExceedsMaxTicketException("You can not book more than 5 tickets!!!");
		
		if(ticketNumber > (50-bookingService.showAllTicket().size())) {
			throw new ExceedsMaxTicketException("Only " + (50-bookingService.showAllTicket().size()) + " Tickets are available." );
		
		}
		Random random = new Random();
		int bookingID = 100+random.nextInt(900);
		for(int i = 0; i < ticketNumber; i++) {
			System.out.println("Enter Name: ");
			String name = br.readLine(); 
			
			System.out.println("Enter Gender: ");
			String gender = br.readLine(); 
			
			System.out.println("Enter age: ");
			int age = Integer.parseInt(br.readLine()); 
			
			Audiance audiance = new Audiance(name, gender, age, phoneNumber);
			allAudience.add(audiance);

			
			boolean isBooked = bookingService.bookTicket(audiance,bookingID);
			
			if(isBooked) {
				System.out.println("Ticket Booked");
				System.out.println(audiance);
			}
			else 
				System.out.println("Booking Failed");
			
		}
	
    }
	
	
	
	public void showTicketByBookingID() throws Exception{
		 System.out.println("Enter BookingID: ");
		 int bookingID = Integer.parseInt(br.readLine());
		 
		 ArrayList<Ticket> tickets = bookingService.getBookTicketInfo(bookingID);
		 System.out.println(tickets);
		 
	}
	
	
	public void showAllTickets() {
		ArrayList<Ticket> allTicketInfo = bookingService.showAllTicket();
		for(Ticket ticket : allTicketInfo) {
			System.out.println(ticket);
		}
		System.out.println("Available Tickets: " + (50-allTicketInfo.size()));
	}


}
