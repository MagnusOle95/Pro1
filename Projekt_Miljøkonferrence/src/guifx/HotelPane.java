package guifx;

import application.controller.Controller;
import application.model.Deltager;
import application.model.Hotel;
import application.model.Tilmelding;
import application.model.Tilvalg;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class HotelPane extends GridPane {
	private ListView<Hotel> hoteller;
	private ListView<Tilvalg> tilvalg;
	private TextArea besøgende;

	public HotelPane() {
		this.setPadding(new Insets(20));
		this.setHgap(20);
		this.setVgap(10);
		this.setGridLinesVisible(false);

		//Opretter hotel liste og knap//
		Label lblHot = new Label("Hoteller");
		this.add(lblHot, 0, 0);

		hoteller = new ListView<>();
		this.add(hoteller,0 ,1,4,5);
		hoteller.setPrefWidth(200);
		hoteller.setPrefHeight(150);
		hoteller.getItems().setAll(Controller.getHoteller());
		ChangeListener<Hotel> listener = (ov, oldHotel, newHotel) -> this.updateLister();
		hoteller.getSelectionModel().selectedItemProperty().addListener(listener);


		Button opretHotel = new Button("Opret hotel");
		this.add(opretHotel,0 ,6);


		//Opretter TilvalgsListe og knap
		Label lblBesøgende = new Label("Tilvalg");
		this.add(lblBesøgende,6 ,0);

		tilvalg = new ListView<>();
		this.add(tilvalg,6 ,1,4,5);
		tilvalg.setPrefHeight(150);
		tilvalg.setPrefWidth(200);

		Button opretTilvalg = new Button("Opret Tilvalg");
		this.add(opretTilvalg,6 ,6 );


		//opretter liste med deltagere til hotelejere.
		Label lblHotelGæster = new Label("Gæster til hotellet");
		this.add(lblHotelGæster,0 ,8);

		besøgende = new TextArea();
		this.add(besøgende,0 ,9,4,5);
		besøgende.setPrefHeight(150);
		besøgende.setPrefWidth(200);
		besøgende.setEditable(false);

		}

		public void updateLister(){
		Hotel hotel = hoteller.getSelectionModel().getSelectedItem();
		if (hotel != null) {
			tilvalg.getItems().setAll(hotel.getTilValg());

			StringBuilder sb = new StringBuilder();
			for (Tilmelding t : hotel.getTilMeldinger()) {
				sb.append(t.getDeltager().getNavn() + "\n");
			}
			besøgende.setText(sb.toString());
		}
	}



	}





