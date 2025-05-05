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
			imageView = new ImageView(backImage);
			imageView.setFitWidth(100);
			imageView.setFitHeight(150);
		
			imageButton = new Button();
			imageButton.setGraphic(imageView);
			imageButton.setOnAction(e -> prestavi(mesto));
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
	public void prestavi(){
		TranslateTransition anim = new TranslateTransition(Duration.seconds(0.5), this.imageButton);
		anim.setToX(200); // premik za 200px desno
		anim.setToY(0);   // ostane na isti višini
		anim.play();
		obrni();
	}
	public void prestavi(int kupcek){
		TranslateTransition anim = new TranslateTransition(Duration.seconds(0.5), this.imageButton);
		double pozicija = this.imageButton.getLayoutX() + this.imageButton.getTranslateX();
		System.out.println("pozicija x: "+pozicija);
		switch(kupcek){
			case 0:
				anim.setToX(0);
				anim.setOnFinished(e-> {
					this.getGumb().toFront();  // zagotovi, da bo karta vedno na vrhu
				});
				break;
			case 1:
				anim.setToX(-200);
				anim.setOnFinished(e-> {
					this.getGumb().toBack();  // zagotovi, da bo karta v ozadju
				});
				break;
			case 2:
				anim.setToX(-400);
				anim.setOnFinished(e-> {
					this.getGumb().toBack();  // zagotovi, da bo karta v ozadju
				});
		}
		anim.setToY(0);   // ostane na isti višini
		anim.play();
		obrni();
	}
	public void prestavi(int x, int y){
		TranslateTransition anim = new TranslateTransition(Duration.seconds(0.5), this.imageButton);
		double pozicija = this.imageButton.getLayoutX() + this.imageButton.getTranslateX();
		anim.setToX(-pozicija+x);
		anim.setToY(-pozicija+y); 
		anim.setOnFinished(e-> {
			this.getGumb().toBack();
		});
		anim.play();
		obrni();
	}
}
	