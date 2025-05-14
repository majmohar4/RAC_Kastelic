import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import javafx.animation.RotateTransition;
import javafx.scene.transform.Rotate;
import javafx.animation.Interpolator;


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
	
	private final char[] imena = {'J','Q','K','A'};
	
	private ImageView imageView;
	private Image frontImage;
	private static final Image backImage = new Image("./cards/blue_back.png");
	
	public Karta() {
			this(14, 'D');
		}
		
	public Karta(int vrednostInt, char znak) {
		this.vrednostInt = vrednostInt;
		this.znak = znak;
		if(vrednostInt<11)
			this.vrednost = vrednostInt+""+znak;
		else{
			this.vrednost = imena[vrednostInt-11]+""+znak;
		}
		frontImage = new Image("file:cards/" + vrednost + ".png");
		imageView = new ImageView(backImage);
		imageView.setFitWidth(120);
		imageView.setFitHeight(180);
		obrnjena=true;
	
		this.setGraphic(imageView);
		this.setOnAction(e -> obrni());
		this.setStyle("-fx-background-color: transparent; -fx-padding: 0; -fx-border-color: transparent;");
		this.setFocusTraversable(false);
		this.setRotationAxis(Rotate.Y_AXIS);
	}

	@Override
	public boolean jeLice(){
		return obrnjena;
	}
	
	@Override
	public int vrniVrednostKarte(){
		return vrednostInt;
	}
	
	@Override
	public char vrniBarvoKarte(){
		return znak;
	}
	
	@Override
	public void obrni() {
		RotateTransition rt1 = new RotateTransition(Duration.seconds(0.2), this);
		rt1.setAxis(Rotate.Y_AXIS);
		rt1.setFromAngle(0);
		rt1.setToAngle(90);
		rt1.setInterpolator(Interpolator.EASE_IN);
		
		rt1.setOnFinished(e -> {
			this.imageView.setImage(obrnjena ? frontImage : backImage); //zamenja "stran" karte
			obrnjena = !obrnjena;
			
			this.setRotate(270);
			
			RotateTransition rt2 = new RotateTransition(Duration.seconds(0.2), this);
			rt2.setAxis(Rotate.Y_AXIS);
			rt2.setFromAngle(270);
			rt2.setToAngle(360);
			rt2.setInterpolator(Interpolator.EASE_OUT);
			rt2.play();
		});
		
		rt1.play();
	}
	
		public String getVrednost() {
			return vrednost;
		}
	public void prestavi(int x, int y, boolean obrni) {
		TranslateTransition anim = new TranslateTransition(Duration.seconds(0.5), this);
		
		anim.setToX(x - this.getLayoutX());
		anim.setToY(y - this.getLayoutY());
		anim.setOnFinished(e -> {
			this.toBack();
		});
		anim.setInterpolator(Interpolator.LINEAR);
		RotateTransition rt = new RotateTransition(Duration.seconds(0.5), this);
		rt.setByAngle((Math.random() - 0.5) * 20); // -10° do +10°
		rt.setInterpolator(Interpolator.EASE_BOTH);
		rt.play();
		
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

	