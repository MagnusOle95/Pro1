package guifx;

import application.controller.Controller;
import application.model.*;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.time.LocalDate;

public class TilmeldingWindow extends Stage {
    private final Deltager deltager;

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

    private TextField txfLedsagerName;
    private CheckBox chbForedragsholder, chbHotel, chbLedsager;
    private ComboBox<Konferrence> cbbKonference;
    private ListView<Tilvalg> hotelTilvalg, valgteTilvalg;
    private ListView<Udflugt> konferenceUdflugter, valgteUdfluter;
    private ComboBox<Hotel> cbbHotel;
    private Button btnOk, btnAddTilvalg, btnAddUdflugt;
    private Label lblError;
    private final DatePicker datePickerStart = new DatePicker();
    private final DatePicker datePickerSlut = new DatePicker();


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

        VBox vpdate = new VBox(10);
        pane.add(vpdate,0 ,1 );
        vpdate.getChildren().add(datePickerStart);
        vpdate.getChildren().add(datePickerSlut);
        datePickerStart.setPromptText("Ankomstdato");
        datePickerSlut.setPromptText("Afrejsedato");

        Label lblKonference = new Label("Konference:");
        pane.add(lblKonference, 0, 2);

        Label lblLedsagerNavn = new Label("Ledsager's navn");
        pane.add(lblLedsagerNavn,6 ,8);

        txfLedsagerName = new TextField();
        pane.add(txfLedsagerName, 6, 9);
        txfLedsagerName.setMaxWidth(120);

        cbbKonference = new ComboBox<>();
        pane.add(cbbKonference, 0, 3);
        cbbKonference.getItems().addAll(Controller.getKonferrencer());
        ChangeListener<Konferrence> listener4 = (ov, oldUdflugt, newUdflugt) -> this.updateUdflugterListe();
        cbbKonference.getSelectionModel().selectedItemProperty().addListener(listener4);

        cbbHotel = new ComboBox<>();
        cbbHotel.setPromptText("Hoteller");
        pane.add(cbbHotel, 0, 6, 1, 2);
        cbbHotel.getItems().addAll(Controller.getHoteller());
        cbbHotel.setDisable(true);
        ChangeListener<Hotel> listener3 = (ov, oldHotel, newHotel) -> this.updateLister();
        cbbHotel.getSelectionModel().selectedItemProperty().addListener(listener3);

        chbForedragsholder = new CheckBox("Foredragsholder");
        pane.add(chbForedragsholder, 0, 4);

        chbHotel = new CheckBox("Book Hotel");
        pane.add(chbHotel, 0, 5);
        ChangeListener<Boolean> listener = (ov, oldValue, newValue) -> selectedHotelChanged(newValue);
        chbHotel.selectedProperty().addListener(listener);


        Button btnCancel = new Button("Cancel");
        btnCancel.setOnAction(event -> cancelAction());

        btnOk = new Button("OK");
        btnOk.setOnAction(event -> okAction());


        HBox hbButtons = new HBox(20);
        pane.add(hbButtons, 0, 10);
        hbButtons.getChildren().add(btnCancel);
        hbButtons.getChildren().add(btnOk);


        lblError = new Label();
        pane.add(lblError, 1, 11);
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
        LocalDate dStart = datePickerStart.getValue();
        LocalDate dslut = datePickerSlut.getValue();


        if (dStart == null || dslut == null) {
            lblError.setText("Skriv en dato");
        } else {
            Hotel hotel = null;
            if(chbHotel.isSelected()){
                hotel=cbbHotel.getSelectionModel().getSelectedItem();
            }

            Tilmelding tilmelding = Controller.createTilmelding(dStart,dslut,deltager,chbForedragsholder.isSelected(),
                    cbbKonference.getSelectionModel().getSelectedItem(),hotel);
            for (int i = 0; i<valgteTilvalg.getItems().size();i++){
                Controller.addTilvalgToTilmelding(valgteTilvalg.getItems().get(i),tilmelding);
            }

            if (chbLedsager.isSelected()){
                Ledsager ledsager = Controller.createLedsager(txfLedsagerName.getText().trim(),tilmelding);
                for (int i = 0; i < valgteUdfluter.getItems().size();i++){
                    Controller.addLedsagerToUdflugt(ledsager,valgteUdfluter.getItems().get(i));
                }
            }


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
            konferenceUdflugter.getItems().setAll(kon.getUdflugter());
        }

    }

    public void addUdflugtTilLedsager(){
        Udflugt udflugt = konferenceUdflugter.getSelectionModel().getSelectedItem();
        if (!valgteUdfluter.getItems().contains(udflugt)){
            valgteUdfluter.getItems().add(udflugt);
        }
    }
}

