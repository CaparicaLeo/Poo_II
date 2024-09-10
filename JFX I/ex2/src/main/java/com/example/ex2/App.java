package com.example.ex2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("BorderPane define nós em cinco regiões");

        BorderPane borderPane = new BorderPane();

        // Criando os botões
        btn1 = new Button("1º Botão");
        btn2 = new Button("2º Botão");
        btn3 = new Button("3º Botão");
        btn4 = new Button("4º Botão");
        btn5 = new Button("5º Botão");

        // Adicionando o 1º botão no topo centralizado
        HBox topBox = new HBox(btn1);
        topBox.setAlignment(Pos.CENTER);
        topBox.setPadding(new Insets(10));
        borderPane.setTop(topBox);

        // Adicionando o 2º botão à esquerda centralizado verticalmente
        VBox leftBox = new VBox(btn2);
        //leftBox.setAlignment(Pos.CENTER);
        leftBox.setPadding(new Insets(10));
        borderPane.setLeft(leftBox);

        // Adicionando o 3º botão à direita centralizado verticalmente
        VBox rightBox = new VBox(btn3);
        //rightBox.setAlignment(Pos.CENTER);
        rightBox.setPadding(new Insets(10));
        borderPane.setRight(rightBox);

        // Adicionando o 4º botão ao centro
        borderPane.setCenter(btn4);

        // Adicionando o 5º botão no rodapé centralizado
        HBox bottomBox = new HBox(btn5);
        bottomBox.setAlignment(Pos.CENTER);
        bottomBox.setPadding(new Insets(10));
        borderPane.setBottom(bottomBox);

        // Criando a cena
        Scene scene = new Scene(borderPane, 400, 300);

        // Adicionando a cena ao palco
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
