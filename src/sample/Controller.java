package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;


import java.util.Optional;




public class Controller {

    /**************************************************************************************************
     * Create image view and text field
     * Create int i for usage movie selection usage
     ***************************************************************************************************/

    private int i = 1;

    @FXML
    private ImageView myImage;

    @FXML
    private JFXTextField numAdultTxt;

    @FXML
    private JFXTextField numKidTxt;

    @FXML
    private JFXTextField movieTxt;

    @FXML
    private JFXTextField numSeniorsTxt;

    @FXML
    private TextArea outputTxt;

    /**************************************************************************************************
     * Create changeImage method
     * Call changeImage when the user click the next button
     * When the changeImage is call, i is added for each click
     * What ever i is equal to, the image assign to that number
     * That image will then load.
     ***************************************************************************************************/

    @FXML
    private void changeImage(ActionEvent event) {

        i++;
        if (i == 1) {
            myImage.setImage(new Image("/sample/Image/41jOy+rrcHL (1).jpg"));
        } else if (i == 2) {
            myImage.setImage(new Image("/sample/Image/HowlMovingCastle.jpg"));
        } else if (i == 3) {
            myImage.setImage(new Image("/sample/Image/MyNeighborTotoro.jpg"));

        } else if (i == 4) {
            myImage.setImage(new Image("/sample/Image/Kiki.jpg"));

        } else if (i == 5) {
            myImage.setImage(new Image("/sample/Image/Mononoke.jpg"));

        } else if (i == 6) {
            myImage.setImage(new Image("/sample/Image/Nausicaa.jpg"));

        } else if (i == 7) {
            myImage.setImage(new Image("/sample/Image/myHero.jpg"));

        } else if (i == 8) {
            myImage.setImage(new Image("/sample/Image/zoo.jpg"));

        } else if (i == 9) {
            myImage.setImage(new Image("/sample/Image/frozen.jpg"));

        } else if (i == 10) {
            myImage.setImage(new Image("/sample/Image/logan.jpg"));

        } else if (i == 11) {
            myImage.setImage(new Image("/sample/Image/us.jpg"));

        } else if (i == 12) {
            myImage.setImage(new Image("/sample/Image/pulp.jpg"));

        } else if (i == 13) {
            myImage.setImage(new Image("/sample/Image/deadpool.jpg"));

        } else if (i == 14) {
            myImage.setImage(new Image("/sample/Image/DeadPool2.jpg"));

        } else if (i >= 15) {
            myImage.setImage(new Image("/sample/Image/getout.jpg"));
            i = 0;
        }

    }
    /**************************************************************************************************
     * Create changeImageBack method
     * Call changeImageBack when the user click the previous button
     * When the changeImage is call, i is subtracted for each click
     * What ever i is equal to, the image assign to that number
     * That image will then load.
     ***************************************************************************************************/

    @FXML
    private void changeImageBack(ActionEvent event) {
        i--;
        if (i == 1) {
            myImage.setImage(new Image("/sample/Image/41jOy+rrcHL (1).jpg"));
            i = 16;
        } else if (i == 2) {
            myImage.setImage(new Image("/sample/Image/HowlMovingCastle.jpg"));
        } else if (i == 3) {
            myImage.setImage(new Image("/sample/Image/MyNeighborTotoro.jpg"));

        } else if (i == 4) {
            myImage.setImage(new Image("/sample/Image/Kiki.jpg"));

        } else if (i == 5) {
            myImage.setImage(new Image("/sample/Image/Mononoke.jpg"));

        } else if (i == 6) {
            myImage.setImage(new Image("/sample/Image/Nausicaa.jpg"));

        } else if (i == 7) {
            myImage.setImage(new Image("/sample/Image/myHero.jpg"));

        } else if (i == 8) {
            myImage.setImage(new Image("/sample/Image/zoo.jpg"));

        } else if (i == 9) {
            myImage.setImage(new Image("/sample/Image/frozen.jpg"));

        } else if (i == 10) {
            myImage.setImage(new Image("/sample/Image/logan.jpg"));
        } else if (i == 11) {
            myImage.setImage(new Image("/sample/Image/us.jpg"));
        } else if (i == 12) {
            myImage.setImage(new Image("/sample/Image/pulp.jpg"));
        } else if (i == 13) {
            myImage.setImage(new Image("/sample/Image/deadpool.jpg"));
        } else if (i == 14) {
            myImage.setImage(new Image("/sample/Image/DeadPool2.jpg"));
        } else if (i >= 15) {
            myImage.setImage(new Image("/sample/Image/getout.jpg"));

        }
    }


    /**************************************************************************************************
     * Create calculatePrice method
     * Call calculatePrice method when the user click on the calculate button
     ***************************************************************************************************/


    @FXML
    void calculatePrice(ActionEvent event) {

        /**************************************************************************************************
         * First two lines presented followed by user input choosing their movie
         * Create the movieC object from the setMovieRating class
         * Store the movie title of whatever the user input into the title of the moviceC object
         * Also declare the rating base on the movie the user input, in the delcareRating method
         ***************************************************************************************************/

        SetMovieRating movieC = new SetMovieRating();
        String movieCC = movieTxt.getText().toLowerCase();
        movieC.setTitle(movieCC);
        movieC.declareRating();
        /**************************************************************************************************
         * User inputs the amount of children
         * Create kid object from kid class
         * set amountKid to whatever the user input
         * store amountKid into movie amount of moiveC object of setRating class
         ***************************************************************************************************/

        Kid kid = new Kid();
        String amountKidWord = numKidTxt.getText();
        int amountKid = Integer.parseInt(amountKidWord);
        kid.setAmount(amountKid);
        movieC.setAmount(amountKid);

        /**************************************************************************************************
         * User inputs the amount of adults
         * Create adult object from the adult class
         * set amountAdult to whatever the user input
         * store amountAdult into adult amount of the adult object of the Adult class
         ***************************************************************************************************/

        Adult adult = new Adult();
        String amountAdultWord = numAdultTxt.getText();
        int amountAdult = Integer.parseInt(amountAdultWord);
        adult.setAmount(amountAdult);

        /**************************************************************************************************
         * User inputs the amount of senior
         * Create senior object from the senior class
         * set amountSenior to whatever the user input
         * store amountSenior into senior amount of the senior object of the senior class User inputs the amount of seniors
         ***************************************************************************************************/

        Senior senior = new Senior();
        String amountSeniorWord = numSeniorsTxt.getText();
        int amountSenior = Integer.parseInt(amountSeniorWord);
        senior.setAmount(amountSenior);
        /**************************************************************************************************
         * Created a total object from the payment class that take in the object adult, kid, and senior as parameters
         ***************************************************************************************************/
        Payment total = new Payment(adult, kid, senior);
        double result = total.grandTotal();
        String grandResult = String.format("$%.2f", result);
        /**************************************************************************************************
         * Create a if/else that only allow the user to have 10 max ticket per category, and no negative numbers.
         * output the grand total, by calling the grandTotal method with the total object
         ***************************************************************************************************/
        if (amountKid >= 0 && amountSenior >= 0 && amountAdult >= 0 && amountKid <= 10 && amountSenior <= 10 && amountAdult <= 10) {


            outputTxt.setText("Total price: " + grandResult);
            movieC.ageCheck();


            /**************************************************************************************************
             * Ask the user if they would like to make another booking?
             * If yes, clear everything from the text field
             * IF no, leave the text field untouch.
             ***************************************************************************************************/

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Would you like to make another booking?", ButtonType.YES, ButtonType.NO);
            final Optional < ButtonType > box = alert.showAndWait();
            if (box.isPresent() && box.get() == ButtonType.YES) {
                System.out.println("You clicked yes...");
                movieTxt.setText("");
                numKidTxt.setText("");
                numAdultTxt.setText("");
                numSeniorsTxt.setText("");
                outputTxt.setText("");

            } else {
                System.out.println("You clicked no...");

            }

        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Please enter a valid number. Min: 0, Max: 10", ButtonType.OK);
            movieTxt.setText("");
            numKidTxt.setText("");
            numAdultTxt.setText("");
            numSeniorsTxt.setText("");
            outputTxt.setText("");
            alert.show();


        }
    }
    /**************************************************************************************************
     * Created a log out button
     * Call the log out method, the user click on the log out button.
     * Change FXML, taking it back to the log in screen when call
     ***************************************************************************************************/

    @FXML
    void logOut(ActionEvent event) throws IOException {
        Parent loginScreenIN = FXMLLoader.load(getClass().getResource("loginScreen.fxml"));
        Scene loginScene = new Scene(loginScreenIN);

        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();

        window.setScene(loginScene);
        window.show();
    }

}