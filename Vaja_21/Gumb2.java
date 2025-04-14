import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;

/**
* Opis:
* JavaFX aplikacija števec
* 
* @author Maj
* @version 14/04/2025
*/
public class Gumb2 extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) {
		GridPane pane = new GridPane();
		MojGumb myButton = new MojGumb();
		
		pane.add(myButton.myButton, 0, 0);
		
		Scene scene = new Scene(pane, 300, 100);
		stage.setTitle("Gumb");
		stage.setScene(scene);
		stage.show();
	}
}
class MojGumb{
	public Button myButton;
	private int count;
	private String[] ime = {"yes", "no"};
	
	public MojGumb(){
		myButton = new Button(ime[0]);
		myButton.setOnAction(this::buttonClick);
	}
	public MojGumb(String a){
		ime[0] = a;
		myButton = new Button(ime[0]);
		myButton.setOnAction(this::buttonClick);
	}
	public MojGumb(String a, String b){
		ime[0] = a;
		ime[1] = b;
		myButton = new Button(ime[0]);
		myButton.setOnAction(this::buttonClick);
	}
	private void buttonClick(ActionEvent event) {
		count++;
		if(count%2==1)
			myButton.setText("no");
		else
			myButton.setText("yes");
	}
}

