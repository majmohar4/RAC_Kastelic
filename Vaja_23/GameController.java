import javafx.scene.layout.Pane;
import javafx.fxml.FXML;


import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import java.awt.*;
import javax.swing.text.html.*;

public class GameController{
    
    @FXML public Pane mainPane;
    @FXML public Pane gamePane;
    @FXML public Pane cardsPane;
    @FXML public Pane welcomePane;
    @FXML public Label leviKupcekStevilo;
    @FXML public Label desniKupcekStevilo;
    @FXML public Label statusLabel;
    @FXML public Button startBtn;
    @FXML public Button nextBtn;
    @FXML public Button endBtn;
    @FXML public ImageView open1;
    @FXML public ImageView open2;
    @FXML public ImageView deck1;
    @FXML public ImageView deck2;
    
    @FXML
        public void initialize() {
            System.out.println("FXML controller initialized!");
        }
}