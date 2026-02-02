import java.util.Scanner;

import enums.TicketPriority;
import models.User;
import services.TicketService;

public class UserPanel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TicketService ticketService = new TicketService();

        System.out.println("=== Welcome to Ticket Generator System ===");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        User user = new User(1, name);

        System.out.print("Enter your problem: ");
        String problem = sc.nextLine();

        System.out.println("Select Priority:");
        System.out.println("1. LOW");
        System.out.println("2. MEDIUM");
        System.out.println("3. HIGH");

        //  SAFE INPUT
        String input = sc.next();

        TicketPriority priority;

        switch (input) {
            case "1":
            case "LOW":
            case "low":
                priority = TicketPriority.LOW;
                break;

            case "2":
            case "MEDIUM":
            case "medium":
                priority = TicketPriority.MEDIUM;
                break;

            case "3":
            case "HIGH":
            case "high":
                priority = TicketPriority.HIGH;
                break;

            default:
                System.out.println(" Invalid priority selected!");
                sc.close();
                return;
        }

        // ABSTRACTION
        ticketService.createTicket(problem, priority, user);

        System.out.println("\n Ticket Generated Successfully!\n");

        // POLYMORPHISM
        ticketService.getAllTickets().forEach(ticket -> {
            ticket.displayTicket();
        });

        sc.close();
    }
}
