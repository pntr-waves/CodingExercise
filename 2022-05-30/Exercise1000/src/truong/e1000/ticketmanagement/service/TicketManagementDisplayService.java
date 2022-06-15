package truong.e1000.ticketmanagement.service;

import java.util.List;

import truong.e1000.ticketmanagement.model.Ticket;

public class TicketManagementDisplayService {
    public void printTicketList(List<Ticket> ticketList) {
        System.out.println("\n List of Ticket");
        for (Ticket ticket : ticketList) {
            System.out.println("-----------------------------------------");
            System.out.println("Film Name: " + ticket.getFilmName());
            System.out.println("Price: " + ticket.getPrice());
            System.out.println("Show Time: " + ticket.getShowtime());
            System.out.println("Show Date: " + ticket.getShowdate());
        }
    }
}
