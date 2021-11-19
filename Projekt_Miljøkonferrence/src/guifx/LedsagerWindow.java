package guifx;

import application.controller.Controller;
import application.model.Konference;
import application.model.Ledsager;
import application.model.Tilmelding;
import application.model.Udflugt;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import java.awt.*;

public class LedsagerWindow extends Stage {
    private Konference konference;
    private Tilmelding tilmelding;
    public LedsagerWindow(String title, Konference konference, Tilmelding tilmelding){
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setResizable(false);
        this.konference = konference;
        this.tilmelding = tilmelding;

        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);

    }

    //------------------------------------------------------------------------------------
    private TextField txfNavn;
    private ListView<Udflugt> konferenceUdflugter,valgteUdfluter;
    private Label lblError;

    private void initContent(GridPane pane){
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        Label lblNavn = new Label("Navn:");

        txfNavn = new TextField();

        HBox navn = new HBox(20);
        pane.add(navn,0,0);
        navn.getChildren().add(lblNavn);
        navn.getChildren().add(txfNavn);

        Label lblKonferenceUdflugter = new Label("Konferencens Udflugter:");
        pane.add(lblKonferenceUdflugter,0,1);


        konferenceUdflugter = new ListView<>();
        pane.add(konferenceUdflugter,0,2,1,2);
        konferenceUdflugter.setPrefHeight(100);
        konferenceUdflugter.getItems().setAll(konference.getUdflugter());

        Label lblValgteUdflugter = new Label("Valgte Udflugter:");
        pane.add(lblValgteUdflugter,0,5);

        valgteUdfluter = new ListView<>();
        pane.add(valgteUdfluter,0,6,1,2);
        valgteUdfluter.setPrefHeight(100);

        Button btnAdd = new Button("Add");
        btnAdd.setOnAction(event -> addAction());

        Button btnCancel = new Button("Cancel");
        btnCancel.setOnAction(event -> cancelAction());

        Button btnOk = new Button("OK");
        btnOk.setOnAction(event -> okAction());

        HBox hbButtons = new HBox(20);
        pane.add(hbButtons,0,8);
        hbButtons.getChildren().add(btnCancel);
        hbButtons.getChildren().add(btnOk);
        hbButtons.getChildren().add(btnAdd);

        lblError = new Label();
        pane.add(lblError, 0, 7);
        lblError.setStyle("-fx-text-fill: red");

    }

    //-----------------------------------------------------------------------------------------

    private void cancelAction(){this.hide();
    }

    private void okAction(){
        //TODO lav ligesom tilvalgsvinduet
        String navn = txfNavn.getText().trim();
        if (navn.length() == 0) {
            lblError.setText("Skriv et navn");
        } else {
            Ledsager l = Controller.createLedsager(navn);
            Controller.addLedsagerToTilmelding(l,tilmelding);
            for(Udflugt udflugt : valgteUdfluter.getItems()){
                Controller.addUdflugtToLedsager(udflugt,l);
            }
            this.hide();
        }


    }

    private void addAction(){
        Udflugt udflugt = konferenceUdflugter.getSelectionModel().getSelectedItem();
        if(!valgteUdfluter.getItems().contains(udflugt)) {
            valgteUdfluter.getItems().add(udflugt);
        }
    }
}
