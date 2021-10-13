package opgave_2_Swap_frame;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {

  
    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo 2");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfFirstFrame = new TextField();
    private final TextField txfSecondFrame = new TextField();

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);


        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        // Deleted here is:
        // TextField txfName = new TextField();
        pane.add(txfFirstFrame, 1, 0, 1, 1);
        pane.add(txfSecondFrame, 1, 1, 1, 1);


        // add a button to the pane (at col=2, row=1)
        Button swampFrames = new Button("Swamp frames");
        pane.add(swampFrames, 1, 3);
        GridPane.setMargin(swampFrames, new Insets(10, 10, 0, 5));

        // connect a method to the button
        swampFrames.setOnAction(event -> this.swapFrames());
    }

    // -------------------------------------------------------------------------

    private void swapFrames() {
        String firstword = txfFirstFrame.getText().trim();
        String secondword = txfSecondFrame.getText().trim();
        txfFirstFrame.setText(secondword);
        txfSecondFrame.setText(firstword);

    }
}
