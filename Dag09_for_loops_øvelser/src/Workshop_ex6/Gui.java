package Workshop_ex6;

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
        int x1 = 5;
        int y1 = 170;
        int x2 = 195;
        int y2 = 170;
        int streghøjde = 5;
        int miniStregerXkordinat = 5;
        int nummer = 0;

        // tegner nederste linje//
        gc.strokeLine(x1, y1, x2, y2);

        //tegner pilen på nederste linjer//
        gc.strokeLine(x2, y2, x2 - 5, y2 - 5);
        gc.strokeLine(x2, y2, x2 - 5, y2 + 5);

        for (int antalStreger = 0;antalStreger <= 10;antalStreger++,nummer++){
            if (antalStreger % 5 == 0){
                gc.strokeLine(miniStregerXkordinat,y1 - streghøjde - 5,miniStregerXkordinat,y1 + streghøjde + 5);
                miniStregerXkordinat = miniStregerXkordinat + (x2 - x1) / 11;
                gc.fillText(String.valueOf(nummer),miniStregerXkordinat - 20,195);

                }else{
                    gc.strokeLine(miniStregerXkordinat,y1 - streghøjde,miniStregerXkordinat,y1 + streghøjde);
                    miniStregerXkordinat = miniStregerXkordinat + (x2 - x1) / 11;
                }
            }

        }

    }

