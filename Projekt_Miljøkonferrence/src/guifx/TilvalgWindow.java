package guifx;

import application.controller.Controller;
import application.model.Hotel;
import application.model.Tilvalg;
import javafx.beans.value.ChangeListener;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class TilvalgWindow extends Stage {
	private Tilvalg tilvalg;

	public TilvalgWindow(String title, Tilvalg tilvalg) {
		initStyle(StageStyle.UTILITY);
		initModality(Modality.APPLICATION_MODAL);
		setResizable(false);

		this.tilvalg = tilvalg;

		setTitle(title);
		GridPane pane = new GridPane();
		initContent(pane);

		Scene scene = new Scene(pane);
		setScene(scene);
	}

	public TilvalgWindow(String title) {
		this(title, null);
	}

	// -------------------------------------------------------------------------

	//Tilføger lige et employmentYear som tekstfelt
	private TextField txfTilvalgNavn, txfTilvalgBeskrivelse, txfPrisPåTilvalget;
	private Label lblError;
	private ComboBox<Hotel> cbbHoteller;

	private void initContent(GridPane pane) {
		pane.setPadding(new Insets(10));
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setGridLinesVisible(false);

		Label lblTilvalgNavn = new Label("Navn på tilvalg");
		pane.add(lblTilvalgNavn, 0, 0);

		txfTilvalgNavn = new TextField();
		pane.add(txfTilvalgNavn, 0, 1);
		txfTilvalgNavn.setPrefWidth(200);


		Label lblBeskrivelse = new Label("Beskrivelse af tilvalget");
		pane.add(lblBeskrivelse, 0, 2);

		txfTilvalgBeskrivelse = new TextField();
		pane.add(txfTilvalgBeskrivelse, 0, 3);


		//Tilføger label og tekstfelt for employment year.
		Label lblPrisPåTilvalg = new Label("Prisen på tilvalget ");
		pane.add(lblPrisPåTilvalg,0 ,4);

		txfPrisPåTilvalget = new TextField();
		pane.add(txfPrisPåTilvalget,0 ,5 );


		Label lblHoteller = new Label("Vælg det hotel du vil tilføje tilvalget til");
		pane.add(lblHoteller,0, 6);

		cbbHoteller = new ComboBox<>();
		pane.add(cbbHoteller, 0, 7);
		cbbHoteller.getItems().addAll(Controller.getHoteller());


		Button btnCancel = new Button("Cancel");
		pane.add(btnCancel, 0, 9);
		GridPane.setHalignment(btnCancel, HPos.LEFT);
		btnCancel.setOnAction(event -> cancelAction());

		Button btnOK = new Button("OK");
		pane.add(btnOK, 0, 9);
		GridPane.setHalignment(btnOK, HPos.RIGHT);
		btnOK.setOnAction(event -> okAction());

		lblError = new Label();
		pane.add(lblError, 0, 10);
		lblError.setStyle("-fx-text-fill: red");


	}


	// -------------------------------------------------------------------------

	private void cancelAction() {
		hide();
	}

	private void okAction() {
		String TilvalgsNavn = txfTilvalgNavn.getText().trim();
		if (TilvalgsNavn.length() == 0) {
			lblError.setText("Mangler at udfylde tilvalgs navn");
		} else {

			String TilvalgBeskrivelse = txfTilvalgBeskrivelse.getText().trim();
			if (TilvalgBeskrivelse.length() == 0) {
				lblError.setText("Mangler at udfylde tilvalgs beskrivelse");
			} else {

				//Laver enkeltværeksesPris
				double prisPåTilvalg = -1;
				try {
					prisPåTilvalg = Double.parseDouble(txfPrisPåTilvalget.getText().trim());
				} catch (NumberFormatException ex) {
					// do nothing
				}

				//Undersøger om nogle af felterne er tomme, til fejlbesked
				if (prisPåTilvalg < 0) {
					lblError.setText("Mangler at tilføje pris på tilvalget");
				} else {

				    //finder det hotel man har valgt
					Hotel hotel = cbbHoteller.getSelectionModel().getSelectedItem();

					//opretter tilvalg på det valgte hotel
					Tilvalg tilvalg = Controller.createTilvalg(TilvalgsNavn,TilvalgBeskrivelse ,prisPåTilvalg ,hotel );


					hide();
				}
			}
		}
	}



}

	// -------------------------------------------------------------------------

