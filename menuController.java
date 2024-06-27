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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class menuController {

    @FXML
    private AnchorPane menuAnch;

    @FXML
    private Button menuBack;

    @FXML
    private CheckBox menuCheckBox1;

    @FXML
    private CheckBox menuCheckBox2;

    @FXML
    private ImageView menuImg1;

    @FXML
    private Button nonVeglabel1;

    @FXML
    private ImageView menuImg2;

    @FXML
    private Label menuLabel1;

    @FXML
    private Label menuLabel2;

    @FXML
    private Button menuNonVegBtn;

    @FXML
    private Button menuVegBtn;

    @FXML
    void menuCheckBox1(ActionEvent event) {

    }

    @FXML
    void menuCheckBox2(ActionEvent event) {

    }
    

    @FXML
    void menuVegBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/loginpage/VEGMENU1.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root, 600, 400);
        stage.setScene(scene1);
        stage.show();
    }

    public void menuBack2(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/loginpage/Dashboard.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root, 600, 400);
        stage.setScene(scene1);
        stage.show();
    }

    public void menuNonVegBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/loginpage/non-veg.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root, 600, 400);
        stage.setScene(scene1);
        stage.show();
    }
}
