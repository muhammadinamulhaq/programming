package com.abhishek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter movie name");
        String movieName = sc.next();

        System.out.println("Enter no of bookings");
        int noOfBookings = sc.nextInt();

        System.out.println("Enter the available tickets");
        Ticket.setAvailableTickets(sc.nextInt());

        while(noOfBookings > 0) {
            System.out.println("Enter the ticketid");
            int ticketId = sc.nextInt();

            System.out.println("Enter the price");
            int price = sc.nextInt();

            System.out.println("Enter the no of tickets");
            int noOfTickets = sc.nextInt();

            Ticket ticket1 = new Ticket();
            ticket1.setTicketId(ticketId);
            ticket1.setPrice(price);

            System.out.println("Available tickets: " + Ticket.getAvailableTickets());

            if(Ticket.getAvailableTickets() >= noOfTickets) {
                System.out.println("Total amount: " + ticket1.calculateTicketCost(noOfTickets));
                Ticket.setAvailableTickets(Ticket.getAvailableTickets() - noOfTickets);
                if (Ticket.getAvailableTickets() == 0) {
                    System.out.println("House full");
                    break;
                } else {
                    System.out.println("Available tickets after booking: " + Ticket.getAvailableTickets());
                }
            }else{
                System.out.println("Tickets are not available");
            }

            noOfBookings--;
        }
    }
}
