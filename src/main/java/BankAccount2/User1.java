package BankAccount2;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

//this is to replace the User class
public class User1
{
    private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");

    public StringProperty firstNameProperty()
    {
        return firstName;
    }

    public String getFirstName()
    {
        return firstName.get();
    }

    public void setFirstName(String firstName)
    {
        this.firstName.set(firstName);
    }

    private StringProperty lastName = new SimpleStringProperty(this, "lastName", "");

    public StringProperty lastNameProperty()
    {
        return lastName;
    }

    public String getLastName()
    {
        return lastName.get();
    }

    public void setLastName(String lastName)
    {
        this.lastName.set(lastName);
    }

    private StringProperty email = new SimpleStringProperty(this, "email", "");

    public StringProperty emailProperty()
    {
        return email;
    }

    public String getEmail()
    {
        return email.get();
    }

    public void setEmail(String email)
    {
        this.email.set(email);
    }
}
