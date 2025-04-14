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
public class Gumb extends Application {
	
	private int count =0;
	private Button myButton = new Button("Yes");
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) {
		
		
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(10));
		pane.setVgap(10);
		pane.setHgap(10);
		
		myButton.setOnAction(this::buttonClick);
		pane.add(myButton, 0, 0);
		
		Scene scene = new Scene(pane, 300, 100);
		stage.setTitle("Gumb");
		stage.setScene(scene);
		stage.show();
	}
	
	/**
	* Metoda za upravljanje s klikom gumba.
	* Poveča števec in posodobi oznako.
	*/
	private void buttonClick(ActionEvent event) {
		count++;
		if(count%2==1)
			myButton.setText("no");
		else
			myButton.setText("yes");
	}
}
