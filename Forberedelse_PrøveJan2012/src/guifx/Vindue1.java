package guifx;

import application.controller.Controller;
import application.model.Hold;
import application.model.Tilmelding;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class Vindue1 extends GridPane {

	private ListView<Hold> lvwHold;
	private ListView<Tilmelding> lvwTilmelding;

	public Vindue1() {
		this.setPadding(new Insets(20));
		this.setHgap(20);
		this.setVgap(10);
		this.setGridLinesVisible(false);

		Label lblalleHold = new Label("Alle hold i Fitnesscenteret ");
		this.add(lblalleHold, 0, 0);

		lvwHold = new ListView<>();
		this.add(lvwHold, 0, 1, 1, 3);
		lvwHold.setPrefWidth(200);
		lvwHold.setPrefHeight(200);
		lvwHold.getItems().setAll(Controller.getHold());

		ChangeListener<Hold> listener = (ov, oldHold, newHold) -> this.updateTilmeldingsliste();
		lvwHold.getSelectionModel().selectedItemProperty().addListener(listener);


		Label lblTilmeldinger = new Label("Tilmeldinger:");
		this.add(lblTilmeldinger, 2, 0);

		lvwTilmelding = new ListView<>();
		this.add(lvwTilmelding, 2, 1, 1, 3);
		lvwTilmelding.setPrefWidth(200);
		lvwTilmelding.setPrefHeight(200);


		Button btnOpretHold = new Button("OpretHold");
		this.add(btnOpretHold,0 ,5);
		btnOpretHold.setOnAction(event -> this.OpretHold());

		Button btnUpdateHold = new Button("UpdateHold");
		this.add(btnUpdateHold,2 ,5 );
		btnUpdateHold.setOnAction(event -> this.updateHold());

	}

	// -------------------------------------------------------------------------

	private void OpretHold() {
		Vindue1Window window = new Vindue1Window("Opret hold");
		window.showAndWait();

		lvwHold.getItems().setAll(Controller.getHold());
	}

	private void updateHold() {
		Hold hold = lvwHold.getSelectionModel().getSelectedItem();
		if (hold != null){

			Vindue1Window window = new Vindue1Window("Update Hold",hold);
			window.showAndWait();

			lvwHold.getItems().setAll(Controller.getHold());


		}
	}

	private void updateTilmeldingsliste(){
		Hold hold = lvwHold.getSelectionModel().getSelectedItem();
		if (hold != null){
			lvwTilmelding.getItems().setAll(hold.getTilmeldinger());
		}
	}


}
