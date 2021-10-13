package Opgave_4_Tæller_op_ned;

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

    private final TextField Number = new TextField();

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
        pane.add(Number, 1, 3, 1, 1);


        // add a button to the pane (at col=2, row=1)
        Button Plus = new Button("+");
        pane.add(Plus, 3, 2);
        GridPane.setMargin(Plus, new Insets(10, 10, 0, 10));

        // connect a method to the button
        Plus.setOnAction(event -> this.plusknap());

        Button minus = new Button("-");
        pane.add(minus, 3, 4);
        GridPane.setMargin(minus, new Insets(10, 10, 0, 10));

        // connect a method to the button
        minus.setOnAction(event -> this.minusknap());
    }

    // -------------------------------------------------------------------------

    private void plusknap() {
        int nummer = Integer.parseInt(Number.getText().trim());
        nummer++;
        Number.setText(nummer + "");
    }

    private void minusknap(){
        int nummer = Integer.parseInt(Number.getText().trim());
        nummer--;
        Number.setText(nummer + "");
    }

}
