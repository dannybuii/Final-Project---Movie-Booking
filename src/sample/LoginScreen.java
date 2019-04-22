package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class LoginScreen implements Initializable {

    /**************************************************************************************************
     * Create usable button and text field
     ***************************************************************************************************/

    @FXML
    private JFXButton quitButton;

    @FXML
    private JFXTextField usernameTxt;

    @FXML
    private JFXPasswordField passwordTxt;

    /**************************************************************************************************
     * Create method to initialize fmxl location
     ***************************************************************************************************/

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    /**************************************************************************************************
     * Create method to log in
     * Call onEnter method if the user click the log in button
     * Bot test, will not open unless both username and password text field are fill in
     * FXML will not change if the user failed the bot test
     ***************************************************************************************************/

    @FXML
    public void onEnter(ActionEvent event) throws IOException {

        if (!usernameTxt.getText().trim().isEmpty() && (!passwordTxt.getText().trim().isEmpty())) {

            Boolean bot = false;
            while (!bot) {
                Alert check = new Alert(Alert.AlertType.CONFIRMATION);
                check.setTitle("Prove that you are human");
                check.setHeaderText("Select a fruit");
                check.setContentText("Choose your option.");

                ButtonType buttonTypeOne = new ButtonType("Apple");
                ButtonType buttonTypeTwo = new ButtonType("Bean");
                ButtonType buttonTypeThree = new ButtonType("Cat");

                check.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeThree);

                Optional < ButtonType > test = check.showAndWait();
                if (test.get() == buttonTypeOne) {
                    bot = true;
                } else if (test.get() == buttonTypeTwo) {} else if (test.get() == buttonTypeThree) {} else {

                }

            }

            bot = false;

            while (!bot) {
                Alert check = new Alert(Alert.AlertType.CONFIRMATION);
                check.setTitle("Prove that you are human");
                check.setHeaderText("What came first the chicken or the egg?");
                check.setContentText("Choose your option.");

                ButtonType buttonTypeOne = new ButtonType("Chicken");
                ButtonType buttonTypeTwo = new ButtonType("Egg");
                ButtonType buttonTypeThree = new ButtonType("Pig");

                check.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeThree);

                Optional < ButtonType > test = check.showAndWait();
                if (test.get() == buttonTypeOne) {
                    bot = true;
                } else if (test.get() == buttonTypeTwo) {
                    bot = true;
                } else if (test.get() == buttonTypeThree) {} else {}

            }


            Parent loginScreenIN = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Scene loginScene = new Scene(loginScreenIN);

            Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();

            window.setScene(loginScene);
            window.show();
        } else if (usernameTxt.getText().trim().isEmpty() && !passwordTxt.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Press enter username", ButtonType.OK);
            alert.showAndWait();
        } else if (passwordTxt.getText().trim().isEmpty() && (!usernameTxt.getText().trim().isEmpty())) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Press enter password", ButtonType.OK);
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Press enter username and password", ButtonType.OK);
            alert.showAndWait();
        }
    }
    /**************************************************************************************************
     * Create method to quit program
     * Call quitProgram method if the user click the quit button
     * Program will exit when the user press the quit button
     ***************************************************************************************************/
    @FXML
    public void quitProgram() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to quit?", ButtonType.YES,
                ButtonType.NO);
        final Optional < ButtonType > box = alert.showAndWait();
        if (box.isPresent() && box.get() == ButtonType.YES) {
            Stage stage = (Stage) quitButton.getScene().getWindow();
            stage.close();
        }
    }

}