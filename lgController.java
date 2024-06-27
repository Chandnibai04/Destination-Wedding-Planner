package com.example.loginpage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class lgController {

    @FXML
    private AnchorPane L_anch1;

    @FXML
    private AnchorPane l_anch2;

    @FXML
    private ImageView l_img;

    @FXML
    private Label l_label;

    @FXML
    private StackPane l_stack;

    @FXML
    private Button SignUpBtn;

    @FXML
    private Button loginBtn;

    @FXML
    private AnchorPane main_form;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;
    @FXML
    private Label state1;

    public AnchorPane root;


    public void login_btn(ActionEvent event) throws IOException {
        if(username.getText().isBlank() == false && password.getText().isBlank()==false) {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/loginpage/Dashboard.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else{
            state1.setText("please enter username and password");
        }
    }


        @FXML
    void signupBTN(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/loginpage/signup.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
