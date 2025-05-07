import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.lang.*;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import javafx.animation.RotateTransition;
import javafx.scene.transform.Rotate;


/**
* Opis:
* JavaFX aplikacija števec
* 
* @author Maj
* @version 29/04/2025
*/
public class Karta{
	private boolean obrnjena;
	private String vrednost;
	private int mesto;
	
	private Button imageButton;
	private ImageView imageView;
	private Image frontImage;
	private static final Image backImage = new Image("./cards/blue_back.png");
	
	public Karta(){
		obrnjena = false;
		vrednost = "2H";
		frontImage = new Image("./cards/" + vrednost + ".png");
		imageView = new ImageView(backImage);
		imageView.setFitWidth(100);
		imageView.setFitHeight(150);
		
		imageButton = new Button();
		imageButton.setGraphic(imageView);
		imageButton.setOnAction(e -> obrni());
		mesto = 0;
		
	}
	public Karta(String vrednost, int mesto) {
			this.vrednost = vrednost;
			this.mesto = mesto;
			frontImage = new Image("./cards/" + vrednost + ".png");
			imageView = new ImageView(frontImage);
			imageView.setFitWidth(100);
			imageView.setFitHeight(150);
		
			imageButton = new Button();
			imageButton.setGraphic(imageView);
			imageButton.setOnAction(e -> obrni());
		}
	public String vrniVrednost(){
		return vrednost;
	}
	public String vrniStanje(){
		return (!obrnjena?"lice":"hrbet");
	}
	
	public void obrni() {
		RotateTransition rt1 = new RotateTransition(Duration.seconds(0.25), this.getGumb());
		rt1.setAxis(Rotate.Y_AXIS);
		rt1.setFromAngle(0);
		rt1.setToAngle(90);
		
		rt1.setOnFinished(e -> {
			// Zamenjaj sliko
			if (obrnjena) {
				imageView.setImage(frontImage);
			} else {
				imageView.setImage(backImage);
			}
			obrnjena = !obrnjena;
			
			this.getGumb().setRotate(270);
			
			RotateTransition rt2 = new RotateTransition(Duration.seconds(0.25), this.getGumb());
			rt2.setAxis(Rotate.Y_AXIS);
			rt2.setFromAngle(270);
			rt2.setToAngle(360);
			rt2.play();
		});
		
		rt1.play();
	}
	
	public Button getGumb() {
			return imageButton;
		}
	
		public String getVrednost() {
			return vrednost;
		}
	public void prestavi(int x, int y, boolean obrni) {
		TranslateTransition anim = new TranslateTransition(Duration.seconds(0.5), this.imageButton);
		
		double trenutniX = this.imageButton.getLayoutX() + this.imageButton.getTranslateX();
		double trenutniY = this.imageButton.getLayoutY() + this.imageButton.getTranslateY();
		anim.setToX(x - this.imageButton.getLayoutX());
		anim.setToY(y - this.imageButton.getLayoutY());
		anim.setOnFinished(e -> {
			this.getGumb().toBack();
		});
		anim.play();
		if(obrni)
			obrni();
	}
}