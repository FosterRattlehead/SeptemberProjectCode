package BankAccount2;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PostLoginScreen extends UserInterfaceJavaFX
{
    public static Scene display(Stage mainStage)
    {
        GridPane postLoginPane = new GridPane();
        postLoginPane.setPadding(new Insets(60, 60, 60, 60));
        postLoginPane.setHgap(10);
        postLoginPane.setVgap(10);

        Scene postLoginScene = new Scene(postLoginPane, 360, 360);


        //deposit button
        Button depositButton = new Button("Deposit");
        GridPane.setMargin(depositButton, new Insets(60, 0, 0, 0));
        depositButton.setOnAction(e ->
        {
            mainStage.setScene(DepositScreen.display(mainStage));
        });

        //withdrawal button
        Button withdrawButton = new Button("Withdraw");
        GridPane.setMargin(withdrawButton, new Insets(120, 0, 0, 0));
        withdrawButton.setOnAction(e ->
        {
            mainStage.setScene(WithdrawalScreen.display(mainStage));
        });

        //logout button function
        Button buttonLogout = new Button("Logout");
        GridPane.setMargin(withdrawButton, new Insets(160, 0, 0, 0));
        buttonLogout.setOnAction(e ->
        {
            mainStage.setScene(LoginScreen.display(mainStage));
        });

        postLoginPane.getChildren().addAll(depositButton,withdrawButton,buttonLogout);

        mainStage.setScene(postLoginScene);
        mainStage.setTitle("The Totally NOT Fraudulent Bank");
        mainStage.show();

        return postLoginScene;
    }

}
