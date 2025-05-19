import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import javafx.animation.RotateTransition;
import javafx.scene.transform.Rotate;
import javafx.animation.Interpolator;

import javafx.scene.media.AudioClip;

import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.paint.Color;

import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import java.awt.*;


/**
* Opis:
* JavaFX aplikacija števec
* 
* @author Maj
* @version 29/04/2025
*/
public class Karta extends Button implements Obracalna{
	
	private int x=144;
	private int y=216;
	
	private boolean obrnjena;
	private String vrednost;
	private int vrednostInt;
	private char znak;
	
	private int kupcek;
	
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
		switch(znak){
			case 'H':
				vrednostInt+=0.8;
				break;
			case 'D':
				vrednostInt+=0.6;
				break;
			case 'S':
				vrednostInt+=0.4;
				break;
			case 'C':
				vrednostInt+=0.2;
				break;
		}
		frontImage = new Image("file:cards/" + vrednost + ".png");
		imageView = new ImageView(backImage);
		imageView.setFitWidth(x);
		imageView.setFitHeight(y);
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
	
	public void setGlow(){
		DropShadow zlato = new DropShadow();
		zlato.setRadius(100);
		zlato.setColor(Color.rgb(255,215,0, 1.0));
		this.setEffect(zlato);
	}
	public void removeGlow(){
		DropShadow zlato = new DropShadow();
		zlato.setRadius(100);
		zlato.setColor(Color.rgb(255, 215, 0, 1.0));
		this.setEffect(zlato);
		
		Timeline anim = new Timeline(
			new KeyFrame(Duration.ZERO,
				new KeyValue(zlato.colorProperty(), Color.rgb(255, 215, 0, 1.0)),
				new KeyValue(zlato.radiusProperty(), 100)
			),
			new KeyFrame(Duration.seconds(1.5),
				new KeyValue(zlato.colorProperty(), Color.rgb(255, 215, 0, 0)),
				new KeyValue(zlato.radiusProperty(), 0)
			)
		);
		anim.setOnFinished(e->{
			this.setEffect(null);
		});
		anim.setCycleCount(1);
		anim.play();
	}
	public void setGlowSlowly() {
		DropShadow zlato = new DropShadow();
		zlato.setRadius(10);
		zlato.setColor(Color.rgb(255, 215, 0, 0.0));
		this.setEffect(zlato);
		
		Timeline anim = new Timeline(
			new KeyFrame(Duration.ZERO,
				new KeyValue(zlato.colorProperty(), Color.rgb(255, 215, 0, 0.5)),
				new KeyValue(zlato.radiusProperty(), 50)
			),
			new KeyFrame(Duration.seconds(1.5),
				new KeyValue(zlato.colorProperty(), Color.rgb(255, 215, 0, 1.0)),
				new KeyValue(zlato.radiusProperty(), 100)
			)
		);
		
		anim.setCycleCount(1);
		anim.play();
	}
	
	
	
	@Override
	public void obrni() {
		final int i=(kupcek==0)?1:-1;
		RotateTransition rt1 = new RotateTransition(Duration.seconds(0.3), this);
		rt1.setAxis(Rotate.Y_AXIS);
		rt1.setFromAngle(0);
		rt1.setToAngle((-90)*i);
		rt1.setInterpolator(Interpolator.EASE_IN);
		zvok("flip.wav");
		
		rt1.setOnFinished(e -> {
			this.imageView.setImage(obrnjena ? frontImage : backImage); //zamenja "stran" karte
			obrnjena = !obrnjena;
			
			this.setRotate((-270)*i);
			
			RotateTransition rt2 = new RotateTransition(Duration.seconds(0.3), this);
			rt2.setAxis(Rotate.Y_AXIS);
			rt2.setFromAngle((-270)*i);
			rt2.setToAngle((-360)*i);
			rt2.setInterpolator(Interpolator.EASE_OUT);
			rt2.play();
		});
		
		rt1.play();
	}
	
		public String getVrednost() {
			return vrednost;
		}
	public void prestavi(int x, int y, boolean obrni, int kupcek) {
		
		TranslateTransition anim = new TranslateTransition(Duration.seconds(0.55), this);
		
		anim.setToX(x - this.getLayoutX());
		anim.setToY(y - this.getLayoutY());
		anim.setOnFinished(e -> {
			this.toBack();
		});
		anim.setInterpolator(Interpolator.LINEAR);
		RotateTransition rt = new RotateTransition(Duration.seconds(0.55), this);
		rt.setByAngle((Math.random() - 0.5) * 20); // -10° do +10°
		rt.setInterpolator(Interpolator.EASE_BOTH);
		rt.setAxis(Rotate.Z_AXIS);
		rt.play();
		
		anim.play();
		this.kupcek=kupcek;
		if(obrni)
			obrni();
	}
	public void prestavi(int x, int y) {
		TranslateTransition anim = new TranslateTransition(Duration.seconds(0.5), this);
		
		anim.setToX(x - this.getLayoutX());
		anim.setToY(y - this.getLayoutY());
		anim.setInterpolator(Interpolator.LINEAR);
		RotateTransition rt = new RotateTransition(Duration.seconds(0.5), this);
		rt.setInterpolator(Interpolator.EASE_BOTH);
		rt.play();
		
		this.kupcek=kupcek;
		anim.play();
	}
	public String toString(){
		return vrednost;
	}
	public static void zvok(String ime) {
		AudioClip zvok = new AudioClip(Vojna.class.getResource(ime).toString());
		zvok.play();
	}
	public void setKupcek(int kupcek){
		this.kupcek = kupcek;
	}
}

interface Obracalna {
	public void obrni();              // zamenja lice s hrbtom in obratno
	public int vrniVrednostKarte();   // vrne vrednost karte: 2,3,4, …., 9,10,11,12,13,14 ne glede na barvo
	public char vrniBarvoKarte();     // vrne eno od H,D,S,C
	public boolean jeLice();          // vrne stanje obrnjenosti karte
}

	