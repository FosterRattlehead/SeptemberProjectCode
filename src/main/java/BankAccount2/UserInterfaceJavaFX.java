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
        primaryStage.setScene(LoginScreen.display(primaryStage));
        primaryStage.setTitle("The Totally NOT Fraudulent Bank");
        primaryStage.show();

    }
}
