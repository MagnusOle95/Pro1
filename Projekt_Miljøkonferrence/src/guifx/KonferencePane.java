package guifx;

import application.controller.Controller;
import application.model.*;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class KonferencePane extends GridPane {
    
    private ListView<Konferrence> lvwKonferrencer = new ListView<>();
    private TextArea txaUdflugt = new TextArea();
    private TextField txfKonfnavn = new TextField();
    private TextField txfPlacering = new TextField();
    private TextField txfPris = new TextField();
    private TextArea txaTilmelding = new TextArea();
    private TextField txfStartDato = new TextField();
    private TextField txfSlutDato = new TextField();
    private OpretKonferenceWindow opretKonferenceWindow = new OpretKonferenceWindow("Opret Konference");
    private ComboBox<Udflugt> udflugtComboBox = new ComboBox<>();

    
    KonferencePane() {
        this.setPadding(new Insets(20));
        this.setHgap(20);
        this.setVgap(10);
        this.setGridLinesVisible(false);
        this.setPrefHeight(400);
        
        
        // KNAP - OPRET KONFERENCE
        Button opretkonference = new Button("Opret Konference");
        this.add(opretkonference, 0, 4);
        opretkonference.setOnAction(e -> this.opretKonferencen());

        // LABELS
        Label[] labels = new Label[5];
        for (int i = 0; i < labels.length; i++) {
            Label label = new Label();
            labels[i] = label;
            this.add(label, 2, i);
        }
        labels[0].setText("Konferencenavn: ");
        labels[1].setText("Placering: ");
        labels[2].setText("Dagspris: ");
        labels[3].setText("Startdato: ");
        labels[4].setText("Slutdato: ");
        
        
        // LISTVIEW - KONFERENCER
        Label lblComp = new Label("Konferencer");
        lblComp.setFont(Font.font("Verdana", 14));
        this.add(lblComp, 0, 0);
        this.add(lvwKonferrencer, 0, 1, 2, 3);
        lvwKonferrencer.setPrefWidth(200);
        lvwKonferrencer.setPrefHeight(50);
        
        
        // DELTAGERE TILMELDT KONFERENCE
        Label lblDeltagere = new Label("Deltagere");
        lblDeltagere.setFont(Font.font("Verdana", 14));
        this.add(lblDeltagere, 0, 5);
        this.add(txaTilmelding, 0, 6, 3, 8);
        txaTilmelding.setPrefWidth(200);
        txaTilmelding.setPrefHeight(200);
        txaTilmelding.setEditable(false);
        txaTilmelding.setFont(Font.font("Verdana", 13));
        
        
        // TEXTFIELDS
        this.add(txfKonfnavn, 3, 0);
        this.add(txfPlacering, 3, 1);
        this.add(txfPris, 3, 2);
        this.add(txfStartDato, 3, 3);
        this.add(txfSlutDato, 3, 4);

        //Opret udflugt
        Button opretUdflugt = new Button("Opret udflugt");
        this.add(opretUdflugt,3, 12);
        opretUdflugt.setOnAction(e-> this.opretUdflugt());

        //update udflugt
        Button btnUpdateUdflugt = new Button("Update");
        this.add(btnUpdateUdflugt,4, 12);
        btnUpdateUdflugt.setOnAction(e-> this.updateControls());

        this.add(txaUdflugt, 3, 6,2,6);
        txaUdflugt.setPrefWidth(100);
        
        
        // LISTENER TIL KONFERENCER
        ChangeListener<Konferrence> listener = (ov, oldKonference, newKonference) -> this.selectedKonerenceChanged();
        lvwKonferrencer.getSelectionModel().selectedItemProperty().addListener(listener);
        
        // GET KONFERENCER
        lvwKonferrencer.getItems().setAll(Controller.getKonferrencer());
        
    }
    
    private void opretKonferencen() {
        OpretKonferenceWindow opretKonferenceWindow = new OpretKonferenceWindow("Opret Konference");
        opretKonferenceWindow.showAndWait();
        
        
        lvwKonferrencer.getItems().setAll(Controller.getKonferrencer());
        int index = lvwKonferrencer.getItems().size() - 1;
        lvwKonferrencer.getSelectionModel().select(index);
        
    }

    private void opretUdflugt() {
        OpretUdflugtWindow opretUdflugtWindow = new OpretUdflugtWindow("Opret udflugt");
        opretUdflugtWindow.showAndWait();

        updateControls();
    }
    
    private void selectedKonerenceChanged() {
        this.updateControls();
    }


    
    public void updateControls() {
        Konferrence konference = lvwKonferrencer.getSelectionModel().getSelectedItem();
        if (konference != null) {
            txfKonfnavn.setText(konference.getKonferrenceNavn());
            txfPlacering.setText(konference.getLocation());
            txfPris.setText("" + konference.getDagsPris() + " kr.");
            txfStartDato.setText("" + konference.getStartDato());
            txfSlutDato.setText("" + konference.getSlutDato());
            
            
            StringBuilder sbTilmelding = new StringBuilder();
            for (Tilmelding tilmelding : konference.getTilmeldinger()) {
                if (tilmelding.getLedsager() != null) {
                    sbTilmelding.append("Navn:  " + tilmelding.getDeltager() +
                            "\nAdresse:  " + tilmelding.getDeltager().getAdresse() +
                            "\n\nTlfnr:  " + tilmelding.getDeltager().getTlfNr() +
                            "\nFirma:  " + tilmelding.getDeltager().getFirmanavn() +
                            "\nForedragsholder:  " + tilmelding.getFordragsholder() +
                            "\n\n- Ankomstdato: " + tilmelding.getAnkomstDato() +
                            "\n- Afrejsedato: " + tilmelding.getAfrejseDato() +
                            "\n- Ledsager:  " + tilmelding.getLedsager() +
                            "\n\t- Ledsager deltager i udflugter:\n\t  " + tilmelding.getLedsager().getUdflugter().toString().replace("[", "").replace("]", "") +
                            "\n\n-------------------------------------------" + "\n");
                    
                } else
                    sbTilmelding.append("Navn:   " + tilmelding.getDeltager() +
                            "\nAdresse:   " + tilmelding.getDeltager().getAdresse() +
                            "\n\nTlfnr:  " + tilmelding.getDeltager().getTlfNr() +
                            "\nFirma:  " + tilmelding.getDeltager().getFirmanavn() +
                            "\nForedragsholder:  " + tilmelding.getFordragsholder() +
                            "\n\n- Ankomstdato:  " + tilmelding.getAnkomstDato() +
                            "\n- Afrejsedato:  " + tilmelding.getAfrejseDato() +
                            "\n\n-------------------------------------------" + "\n");
            }
            txaTilmelding.setText(sbTilmelding.toString());

            
        }
        StringBuilder sb1 = new StringBuilder();

        for (Udflugt udflugt : konference.getUdflugter()) {
            sb1.append("Navn: " +udflugt.getType()+
                    "\nPris: " +udflugt.getPris() +
                    "\nDato: "+udflugt.getDato() +
                    "\nLedsagere: " + udflugt.getLedsagere());


        }
        txaUdflugt.setText(sb1.toString());
    }


}






