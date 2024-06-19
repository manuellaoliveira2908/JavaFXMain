import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.stage.Stage;

public class JavaFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Criando um triângulo retângulo
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(0.0, 0.0, 100.0, 0.0, 0.0, 100.0);
        
        // Definindo um preenchimento gradiente
        Stop[] stops = new Stop[] { 
            new Stop(0, Color.BLUE), 
            new Stop(1, Color.MAGENTA)
        };
        LinearGradient gradient = new LinearGradient(
            0, 0, 1, 1, true, javafx.scene.paint.CycleMethod.NO_CYCLE, stops);
        triangle.setFill(gradient);
        
        // Adicionando o triângulo a um layout de cena
        Pane root = new Pane();
        root.getChildren().add(triangle);
        
        // Configurando a cena e exibindo a janela
        Scene scene = new Scene(root, 300, 250, Color.BLACK);
        primaryStage.setTitle("Triângulo com Gradiente");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}