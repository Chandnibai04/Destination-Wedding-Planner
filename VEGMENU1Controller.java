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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class VEGMENU1Controller {

    @FXML
    private ImageView VegmenuPIC1;

    @FXML
    private ImageView VegmenuPIC2;

    @FXML
    private ImageView VegmenuPIC3;

    @FXML
    private ImageView VegmenuPIC4;

    @FXML
    private ImageView VegmenuPIC5;

    @FXML
    private ImageView VegmenuPIC6;

    @FXML
    private Button vegbackbtn;

    @FXML
    private AnchorPane vegmenuANC;

    @FXML
    private Label vegmenuLabel1;

    @FXML
    private Label vegmenuLabel2;

    @FXML
    private Label vegmenuLabel3;

    @FXML
    private Label vegmenuLabel4;

    @FXML
    private Label vegmenuLabel5;

    @FXML
    private Label vegmenuLabel6;

    @FXML
    void vegbackbtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/loginpage/menu1.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root, 600, 400);
        stage.setScene(scene1);
        stage.show();
    }

}
