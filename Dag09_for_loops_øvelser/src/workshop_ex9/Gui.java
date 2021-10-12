package workshop_ex9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

public class Gui extends Application {


    @Override
    public void start(Stage stage) {
        GridPane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops");
        stage.setScene(scene);
        stage.show();
    }

    private GridPane initContent() {
        GridPane pane = new GridPane();
        Canvas canvas = new Canvas(200, 200);
        pane.add(canvas, 0, 0);
        this.drawShapes(canvas.getGraphicsContext2D());
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(GraphicsContext gc) {
        int x = 180;
        int y = 60;
        int y2 = 190;
        int linjeHøjde = y2 - y;
        int MidterY = (linjeHøjde/5) + y;


            gc.strokeLine(x,linjeHøjde/5 + y,x,linjeHøjde/2 + y);





        System.out.println(linjeHøjde);
        System.out.println(MidterY);



        }

}



