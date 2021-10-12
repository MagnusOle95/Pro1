package workshop_ex7;

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
        int nummer = 1;  //nummer er en variabel der indikere rækkens nummer, fx D = 1 Da = 2 og Dat = 3//
        int linjehøjdePåYakse = 10; //variablen der indikere hvor på y-aksen teksten skrives, den er 10 ved første D.

        String Tekst = "Datamatiker";
            for (int i = 1; i <= Tekst.length(); i++){
                gc.fillText(Tekst.substring(0,i),10,linjehøjdePåYakse);
                linjehøjdePåYakse = linjehøjdePåYakse + 15;
            }

    }
}


