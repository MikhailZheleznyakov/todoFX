package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sample.models.Task;

public class ToDoMainController {
    @FXML
    private TableView<Task> tableToDo;
    @FXML
    private TableColumn<Task, String> taskColumn;
    @FXML
    private TableColumn<Task, String> deadlineColumn;



}
