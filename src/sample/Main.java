package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        //Test generatoru nahodnych cisel
        Random rn = new Random();
        rn.nextInt();
        System.out.println("Prvni generovani.." + rn.nextInt(100));
        System.out.println("Druhe generovani.." + rn.nextInt(100));
    }


    public static void main(String[] args) {
        launch(args);
    }
}
