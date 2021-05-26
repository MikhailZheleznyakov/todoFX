package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        primaryStage.setTitle("ToDo Java");
        showRegistration();


    }

    public void showRegistration() throws IOException{
        FXMLLoader loader = new FXMLLoader(new File("C:/Users/irong/Desktop/2 курс/JAVA/todoFX/src/main/java/sample/views/Registration.fxml").toURI().toURL());
        AnchorPane registration = loader.load();
        Scene scene = new Scene(registration);
        primaryStage.setScene(scene);
        primaryStage.show();

    }



    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
