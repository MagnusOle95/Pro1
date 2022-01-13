package guifx;

import application.controller.Controller;
import application.model.Hold;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Vindue1Window extends Stage {
	private Hold hold;

	public Vindue1Window(String title, Hold Hold) {
		this.initStyle(StageStyle.UTILITY);
		this.initModality(Modality.APPLICATION_MODAL);
		this.setResizable(false);

		this.hold = Hold;

		this.setTitle(title);
		GridPane pane = new GridPane();
		this.initContent(pane);

		Scene scene = new Scene(pane);
		this.setScene(scene);
	}

	public Vindue1Window(String title) {
		this(title, null);
	}

	// -------------------------------------------------------------------------

	private TextField txfName, txfDiciplin, txfMaxAntal;
	private Label lblError;

	private void initContent(GridPane pane) {
		pane.setPadding(new Insets(10));
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setGridLinesVisible(false);

		Label lblName = new Label("Hold navn");
		pane.add(lblName, 0, 0);

		txfName = new TextField();
		pane.add(txfName, 0, 1);
		txfName.setPrefWidth(200);

		Label lblDiciplin = new Label("Diciplin");
		pane.add(lblDiciplin, 0, 2);

		txfDiciplin = new TextField();
		pane.add(txfDiciplin, 0, 3);

		Label lblMaxAntal = new Label("Max antal pladser på holdet");
		pane.add(lblMaxAntal, 0, 4);

		txfMaxAntal = new TextField();
		pane.add(txfMaxAntal, 0, 5);


		Button btnCancel = new Button("Cancel");
		pane.add(btnCancel, 0, 7);
		GridPane.setHalignment(btnCancel, HPos.LEFT);
		btnCancel.setOnAction(event -> this.cancelAction());

		Button btnOK = new Button("OK");
		pane.add(btnOK, 0, 7);
		GridPane.setHalignment(btnOK, HPos.RIGHT);
		btnOK.setOnAction(event -> this.okAction());

		lblError = new Label();
		pane.add(lblError, 0, 8);
		lblError.setStyle("-fx-text-fill: red");

		this.initControls();
	}

	private void initControls() {
		if (hold != null){
			txfName.setText(hold.getNavn());
			txfDiciplin.setText(hold.getDiciplin());
			txfMaxAntal.setText(hold.getMaxAntal() + "");
		}
	}

	// -------------------------------------------------------------------------

	private void cancelAction() {
		this.hide();
	}

	private void okAction() {
		String name = txfName.getText().trim();
		if (name.length() == 0) {
			lblError.setText("Navn er ikke udfyldt");
		} else {
			String diciplin = txfDiciplin.getText().trim();
			if (diciplin.length() == 0) {
				lblError.setText("Diciplin er ikke udfyldt");
			} else {
				int MaxAntal = -1;
				try {
					MaxAntal = Integer.parseInt(txfMaxAntal.getText().trim());
				} catch (NumberFormatException ex) {
					// do nothing
				}
				if (MaxAntal <= 0) {
					lblError.setText("Antal skal være mere end 0");
				} else {
					// Call application.controller methods
					if (hold != null) {
						Controller.updateHold(hold,name, diciplin,MaxAntal);
					} else {
						Controller.createHold(name,diciplin ,MaxAntal);
					}
					this.hide();
				}
			}
		}
	}


}
