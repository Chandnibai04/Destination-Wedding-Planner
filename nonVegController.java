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
import javafx.stage.Stage;

import java.io.IOException;

public class nonVegController {

    @FXML
    private Button nonVegbackBtn;

    @FXML
    private ImageView nonvegIMG1;

    @FXML
    private ImageView nonvegIMG2;

    @FXML
    private ImageView nonvegIMG3;

    @FXML
    private ImageView nonvegIMG4;

    @FXML
    private ImageView nonvegIMG5;

    @FXML
    private Label nonvegLabel1;

    @FXML
    private Label nonvegLabel2;

    @FXML
    private Label nonvegLabel3;

    @FXML
    private Label nonvegLabel4;

    @FXML
    private Label nonvegLabel5;

    @FXML
    void nonVegbackBtn1(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/loginpage/menu1.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root, 600, 400);
        stage.setScene(scene1);
        stage.show();

    }

}
