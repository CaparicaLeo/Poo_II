package com.example.ex1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
public class HelloApplication extends Application {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Vbox define os nós verticalmente");
        // Cria um painel
        VBox vbox = new VBox();
        // define espa�amento de 10 pixels entre um n� e o outro no hbox
        vbox.setSpacing(10);
        btn1 = new Button("1 Botao");
        btn2 = new Button("2 Botao");
        btn3 = new Button("3 Botao");
        // Criar um espa�ador entre um n� e outro
        Region spacer = new Region();
        // Adiciona os n�s ao painel hbox
        // Inclui um n� espa�ador entre os dois primeiros bot�es e o terceiro
        vbox.getChildren().addAll(btn1, btn2, spacer, btn3);
        // define espa�amento em torno de hbox de 10 pixels
        vbox.setPadding(new Insets(10));
        // Configura spacer para se ajustar automaticamente na tela
        VBox.setVgrow(spacer, Priority.ALWAYS);
        vbox.setAlignment(Pos.CENTER);
        // Cria uma scene
        Scene scene = new Scene(vbox, 300, 200);
        // Adiciona uma scene ao stage
        primaryStage.setScene(scene);
        // Exibe o stage
        primaryStage.show();
    }
}
