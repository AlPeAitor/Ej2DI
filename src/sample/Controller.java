package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    Label textView1;

    @FXML
    Label textView2;

    @FXML
    Label textView3;

    @FXML
    Button boton1;

    @FXML
    Button boton2;

    @FXML
    Button boton3;

    @FXML
    private void bHover1() {
        textView1.setTextFill(Color.RED);
    }

    @FXML
    private void bHover2() {
        textView2.setTextFill(Color.YELLOW);
    }

    @FXML
    private void bHover3() {
        textView3.setTextFill(Color.BLUE);
    }
    @FXML
    private void colorearNegro() {
        textView1.setTextFill(Color.BLACK);
        textView2.setTextFill(Color.BLACK);
        textView3.setTextFill(Color.BLACK);
    }

    @FXML
    private void botonClicado() {
        System.out.println("Abriendo Ventana");
        try {
            Parent root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
            Stage primaryStage = new Stage();
            Scene scene = new Scene(root, 300, 275);
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
