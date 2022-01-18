package guifx;

import application.model.X1;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Vindue1 extends Application {

	@Override
	public void init() {
		//	Controller.initStorage(); ----Gør denne aktiv
	}

	@Override
	public void start(Stage stage) {
		stage.setTitle("Skabelon 2");
		GridPane pane = new GridPane();
		this.initContent(pane);

		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
	}

	//--------------------------------------------------------------------------

	private TextField txf1, txf2;
	private TextArea txa;
	private ListView<X1> lvw; //Husk at ændre X1


	// -------------------------------------------------------------------------

	private void initContent(GridPane pane) {
		pane.setPadding(new Insets(20));
		pane.setHgap(20);
		pane.setVgap(10);
		pane.setGridLinesVisible(false);

		Label lbl1 = new Label("Label 1");
		pane.add(lbl1, 0, 0);

		lvw = new ListView<>();
		pane.add(lvw, 0, 1, 1, 3);
		lvw.setPrefWidth(200);
		lvw.setPrefHeight(200);


		Label lbl2 = new Label("label 2");
		pane.add(lbl2, 1, 1);

		txf1 = new TextField();
		pane.add(txf1, 2, 1);
		txf1.setEditable(true);


		Label lbl3 = new Label("Label 3");
		pane.add(lbl3, 1, 2);

		txf2 = new TextField();
		pane.add(txf2, 2, 2);
		txf2.setEditable(true);


		Label lbl4 = new Label("Label 4");
		pane.add(lbl4, 1, 3);

		txa = new TextArea();
		pane.add(txa, 2, 3);
		txa.setPrefWidth(200);
		txa.setPrefHeight(100);
		txa.setEditable(true);


		HBox hbxButtons = new HBox(40);
		pane.add(hbxButtons, 0, 4, 3, 1);
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
