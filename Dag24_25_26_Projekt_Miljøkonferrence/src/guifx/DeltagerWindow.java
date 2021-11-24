package guifx;

import application.controller.Controller;
import application.model.Tilvalg;
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

public class DeltagerWindow extends Stage {

    public DeltagerWindow(String title){
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setResizable(false);

        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    //--------------------------------------------------------------------------------------

    private TextField txfName,txfAdresse,txfLand,txfTlfNr;
    private Label lblError;
    private ListView<Tilvalg> hotelTilvalg,valgteTilvalg;

    private void initContent(GridPane pane){
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        Label lblName = new Label("Name:");
        pane.add(lblName,0,0);

        txfName = new TextField();
        pane.add(txfName,1,0);

        Label lblAdresse = new Label("Adresse:");
        pane.add(lblAdresse,0,1);

        txfAdresse = new TextField();
        pane.add(txfAdresse,1,1);

        Label lblLand = new Label("Land:");
        pane.add(lblLand,0,2);

        txfLand = new TextField();
        pane.add(txfLand,1,2);

        Label lblTlfNr = new Label("Tlf.nr:");
        pane.add(lblTlfNr,0,3);

        txfTlfNr = new TextField();
        pane.add(txfTlfNr,1,3);

        Button btnOk = new Button("OK");
        pane.add(btnOk,1,4);
        btnOk.setOnAction(event -> okAction());

        Button btnCancel = new Button("Cancel");
        pane.add(btnCancel,0,4);
        btnCancel.setOnAction(event -> cancelAction());


        lblError = new Label();
        pane.add(lblError, 0, 5,2,1);
        lblError.setStyle("-fx-text-fill: red");

        //---------------------------------------------------------------------------------------------
    }


    private void cancelAction(){this.hide();}

    private void okAction(){
        String name = txfName.getText().trim();
        String adresse = txfAdresse.getText().trim();
        String land = txfLand.getText().trim();
        if(name.length()==0 || adresse.length()==0 || land.length()==0){
            lblError.setText("Udfyld alle felter");
        }else{
            int tlfNr = -1;
            try {
                tlfNr = Integer.parseInt(txfTlfNr.getText().trim());
            } catch (NumberFormatException ex) {
                // do nothing
            }
            if(tlfNr<=0 || tlfNr>1000000000){
                lblError.setText("Udfyld alle felter");
            }else {
                Controller.createDeltager(name,adresse ,land ,tlfNr);
                this.hide();
            }
        }
    }


}
