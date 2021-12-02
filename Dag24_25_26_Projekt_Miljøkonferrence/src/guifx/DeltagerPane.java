package guifx;

import application.controller.Controller;
import application.model.Deltager;
import application.model.Tilmelding;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import java.awt.*;
import java.security.PrivateKey;

public class DeltagerPane extends GridPane {
	private ListView<Tilmelding> tilmeldingListView;
	private ListView<Deltager> deltagere;
	private TextField txfName, txfValgtKonfererence;
	private DatePicker dpAnkomstDato, dpAfrejseDato;
	private CheckBox chkForeDragsHolder;
	private ToggleGroup group = new ToggleGroup();
	private RadioButton rbDeltager, rbNyDeltager;
	private Button opretDeltager, tilmeldDeltager;
	private TextArea txaTilmeldinger;

	public DeltagerPane() {
		this.setPadding(new Insets(20));
		this.setHgap(20);
		this.setVgap(10);
		this.setGridLinesVisible(false);

		Label lblComp = new Label("Tidligere konferencer du har været med i:");
		this.add(lblComp, 3, 1);

		txaTilmeldinger = new TextArea();
		this.add(txaTilmeldinger, 3, 2, 5, 6);
		txaTilmeldinger.setPrefWidth(200);
		txaTilmeldinger.setPrefHeight(200);
		txaTilmeldinger.setEditable(false);

		deltagere = new ListView<>();
		this.add(deltagere, 0, 2, 2, 10);
		deltagere.setPrefWidth(100);
		deltagere.setPrefHeight(100);


		ChangeListener<Deltager> listener = (ov, oldCompny, newCompany) -> this.selectedDeltagerChanged();
		deltagere.getSelectionModel().selectedItemProperty().addListener(listener);



		rbDeltager = new RadioButton("Tidligere deltager");
		this.add(rbDeltager, 0, 0);
		rbDeltager.setToggleGroup(group);
		rbDeltager.setOnAction(event -> showDeltagereAction());

		rbNyDeltager = new RadioButton("Ny deltager");
		this.add(rbNyDeltager, 1, 0);
		rbNyDeltager.setToggleGroup(group);
		group.selectToggle(rbNyDeltager);
		rbNyDeltager.setOnAction(event -> nyDeltagerAction());

		Label lblDeltagere = new Label("Find dig selv i systemet:");
		this.add(lblDeltagere, 0, 1);

		HBox hbxButtons = new HBox(20);
		this.add(hbxButtons, 3, 10, 2, 1);

		opretDeltager = new Button("Opret Deltager");
		hbxButtons.getChildren().add(opretDeltager);
		opretDeltager.setOnAction(event -> createDeltagerAction());

		tilmeldDeltager = new Button("Tilmeld Deltager");
		hbxButtons.getChildren().add(tilmeldDeltager);
		tilmeldDeltager.setOnAction(event -> createTilmeldAction());

		Button btnBeregnPris = new Button("Udregn Pris");
		this.add(btnBeregnPris,3,11);
		btnBeregnPris.setOnAction(event -> udregnPris());

		tilmeldDeltager.setDisable(true);
		if (deltagere.getItems().size() > 0) {
			deltagere.getSelectionModel().select(0);
		}



	}


	//-------------------------------------------------------------------------

	private void selectedDeltagerChanged(){this.updateControls();}

	private void showDeltagereAction() {
		deltagere.getItems().setAll(Controller.getDeltagere());
		opretDeltager.setDisable(true);
		tilmeldDeltager.setDisable(false);
	}

	private void nyDeltagerAction() {
		deltagere.getItems().clear();
		opretDeltager.setDisable(false);
		tilmeldDeltager.setDisable(true);
	}

	private void createDeltagerAction(){

		DeltagerWindow dia = new DeltagerWindow("Opret Deltager");
		dia.showAndWait();

		showDeltagereAction();
		rbDeltager.setSelected(true);

	}

	private void createTilmeldAction(){
		if (deltagere.getSelectionModel().getSelectedItem() != null){
			TilmeldingWindow dia = new TilmeldingWindow("Tilmeld Deltager",deltagere.getSelectionModel().getSelectedItem());
			dia.showAndWait();
			updateControls();
		}
	}

	public void updateControls(){
		Deltager deltager = deltagere.getSelectionModel().getSelectedItem();
		if(deltager!=null){
			StringBuilder sb = new StringBuilder();
			for(Tilmelding tilm:deltager.getTilmeldinger()){
				sb.append(tilm + "\n");
				sb.append("\n");
			}
			txaTilmeldinger.setText(sb.toString());
		}else{
			txaTilmeldinger.clear();
		}
	}

	private void udregnPris(){
		Deltager deltager = deltagere.getSelectionModel().getSelectedItem();
		if(deltager != null){
			StringBuilder sb = new StringBuilder();
			for(Tilmelding tilm:deltager.getTilmeldinger()){
				sb.append(tilm +"\n");
				System.out.println();
				sb.append(tilm.getSamledePris()+"\n");
			}
			txaTilmeldinger.setText(sb.toString());
		}else{
			txaTilmeldinger.clear();
		}
	}


}









