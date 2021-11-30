package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Bane;

import java.time.LocalDate;
import java.time.LocalTime;


public class Gui extends Application {

    @Override
    public void init() {
        Controller.initStorage();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Booking af tennisbaner");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        // TODO
    }

    // -------------------------------------------------------------------------

    // TODO

    private final TextField txfDato = new TextField("2016-01-20");
    private final ListView<Bane> lvwBaner = new ListView<>();
    private final ListView<LocalTime> lvwLedigeTimer = new ListView<>();

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        Label lblDato = new Label("Dato:");
        pane.add(lblDato, 0, 0);

        pane.add(txfDato, 0, 1);
        txfDato.setPrefWidth(100);

        Label lblBaner = new Label("Baner:");
        pane.add(lblBaner, 0, 2);

        pane.add(lvwBaner, 0, 3);
        lvwBaner.setPrefWidth(150);
        lvwBaner.setPrefHeight(160);
        // TODO

        Button btnOpretBane = new Button("Opret bane");
        pane.add(btnOpretBane, 0, 4);
        btnOpretBane.setOnAction(event -> this.opretBaneAction());

        Label lblLedigeTider = new Label("Ledige tider:");
        pane.add(lblLedigeTider, 1, 0);

        pane.add(lvwLedigeTimer, 1, 1, 1, 3);
        lvwLedigeTimer.setPrefWidth(100);
        lvwLedigeTimer.setPrefHeight(200);

        //-------------------------------------------------

        lvwBaner.getItems().setAll(Controller.getBaner());
    }

    private void selectionChanged() {
        // TODO
    }

    private void opretBaneAction() {
        // TODO
    }
}
