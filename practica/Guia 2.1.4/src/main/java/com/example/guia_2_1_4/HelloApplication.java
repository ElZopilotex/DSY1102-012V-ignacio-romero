package com.example.guia_2_1_4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void init() {
        System.out.println("init(): Inicializando componentes previos...");
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println("start(): Creando ventana y escena...");

        // Elementos visuales (Nodes)
        Label mensaje = new Label("Bienvenido a la Guía 2.1.4");
        Button btnCambiar = new Button("Cambiar Mensaje");
        Button btnRestablecer = new Button("Restablecer");

        // Eventos de los botones
        btnCambiar.setOnAction(e -> mensaje.setText("¡El evento del botón funciona!"));
        btnRestablecer.setOnAction(e -> mensaje.setText("Bienvenido a la Guía 2.1.4"));

        // Layout de la interfaz (Contenedor)
        VBox layout = new VBox(15, mensaje, btnCambiar, btnRestablecer);
        layout.setAlignment(Pos.CENTER);

        // Creación de la Escena y Escenario
        Scene scene = new Scene(layout, 400, 250);
        primaryStage.setTitle("Actividad 2.1.4 - JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() {
        System.out.println("stop(): Liberando recursos al cerrar...");
    }

    public static void main(String[] args) {
        launch(args);
    }
}