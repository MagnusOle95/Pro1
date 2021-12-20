package guifx;

import Gui.application.model.Company;
import application.controller.Controller;
import application.model.Festival;
import application.model.Frivillig;
import application.model.Job;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Vindue extends GridPane {

    private TextField txfTimer;
    private TextArea txa;
    private ListView<Festival> lvwFestivaler;
    private ListView<Job> lvwJobs;
    private ListView<Frivillig> LvwFrivilige;

    public Vindue() {
        this.setPadding(new Insets(20));
        this.setHgap(20);
        this.setVgap(10);
        this.setGridLinesVisible(false);

        Label lblFestivaler = new Label("Festivaler");
        this.add(lblFestivaler, 0, 0);

        lvwFestivaler = new ListView<>();
        this.add(lvwFestivaler, 0, 1, 1, 3);
        lvwFestivaler.setPrefWidth(200);
        lvwFestivaler.setPrefHeight(200);
        lvwFestivaler.getItems().setAll(Controller.getFestivaler());

        Label lblJobs = new Label("Jobs");
        this.add(lblJobs, 1, 0);

        lvwJobs = new ListView<>();
        this.add(lvwJobs, 1, 1, 1, 3);
        lvwJobs.setPrefWidth(200);
        lvwJobs.setPrefHeight(200);



        Label lblFrivillige = new Label("Frivillige");
        this.add(lblFrivillige, 2, 0);

        LvwFrivilige = new ListView<>();
        this.add(LvwFrivilige, 2, 1, 1, 3);
        LvwFrivilige.setPrefWidth(200);
        LvwFrivilige.setPrefHeight(200);
        LvwFrivilige.getItems().setAll(Controller.getFrivilige());


        Label lblTildelteJobs = new Label("Tildeltejobs");
        this.add(lblTildelteJobs, 3, 0);

        txa = new TextArea();
        this.add(txa, 3, 1,1,3);
        txa.setPrefWidth(200);
        txa.setPrefHeight(200);
        txa.setEditable(false);

        HBox hbxButtons = new HBox(40);
        this.add(hbxButtons, 0, 4, 3, 1);
        hbxButtons.setPadding(new Insets(10, 0, 0, 0));
        hbxButtons.setAlignment(Pos.BASELINE_CENTER);


        Label lblTimer = new Label("Timer");
        hbxButtons.getChildren().add(lblTimer);

        txfTimer = new TextField();
        hbxButtons.getChildren().add(txfTimer);

        Button btnCreate = new Button("Tag Vagt");
        hbxButtons.getChildren().add(btnCreate);
        btnCreate.setOnAction(event -> this.createAction());

    }

    // -------------------------------------------------------------------------

    private void createAction() {

    }

    private void updateAction() {

    }

    private void deleteAction() {

    }

    // -------------------------------------------------------------------------

    public void updateControls() {

    }


}



