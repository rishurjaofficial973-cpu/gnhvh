package utils;

import java.util.UUID;

public class IdGenerator {

    // ABSTRACTION
    public static int generateTicketId() {

        // UUID generate
        UUID uuid = UUID.randomUUID();

        // UUID → int
        return Math.abs(uuid.hashCode()%10000);
    }
}
