package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sample.models.Category;

public class CategoryController {
    @FXML
    private TableView<Category> tableCategory;
    @FXML
    private TableColumn<Category, String> nameColumn;
}
