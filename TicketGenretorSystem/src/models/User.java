package models;

public class User {

    // ✅ ENCAPSULATION
    // Data members private rakhe gaye hain
    private int userId;
    private String name;

    // CONSTRUCTOR
    // Object creation + data initialization
    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    // ABSTRACTION
    // Getter ke through controlled access
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
