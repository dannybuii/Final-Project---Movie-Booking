/*******************************************************************************************************************
 * Movie Ticket
 *******************************************************************************************************************
 * Final Project
 * Movie application that a user uses to purchase a movie ticket based on a projected selection.
 *
 * Kip Blackard, Danny Bui, Pedram , & Hunter Freeman
 * 22 April 2019
 * CMSC 255 Section 003
 *
 *******************************************************************************************************************/
package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("loginScreen.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
