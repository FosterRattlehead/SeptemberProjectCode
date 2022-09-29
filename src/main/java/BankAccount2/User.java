package BankAccount2;


public class User {
    // a simple class to add the information that we want in our main method
    private String name;
    private String lastName;
    private String email ;

    public User(String name, String lastName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}