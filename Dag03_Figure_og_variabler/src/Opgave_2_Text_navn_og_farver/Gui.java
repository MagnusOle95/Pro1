package Opgave_2_Text_navn_og_farver;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
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

        //Retangel//
        Rectangle rectangle = new Rectangle(150,150,100,50);
        pane.getChildren().add(rectangle);
        rectangle.setFill(Color.BLUE);
        rectangle.setStroke(Color.BLACK);

        //Mit Navn//
        Text navn = new Text(175,175,"Magnus");
        pane.getChildren().add(navn);
        navn.setFill(Color.RED);

    }
}
