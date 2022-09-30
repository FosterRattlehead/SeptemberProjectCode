package BankAccount2;

import javafx.geometry.HPos;
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
        postLoginPane.setPadding(new Insets(20, 20, 20, 20));
        postLoginPane.setHgap(20);
        postLoginPane.setVgap(20);

        Scene postLoginScene = new Scene(postLoginPane, 200, 200);


        //deposit button
        Button depositButton = new Button("Deposit");
        GridPane.setHalignment(depositButton, HPos.CENTER);
        depositButton.setOnAction(e ->
        {
            mainStage.setScene(DepositScreen.display(mainStage));
        });

        //withdrawal button
        Button withdrawButton = new Button("Withdraw");
        GridPane.setHalignment(withdrawButton, HPos.CENTER);
        withdrawButton.setOnAction(e ->
        {
            mainStage.setScene(WithdrawalScreen.display(mainStage));
        });

        //logout button function
        Button buttonLogout = new Button("Logout");
        GridPane.setHalignment(buttonLogout, HPos.CENTER);
        buttonLogout.setOnAction(e ->
        {
            mainStage.setScene(LoginScreen.display(mainStage));
        });

        postLoginPane.add(depositButton, 2,0);
        postLoginPane.add(withdrawButton,2,1);
        postLoginPane.add(buttonLogout, 2,2);

        mainStage.setScene(postLoginScene);
        mainStage.setTitle("The Totally NOT Fraudulent Bank");
        mainStage.show();

        return postLoginScene;
    }

}
