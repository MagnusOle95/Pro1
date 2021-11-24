package guifx;

import application.controller.Controller;
import application.model.Konferrence;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.time.LocalDate;


public class OpretKonferenceWindow extends Stage {
    private Konferrence konference;
    
    public OpretKonferenceWindow(String title, Konferrence konference) {
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);
        
        this.konference = konference;
        
        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);
        
        Scene scene = new Scene(pane);
        this.setScene(scene);
        
    }
    
    public OpretKonferenceWindow(String title) {
        this(title, null);
    }
    
    private final TextField txfStartDato = new TextField();
    private final TextField txfSlutDato = new TextField();
    private final TextField txfPlacering = new TextField();
    private final TextField txfDagspris = new TextField();
    private final TextField txfNavn = new TextField();
    private final TextField txfKonfDage = new TextField();
    private final DatePicker datePickerStart = new DatePicker();
    private final DatePicker datePickerSlut = new DatePicker();
    
    
    private void initContent(GridPane pane) {
        
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(10));
        pane.setVgap(10);
        pane.setHgap(10);
        
        // NAVN
        Label lblName = new Label("Navn:");
        pane.add(lblName, 0, 1);
        pane.add(txfNavn, 1, 1, 1, 1);
        
        // PLACERING
        Label lblPlacering = new Label("Placering:");
        pane.add(lblPlacering, 0, 2);
        pane.add(txfPlacering, 1, 2, 1, 1);
        
        
        // START OG SLUT
        VBox dates = new VBox(10);
        pane.add(dates, 1, 3, 2, 1);
        dates.setPadding(new Insets(10, 10, 0, 10));
        dates.setAlignment(Pos.TOP_RIGHT);
        dates.getChildren().add(datePickerStart);
        dates.getChildren().add(datePickerSlut);
        Label lblDato = new Label("Tidspunkt: ");
        pane.add(lblDato, 0, 3);
        datePickerStart.setPromptText("Startdato");
        datePickerSlut.setEditable(false);
        datePickerStart.setPrefWidth(140);
        datePickerSlut.setPromptText("Slutdato");
        datePickerSlut.setPrefWidth(140);
        
        
        // MAX KAPACITET
        Label lblMax = new Label("Dagspris:");
        pane.add(lblMax, 0, 5);
        pane.add(txfDagspris, 1, 5, 2, 1);
        
        
        // BESKRIVELSE
        Label lblBeskrivelse = new Label("Beskrivelse:");
        
        
        HBox buttonBox = new HBox(20);
        pane.add(buttonBox, 1, 6);
        buttonBox.setPadding(new Insets(10, 10, 0, 10));
        buttonBox.setAlignment(Pos.TOP_RIGHT);
        
        // OPRET-KNAP
        Button btnCancel = new Button("Opret");
        buttonBox.getChildren().add(btnCancel);
        btnCancel.setOnAction(event -> this.okAction());
        Button btnOK = new Button("Cancel");
        buttonBox.getChildren().add(btnOK);
        btnOK.setOnAction(event -> this.cancelAction());
        
        
        this.initControls();
    }
    
    private void initControls() {
        if (konference != null) {
            txfNavn.setText(konference.getKonferrenceNavn());
            txfPlacering.setText(konference.getLocation());
            txfDagspris.setText("" + konference.getDagsPris());
            txfStartDato.setText("" + konference.getStartDato());
            txfSlutDato.setText("" + konference.getSlutDato());
            
        } else
            txfNavn.clear();
        txfPlacering.clear();
    }
    
    private void cancelAction() {
        txfNavn.clear();
        txfPlacering.clear();
        txfDagspris.clear();
        konference = null;
        OpretKonferenceWindow.this.hide();
    }
    
    private void okAction() {
        String name = txfNavn.getText().trim();
        String placering = txfPlacering.getText().trim();
        double dagspris = Double.parseDouble(txfDagspris.getText().trim());
        LocalDate startdate = datePickerStart.getValue();
        LocalDate slutdate = datePickerSlut.getValue();
        
        if (konference == null) {
            konference = Controller.crateKonferrence(startdate, slutdate, name, placering, dagspris);
            
        }
        
        this.hide();
        
    }
    
    public Konferrence getKonference() {
        return konference;
    }
    
    
}
