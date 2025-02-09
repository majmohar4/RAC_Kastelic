import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Two_00 extends Application {

    class TTocka {
        double x = 50, y = 50;
    }
    
    static TTocka[] tab = new TTocka[150];

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
        for (int i=0; i<tab.length; i++){
            tab[i] = new TTocka();
            tab[i].x = Math.random()*401-200;
            tab[i].y = Math.random()*401-200;
            
            
            Circle c = new Circle(centerX + tab[i].x, centerY - tab[i].y, 3);
            c.setFill(null);
            c.setStroke(Color.RED);
            g.getChildren().add(c);
        }
        
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
