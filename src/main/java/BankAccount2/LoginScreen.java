package BankAccount2;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginScreen
{
    public static Scene display(Stage mainStage)
    {
        //login window layout
        GridPane loginPane = new GridPane();
        loginPane.setPadding(new Insets(20, 20, 60, 60));
        loginPane.setHgap(15);
        loginPane.setVgap(5);

        Scene loginScene = new Scene(loginPane, 580, 200);

        // Hint for the user
        Label labelHint = new Label("Please enter the following information " +
                "  (Hint: Case sensitive)");
        GridPane.setHalignment(labelHint, HPos.LEFT);

        //LastName
        Label labelLastName = new Label("Lastname");
        GridPane.setHalignment(labelLastName, HPos.LEFT);
        TextField textFieldLastName = new TextField();

        //Firstname
        Label labelFirstName = new Label("Firstname:");
        GridPane.setHalignment(labelFirstName, HPos.LEFT);
        TextField textFieldFirstName = new TextField();


        //Email
        Label labelEmail = new Label("Email:");
        GridPane.setHalignment(labelEmail, HPos.LEFT);
        TextField textFieldEmail = new TextField();

        //Login Button
        Button buttonLogin = new Button("Login");
        GridPane.setMargin(buttonLogin, new Insets(10, 0, 0, 0));
        buttonLogin.setOnAction(e ->
        {
            mainStage.setScene(PostLoginScreen.display(mainStage));
        });

        loginPane.add(labelHint, 1, 0);
        loginPane.add(labelLastName, 0, 2);
        loginPane.add(textFieldLastName, 1, 2);
        loginPane.add(labelFirstName, 0, 3);
        loginPane.add(textFieldFirstName, 1, 3);
        loginPane.add(labelEmail, 0, 4);
        loginPane.add(textFieldEmail, 1, 4);
        loginPane.add(buttonLogin, 1, 5);

        //displays the initial login screen
        mainStage.setScene(loginScene);
        mainStage.setTitle("The Totally NOT Fraudulent Bank");
        mainStage.show();

        return loginScene;
    }
}
