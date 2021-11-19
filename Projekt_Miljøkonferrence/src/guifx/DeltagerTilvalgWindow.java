package guifx;

import application.controller.Controller;
import application.model.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class DeltagerTilvalgWindow extends Stage {
    private Hotel hotel;
    private Tilmelding tilmelding;
    public DeltagerTilvalgWindow(String title, Hotel hotel, Tilmelding tilmelding){
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setResizable(false);
        this.hotel = hotel;
        this.tilmelding = tilmelding;

        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }


    private ListView<Tilvalg> hotelTilvalg,valgteTilvalg;


    private void initContent(GridPane pane){
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        Label lblNavn = new Label("Navn:");

        Label lblHotelNavn = new Label(hotel.getHotelNavn());

        HBox hbnavne = new HBox(20);
        pane.add(hbnavne,0,0);
        hbnavne.getChildren().add(lblNavn);
        hbnavne.getChildren().add(lblHotelNavn);

        Label lblTilvalg = new Label("Mulige Tilvalg:");
        pane.add(lblTilvalg,0,1);

        hotelTilvalg= new ListView<>();
        pane.add(hotelTilvalg,0,2,1,2);
        hotelTilvalg.setPrefHeight(100);
        hotelTilvalg.getItems().setAll(hotel.getTilvalgs());

        Label lblValgteTilvalg = new Label("Valgte Tilvalg:");
        pane.add(lblValgteTilvalg,0,5);

        valgteTilvalg = new ListView<>();
        pane.add(valgteTilvalg,0,6,1,2);
        valgteTilvalg.setPrefHeight(100);

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




    }

    //--------------------------------------------------------------------------------------
    private void cancelAction(){
        Controller.deleteTilmelding(tilmelding);
        this.hide();
    }

    private void okAction(){
        for(Tilvalg tilvalg:valgteTilvalg.getItems()){
            Controller.addTilvalgToTilmelding(tilmelding,tilvalg);
        }
        this.hide();
    }

    private void addAction(){
        Tilvalg tilvalg = hotelTilvalg.getSelectionModel().getSelectedItem();
        if(!valgteTilvalg.getItems().contains(tilvalg)) {
            valgteTilvalg.getItems().add(tilvalg);
        }
    }
}
