package gui;

import controller.Controller;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class OpretBaneDialog extends Stage {

    public OpretBaneDialog(String title, Stage owner) {
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setResizable(false);

        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    // -------------------------------------------------------------------------

    private final TextField txfNummer = new TextField();
    private final TextField txfInfo = new TextField();

    private void initContent(GridPane pane) {
        // pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblNummer = new Label("Nummer:");
        pane.add(lblNummer, 0, 0);

        pane.add(txfNummer, 1, 0);

        Label lblInfo = new Label("Info:");
        pane.add(lblInfo, 0, 1);

        pane.add(txfInfo, 1, 1);

        // TODO
    }

    private void cancelAction() {
        // TODO
    }

    private void okAction() {
        // TODO
    }
}
