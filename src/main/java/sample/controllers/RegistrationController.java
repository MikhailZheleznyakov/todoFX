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
    private TextField textLoginReg;

    @FXML
    private PasswordField textPasswordReg;

    @FXML
    private PasswordField textAgainPasswordReg;



    @FXML
    public void enterRegistration(){
        stage.close();
    }


}
