package guifx;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class OpretKonference extends Stage {
    
    public OpretKonference(String title, Stage owner) {
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);
        
        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);
        
        Scene scene = new Scene(pane);
        this.setScene(scene);
        
    }
    
    private final TextField txfTitle = new TextField();
    private final TextArea txaDescription = new TextArea();
    private final TextField txfLokation = new TextField();
    private final TextField txfMaxKapacitet = new TextField();
    private final TextField txfArrangoer = new TextField();
    
    private final DatePicker startDato = new DatePicker();
    private final DatePicker slutDato = new DatePicker();
    
    
    private void initContent(GridPane pane) {
        
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(10));
        pane.setVgap(10);
        pane.setHgap(10);
        
        // TITEL
        Label lblName = new Label("Titel:");
        pane.add(lblName, 0, 1);
        pane.add(txfTitle, 1, 1, 2, 1);
        
        // ARRANGØR
        Label lblArrangoer = new Label("Arrangør:");
        pane.add(lblArrangoer, 0, 2);
        pane.add(txfArrangoer, 1, 2, 2, 1);
        
        // START OG SLUT
        
        startDato.setEditable(false);
        startDato.setPromptText("Startdato");
        startDato.setPrefWidth(170);
        pane.add(startDato, 1, 3, 1, 1);
        
        slutDato.setEditable(false);
        slutDato.setPromptText("Slutdato");
        slutDato.setPrefWidth(170);
        pane.add(slutDato, 2, 3, 1, 1);
        Label lblDato = new Label("Dato:");
        pane.add(lblDato, 0, 3);
        
        // MAX KAPACITET
        Label lblMax = new Label("Max kapacitet:");
        pane.add(lblMax, 0, 4);
        pane.add(txfMaxKapacitet, 1, 4, 2, 1);
        
        
        // LOKATION
        Label lblLokation = new Label("Lokation:");
        pane.add(lblLokation, 0, 5);
        pane.add(txfLokation, 1, 5, 2, 1);
        
        // BESKRIVELSE
        Label lblBeskrivelse = new Label("Beskrivelse:");
        pane.add(lblBeskrivelse, 0, 6);
        txaDescription.setEditable(true);
        txaDescription.setPrefSize(300, 200);
        pane.add(txaDescription, 1, 6, 2, 1);
        
        
        // OPRET-KNAP
        Button btnAdd = new Button("Opret");
        pane.add(btnAdd, 1, 10);
        
        // CANCEL
        Button btnCancel = new Button("Cancel");
        pane.add(btnCancel, 2, 10);
        
        
    }
    
    
}
