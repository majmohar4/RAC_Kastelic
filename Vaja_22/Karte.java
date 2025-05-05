import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.awt.*;
import javafx.scene.layout.HBox;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;

import java.util.*;



/**
* Opis:
* JavaFX aplikacija števec
* 
* @author Maj
* @version 29/04/2025
*/
public class Karte extends Application {
    private static boolean deljeno=false;
    private static int counter=0;
    private static Karta[] rokaLeva=new Karta[5];
    private static Karta[] rokaDesna = new Karta[5];
    
    private static Karta[] karte = new Karta[52];
    
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) {
		
        Pane pane = new Pane();
		
		String[] barve = { "C", "D", "H", "S" };
		String[] vrednosti = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q" };
		
		int k = 0;
		for (int i = 0; i < barve.length; i++) {
			for (int j = 0; j < vrednosti.length; j++) {
				karte[k] = new Karta(vrednosti[j] + barve[i], 1);
                karte[k].getGumb().setLayoutX(600);
                karte[k].getGumb().setLayoutY(400);
                k++;
			}
		}
        premesajKarte();
        for(int i=0;i<karte.length;i++)
            pane.getChildren().add(karte[i].getGumb());
        
        Button prestavi = new Button("Deli");
        prestavi.setOnAction(e -> prestavi());
        
        prestavi.setLayoutX(630);
        prestavi.setLayoutY(570);
        pane.getChildren().add(prestavi);
		
		Scene scene = new Scene(pane, 2000, 1000);
		stage.setTitle("Karte");
		stage.setScene(scene);
		stage.show();
	}
    public static void premesajKarte(){
        Random rand = new Random();
        for (int i = karte.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Karta temp = karte[i];
            karte[i] = karte[j];
            karte[j] = temp;
        }
    }
    public void prestavi(){
        if(!deljeno){
            deliKarte();
        }else{
            
        }
    }
    public static void deliKarte(){
        //counter pove, do kje so karte "porabljene"
        int x = 200;
        int y=200;
        for(int i=0; i<5; i++){
            rokaLeva[i] = karte[counter];
            karte[counter].prestavi(x, y);
            
            counter++;
            rokaLeva[i] = karte[counter];
            karte[counter].prestavi(x, y);
            
            y+=160;
            counter++;
        }
    }
}
