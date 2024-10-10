package p1;
import java.io.*;
import java.util.Scanner;

public class MainClass {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    Flight[] allFlight = new Flight[10];
    int position = 0;
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MainClass app = new MainClass();
        while(true){
            System.out.println("__________Choose one Option__________");
            System.out.println("1. Add Flight");
            System.out.println("2. Show All Flight");
            System.out.println("3. Book Flight");
            System.out.println("4. Booking Status");
            System.out.println("press 0 to exit");
            System.out.println("Enter Choice");
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    app.addFlight();
                    break;
                case 2:
                    app.showAllFlight();
                    break;
                case 3:
                    app.bookFlight();
                    break;
                case 4:
                    app.showBookingStatus();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Wrong Input!!!");
            }
        }
    }

    public void addFlight() throws IOException {
        System.out.println("Enter Flight Details: ");
        System.out.println("Enter Source Airport: ");
        String source = br.readLine();
        System.out.println("Enter Destination Details: ");
        String destination = br.readLine();
        allFlight[position++] = new Flight(source, destination);
    }

    public void showAllFlight(){
        for(int i = 0; i < position; i++){
            System.out.println("Flight ID: "+(i+1));
            System.out.println(allFlight[i].toString());
        }
    }
    public void bookFlight() throws IOException{
        System.out.println("Enter Flight No: ");
        int flightNo = sc.nextInt()-1;
        if (flightNo<0 || flightNo >= position){
            System.out.println("Invalid flight Number");
        }
        System.out.println("Enter Passenger Name: ");
        String passengerName = br.readLine();

        System.out.println("Enter Passenger Age: ");
        int passengerAge = sc.nextInt();

        System.out.println("Enter Passenger Gender: ");
        String passengerGender = br.readLine();

        boolean status = allFlight[flightNo].doSeatBooking(new Passenger(passengerName, passengerAge, passengerGender));
        if(status){
            System.out.println("Booking Status Successful");
        }
        else
            System.out.println("Booking Failed");
    }

    public void showBookingStatus(){
        System.out.println("Enter Flight No: ");
        int flightNo = sc.nextInt()-1;
        if(flightNo < 0 || flightNo >= position){
            System.out.println("Invalid flight Number");
        }

        allFlight[flightNo].displayFlightBookingStatus();
    }

}
