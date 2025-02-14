import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javax.swing.*;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.awt.*;

/**
* Opis:
* JavaFX aplikacija števec
* 
* @author Maj
* @version 3. 2. 2025
*/
public class Mo00 extends Application {

	private Label myLabel = new Label("0");

	static int[] tab= new int[22]; // -100 : 100
	HBox h33 = null;
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		
		for(int i=0 ; i<tab.length ; i++){
			tab[i] = (int)(Math.random()*201-100);
		}

		h33 = new HBox();
		vizualiziraj();


		Button myButton = new Button("SCount");
		Button myButton1 = new Button("Count");
		Button myButton2 = new Button("Count");
		Button myButton3 = new Button("ZCount");

		//Group g = new Group();
		HBox g = new HBox();
					g.getChildren().add(myButton);
					g.getChildren().addAll(myButton1,myButton2,myButton3);

		HBox hb2 = new HBox();
		for(int i=0 ; i<20 ; i++){
				Button b = new Button(); 
					b.setText(""+i);
					b.setMinWidth(30.0);
					b.setOnAction(this::buttonClick);
				hb2.getChildren().add(b);
		}

		VBox vb = new VBox();
		vb.getChildren().add(hb2);
		vb.getChildren().add(g);
		vb.getChildren().add(h33);

		Scene scene = new Scene(vb,300,100);
		stage.setTitle("JavaFX Example");
		stage.setScene(scene);

		// Show the Stage (window)
		stage.show();


		//h33 = vizualizaciraj();
		//hb.getChildren().add(h33);
		vb.getChildren().add( vizualiziraj() ); tab[0] = 333;
		vb.getChildren().add( vizualiziraj() );
		vb.getChildren().add( vizualiziraj() );
	}
	private void buttonClick(ActionEvent event){
		System.out.println(event);
		((Button)(event.getSource())).setText("asd");
	}
	HBox vizualiziraj(){
		HBox h3 = new HBox();
		for(int i=0 ; i<tab.length ; i++){
				Button b = new Button(); 
						b.setText( ""+tab[i] );
						b.setMinWidth(30.0);
						b.setOnAction(this::buttonClick);
				h3.getChildren().add(b);
		}
		return h3;
	}
}
		