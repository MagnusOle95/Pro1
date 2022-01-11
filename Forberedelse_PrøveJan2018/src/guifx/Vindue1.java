package guifx;

import application.controller.Controller;
import application.model.Arrangement;
import application.model.Tutor;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import storage.Storage;

import java.util.ArrayList;

public class Vindue1 extends GridPane {
    private TextField txfName, txfEmail;
    private ListView<Arrangement> lvwarrangementer, lvwtutorArrangementer;
    private ListView<Tutor> lvwtutors;

    public Vindue1() {
        this.setPadding(new Insets(20));
        this.setHgap(20);
        this.setVgap(10);
        this.setGridLinesVisible(false);


        Label lblTutors = new Label("Tutors:");
        this.add(lblTutors, 0, 0);

        lvwtutors = new ListView<>();
        this.add(lvwtutors, 0, 1, 1, 3);
        lvwtutors.setPrefWidth(200);
        lvwtutors.setPrefHeight(200);
        lvwtutors.getItems().setAll(Controller.GetTutors());
        ChangeListener<Tutor> listener = (ov, oldTutor, newTutor) -> this.valgtTutor();
        lvwtutors.getSelectionModel().selectedItemProperty().addListener(listener);


        Label lblName = new Label("Navn:");
        this.add(lblName, 1, 0);

        txfName = new TextField();
        this.add(txfName, 2, 0);
        txfName.setEditable(false);


        Label lblEmail = new Label("Email:");
        this.add(lblEmail, 1, 1);

        txfEmail = new TextField();
        this.add(txfEmail, 2, 1);
        txfEmail.setEditable(false);


        Label lbltutorArragementer = new Label("Arragementer:");
        this.add(lbltutorArragementer, 1, 2);

        lvwtutorArrangementer = new ListView<>();
        this.add(lvwtutorArrangementer, 2, 2, 1, 2);
        lvwtutorArrangementer.setPrefWidth(200);
        lvwtutorArrangementer.setPrefHeight(200);


        Label lblarrangementer = new Label("Alle mulige arragementer:");
        this.add(lblarrangementer, 3, 1);

        lvwarrangementer = new ListView<>();
        this.add(lvwarrangementer, 3, 2, 1, 2);
        lvwarrangementer.setPrefWidth(200);
        lvwarrangementer.setPrefHeight(200);
        lvwarrangementer.getItems().setAll(Controller.getArrangementer());



        Button btnFjern = new Button("Fjern");
        this.add(btnFjern,2 ,5 );
        btnFjern.setOnAction(event -> this.fjernFroTutor());

        Button btnTilføj = new Button("Tilføj");
        this.add(btnTilføj,3 ,5 );
        btnTilføj.setOnAction(event -> this.tilføgTilTutor());


    }

    // -------------------------------------------------------------------------

    private void tilføgTilTutor() {
        Tutor tutor = lvwtutors.getSelectionModel().getSelectedItem();
        Arrangement arrangement = lvwarrangementer.getSelectionModel().getSelectedItem();
        Controller.addArrangementTilTutor(arrangement,tutor);
        lvwtutorArrangementer.getItems().setAll(tutor.getArrangementer());
        lvwarrangementer.getItems().setAll(Controller.ikkeValgteArrangementer(tutor));

    }

    private void fjernFroTutor() {
        Tutor tutor = lvwtutors.getSelectionModel().getSelectedItem();
        Arrangement arrangement = lvwtutorArrangementer.getSelectionModel().getSelectedItem();
        Controller.removeArrangementFraTutor(arrangement,tutor);
        lvwtutorArrangementer.getItems().setAll(tutor.getArrangementer());
        lvwarrangementer.getItems().setAll(Controller.ikkeValgteArrangementer(tutor));

    }

    private void valgtTutor() {
        Tutor tutor = lvwtutors.getSelectionModel().getSelectedItem();
        txfName.setText(tutor.getNavn());
        txfEmail.setText(tutor.geteMail());
        lvwtutorArrangementer.getItems().setAll(tutor.getArrangementer());
        lvwarrangementer.getItems().setAll(Controller.ikkeValgteArrangementer(tutor));

    }



    // -------------------------------------------------------------------------

    public void updateControls() {


    }
}
