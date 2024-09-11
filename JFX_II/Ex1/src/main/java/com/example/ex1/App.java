package com.example.ex1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando os elementos da interface
        Label labelInstrucao = new Label("Digite seu nome:");
        TextField campoTexto = new TextField();
        Label labelSaudacao = new Label();
        Button botaoOla = new Button("Olá");
        Button botaoSair = new Button("Sair");

        // Ação do botão "Olá"
        botaoOla.setOnAction(e -> {
            String nome = campoTexto.getText();
            labelSaudacao.setText("Olá " + nome);
            labelSaudacao.setStyle("-fx-text-fill: blue;");
        });

        // Ação do botão "Sair"
        botaoSair.setOnAction(e -> {
            primaryStage.close();
        });

        // Layout
        VBox layout = new VBox(10);// Espaçamento entre os elementos
        layout.setPadding(new Insets(15, 20, 15, 20)); // (top, right, bottom, left)
        layout.getChildren().addAll(labelInstrucao, campoTexto, labelSaudacao, botaoOla, botaoSair);

        // Configurando a cena e o palco
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setTitle("Aplicativo Olá JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

