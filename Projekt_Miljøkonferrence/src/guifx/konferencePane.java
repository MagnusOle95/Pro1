package guifx;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class konferencePane extends GridPane {
	private TextArea txaEmps;
	private ListView<String> konFerrencer,udFlugter,foreDrag;

	public konferencePane() {
		this.setPadding(new Insets(20));
		this.setHgap(20);
		this.setVgap(10);
		this.setGridLinesVisible(false);

		Label lblComp = new Label("konferencer:");
		this.add(lblComp, 0, 0);

		Button opretkonference = new Button("Opret konference");
		this.add(opretkonference,1 ,0);

		konFerrencer = new ListView<>();
		this.add(konFerrencer,0 ,1,2,10);
		konFerrencer.setPrefWidth(200);
		konFerrencer.setPrefHeight(200);


		Label lblOpretFordrag = new Label("Fordrag:");
		this.add(lblOpretFordrag, 3, 0);

		Button opretFordrag = new Button("Opret fordrag");
		this.add(opretFordrag,4 ,0,1,1 );

		foreDrag = new ListView<>();
		this.add(foreDrag,3 ,1,2,3);
		foreDrag.setPrefWidth(200);
		foreDrag.setPrefHeight(100);


		Label lblOpretUdflugt = new Label("Udflugter:");
		this.add(lblOpretUdflugt, 3, 5);

		Button opretUdflugt = new Button("Opret udflugt");
		this.add(opretUdflugt,4 ,5,1,1 );

		udFlugter = new ListView<>();
		this.add(udFlugter,3 ,6,2,3);
		udFlugter.setPrefWidth(200);
		udFlugter.setPrefHeight(100);

		}
	}





