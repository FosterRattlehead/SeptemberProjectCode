package BankAccount2;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DepositScreen extends UserInterfaceJavaFX
{
    public static Scene display(Stage mainStage)
    {
        GridPane depositPane = new GridPane();
        depositPane.setPadding(new Insets(20, 20, 20, 20));
        depositPane.setHgap(20);
        depositPane.setVgap(20);

        Scene depositScene = new Scene(depositPane, 500, 300);

        Label labelDepositHint = new Label("Please select how much you would like to deposit: ");
        GridPane.setHalignment(labelDepositHint, HPos.LEFT);

        //deposit 100 dollars
        Button hundredDepositButton = new Button("$100");
        GridPane.setMargin(hundredDepositButton, new Insets(10, 10, 10, 10));
        hundredDepositButton.setOnAction(e ->
        {
        });

        //deposit 1000 dollars
        Button thousandDepositButton = new Button("$1000");
        GridPane.setMargin(thousandDepositButton, new Insets(10, 10, 10, 10));
        thousandDepositButton.setOnAction(e ->
        {
        });

        //deposit custom amount
        Label labelCustomDeposit = new Label("Or enter a custom amount below: ");
        GridPane.setHalignment(labelCustomDeposit, HPos.LEFT);
        TextField customDepositTextField = new TextField();
        GridPane.setMargin(customDepositTextField, new Insets(0, 10, 10, 10));
        customDepositTextField.setOnAction(e ->
        {

        });

        Button depositButton = new Button("deposit");
        GridPane.setMargin(depositButton, new Insets(10,10,10,10));
        depositButton.setOnAction(e ->
        {

        });

        //go back to the previous page
        Button backButton = new Button("Back");
        GridPane.setMargin(thousandDepositButton, new Insets(10, 10, 10, 10));
        backButton.setOnAction(e ->
        {
            mainStage.setScene(PostLoginScreen.display(mainStage));
        });


        depositPane.add(labelDepositHint,0,0);
        depositPane.add(hundredDepositButton, 0, 1);
        depositPane.add(thousandDepositButton, 0, 2);
        depositPane.add(labelCustomDeposit, 0, 3);
        depositPane.add(customDepositTextField, 0, 4);
        depositPane.add(depositButton,1,4);
        depositPane.add(backButton, 2, 4);

        return depositScene;
    }
}
