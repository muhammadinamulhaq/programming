package com.abhishek;

public class Ticket {
    private int ticketId;
    private int price;
    private static int availableTickets;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        Ticket.availableTickets = availableTickets;
    }

    public int calculateTicketCost(int noOfTickets){
//        if(noOfTickets > Ticket.availableTickets){
//            System.out.println("Tickets are not available");
//            return -1;
//        }
        return noOfTickets * this.price;
    }
}
