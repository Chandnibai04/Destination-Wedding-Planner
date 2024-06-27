package com.example.loginpage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class muslimStyleController {

    @FXML
    private Button MuslimDoneBtn;

    @FXML
    private CheckBox muslimCheckbox1;

    @FXML
    private CheckBox muslimCheckbox2;

    @FXML
    private Label muslimDecLabel;

    @FXML
    private Label muslimDoneLabel;

    @FXML
    private AnchorPane muslimMainAnc;

    @FXML
    private Button muslimbackbtn;

    @FXML
    void muslimBack(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/loginpage/venue.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root, 600, 400);
        stage.setScene(scene1);
        stage.show();
    }

    public void muslimDone(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/loginpage/dashBoard.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root, 600, 400);
        stage.setScene(scene1);
        stage.show();
    }
}


