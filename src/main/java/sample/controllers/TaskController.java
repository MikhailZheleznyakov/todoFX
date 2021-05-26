package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TaskController {
    @FXML
    private TextField nameTask;
    @FXML
    private TextArea taskDesc;
    @FXML
    private DatePicker deadline;
    @FXML
    private ChoiceBox<String> taskCategory;
}
