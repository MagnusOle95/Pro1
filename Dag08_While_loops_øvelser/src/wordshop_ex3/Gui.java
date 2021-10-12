package wordshop_ex3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

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
        // Replace the statement here with your code.

        //variabler//
        //int x = 20; //x1 og x2 er den samme//
        //int x2 = 180;
        //int y = 20;
        //int y2 = 180;

        //Figure 1 - Bruger kun x til begge punkter, da det er en lige linje//
        //while (x <= 180){
        //    gc.strokeLine(x,y,x,y2);
        //    x = x + 40;
        //}

        //Retunere x til udgangspunkt//
        //x = 20;

        //Figure 2 - bruger kun y til begge punkter da det er en lige linje//
        //while (y <= 180) {
        //    gc.strokeLine(x, y, x2, y);
        //    y = y + 40;
        //}

        //Variabler til Figure 3.
        int x = 90;
        int y = 20;
        int x2 = 110;

        //Figure 3 - let opgave 2000
        while (y <= 180) {
            gc.strokeLine(x, y, x2, y);
            y = y + 40;
            x = x - 20;
            x2 = x2 + 20;
        }
    }
}
