package com.example.loginpage;

import db.DbConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class signupController  {

    @FXML
    private Button signupaccount1;

    @FXML
    private AnchorPane signupAnc1;

    @FXML
    private AnchorPane signupAnc2;

    @FXML
    private TextField signupConfirmPass;

    @FXML
    private TextField signupEmail;

    @FXML
    private TextField signupPass;


    @FXML
    private Label signupLabel1;

    @FXML
    private TextField signupName;

    @FXML
    private StackPane signupStack;

    @FXML
    private Label passLabel1;

    @FXML
    private Label passLabel2;


    public void initialize(){
        passLabel1.setVisible(false);
        passLabel2.setVisible(false);

    }
    @FXML
    public void SignupBtn(ActionEvent event) throws IOException {
        register();
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/loginpage/lg.fxml"));
//        Parent root = fxmlLoader.load();
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        Scene scene1 = new Scene(root, 600, 400);
//        stage.setScene(scene1);
//        stage.show();

    }

    public void signupName1(ActionEvent event) {
    }

    public void signupEmail1(ActionEvent event) {
    }

    public void signupPass1(ActionEvent event) {
    }

    public void signupConfirmPass1(ActionEvent event) throws IOException {
        register();

    }

    public void register() throws IOException {
            String newPassword =signupPass.getText();
            String confirmPassword =signupConfirmPass.getText();
            if (newPassword.equals(confirmPassword)){
                setBorderColor("transparent");
                passLabel1.setVisible(false);
                passLabel2.setVisible(false);
                signupPass.requestFocus();
            }
            else{
                setBorderColor("red");
                passLabel1.setVisible(true);
                passLabel2.setVisible(true);
                signupPass.requestFocus();


            }


    }
    public void setBorderColor(String color){
        signupPass.setStyle("-fx-border-color: " + color);
        signupConfirmPass.setStyle("-fx-border-color: " + color);

    }


}
