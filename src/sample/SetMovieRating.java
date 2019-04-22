package sample;


import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;
import java.util.Scanner;
/**************************************************************************************************
 * Create a setMovingrating class that inherit everything feature from the Person class
 * Inheriting the Person class allow the program to get the Person amount, which will be use
 * in the ageCheck method.
 ***************************************************************************************************/
public class SetMovieRating extends Person {
    private String rating;
    private String title;
    private int noShow;

    public SetMovieRating() {
        this.rating = "Test";
        this.title = "kkada";
    }
    /**************************************************************************************************
     * Getter/Setter
     ***************************************************************************************************/
    public void SetRating(String rating) {
        this.rating = rating;
    }

    public String getRating(String rating) {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle(String title) {
        return title;
    }

    public int returnAmount() {
        return amount;
    }

    /**************************************************************************************************
     * Create a declareRating method that will assign the movie rating base on the user input
     ***************************************************************************************************/

    public void declareRating() {
        switch (title) {
            case "deadpool 2":
            case "logan":
            case "us":
            case "pulp fiction":
            case "deadpool":
            case "get out":
                this.rating = "R";
                break;
            /**************************************************************************************************
             * List of possible user input movies that are rated PG
             ***************************************************************************************************/
            case "spirited away":
            case "howl's moving castle":
            case "my neighbor totoro":
            case "kiki's delivery service":
            case "princess mononoke":
            case "nausicaa":
            case "nausicaa of the valley of the wind":
            case "my hero academia the movie":
            case "my hero academia":
            case "zootopia":
            case "frozen 2":
                this.rating = "PG";
                break;
            /**************************************************************************************************
             * All other movies user input is not in theater
             ***************************************************************************************************/
            default:
                Alert alert = new Alert(Alert.AlertType.WARNING, "This movie is not in theater", ButtonType.OK);
                alert.showAndWait();
        }

    }

    /**************************************************************************************************
     * Create a method that will check if a kid is trying to purchase rated R movie
     * if there is a kid that is purchasing rated R movie, program will make sure to let him/her know it's rated R
     * the program will let the kid know to show valid ID at the door in order to watch rated R movie
     ***************************************************************************************************/
    public void ageCheck() {
        if (amount > 0 && rating.equals("R")) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION,  " This movie is rated R." +
                    " Are you sure you want to watch?", ButtonType.YES, ButtonType.NO);
            final Optional< ButtonType > box = alert.showAndWait();
            if (box.isPresent() && box.get() == ButtonType.YES) {
                Alert alertID = new Alert(Alert.AlertType.CONFIRMATION,  " Please show valid ID at the door.", ButtonType.OK);
                alertID.showAndWait();
            }
        }
    }

    }


