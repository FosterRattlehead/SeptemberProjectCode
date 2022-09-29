package BankAccount2;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class WithdrawalScreen extends Bank
{
    public static Scene display(Stage mainStage)
    {
        GridPane withdrawalPane = new GridPane();
        withdrawalPane.setPadding(new Insets(60, 60, 60, 60));
        withdrawalPane.setHgap(10);
        withdrawalPane.setVgap(10);

        Scene withdrawalScene = new Scene(withdrawalPane, 360, 360);

        //withdraw 100 dollars
        Button hundredWithdrawalButton = new Button(" - $100");
        GridPane.setMargin(hundredWithdrawalButton, new Insets(30, 0, 0, 0));
        hundredWithdrawalButton.setOnAction(e ->
        {
        });

        //withdrawal 1000 dollars
        Button thousandWithdrawalButton = new Button(" - $1000");
        GridPane.setMargin(thousandWithdrawalButton, new Insets(60, 0, 0, 0));
        thousandWithdrawalButton.setOnAction(e ->
        {
        });

        //withdraw custom amounts
        Label labelCustomWithdrawal = new Label("Enter Custom Amount: ");
        GridPane.setHalignment(labelCustomWithdrawal, HPos.LEFT);
        TextField customWithdrawalTextField = new TextField();
        GridPane.setMargin(customWithdrawalTextField, new Insets(90, 0, 0, 0));
        customWithdrawalTextField.setOnAction(e ->
        {
        });

        //navigate back to previous page
        Button backButton = new Button("Back");
        GridPane.setMargin(thousandWithdrawalButton, new Insets(120, 0, 0, 0));
        backButton.setOnAction(e ->
        {
            mainStage.setScene(PostLoginScreen.display(mainStage));
        });

        withdrawalPane.getChildren().addAll(hundredWithdrawalButton,thousandWithdrawalButton,
               labelCustomWithdrawal ,customWithdrawalTextField,backButton);

        return withdrawalScene;
    }
}