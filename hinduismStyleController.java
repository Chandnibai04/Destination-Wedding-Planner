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
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class hinduismStyleController {

    @FXML
    private Button hinduismBackBtn;

    @FXML
    private Button hinduismDoneBtn;

    @FXML
    private ImageView hinduismImg2;

    @FXML
    private CheckBox hinduismcheckbox1;

    @FXML
    private CheckBox hinduismcheckbox2;

    @FXML
    private ImageView hinduismimg1;

    @FXML
    private Label hinduismlabel1;

    @FXML
    private Label hinduismlabel2;


    public void hinduismBackBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/loginpage/venue.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root, 600, 400);
        stage.setScene(scene1);
        stage.show();
    }

    public void hinduismDoneBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/loginpage/dashBoard.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root, 600, 400);
        stage.setScene(scene1);
        stage.show();
    }

}
