package Gui.skabelon_med_2_eller_flere_faner.guifx;

import Gui.skabelon_med_2_eller_flere_faner.application.model.X1;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Vindue1 extends GridPane {

	private TextField txf1, txf2;
	private TextArea txa;
	private ListView<X1> lvw; //Husk at ændre X1

	public Vindue1() {
		this.setPadding(new Insets(20));
		this.setHgap(20);
		this.setVgap(10);
		this.setGridLinesVisible(false);

		Label lbl1 = new Label("Label 1");
		this.add(lbl1, 0, 0);

		lvw = new ListView<>();
		this.add(lvw, 0, 1, 1, 3);
		lvw.setPrefWidth(200);
		lvw.setPrefHeight(200);


		Label lbl2 = new Label("label 2");
		this.add(lbl2, 1, 1);

		txf1 = new TextField();
		this.add(txf1, 2, 1);
		txf1.setEditable(true);


		Label lbl3 = new Label("Label 3");
		this.add(lbl3, 1, 2);

		txf2 = new TextField();
		this.add(txf2, 2, 2);
		txf2.setEditable(true);


		Label lbl4 = new Label("Label 4");
		this.add(lbl4, 1, 3);

		txa = new TextArea();
		this.add(txa, 2, 3);
		txa.setPrefWidth(200);
		txa.setPrefHeight(100);
		txa.setEditable(true);


		HBox hbxButtons = new HBox(40);
		this.add(hbxButtons, 0, 4, 3, 1);
		hbxButtons.setPadding(new Insets(10, 0, 0, 0));
		hbxButtons.setAlignment(Pos.BASELINE_CENTER);

		Button btnCreate = new Button("Create");
		hbxButtons.getChildren().add(btnCreate);
		btnCreate.setOnAction(event -> this.createAction());

		Button btnUpdate = new Button("Update");
		hbxButtons.getChildren().add(btnUpdate);
		btnUpdate.setOnAction(event -> this.updateAction());

		Button btnDelete = new Button("Delete");
		hbxButtons.getChildren().add(btnDelete);
		btnDelete.setOnAction(event -> this.deleteAction());

	}

	// -------------------------------------------------------------------------

	private void createAction() {
	//	Vindue1Window dia = new Vindue1Window("Create X");
	//	dia.showAndWait();

		//se note, under akitektur.


	}

	private void updateAction() {

	}

	private void deleteAction() {

	}

	// -------------------------------------------------------------------------

	public void updateControls() {

	}


}
