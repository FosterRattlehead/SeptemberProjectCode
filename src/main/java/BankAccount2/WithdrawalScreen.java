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
        withdrawalPane.setPadding(new Insets(20, 20, 20, 20));
        withdrawalPane.setHgap(20);
        withdrawalPane.setVgap(20);

        Scene withdrawalScene = new Scene(withdrawalPane, 500, 300);

        Label labelWithdrawalHint = new Label("Please select how much you would like to withdraw: ");
        GridPane.setHalignment(labelWithdrawalHint, HPos.LEFT);

        //withdraw 100 dollars
        Button hundredWithdrawalButton = new Button(" - $100");
        GridPane.setMargin(hundredWithdrawalButton, new Insets(10, 10, 10, 10));
        hundredWithdrawalButton.setOnAction(e ->
        {
        });

        //withdrawal 1000 dollars
        Button thousandWithdrawalButton = new Button(" - $1000");
        GridPane.setMargin(thousandWithdrawalButton, new Insets(0, 10, 10, 10));
        thousandWithdrawalButton.setOnAction(e ->
        {
        });

        //withdraw custom amounts
        Label labelCustomWithdrawal = new Label("Or enter a custom amount below: ");
        GridPane.setHalignment(labelCustomWithdrawal, HPos.LEFT);
        TextField customWithdrawalTextField = new TextField();
        GridPane.setMargin(customWithdrawalTextField, new Insets(0, 10, 10, 10));
        customWithdrawalTextField.setOnAction(e ->
        {
        });

        Button withdrawalButton = new Button("withdraw");
        GridPane.setMargin(withdrawalButton, new Insets(10,10,10,10));
        withdrawalButton.setOnAction(e ->
        {

        });

        //navigate back to previous page
        Button backButton = new Button("Back");
        GridPane.setMargin(thousandWithdrawalButton, new Insets(10, 10, 10, 10));
        backButton.setOnAction(e ->
        {
            mainStage.setScene(PostLoginScreen.display(mainStage));
        });

        withdrawalPane.add(labelWithdrawalHint,0,0);
        withdrawalPane.add(hundredWithdrawalButton, 0, 1);
        withdrawalPane.add(thousandWithdrawalButton, 0, 2);
        withdrawalPane.add(labelCustomWithdrawal, 0, 3);
        withdrawalPane.add(customWithdrawalTextField, 0, 4);
        withdrawalPane.add(withdrawalButton,1,4);
        withdrawalPane.add(backButton, 2, 4);

        return withdrawalScene;
    }
}