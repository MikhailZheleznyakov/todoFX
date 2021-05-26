package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegistrationController {
    private Stage stage;

    @FXML
    private TextField textLoginSign;

    @FXML
    private PasswordField passwordSign;

    @FXML
    private Label loginLabelSign;

    @FXML
    private Label passwordLabelSign;


    @FXML
    public void enterRegistration(){
        stage.close();
    }


}
