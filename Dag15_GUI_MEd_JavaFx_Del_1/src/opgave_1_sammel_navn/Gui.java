package opgave_1_sammel_navn;

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

    private final TextField txfFirstName = new TextField();
    private final TextField txfLastName = new TextField();
    private final TextField txfFullName = new TextField();

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
        pane.add(txfFirstName, 1, 0, 1, 1);
        pane.add(txfLastName, 2, 0, 1, 1);
        pane.add(txfFullName,1 ,1,2,1);


        // add a button to the pane (at col=2, row=1)
        Button btnLowerCase = new Button("Kombiner");
        pane.add(btnLowerCase, 1, 3);
        GridPane.setMargin(btnLowerCase, new Insets(10, 10, 0, 10));

        // connect a method to the button
        btnLowerCase.setOnAction(event -> this.lowerCaseAction());
    }

    // -------------------------------------------------------------------------

    private void upperCaseAction() {
        String name = txfFirstName.getText().trim();
        txfFirstName.setText(name.toUpperCase());
    }

    private void lowerCaseAction() {
        String name = txfFirstName.getText().trim();
        txfFirstName.setText(name.toLowerCase());
    }
}
