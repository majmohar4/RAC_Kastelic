import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Two_00 extends Application {

    class TTocka {
       double x=50,y=50;
    }
    
    public void start(Stage stage){
       
        double centerX, centerY; centerX=centerY=250;
        
        Group scg = new Group();
           Line h = new Line(250,0,250,500); h.getStrokeDashArray().addAll(25d, 20d, 5d, 20d);
           Line v = new Line(0,250,500,250); v.getStrokeDashArray().addAll(25d, 20d, 5d, 20d);
         
        Group g = new Group();   // osnoven kontejner bo grupa - ne izkoriščamo nobenega
                           // prednastavljenega razporejnja komponent
        
        // primer bloka, ki doda točko za izris v grupo g ! to morajo biti tudi ostale točke
        TTocka t = new TTocka(); t.x=75; t.y=35;
        {
          Circle c = new Circle(centerX + t.x, centerY - t.y,3); 
                 c.setFill(null); c.setStroke(Color.RED);                    
          g.getChildren().add(c);
        }
               
        scg.getChildren().addAll(h,v,g);  // v scg damo osi sistema h in v, ter grupo točk g
        
        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(scg, 500,500);
        stage.setTitle("JavaFX Example");
        stage.setScene(scene);

        // Show the Stage (window)
        stage.show();   
    }
}
