import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlipCardDemo extends Application {

    private boolean obrnjena = false;

    @Override
    public void start(Stage stage) {
        Image front = new Image("file:cards/2C.png");
        Image back = new Image("file:cards/blue_back.png");

        ImageView card = new ImageView(back);
        card.setFitWidth(120);
        card.setFitHeight(180);

        StackPane root = new StackPane(card);
        Scene scene = new Scene(root, 400, 300);

        // Dodamo perspektivno kamero za 3D efekt
        PerspectiveCamera camera = new PerspectiveCamera();
        scene.setCamera(camera);

        // Pivot točke za rotacijo (središče karte)
        card.setRotationAxis(Rotate.Y_AXIS);

        root.setOnMouseClicked(e -> flip(card, front, back));

        stage.setScene(scene);
        stage.setTitle("Obračanje karte");
        stage.show();
    }

    private void flip(ImageView card, Image front, Image back) {
        RotateTransition rotateOut = new RotateTransition(Duration.millis(200), card);
        rotateOut.setFromAngle(0);
        rotateOut.setToAngle(90);
        rotateOut.setInterpolator(Interpolator.EASE_IN);

        RotateTransition rotateIn = new RotateTransition(Duration.millis(200), card);
        rotateIn.setFromAngle(270); // nadaljuje od 270 = -90
        rotateIn.setToAngle(360);
        rotateIn.setInterpolator(Interpolator.EASE_OUT);

        rotateOut.setOnFinished(e -> {
            card.setImage(obrnjena ? back : front);
            obrnjena = !obrnjena;
            card.setRotate(270); // nastavitev za "drugo stran"
            rotateIn.play();
        });

        rotateOut.play();
    }

    public static void main(String[] args) {
        launch();
    }
}
