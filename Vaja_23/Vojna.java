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
import javafx.animation.PauseTransition;

import javafx.scene.media.AudioClip;

import java.util.*;

/**
* Opis:
* JavaFX aplikacija, ki simulira igro s kartami "Vojna"
* 
* @author Maj
* @version 05/05/2025
*/
public class Vojna extends Application {
    private static int counter=0;
    private static Karta[] kupcekLevi=new Karta[52];
    private static int pointerLevi =0;
    private static Karta[] kupcekDesni = new Karta[52];
    private static int poinetrDesni =0;
    
    private static boolean start =false;
    
    private static Karta[] karte = new Karta[52];
    
    private static Pane pane = new Pane();
    private static GameState state = GameState.INIT;
    private static Button prestavi;
    
    private static double poljeX;
    private static double poljeY;
    
    private static AudioClip zvok;
    
    
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) {
        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        poljeX = screenSize.getWidth();
        poljeY= screenSize.getHeight();
        
        
		char[] barve = { 'C', 'D', 'H', 'S' };
		String[] vrednosti = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q" };
        
		int k = 0;
		for (int i = 0 ; i < barve.length; i++) {
			for (int j = 2; j < 15; j++) {
				karte[k] = new Karta(j, barve[i]);
                karte[k].setLayoutX((poljeX-100)/2);
                karte[k].setLayoutY(200);
                k++;
			}
		}
        prestavi = new Button("Prični");
        prestavi.setOnAction(e -> prestavi());
        
        int h = 150, w = 100;
        prestavi.setLayoutX((poljeX-w)/2);
        prestavi.setLayoutY((poljeY-h)/2);
        
        prestavi.setMinSize(h, w);
        prestavi.setPrefSize(h, w);
        prestavi.setMaxSize(h, w);
        pane.getChildren().add(prestavi);
        
		        
		Scene scene = new Scene(pane, poljeX, poljeY);
		stage.setTitle("Igra: Vojna");
		stage.setScene(scene);
		stage.show();
	}
    public static void prestavi(){
        switch (state) {
            case INIT:
                inicializirajPolje();
                prestavi.setText("Deli karte");
                state=GameState.START;
                System.out.println("init");
                break;
            case START:
                deliKarte();
                state = GameState.DRAW;
                break;
            case DRAW:
                //
                break;
            case CHECK:
                //
                break;
            case CLEAR:
                //
                break;
            case END:
                //
                break;
        }
    }
    public static void inicializirajPolje(){
        premesajKarte();
        for(int i=karte.length-1;i>=0;i--)
            pane.getChildren().add(karte[i]);
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
    public static void deliKarte(){
        if(!start){
            int x = 200;
            int y = 200;
            int k=0;
            for(int i = 0; i < karte.length/2;i++){
                final int j = i;
                final int xx = x;
                final int yy = y;
                final int indexLevi = counter;
                final int indexDesni = counter +1;
                double zmanjsaj=0.004;
                double base = 0.08*i;
                double easeOut = Math.pow(i, 0.2) * 0.007;
                
                PauseTransition zamik1 = new PauseTransition(Duration.seconds(base-easeOut));
                zamik1.setOnFinished(e -> {
                    kupcekLevi[j] = karte[indexLevi];
                    karte[indexLevi].prestavi(xx, yy, true);
                    zvok = new AudioClip(Vojna.class.getResource("card1.wav").toString());
                    zvok.play();
                });
                zamik1.play();
                
                PauseTransition zamik2 = new PauseTransition(Duration.seconds(base + 0.05-easeOut));
                zamik2.setOnFinished(e -> {
                    kupcekDesni[j] = karte[indexDesni];
                    karte[indexDesni].prestavi(xx + 800, yy, true);
                    zvok = new AudioClip(Vojna.class.getResource("card1.wav").toString());
                    zvok.play();
                });
                zamik2.play();
                
                counter += 2;
            }
            
        }
    }
}
enum GameState{
    INIT, START, DRAW, CHECK, CLEAR, END
}

interface Mesaj{
	void premesajKarte();
}
