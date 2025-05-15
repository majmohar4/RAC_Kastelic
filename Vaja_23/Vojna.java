import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import javafx.animation.PauseTransition;
import javafx.scene.media.AudioClip;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.applet.*;
import java.time.*;

import javafx.scene.paint.Color;


public class Vojna implements Mesalna{
    private final Pane pane;
    private final Button prestavi;
    private final double poljeX = 1260;
    private final double poljeY = 810;
    private GameState state = GameState.WELCOME;
    private boolean startano = false;
    private final Karta[] karte = new Karta[52];
    private final Kupcek levi = new Kupcek();
    private final Kupcek desni = new Kupcek();
    private Kupcek[] pobrano = new Kupcek[2];
    
    private AudioClip button = new AudioClip(Vojna.class.getResource("button_click.wav").toString());
    private AudioClip karta_zvok = new AudioClip(Vojna.class.getResource("dealing.wav").toString());
    
    private Karta openLeft;
    private Karta openRight;
    
    private final int deck1[] = {100, 305};
    private final int deck2[] = {1054, 305};
    private final int open1[] = {470, 296};
    private final int open2[] = {675, 296};
    
    private int counter = 0;
    
    private final GameController controller;
    
    public Vojna(GameController controller) {
        this.controller = controller;
        pane = controller.cardsPane;
        prestavi = controller.nextBtn;
        controller.startBtn.setOnAction(e -> prestavi());
        controller.gamePane.toBack();
        controller.mainPane.toBack();
        
        pobrano[0] = new Kupcek();
        pobrano[1] = new Kupcek();
        
        controller.endBtn.setOnAction(e-> System.exit(0));
        inicializirajZvok();
    }
    
    private void inicializirajZvok() {
        button.setVolume(0);
        button.play();
        button.stop();
        
        karta_zvok.play();
        karta_zvok.stop();
        button.setVolume(1.0);
    }
    

    public void inicializiraj() {
        ustvariKarte();
        controller.nextBtn.setOnAction(e -> prestavi());
        controller.nextBtn.setText("Začni igro");
    }

    private void ustvariKarte() {
        char[] barve = { 'C', 'D', 'H', 'S' };
        int k = 0;
        for (char b : barve) {
            for (int vrednost = 2; vrednost <= 14; vrednost++) {
                Karta nova = new Karta(vrednost, b);
                nova.setLayoutX((poljeX - 100) / 2);
                nova.setLayoutY(400);
                karte[k++] = nova;
            }
        }
    }

    private void prestavi() {
        button.play();
        boolean a =false;
        
        PauseTransition enableBtn = new PauseTransition(Duration.millis(200));
        enableBtn.setOnFinished(e -> prestavi.setDisable(false));
        
        switch (state) {
            case WELCOME: 
                controller.startBtn.setDisable(true);
                PauseTransition zamik = new PauseTransition(Duration.millis(200));
                zamik.setOnFinished(e-> {
                    controller.welcomePane.toBack();
                    controller.gamePane.toFront();
                    state = GameState.INIT;
                    popraviKupcka();
                });
                zamik.play();
                break;
            case INIT:
                prestavi.setDisable(true);
                inicializirajPolje();
                prestavi.setText("Naslednja poteza");
                popraviKupcka();
                PauseTransition zamik2 = new PauseTransition(Duration.seconds(0.4));
                zamik2.setOnFinished(e-> {
                    if (!startano) {
                        deliKarteAnimirano();
                        startano = true;
                        state = GameState.DRAW;
                    }
                });
                a=true;
                zamik2.play();
                break;
            case DRAW:
                System.out.println("vzemi");
                prestavi.setDisable(true);
                openLeft = levi.vzemi();
                openLeft.prestavi(open1[0], open1[1], true, 0);
                System.out.println(openLeft);
                popraviKupcka();
                state = GameState.CHECK;
                PauseTransition zamik3 = new PauseTransition(Duration.seconds(1));
                zamik3.setOnFinished(e-> {
                    openRight = desni.vzemi();
                    openRight.prestavi(open2[0], open2[1], true, 1);
                    popraviKupcka();
                    prestavi.setDisable(false);
                });
                a=true;
                zamik3.play();
                break;
            case CHECK:
                System.out.println("preveri");
                int[] index= deck1;
                int indexInt =0;
                prestavi.setDisable(true);
                if(openLeft.vrniVrednostKarte()<openRight.vrniVrednostKarte()){
                    openRight.setGlowSlowly();
                    index=deck2;
                    indexInt=1;
                    PauseTransition počakaj = new PauseTransition(Duration.seconds(1.2));
                    počakaj.setOnFinished(e->{
                        openRight.removeGlow();
                        openRight.toFront();
                        openLeft.toBack();
                    });
                    počakaj.play();
                }
                else {
                    openLeft.setGlowSlowly();
                    index=deck1;
                    indexInt=0;
                    PauseTransition počakaj = new PauseTransition(Duration.seconds(1.2));
                    počakaj.setOnFinished(e->{
                        openLeft.removeGlow();
                        openLeft.toFront();
                        openRight.toBack();
                    });
                    počakaj.play();
                }
                pobrano[indexInt].dodaj(openRight);
                pobrano[indexInt].dodaj(openLeft);
                
                
                int[] finalindex = index;
                PauseTransition počakaj = new PauseTransition(Duration.seconds(1.5));
                počakaj.setOnFinished(e->{
                    openLeft.prestavi(finalindex[0], finalindex[1]-300);
                    openRight.prestavi(finalindex[0], finalindex[1]-300);
                });
                openLeft.setKupcek(indexInt);
                počakaj.play();
                PauseTransition gumb = new PauseTransition(Duration.seconds(1.8));
                gumb.setOnFinished(e->{
                    prestavi.setDisable(false);
                    //openLeft=null;
                    //openRight=null;
                });
                gumb.play();
                a=true;
                if(levi.velikost()==0){
                    if(pobrano[0].velikost()!=0){
                        vrniKupcek(pobrano[0], levi);
                        for(int i =levi.velikost(); i>0; i--){
                            levi.get(i).prestavi(deck1[0], deck1[1], true, 0);
                            System.out.print("levi");
                        }
                        state=GameState.DRAW;
                    }
                    else state  = GameState.END;
                }
                if(desni.velikost()==0){
                    if(pobrano[1].velikost()!=0){
                        vrniKupcek(pobrano[1], desni);
                        for(int i =desni.velikost(); i>0; i--){
                            desni.get(i).prestavi(deck2[0], deck2[1], true, 0);
                            System.out.print("desni");
                        }
                        state=GameState.DRAW;
                    }
                    else state  = GameState.END;
                }else{
                    state=GameState.DRAW;
                }
                break;
            case END:
                //
                
        }
        if(!a){
            enableBtn.play();
        }
        a=false;
    }
    private void vrniKupcek(Kupcek pokopalisce, Kupcek novi){
        Karta k;
        novi.reset();
        for(int i=0; i<karte.length; i++){
            k= pokopalisce.vzemi();
            if(k==null) break;
            novi.dodaj(k);
        }
        pokopalisce.reset();
        novi.premesaj();
    }
    
    @Override
    public void premesaj(){
        Random rand = new Random();
        for (int i = karte.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Karta temp = karte[i];
            karte[i] = karte[j];
            karte[j] = temp;
        }
    }
    private void popraviKupcka(){
        controller.leviKupcekStevilo.setText(""+levi.velikost());
        controller.desniKupcekStevilo.setText(""+desni.velikost());
    }
    private void inicializirajPolje() {
        premesaj();
        for (int i = karte.length - 1; i >= 0; i--)
            pane.getChildren().add(karte[i]);
    }

    private void deliKarteAnimirano() {
        prestavi.setDisable(true);
        boolean obrni = false;
        final int kupcek=0;
        
        double totalTime=0.12;

        for (int i = 0; i < 26; i++) {
            int j = i * 2;
            Karta leva = karte[j];
            Karta desna = karte[j + 1];
            
            double base = 0.12 * i;
            double easeOut = Math.pow(i, 0.2) * 0.007;
            
            totalTime=base+(i+2)*easeOut;
            
            PauseTransition zamik1 = new PauseTransition(Duration.seconds(base - easeOut));
            zamik1.setOnFinished(e -> {
                karte[j].prestavi(deck1[0], deck1[1], obrni, 0);
                levi.dodaj(leva);
                karta_zvok.play();
            });
            zamik1.play();

            PauseTransition zamik2 = new PauseTransition(Duration.seconds(base + 0.05 - easeOut));
            zamik2.setOnFinished(e -> {
                karte[j+1].prestavi(deck2[0], deck2[1], obrni, 1);
                karta_zvok.play();
                desni.dodaj(desna);
                popraviKupcka();
            });
            zamik2.play();
            popraviKupcka();
        }
        PauseTransition enable = new PauseTransition(Duration.seconds(totalTime));
        enable.setOnFinished(e->{
            prestavi.setDisable(false);
        });
        enable.play();
    }
}
enum GameState {
    WELCOME, INIT, DRAW, CHECK, CLEAR, END
}

class Kupcek {
    private Karta[] karte = new Karta[52];
    private int start, end;
    // end kaže na prazen prostor
    public Kupcek(){
        start=0;
        end=0;
    }
    
    public Karta get(int index){
        return karte[index];
    }
    
    public void dodaj(Karta karta) {
        karte[end] = karta;
        end++;
    }
    
    public Karta vzemi() {
        if(start==end) return null;
        Karta k = karte[start];
        karte[start] = null;
        start++;
        return k;
    }
    
    public boolean prazen() {
        return (start==end)?true:false;
    }
    
    public int velikost() {
        return (end-start);
    }
    public void premesaj(){
        Random rand = new Random();
        for (int i = end; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Karta temp = karte[i];
            karte[i] = karte[j];
            karte[j] = temp;
        }
    }
    public void reset(){
        end=0;
        start=0;
    }
}
interface Mesalna{
    void premesaj();
}
