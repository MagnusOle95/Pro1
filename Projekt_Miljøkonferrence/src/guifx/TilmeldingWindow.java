package guifx;

import application.controller.Controller;
import application.model.*;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.time.LocalDate;
import java.util.ArrayList;

public class TilmeldingWindow extends Stage {
    private Deltager deltager;

    public TilmeldingWindow(String title, Deltager deltager) {
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setResizable(false);
        this.deltager = deltager;

        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }


    //-------------------------------------------------------------------------------------

    private TextField txfYear, txfMonth, txfDay, txfYear2, txfMonth2, txfDay2, txfName, txfAdresse, txfLand, txfTlfNr;
    private CheckBox chbForedragsholder, chbHotel, chbLedsager;
    private ComboBox<Konferrence> cbbKonference;
    private ListView<Tilvalg> hotelTilvalg, valgteTilvalg;
    private ListView<Udflugt> konferenceUdflugter, valgteUdfluter;
    private ComboBox<Hotel> cbbHotel;
    private Button btnOk, btnBookHotel, btnAddTilvalg, btnAddUdflugt;
    private Label lblError;


    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        Label lblNavn = new Label("Navn: ");

        Label lblValgteNavn = new Label(deltager.getNavn());
        chbLedsager = new CheckBox("Ledsager");
        ChangeListener<Boolean> listener2 = (ov, oldValue, newValue) -> selectedLedsager(newValue);
        chbLedsager.selectedProperty().addListener(listener2);

        HBox lblNavne = new HBox(20);
        pane.add(lblNavne, 0, 0);
        lblNavne.getChildren().add(lblNavn);
        lblNavne.getChildren().add(lblValgteNavn);
        lblNavne.getChildren().add(chbLedsager);


        Label lblAnkomstDato = new Label("AnkomstDato:");
        pane.add(lblAnkomstDato, 0, 1);

        Label lblYear = new Label("År");

        txfYear = new TextField();
        txfYear.setMaxWidth(70);

        Label lblMonth = new Label("Måned");

        txfMonth = new TextField();
        txfMonth.setMaxWidth(30);

        Label lblDay = new Label("Dag");

        txfDay = new TextField();
        txfDay.setMaxWidth(30);

        Label lblAfrejseDato = new Label("AfrejseDato:");
        pane.add(lblAfrejseDato, 0, 5);


        Label lblYear2 = new Label("År");
        pane.add(lblYear2, 0, 6);

        txfYear2 = new TextField();
        pane.add(txfYear2, 0, 7);
        txfYear2.setMaxWidth(70);

        Label lblMonth2 = new Label("Måned");
        pane.add(lblMonth2, 1, 6);

        txfMonth2 = new TextField();
        pane.add(txfMonth2, 1, 7);
        txfMonth2.setMaxWidth(30);

        Label lblDay2 = new Label("Dag");
        pane.add(lblDay2, 2, 6);

        txfDay2 = new TextField();
        pane.add(txfDay2, 2, 7);
        txfDay2.setMaxWidth(30);

        Label lblKonference = new Label("Konference:");
        pane.add(lblKonference, 0, 8);

        cbbKonference = new ComboBox<>();
        pane.add(cbbKonference, 0, 9);
        cbbKonference.getItems().addAll(Controller.getKonferrencer());
        ChangeListener<Konferrence> listener4 = (ov, oldUdflugt, newUdflugt) -> this.updateUdflugterListe();
        cbbKonference.getSelectionModel().selectedItemProperty().addListener(listener4);

        cbbHotel = new ComboBox<>();
        pane.add(cbbHotel, 0, 13, 1, 2);
        cbbHotel.getItems().addAll(Controller.getHoteller());
        cbbHotel.setDisable(true);
        ChangeListener<Hotel> listener3 = (ov, oldHotel, newHotel) -> this.updateLister();
        cbbHotel.getSelectionModel().selectedItemProperty().addListener(listener3);

        chbForedragsholder = new CheckBox("Foredragsholder");
        pane.add(chbForedragsholder, 0, 10);

        chbHotel = new CheckBox("Book Hotel");
        pane.add(chbHotel, 0, 12);
        ChangeListener<Boolean> listener = (ov, oldValue, newValue) -> selectedHotelChanged(newValue);
        chbHotel.selectedProperty().addListener(listener);


        Button btnCancel = new Button("Cancel");
        btnCancel.setOnAction(event -> cancelAction());

        btnOk = new Button("OK");
        btnOk.setOnAction(event -> okAction());


        HBox hbButtons = new HBox(20);
        pane.add(hbButtons, 0, 15);
        hbButtons.getChildren().add(btnCancel);
        hbButtons.getChildren().add(btnOk);


        HBox lblDato = new HBox(50);
        pane.add(lblDato, 0, 2);
        lblDato.setAlignment(Pos.CENTER);
        lblDato.getChildren().add(lblYear);
        lblDato.getChildren().add(lblMonth);
        lblDato.getChildren().add(lblDay);

        HBox txfDato = new HBox(40);
        pane.add(txfDato, 0, 3);
        txfDato.setAlignment(Pos.CENTER);
        txfDato.getChildren().add(txfYear);
        txfDato.getChildren().add(txfMonth);
        txfDato.getChildren().add(txfDay);


        HBox lblDato2 = new HBox(50);
        pane.add(lblDato2, 0, 6);
        lblDato2.setAlignment(Pos.CENTER);
        lblDato2.getChildren().add(lblYear2);
        lblDato2.getChildren().add(lblMonth2);
        lblDato2.getChildren().add(lblDay2);

        HBox txfDato2 = new HBox(40);
        pane.add(txfDato2, 0, 7);
        txfDato2.setAlignment(Pos.CENTER);
        txfDato2.getChildren().add(txfYear2);
        txfDato2.getChildren().add(txfMonth2);
        txfDato2.getChildren().add(txfDay2);

        lblError = new Label();
        pane.add(lblError, 1, 12);
        lblError.setStyle("-fx-text-fill: red");

        //---------------------------------------------------------------------------------------------------
        //DeltagerTilvalgWindow

        Label lblTilvalg = new Label("Mulige Tilvalg:");
        pane.add(lblTilvalg, 3, 0);

        hotelTilvalg = new ListView<>();
        pane.add(hotelTilvalg, 3, 1, 1, 2);
        hotelTilvalg.setPrefHeight(100);


        btnAddTilvalg = new Button("Add tilvalg");
        pane.add(btnAddTilvalg, 3, 3);
        btnAddTilvalg.setOnAction(event -> addTilvalgTilDeltager());

        Label lblValgteTilvalg = new Label("Valgte Tilvalg:");
        pane.add(lblValgteTilvalg, 3, 4);

        valgteTilvalg = new ListView<>();
        pane.add(valgteTilvalg, 3, 5, 1, 2);
        valgteTilvalg.setPrefHeight(100);

        Button btnAdd = new Button("Add");
        //btnAdd.setOnAction(event -> );

        hotelTilvalg.setDisable(true);
        btnAddTilvalg.setDisable(true);
        valgteTilvalg.setDisable(true);


        //-------------------------------------------------------------------------------------

        Label lblKonferenceUdflugter = new Label("Konferencens Udflugter:");
        pane.add(lblKonferenceUdflugter, 6, 0);


        konferenceUdflugter = new ListView<>();
        pane.add(konferenceUdflugter, 6, 1, 1, 2);
        konferenceUdflugter.setPrefHeight(100);


        btnAddUdflugt = new Button("Add udflugt");
        pane.add(btnAddUdflugt, 6, 3);
        btnAddUdflugt.setOnAction(event -> addUdflugtTilLedsager());

        Label lblValgteUdflugter = new Label("Valgte Udflugter:");
        pane.add(lblValgteUdflugter, 6, 4);


        valgteUdfluter = new ListView<>();
        pane.add(valgteUdfluter, 6, 5, 1, 2);
        valgteUdfluter.setPrefHeight(100);

        Button btnAddLedsager = new Button("Add ledsager");
        // btnAdd.setOnAction(event -> addAction());

        Button btnOk = new Button("OK");
        btnOk.setOnAction(event -> okAction());

        konferenceUdflugter.setDisable(true);
        btnAddUdflugt.setDisable(true);
        valgteUdfluter.setDisable(true);

        //---------------------------------------------------------------------------------------------


    }


    //----------------------------------------------------------------------------------


    private void cancelAction() {
        this.hide();
    }

    private void okAction() {
        int year = -1;
        int year2 = -1;
        int month = -1;
        int month2 = -1;
        int day = -1;
        int day2 = -1;
        try {
            year = Integer.parseInt(txfYear.getText().trim());
            month = Integer.parseInt(txfMonth.getText().trim());
            day = Integer.parseInt(txfDay.getText().trim());
            year2 = Integer.parseInt(txfYear2.getText().trim());
            month2 = Integer.parseInt(txfMonth2.getText().trim());
            day2 = Integer.parseInt(txfDay2.getText().trim());
        } catch (NumberFormatException ex) {
            //do nothing
        }
        if (year < 0 && year2 < 0 && month < 0 && month2 < 0 && day < 0 && day2 < 0) {
            lblError.setText("Skriv en dato");
        } else {
            Hotel hotel = null;
            if(chbHotel.isSelected()){
                hotel=cbbHotel.getSelectionModel().getSelectedItem();
            }

            Tilmelding tilmelding = Controller.createTilmelding(LocalDate.of(year,month ,day),
                    LocalDate.of(year2 ,month2 ,day2 ) ,
                    deltager,chbForedragsholder.isSelected(),
                    cbbKonference.getSelectionModel().getSelectedItem(),hotel);

            this.hide();
        }

    }

    public void selectedHotelChanged(boolean checked) {
        cbbHotel.setDisable(!checked);
        hotelTilvalg.setDisable(!checked);
        btnAddTilvalg.setDisable(!checked);
        valgteTilvalg.setDisable(!checked);
    }

    public void selectedLedsager(boolean checked) {
        konferenceUdflugter.setDisable(!checked);
        valgteUdfluter.setDisable(!checked);
        btnAddUdflugt.setDisable(!checked);
    }

    public ArrayList<Tilvalg> showHotelTilvalg(Hotel Hotel) {
        return Hotel.getTilValg();
    }

    public void updateLister() {
        Hotel hotel = cbbHotel.getSelectionModel().getSelectedItem();
        if (hotel != null) {
            hotelTilvalg.getItems().setAll(hotel.getTilValg());


        }
    }

    public void addTilvalgTilDeltager(){
        Tilvalg tilvalg = hotelTilvalg.getSelectionModel().getSelectedItem();
        if(!valgteTilvalg.getItems().contains(tilvalg)) {
            valgteTilvalg.getItems().add(tilvalg);
        }
    }

    public void updateUdflugterListe(){
        Konferrence kon = cbbKonference.getSelectionModel().getSelectedItem();
        if (kon != null){
            konferenceUdflugter.getItems().setAll(kon.getudflugter());
        }

    }

    public void addUdflugtTilLedsager(){
        Udflugt udflugt = konferenceUdflugter.getSelectionModel().getSelectedItem();
        if (!valgteUdfluter.getItems().contains(udflugt)){
            valgteUdfluter.getItems().add(udflugt);
        }
    }
}
