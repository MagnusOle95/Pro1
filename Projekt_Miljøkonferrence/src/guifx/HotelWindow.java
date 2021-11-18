package guifx;

import application.controller.Controller;
import application.model.Hotel;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HotelWindow extends Stage {
    private Hotel hotel;

    public HotelWindow(String title, Hotel hotel) {
        initStyle(StageStyle.UTILITY);
        initModality(Modality.APPLICATION_MODAL);
        setResizable(false);

        this.hotel = hotel;

        setTitle(title);
        GridPane pane = new GridPane();
        initContent(pane);

        Scene scene = new Scene(pane);
        setScene(scene);
    }

    public HotelWindow(String title) {
        this(title, null);
    }

    // -------------------------------------------------------------------------

    //Tilføger lige et employmentYear som tekstfelt
    private TextField txfHotelName, txfHotelBestyrresNavn, txfEnkeltværelsesPris, txfDobbeltværelsesPris;
    private Label lblError;

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        Label lblName = new Label("Navnet på Hotellet");
        pane.add(lblName, 0, 0);

        txfHotelName = new TextField();
        pane.add(txfHotelName, 0, 1);
        txfHotelName.setPrefWidth(200);

        Label lblHotelBestyresNavn = new Label("Hotelbestyrre's navn");
        pane.add(lblHotelBestyresNavn, 0, 2);

        txfHotelBestyrresNavn = new TextField();
        pane.add(txfHotelBestyrresNavn, 0, 3);

        //Tilføger label og tekstfelt for employment year.
        Label lblEnkeltværelsesPris = new Label("Enkeltværelses pris");
        pane.add(lblEnkeltværelsesPris, 0, 4);

        txfEnkeltværelsesPris = new TextField();
        pane.add(txfEnkeltværelsesPris, 0, 5);

        //Opretter, dobbeltværrelses pris
        Label lblDobbeltværelsesPris = new Label("Dobbeltværelses Pris");
        pane.add(lblDobbeltværelsesPris, 0, 6);

        txfDobbeltværelsesPris = new TextField();
        pane.add(txfDobbeltværelsesPris, 0, 7);


        Button btnCancel = new Button("Cancel");
        pane.add(btnCancel, 0, 9);
        GridPane.setHalignment(btnCancel, HPos.LEFT);
        btnCancel.setOnAction(event -> cancelAction());

        Button btnOK = new Button("OK");
        pane.add(btnOK, 0, 9);
        GridPane.setHalignment(btnOK, HPos.RIGHT);
        btnOK.setOnAction(event -> okAction());

        lblError = new Label();
        pane.add(lblError, 0, 10);
        lblError.setStyle("-fx-text-fill: red");

        initControls();
    }

    private void initControls() {

    }


    // -------------------------------------------------------------------------

    private void cancelAction() {
        hide();
    }

    private void okAction() {
        String hotelnavn = txfHotelName.getText().trim();
        if (hotelnavn.length() == 0) {
            lblError.setText("Mangler at udfylde hotel navn");
        } else {

            String hotelBestyrreNavn = txfHotelBestyrresNavn.getText().trim();
            if (hotelBestyrreNavn.length() == 0) {
                lblError.setText("mangler at udfylde hotelBestyrres navn");
            } else {

                //Laver enkeltværeksesPris
                double enkeltVærelsesPris = -1;
                try {
                    enkeltVærelsesPris = Double.parseDouble(txfEnkeltværelsesPris.getText().trim());
                } catch (NumberFormatException ex) {
                    // do nothing
                }

                //Laver dobbeltværrelsespris lige som enkeltværelse
                double dobbeltVærelsesPris = -1;
                try {
                    dobbeltVærelsesPris = Double.parseDouble(txfDobbeltværelsesPris.getText().trim());
                } catch (NumberFormatException ex) {
                    //Do nothing
                }

                //Undersøger om nogle af felterne er tomme, til fejlbesked
                if (enkeltVærelsesPris < 0 || dobbeltVærelsesPris < 0) {
                    lblError.setText("Mangler og udfylde enkelt og dobbeltværelse");
                } else {

                    Hotel newHotel = Controller.createHotel(hotelnavn,hotelBestyrreNavn,enkeltVærelsesPris,dobbeltVærelsesPris );

                    hide();
                }
            }
        }
    }





}


// -------------------------------------------------------------------------

