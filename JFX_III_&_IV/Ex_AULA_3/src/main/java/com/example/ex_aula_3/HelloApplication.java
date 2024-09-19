package com.example.ex_aula_3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400); // Dimensões atualizadas
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setResizable(false); // Impede o redimensionamento da janela
        stage.show(); // Mostra a janela
    }

    public static void main(String[] args) {
        launch();
    }
}
