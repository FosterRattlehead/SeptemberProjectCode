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
        depositPane.setPadding(new Insets(60, 60, 60, 60));
        depositPane.setHgap(10);
        depositPane.setVgap(10);

        Scene depositScene = new Scene(depositPane, 360, 360);

        //deposit 100 dollars
        Button hundredDepositButton = new Button("$100");
        GridPane.setMargin(hundredDepositButton, new Insets(10, 0, 0, 0));
        hundredDepositButton.setOnAction(e ->
        {
        });

        //deposit 1000 dollars
        Button thousandDepositButton = new Button("$1000");
        GridPane.setMargin(thousandDepositButton, new Insets(10, 0, 0, 0));
        thousandDepositButton.setOnAction(e ->
        {
        });

        //deposit custom amount
        Label labelCustomDeposit = new Label("Enter Custom Amount: ");
        GridPane.setHalignment(labelCustomDeposit, HPos.LEFT);
        TextField customDepositTextField = new TextField("Custom");
        GridPane.setMargin(customDepositTextField, new Insets(10, 0, 0, 0));
        customDepositTextField.setOnAction(e ->
        {

        });

        //go back to the previous page
        Button backButton = new Button("Back");
        GridPane.setMargin(thousandDepositButton, new Insets(10, 0, 0, 0));
        backButton.setOnAction(e ->
        {
            mainStage.setScene(PostLoginScreen.display(mainStage));
        });

        return depositScene;
    }
}
