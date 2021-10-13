package opgave_3_split_tekst;

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
        pane.add(txfFirstName, 1, 1, 1, 1);
        pane.add(txfLastName, 2, 1, 1, 1);
        pane.add(txfFullName,1 ,0,2,1);


        // add a button to the pane (at col=2, row=1)
        Button split = new Button("split");
        pane.add(split, 1, 3);
        GridPane.setMargin(split, new Insets(10, 10, 0, 10));

        // connect a method to the button
        split.setOnAction(event -> this.splitNameIntoFirstAndLastName());
    }

    // -------------------------------------------------------------------------

    private void splitNameIntoFirstAndLastName() {

        String fullName = txfFullName.getText().trim();
        int index = fullName.indexOf(" ");
        String firsname = fullName.substring(0,index );
        String lastname = fullName.substring(index + 1,fullName.length());
        txfFirstName.setText(firsname);
        txfLastName.setText(lastname);


    }
}
