package Opgave_1_2_Brug_af_variabler_til_at_rykke_figurende;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);
        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {

        //Variabel der rykker alle figure 100 pixel//
        int rykHenAfX = 100;

        //Cirkel//
        Circle circle = new Circle(70 + rykHenAfX, 70, 30);
        pane.getChildren().add(circle);
        circle.setFill(Color.CORNFLOWERBLUE);
        circle.setStroke(Color.BLACK);

        //Retangel//
        Rectangle rectangle = new Rectangle(150 + rykHenAfX,150,100,50);
        pane.getChildren().add(rectangle);
        rectangle.setFill(Color.RED);
        rectangle.setStroke(Color.BLACK);

        //Streg//
        Line line = new Line(100 + rykHenAfX, 300, 300 + rykHenAfX, 300);
        pane.getChildren().add(line);







    }
}
