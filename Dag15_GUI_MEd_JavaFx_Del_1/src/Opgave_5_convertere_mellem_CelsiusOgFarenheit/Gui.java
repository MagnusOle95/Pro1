package Opgave_5_convertere_mellem_CelsiusOgFarenheit;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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

    private final TextField celcius = new TextField();
    private final TextField fahrenHeit = new TextField();

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
        pane.add(celcius, 2, 1, 1, 1);
        pane.add(fahrenHeit,1 ,1,1,1 );

        Label celcius = new Label("Celcius: ");
        pane.add(celcius, 2, 0);
        Label fahrenheit = new Label("Fahrenheit: ");
        pane.add(fahrenheit,1 ,0);

        // add a button to the pane (at col=2, row=1)
        Button beregnFerenheit = new Button("Beregn ferenheit");
        pane.add(beregnFerenheit, 1, 2);
        GridPane.setMargin(beregnFerenheit, new Insets(10, 10, 0, 10));

        // connect a method to the button
        beregnFerenheit.setOnAction(event -> this.beregnFarenheit());

        // add a button to the pane (at col=2, row=1)
        Button beregnCelsius = new Button("Beregn celsius");
        pane.add(beregnCelsius, 2, 2);
        GridPane.setMargin(beregnCelsius, new Insets(10, 10, 0, 10));

        // connect a method to the button
        beregnCelsius.setOnAction(event -> this.beregnCelsius());

    }

    // -------------------------------------------------------------------------

    private void beregnFarenheit() {
        double celsius = Double.parseDouble(celcius.getText().trim());
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        fahrenHeit.setText(fahrenheit + "");
    }

    public void beregnCelsius(){
        double fahrenheit = Double.parseDouble(fahrenHeit.getText().trim());
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        celcius.setText(celsius + "");
    }


}
