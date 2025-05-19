import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.PerspectiveCamera;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.*;
import javafx.fxml.FXML;

public class IgraVojna extends Application {
    @Override
    public void start(Stage stage) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Layout.fxml"));
        Scene scena = new Scene(loader.load(), 1260, 810);
        GameController controller = loader.getController();
        PerspectiveCamera kamera = new PerspectiveCamera();
        scena.setCamera(kamera);
        
        Vojna vojna = new Vojna(controller);
        vojna.inicializiraj();
        
        stage.setTitle("Igra: Vojna");
        stage.setScene(scena);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
