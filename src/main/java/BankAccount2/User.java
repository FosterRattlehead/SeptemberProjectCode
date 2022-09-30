package BankAccount2;

////this is to replace the User class
//public final class User
//{
//
//    public User(String firstName, String lastname, String email)
//    {
//        this.firstName = firstName;
//    }
//
//    private String firstName;
//    //returns the firstName value
//    public String getFirstName()
//    {
//        return firstName;
//    }
//    //set the firstName value
//    public void setFirstName(String firstName)
//    {
//        this.firstName = firstName;
//    }
//
//
//    private String lastName;
//    public String getLastName()
//    {
//        return lastName ;
//    }
//    public void setLastName(String lastName)
//    {
//        this.lastName = lastName;
//    }
//
//
//    private String email;
//    public String getEmail()
//    {
//        return email;
//    }
//    public void setEmail(String email)
//    {
//        this.email = email;
//    }
//}


public class User {
    // a simple class to add the information that we want in our main method
    private static String firstName;
    private static String lastName;
    private static String email;

    public User(String firstName, String lastName, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public static String getName()
    {
        return firstName;
    }

    public static String getLastName()
    {
        return lastName;
    }

    public static String getEmail()
    {
        return email;
    }
}