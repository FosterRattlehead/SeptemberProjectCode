package BankAccount2;

import javafx.application.Application;
import javafx.stage.Stage;

public class UserInterfaceJavaFX extends Application
{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        User1 user = new User1();
        user.firstNameProperty().addListener((v, oldValue, newValue) ->
        {

        });


        primaryStage.setScene(LoginScreen.display(primaryStage));
        primaryStage.setTitle("The Totally NOT Fraudulent Bank");
        primaryStage.show();


    }
}
