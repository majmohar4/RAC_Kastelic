import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Naloga6 extends Application {

    class TTocka {
        double x = 50, y = 50;
    }
    
    static TTocka[] tab = new TTocka[400];

    public void start(Stage stage) {
        double centerX = 250, centerY = 250;

        Group scg = new Group();

        // osnoven kontejner bo grupa - ne izkoriščamo nobenega
        // prednastavljenega razporejanja komponent
        Group g = new Group();   

        // Dashed coordinate lines
        Line h = new Line(250, 0, 250, 500);
        h.getStrokeDashArray().addAll(25d, 20d, 5d, 20d);

        Line v = new Line(0, 250, 500, 250);
        v.getStrokeDashArray().addAll(25d, 20d, 5d, 20d);

        // primer bloka, ki doda točko za izris v grupo g ! to morajo biti tudi ostale točke
        for (int i=0; i<100; i++){ //1. kvadrant
            tab[i] = new TTocka();
            tab[i].x = Math.random()*201-200;
            tab[i].y = Math.random()*201;
            
            Circle c = new Circle(centerX + tab[i].x, centerY - tab[i].y, 3);
            c.setFill(null);
            c.setStroke(Color.RED);
            g.getChildren().add(c);
        }
        for (int i=100; i<200; i++){//2. kvadrant
            tab[i] = new TTocka();
            tab[i].x = Math.random()*201;
            tab[i].y = Math.random()*201;
            
            Circle c = new Circle(centerX + tab[i].x, centerY - tab[i].y, 3);
            c.setFill(null);
            c.setStroke(Color.RED);
            g.getChildren().add(c);
        }
        for (int i=200; i<300; i++){ // 3. kvadrant
            tab[i] = new TTocka();
            tab[i].x = Math.random()*201;
            tab[i].y = Math.random()*201-200;
            
            Circle c = new Circle(centerX + tab[i].x, centerY - tab[i].y, 3);
            c.setFill(null);
            c.setStroke(Color.RED);
            g.getChildren().add(c);
        }
        for (int i=300; i<400; i++){ // 4. kvadrant
            tab[i] = new TTocka();
            tab[i].x = Math.random()*201-200;
            tab[i].y = Math.random()*201-200;
            
            Circle c = new Circle(centerX + tab[i].x, centerY - tab[i].y, 3);
            c.setFill(null);
            c.setStroke(Color.RED);
            g.getChildren().add(c);
        }
        int t1 = najdaljVKvadrantu(1);
        int t2 = najdaljVKvadrantu(2);
        int t3 = najdaljVKvadrantu(3);
        int t4 = najdaljVKvadrantu(4);
        
        Line line1 = new Line(centerX + tab[t1].x, centerY - tab[t1].y, centerX + tab[t2].x, centerY - tab[t2].y);
        line1.setStroke(Color.BLUE);
        g.getChildren().add(line1);
        
        Line line2 = new Line(centerX + tab[t2].x, centerY - tab[t2].y, centerX + tab[t3].x, centerY - tab[t3].y);
        line2.setStroke(Color.BLUE);
        g.getChildren().add(line2);
        
        Line line3 = new Line(centerX + tab[t3].x, centerY - tab[t3].y, centerX + tab[t4].x, centerY - tab[t4].y);
        line3.setStroke(Color.BLUE);
        g.getChildren().add(line3);
        
        Line line4 = new Line(centerX + tab[t4].x, centerY - tab[t4].y, centerX + tab[t1].x, centerY - tab[t1].y);
        line4.setStroke(Color.BLUE);
        g.getChildren().add(line4);
        
        
        
        
        int tocka = poisciTocko();
        Line line = new Line(centerX + tab[tocka].x, centerY - tab[tocka].y, centerX, centerY);
        line.setStroke(Color.BLUE);
        g.getChildren().add(line);
        
        int tocka2 = izpisiNajblizjoPovprecju();
        Circle c = new Circle(centerX + tab[tocka2].x, centerY - tab[tocka2].y, 3);
        c.setFill(Color.GREEN);
        g.getChildren().add(c);
        

        // v scg damo osi sistema h in v, ter grupo točk g
        scg.getChildren().addAll(h, v, g);

        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(scg, 500, 500);
        stage.setTitle("JavaFX Example");
        stage.setScene(scene);

        // Show the Stage (window)
        stage.show();
    }
    static int najdaljVKvadrantu(int kv){
        int i = kv*100-100;
        double razdalja =0, temp;
        int tocka=-1;
        for (int j= i; j<i+100; j++){
            temp = Math.sqrt(tab[j].x*tab[j].x+tab[j].y*tab[j].y);
            if(temp>razdalja) {
                tocka =j;
                razdalja = temp;
            }
        }
        return tocka;
    }
    
    static int poisciTocko(){
        double razdalja =0, temp;
        int tocka=-1;
        for (int i=0; i<tab.length; i++){
            temp = Math.sqrt(tab[i].x*tab[i].x+tab[i].y*tab[i].y);
            if(temp>razdalja) {
                tocka =i;
                razdalja = temp;
            }
        }
        System.out.println("Najbolj oddaljena je točka z indexom: "+tocka);
        return tocka;
    }
    static int izpisiNajblizjoPovprecju(){
        double razdalja =0, temp=0, najboljsa=100000;
        int tocka = -1;
        for (int i=0; i<150; i++)
            razdalja += Math.sqrt(tab[i].x*tab[i].x+tab[i].y*tab[i].y);
        double povprecje = razdalja/tab.length;
        for (int i=0; i<150; i++){
            temp = Math.abs(povprecje - Math.sqrt(tab[i].x*tab[i].x+tab[i].y*tab[i].y));
            if (temp<najboljsa){
                najboljsa = temp;
                tocka = i;
            }
        }
        System.out.println("Povprecje razdalje od (0,0) je: "+ povprecje);
        System.out.println("Najblizja tocka povprecju je: "+tocka+", s razdaljo: "+temp+", in koordinatami ("+tab[tocka].x+","+tab[tocka].y+").");
        return tocka;
    }
}
