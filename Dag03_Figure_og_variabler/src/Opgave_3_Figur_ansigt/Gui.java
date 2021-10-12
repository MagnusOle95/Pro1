package Opgave_3_Figur_ansigt;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
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

        //Ansigtes varibler//
        int centerX = 200;
        int centerY = 200;
        int øjeafstand_fra_centrum = 30;

        //Ydrecirkel//
        Circle ydreCircle = new Circle(centerX,centerY,100);
        pane.getChildren().add(ydreCircle);
        ydreCircle.setFill(null);
        ydreCircle.setStroke(Color.BLACK);

        //Højreøje//
        Circle højre_øje = new Circle(centerX-øjeafstand_fra_centrum,centerY-øjeafstand_fra_centrum,15);
        pane.getChildren().add(højre_øje);

        //Venstre øje//
        Circle venstre_øje = new Circle(centerX + øjeafstand_fra_centrum,centerY-øjeafstand_fra_centrum,15);
        pane.getChildren().add(venstre_øje);

        //Mund//
        Line mund = new Line(150,240,250,210);
        pane.getChildren().add(mund);

        //Mit Navn//
        Text navn = new Text(200,320,"Magnus");
        pane.getChildren().add(navn);
        navn.setFill(Color.BLACK);

    }
}
