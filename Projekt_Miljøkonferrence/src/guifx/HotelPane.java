package guifx;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class HotelPane extends GridPane {
	private ListView<String> hoteller,besøgende;

	public HotelPane() {
		this.setPadding(new Insets(20));
		this.setHgap(20);
		this.setVgap(10);
		this.setGridLinesVisible(false);

		Label lblComp = new Label("Hoteller til konferrence");
		this.add(lblComp, 0, 0);

		hoteller = new ListView<>();
		this.add(hoteller,0 ,1,5,6);
		hoteller.setPrefWidth(200);
		hoteller.setPrefHeight(200);


		Label lblBesøgende = new Label("Folk der har booket hotellet");
		this.add(lblBesøgende,6 ,0);

		besøgende = new ListView<>();
		this.add(besøgende,6 ,1,5,6 );
		besøgende.setPrefHeight(200);
		besøgende.setPrefHeight(200);



		}
	}





