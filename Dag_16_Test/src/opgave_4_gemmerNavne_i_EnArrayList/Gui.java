package opgave_4_gemmerNavne_i_EnArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Gui extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Boys");
        GridPane PrimePane = new GridPane();

        this.initContent(PrimePane);

        Scene scene1 = new Scene(PrimePane);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private final ListView<String> lvwNames = new ListView<>();
    private final ArrayList<String> names = new ArrayList<>();
    private final TextField txfName = new TextField();


    private void initContent(GridPane Primepane){
        this.initNames();

        Primepane.setGridLinesVisible(false);
        Primepane.setPadding(new Insets(20));
        Primepane.setHgap(10);
        Primepane.setVgap(10);

        Primepane.add(lvwNames,1 ,0,3,5 );
        lvwNames.setPrefHeight(200);
        lvwNames.setPrefWidth(200);
        lvwNames.getItems().setAll(names);

        Label lblNames = new Label("Navne:");
        Primepane.add(lblNames,0 ,0 );

        Label lblname = new Label("Navn:");
        Primepane.add(lblname,0 ,6 );

        Primepane.add(txfName,1 ,6,3,1 );

        Button btnAdd = new Button("Tilføj til liste");
        Primepane.add(btnAdd,4 ,6,1,1 );


    }

    public void initNames(){
        names.add("Per");
        names.add("Ken");
        names.add("Benny");
    }


}
