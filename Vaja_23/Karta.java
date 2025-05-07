import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.lang.*;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import javafx.animation.RotateTransition;
import javafx.scene.transform.Rotate;
import java.awt.*;


/**
* Opis:
* JavaFX aplikacija števec
* 
* @author Maj
* @version 29/04/2025
*/
public class Karta extends Button implements Obracalna{
	private boolean obrnjena;
	private String vrednost;
	private int vrednostInt;
	private char znak;
	
	private char[] imena = {'J','Q','K','A'};
	
	private ImageView imageView;
	private Image frontImage;
	private static final Image backImage = new Image("./cards/blue_back.png");
	
	public Karta(){
		obrnjena = false;
		vrednostInt = 14;
		znak = 'D';
		vrednost = "K"+znak;
		frontImage = new Image("./cards/" + vrednost + ".png");
		imageView = new ImageView(backImage);
		imageView.setFitWidth(100);
		imageView.setFitHeight(150);
		
		this.setGraphic(imageView);
		this.setOnAction(e -> obrni());
		
	}
	public Karta(int vrednostInt, char znak) {
		this.vrednostInt = vrednostInt;
		this.znak = znak;
		if(vrednostInt<11)
			this.vrednost = vrednostInt+""+znak;
		else{
			this.vrednost = imena[vrednostInt-11]+""+znak;
		}
		frontImage = new Image("./cards/" + vrednost + ".png");
		imageView = new ImageView(frontImage);
		imageView.setFitWidth(100);
		imageView.setFitHeight(150);
	
		this.setGraphic(imageView);
		this.setOnAction(e -> obrni());
	}
	public String vrniVrednost(){
		return vrednost;
	}
	public boolean jeLice(){
		return obrnjena;
	}
	public int vrniVrednostKarte(){
		return vrednostInt;
	}
	public char vrniBarvoKarte(){
		return znak;
	}
	
	public void obrni() {
		RotateTransition rt1 = new RotateTransition(Duration.seconds(0.25), this);
		rt1.setAxis(Rotate.Y_AXIS);
		rt1.setFromAngle(0);
		rt1.setToAngle(90);
		
		rt1.setOnFinished(e -> {
			//zamenjaj sliko
			if (obrnjena) {
				imageView.setImage(frontImage);
			} else {
				imageView.setImage(backImage);
			}
			obrnjena = !obrnjena;
			
			this.setRotate(270);
			
			RotateTransition rt2 = new RotateTransition(Duration.seconds(0.25), this);
			rt2.setAxis(Rotate.Y_AXIS);
			rt2.setFromAngle(270);
			rt2.setToAngle(360);
			rt2.play();
		});
		
		rt1.play();
	}
	
		public String getVrednost() {
			return vrednost;
		}
	public void prestavi(int x, int y, boolean obrni) {
		TranslateTransition anim = new TranslateTransition(Duration.seconds(0.5), this);
		
		double trenutniX = this.getLayoutX() + this.getTranslateX();
		double trenutniY = this.getLayoutY() + this.getTranslateY();
		anim.setToX(x - this.getLayoutX());
		anim.setToY(y - this.getLayoutY());
		anim.setOnFinished(e -> {
			this.toBack();
		});
		anim.play();
		if(obrni)
			obrni();
	}
}

interface Obracalna {
	public void obrni();              // zamenja lice s hrbtom in obratno
	public int vrniVrednostKarte();   // vrne vrednost karte: 2,3,4, …., 9,10,11,12,13,14 ne glede na barvo
	public char vrniBarvoKarte();     // vrne eno od H,D,S,C
	public boolean jeLice();          // vrne stanje obrnjenosti karte
}

	