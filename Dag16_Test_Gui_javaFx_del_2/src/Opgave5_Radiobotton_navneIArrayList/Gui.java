package Opgave5_Radiobotton_navneIArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Gui extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drenge og piger");
        GridPane PrimePane = new GridPane();

        this.initContent(PrimePane);

        Scene scene1 = new Scene(PrimePane);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private final ListView<String> lvwNames = new ListView<>();
    private final ArrayList<String> boyNames = new ArrayList<>();
    private final ArrayList<String> girlNames = new ArrayList<>();
    private final TextField txfName = new TextField();
    private final RadioButton rbBoys = new RadioButton("Drenge");
    private final RadioButton rbGirls = new RadioButton("Piger");



    private void initContent(GridPane Primepane){
        this.initNames();

        Primepane.setGridLinesVisible(false);
        Primepane.setPadding(new Insets(20));
        Primepane.setHgap(10);
        Primepane.setVgap(10);

        Primepane.add(lvwNames,1 ,1,3,5 );
        lvwNames.setPrefHeight(200);
        lvwNames.setPrefWidth(200);
        lvwNames.getItems().setAll(boyNames);
        rbBoys.setSelected(true);

        Label lblNames = new Label("Navne:");
        Primepane.add(lblNames,0 ,1 );

        Label lblname = new Label("Navn:");
        Primepane.add(lblname,0 ,7 );

        Primepane.add(txfName,1 ,7,3,1 );

        Button btnAdd = new Button("Tilføj til liste");
        Primepane.add(btnAdd,4 ,7,1,1 );
        btnAdd.setOnAction(event -> AddName());

        Primepane.add(rbBoys,1 ,0 );
        rbBoys.setOnAction(event -> chooseRbBoys());

        Primepane.add(rbGirls,2 ,0 );
        rbGirls.setOnAction(event -> chooseRbGirls());


    }
    public void AddName(){
        String name = txfName.getText().trim();

        if (name.length() > 0 && rbBoys.isSelected()){
            boyNames.add(name);
            lvwNames.getItems().setAll(boyNames);
            txfName.clear();

        }
        else if (name.length() > 0 && rbGirls.isSelected()){
            girlNames.add(name);
            lvwNames.getItems().setAll(girlNames);
            txfName.clear();
        }

        else if (!rbGirls.isSelected() && !rbBoys.isSelected() && name.length() <= 0){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Tilføj Person");
            alert.setHeaderText("Mangler navn og køn");
            alert.setContentText("Du skal vælge et køn og et navn før du kan tilføje en person");
            alert.show();
        }

        else if (rbBoys.isSelected() || rbGirls.isSelected() && name.length() <= 0){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Tilføj Person");
            alert.setHeaderText("Mangler navn");
            alert.setContentText("Navnet skal mindst indeholde 1 bogstav");
            alert.show();
        }

        else if (!rbBoys.isSelected() && !rbGirls.isSelected() && name.length() > 0){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Tilføj Person");
            alert.setHeaderText("Mangler Køn");
            alert.setContentText("Du skal vælge et køn før du kan gemme navnet");
            alert.show();
        }
    }

    public void chooseRbBoys(){
            rbGirls.setSelected(false);
            lvwNames.getItems().setAll(boyNames);

    }

    public void chooseRbGirls (){
            rbBoys.setSelected(false);
            lvwNames.getItems().setAll(girlNames);
    }

    public void initNames(){
        boyNames.add("Per");
        boyNames.add("Ken");
        boyNames.add("Benny");

        girlNames.add("Irma");
        girlNames.add("Ursula");
        girlNames.add("Line");
    }
}
