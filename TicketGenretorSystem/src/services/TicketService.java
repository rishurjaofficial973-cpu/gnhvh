package services;

import java.util.ArrayList;
import java.util.List;

import enums.TicketPriority;
import enums.TicketStatus;
import models.Ticket;
import models.User;
import utils.IdGenerator;

public class TicketService {

    // ENCAPSULATION
    // Ticket list direct access se protected hai
    private List<Ticket> tickets = new ArrayList<>();

    // ABSTRACTION
    // Business logic user se hide hai
    public Ticket createTicket(String issue, TicketPriority priority, User user) {

        // OBJECT CREATION
        int ticketId = IdGenerator.generateTicketId();
        Ticket ticket = new Ticket(ticketId, issue, priority, user);

        tickets.add(ticket);
        return ticket;
    }

    // ABSTRACTION
    // Ticket close karne ka internal logic hide
    public void closeTicket(int ticketId) {
        for (Ticket ticket : tickets) {
            if (ticket.getTicketId() == ticketId) {
                ticket.updateStatus(TicketStatus.CLOSED);
            }
        }
    }

    // ABSTRACTION
    public List<Ticket> getAllTickets() {
        return tickets;
    }
}
