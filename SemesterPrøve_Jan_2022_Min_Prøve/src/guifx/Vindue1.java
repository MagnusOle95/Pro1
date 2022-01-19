package guifx;

import application.controller.Controller;
import application.model.Løb;
import application.model.Note;
import application.model.Tilmelding;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Vindue1 extends Application {

    @Override
    public void init() {
        Controller.initStorage();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Skabelon 2");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    //--------------------------------------------------------------------------

    private TextField txfVinder, txfNavnForhindring, txfStrafSekunder;
    private TextArea txa;
    private ListView<Løb> lvwLøb;
    private ListView<Tilmelding> lvwTilmeldinger;
    private ListView<Note> lvwNoter;


    // -------------------------------------------------------------------------

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        Label lblLøb = new Label("Løb");
        pane.add(lblLøb, 0, 0);

        lvwLøb = new ListView<>();
        pane.add(lvwLøb, 0, 1, 2, 3);
        lvwLøb.setPrefWidth(200);
        lvwLøb.setPrefHeight(200);
        lvwLøb.getItems().setAll(Controller.getArraylistLøb());

        ChangeListener<Løb> listener = (ov, oldLøb, newLøb) -> this.valgtLøb();
        lvwLøb.getSelectionModel().selectedItemProperty().addListener(listener);


        Label lblTilmeding = new Label("Tilmeldinger");
        pane.add(lblTilmeding, 2, 0);

        lvwTilmeldinger = new ListView<>();
        pane.add(lvwTilmeldinger, 2, 1, 2, 3);
        lvwTilmeldinger.setPrefWidth(200);
        lvwTilmeldinger.setPrefHeight(200);

        ChangeListener<Tilmelding> listener2 = (ov, oldTilmeding, newTilmelding) -> this.valgtTilmelding();
        lvwTilmeldinger.getSelectionModel().selectedItemProperty().addListener(listener2);


        Label lblNote = new Label("Noter");
        pane.add(lblNote, 4, 0);

        lvwNoter = new ListView<>();
        pane.add(lvwNoter, 4, 1, 2, 3);
        lvwNoter.setPrefWidth(200);
        lvwNoter.setPrefHeight(200);


        Button btnVinder = new Button("Vinder");
        pane.add(btnVinder,0 ,4 );
        btnVinder.setOnAction(event -> findVinderAfLøb());

        txfVinder = new TextField();
        pane.add(txfVinder, 1, 4);
        txfVinder.setEditable(false);



        Label lblNavnForhindring = new Label("Navn Forhindring: ");
        pane.add(lblNavnForhindring, 2, 4);

        txfNavnForhindring = new TextField();
        pane.add(txfNavnForhindring, 3, 4);
        txfNavnForhindring.setEditable(true);


        Label lblStrafSekunder = new Label("Straf sekunder: ");
        pane.add(lblStrafSekunder, 2, 5);

        txfStrafSekunder = new TextField();
        pane.add(txfStrafSekunder, 3, 5);
        txfStrafSekunder.setEditable(true);

        Button btnRegistrerNote = new Button("Registrer note");
        pane.add(btnRegistrerNote,4 , 4);
        btnRegistrerNote.setOnAction(event -> registereNotePåLøber());







       /* //Note
        HBox hbxButtons = new HBox(40);
        pane.add(hbxButtons, 0, 4, 3, 1);
        hbxButtons.setPadding(new Insets(10, 0, 0, 0));
        hbxButtons.setAlignment(Pos.BASELINE_CENTER);

        Button btnCreate = new Button("Create");
        hbxButtons.getChildren().add(btnCreate);
        btnCreate.setOnAction(event -> this.createAction());

        Button btnUpdate = new Button("Update");
        hbxButtons.getChildren().add(btnUpdate);
        btnUpdate.setOnAction(event -> this.updateAction());

        Button btnDelete = new Button("Delete");
        hbxButtons.getChildren().add(btnDelete);
        btnDelete.setOnAction(event -> this.deleteAction());


        */
    }

    // -------------------------------------------------------------------------

    private void valgtLøb() {
        Løb løb = lvwLøb.getSelectionModel().getSelectedItem();
        lvwTilmeldinger.getItems().setAll(løb.getTilmeldinger());
    }

    private void valgtTilmelding() {
        Tilmelding tilmelding = lvwTilmeldinger.getSelectionModel().getSelectedItem();
        lvwNoter.getItems().setAll(tilmelding.getnoter());
    }

    private void findVinderAfLøb() {
        Løb løb = lvwLøb.getSelectionModel().getSelectedItem();
        if (løb != null){
            txfVinder.setText(løb.getVinderAfLøbet());
        }
    }

    public void registereNotePåLøber(){
        Tilmelding tilmelding = lvwTilmeldinger.getSelectionModel().getSelectedItem();
        if (tilmelding != null){

            String forhindringsNavn = txfNavnForhindring.getText();
            int strafSekunder = Integer.parseInt(txfStrafSekunder.getText());

            if (forhindringsNavn != null && strafSekunder > 0){
                Controller.registerStrafPåForhindring(forhindringsNavn,strafSekunder,tilmelding);
            }

        }
        lvwNoter.getItems().setAll(Controller.getNoter(tilmelding));
        txfNavnForhindring.clear();
        txfStrafSekunder.clear();
    }



}
