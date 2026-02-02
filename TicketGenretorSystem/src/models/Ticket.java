package models;

import enums.TicketPriority;
import enums.TicketStatus;

public class Ticket {

    // ENCAPSULATION
    // Ticket ka pura data class ke andar band hai
    private int ticketId;
    private String title;
    private TicketPriority priority;
    private TicketStatus status;

    // ASSOCIATION (HAS-A relationship)
    // Ticket HAS-A User
    private User user;

    // CONSTRUCTOR
    // Ticket object create + initialize hota hai
    public Ticket(int ticketId, String title, TicketPriority priority, User user) {
        this.ticketId = ticketId;
        this.title = title;
        this.priority = priority;
        this.status = TicketStatus.OPEN;
        this.user = user;
    }

    // ABSTRACTION
    // Status direct change nahi hota
    // Method ke through controlled update hota hai
    public void updateStatus(TicketStatus status) {
        this.status = status;
    }

    // ABSTRACTION
    public int getTicketId() {
        return ticketId;
    }

    // ABSTRACTION
    // Ticket details ka internal structure hide
    // Sirf formatted output milta hai
    public void displayTicket() {
        System.out.println("------ Ticket Details ------");
        System.out.println("Ticket ID : " +"CODE"+ ticketId);
        System.out.println("Issue     : " + title);
        System.out.println("Priority  : " + priority);
        System.out.println("Status    : " + status);
        System.out.println("Created By: " + user.getName());
        System.out.println("----------------------------");
    }
}
