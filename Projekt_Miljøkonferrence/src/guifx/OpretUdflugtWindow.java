package guifx;

import application.controller.Controller;
import application.model.Konferrence;
import application.model.Udflugt;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.time.LocalDate;


public class OpretUdflugtWindow extends Stage {
    private Udflugt udflugt;
    private Konferrence konference;
    
    public OpretUdflugtWindow(String title, Udflugt udflugt) {
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);
        
        this.udflugt = udflugt;
        
        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);
        
        Scene scene = new Scene(pane);
        this.setScene(scene);
        
    }
    
    public OpretUdflugtWindow(String title) {
        this(title,null);
    }
    

    private final TextField txfPlacering = new TextField();
    private final TextField txfDagspris = new TextField();
    private final TextField txfNavn = new TextField();
    private  ComboBox<Konferrence> cbbKonferencer = new ComboBox<>();
    DatePicker startdate = new DatePicker();
    
    
    
    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(10));
        pane.setVgap(10);
        pane.setHgap(10);
        
        // TITEL
        Label lblTitel = new Label("Navn:");
        pane.add(lblTitel, 0, 1);
        pane.add(txfNavn, 1, 1, 1, 1);
        
        // PLACERING
        Label lblPacering = new Label("Placering:");
        pane.add(lblPacering, 0, 2);
        pane.add(txfPlacering, 1, 2, 1, 1);
        
        // START
        Label lblStart = new Label("Startdato: ");
        pane.add(lblStart, 0, 3);
        pane.add(startdate, 1, 3);
        
        Label lblDagsPris = new Label("Dagspris: ");
        pane.add(lblDagsPris, 0, 4);
        pane.add(txfDagspris, 1, 4);
        
        // HBOX
        HBox buttonBox = new HBox(20);
        pane.add(buttonBox, 1, 7);
        buttonBox.setPadding(new Insets(10, 10, 0, 10));
        buttonBox.setAlignment(Pos.TOP_RIGHT);
    
        // OPRET OG CANCEL
        Button btnOK = new Button("Cancel");
        buttonBox.getChildren().add(btnOK);
        btnOK.setOnAction(event -> this.cancelAction());
        Button btnCancel = new Button("Opret");
        buttonBox.getChildren().add(btnCancel);
        btnCancel.setOnAction(event -> this.okAction());

   
        Label lblCombo = new Label("Konferencer: ");
        pane.add(lblCombo, 0, 6);
        pane.add(cbbKonferencer, 1, 6,1,1);
        cbbKonferencer.getItems().addAll(Controller.getKonferrencer());
        
    
        this.initControls();
    }
    private void initControls() {
        if (udflugt != null) {
            txfNavn.setText(udflugt.getType());
            txfPlacering.setText(udflugt.getPlacering());
            txfDagspris.setText("" + udflugt.getPris());
            cbbKonferencer.getSelectionModel().select(konference);
            
        } else
            txfNavn.clear();
        txfPlacering.clear();
    }
    
    private void cancelAction() {
        this.hide();
    }
    
    private void okAction() {
    
        String name = txfNavn.getText().trim();
        String placering = txfPlacering.getText().trim();
        double dagspris = Double.parseDouble(txfDagspris.getText().trim());
        konference = cbbKonferencer.getSelectionModel().getSelectedItem();
        LocalDate startdato = startdate.getValue();
        
        if (udflugt == null) {
            udflugt = Controller.createUdflugt(dagspris,placering,name,startdato,konference);
        }
        
        this.hide();
    }
    
    public Udflugt getUdflugt() {
        return udflugt;
    }
  
}
    
    
    
