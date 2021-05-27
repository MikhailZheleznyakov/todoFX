package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.controllers.CategoryController;
import sample.controllers.RegistrationController;
import sample.controllers.TaskController;
import sample.controllers.ToDoMainController;
import sample.models.Task;

import java.io.File;
import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;
    private ObservableList<Task> taskData = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        primaryStage.setTitle("ToDo Java");
        showRegistration();


    }

    public void showRegistration() throws IOException{
        FXMLLoader loader = new FXMLLoader(new File("C:/Users/irong/Desktop/2 курс/JAVA/todoFX/src/main/java/sample/views/Enter.fxml").toURI().toURL());
        AnchorPane registration = loader.load();
        Scene scene = new Scene(registration);
        primaryStage.setScene(scene);
        RegistrationController controller = loader.getController();
        controller.setMain(this);
        primaryStage.show();

    }

    public void showToDoMain() {
        try {
            // Загружаем сведения об адресатах.
            FXMLLoader loader = new FXMLLoader(new File("C:/Users/irong/Desktop/2 курс/JAVA/todoFX/src" +
                    "/main/java/sample/views/ToDoMain.fxml").toURI().toURL());
            AnchorPane todomain = (AnchorPane) loader.load();
            Scene scene = new Scene(todomain);
            primaryStage.setScene(scene);

            // Даём контроллеру доступ к главному приложению.
            ToDoMainController controller = loader.getController();
            controller.setMain(this);
            primaryStage.show();

        } catch (IOException e) {
        }
    }

    public void showCategory() {
        try {
            // Загружаем сведения об адресатах.
            FXMLLoader loader = new FXMLLoader(new File("C:/Users/irong/Desktop/2 курс/JAVA/todoFX/src" +
                    "/main/java/sample/views/Category.fxml").toURI().toURL());
            AnchorPane todomain = (AnchorPane) loader.load();
            Scene scene = new Scene(todomain);
            primaryStage.setScene(scene);

            // Даём контроллеру доступ к главному приложению.
            CategoryController controller = loader.getController();
            controller.setMain(this);
            primaryStage.show();

        } catch (IOException e) {
        }
    }

    public boolean showTask(Task task) {
        try {
            // Загружаем fxml-файл и создаём новую сцену
            // для всплывающего диалогового окна.
            FXMLLoader loader = new FXMLLoader(new File("C:/Users/irong/Desktop/2 курс/JAVA/todoFX/src" +
                    "/main/java/sample/views/Task.fxml").toURI().toURL());
            AnchorPane page = (AnchorPane) loader.load();

            // Создаём диалоговое окно Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Edit Task");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            // Передаём адресата в контроллер.
            TaskController controllerEditDialog = loader.getController();
            controllerEditDialog.setDialogStage(dialogStage);
            controllerEditDialog.setTask(task);
            controllerEditDialog.setMain(this);

            // Отображаем диалоговое окно и ждём, пока пользователь его не закроет
            dialogStage.showAndWait();

            return controllerEditDialog.isOkClicked();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }

    public ObservableList<Task> getTaskData() {
        return taskData;
    }
}
