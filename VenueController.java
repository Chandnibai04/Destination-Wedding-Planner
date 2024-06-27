package com.example.loginpage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class VenueController {

    @FXML
    private Button VenueBackBtn;

    @FXML
    private Button VenueChriBtn;

    @FXML
    private Button VenueHinBtn;

    @FXML
    private AnchorPane venueAnc2;

    @FXML
    private Label venueLabel;

    @FXML
    private AnchorPane venueMainAnc;

    @FXML
    private Button venueMusBtn;

    @FXML
    private AnchorPane venueanch1;

    @FXML
    private ImageView venueimg;



    @FXML
    void VenueChristainBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/loginpage/christianstyle.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root, 600, 400);
        stage.setScene(scene1);
        stage.show();
    }

    @FXML
    void VenueHindusimBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/loginpage/hinduismStyle.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root, 600, 400);
        stage.setScene(scene1);
        stage.show();

    }

    @FXML
    void VenueMuslimBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/loginpage/muslimStyle.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root, 600, 400);
        stage.setScene(scene1);
        stage.show();
    }

    @FXML
    void weddingStyleBackBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/loginpage/dashBoard.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root, 600, 400);
        stage.setScene(scene1);
        stage.show();

    }

}
