package guifx;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.awt.*;
import java.security.PrivateKey;

public class DeltagerPane extends GridPane {
	private ListView<String> konFerrencer,udFlugter;
	private TextField txfName,txfAlder,txfAdresse,txfBy,txfLand,txfValgtKonfererence,txfFirmaNavn,txfFirmaTlfNr,txfLedsagerNavn,txfLedsagderAlder;
	private DatePicker dpAnkomstDato,dpAfrejseDato;
	private CheckBox chkForeDragsHolder;
	private ToggleGroup group = new ToggleGroup();

	public DeltagerPane() {
		this.setPadding(new Insets(20));
		this.setHgap(20);
		this.setVgap(10);
		this.setGridLinesVisible(false);

		Label lblComp = new Label("konference du kan tilmelde dig");
		this.add(lblComp, 3, 0);

		konFerrencer = new ListView<>();
		this.add(konFerrencer,3 ,1,5,6);
		konFerrencer.setPrefWidth(200);
		konFerrencer.setPrefHeight(200);


		Label lblValgtForedrag = new Label("Konference du har valgt at du vil deltage i");
		this.add(lblValgtForedrag,3 ,7);
		txfValgtKonfererence = new TextField();
		this.add(txfValgtKonfererence,3 ,8);
		txfValgtKonfererence.setEditable(false);


		RadioButton rbAlene = new RadioButton("Ankommer alene");
		this.add(rbAlene,3 , 9);
		rbAlene.setToggleGroup(group);
		RadioButton rbLedsager = new RadioButton("Medbringer ledsager");
		this.add(rbLedsager,3 ,10 );
		rbLedsager.setToggleGroup(group);


		Label lblForedragsHolder = new Label("Foredragsholder");
		this.add(lblForedragsHolder,0 ,0 );
		chkForeDragsHolder = new CheckBox();
		this.add(chkForeDragsHolder,1 ,0 );


		Label lblOpretFordrag = new Label("Navn:");
		this.add(lblOpretFordrag, 0, 1);
		txfName = new TextField();
		this.add(txfName,1 ,1);


		Label lblAlder = new Label("Alder");
		this.add(lblAlder,0 ,2 );
		txfAlder = new TextField();
		this.add(txfAlder,1 ,2);


		Label lblOpretUdflugt = new Label("Adresse");
		this.add(lblOpretUdflugt, 0, 3);
		txfAdresse = new TextField();
		this.add(txfAdresse,1 ,3);


		Label LblBy= new Label("By");
		this.add(LblBy,0 ,4 );
		txfBy = new TextField();
		this.add(txfBy,1 , 4);


		Label lblLand = new Label("Land");
		this.add(lblLand,0 ,5 );
		txfLand = new TextField();
		this.add(txfLand,1 ,5);


		Label lblAnkomstDato = new Label("Ankomst");
		this.add(lblAnkomstDato,0 ,6 );
		dpAnkomstDato = new DatePicker();
		this.add(dpAnkomstDato,1 ,6 );


		Label lblAfrejseDato = new Label("Afrejse");
		this.add(lblAfrejseDato,0 ,7 );
		dpAfrejseDato = new DatePicker();
		this.add(dpAfrejseDato,1 ,7 );


		Label lblFirmaNavn = new Label("Firma navn");
		this.add(lblFirmaNavn,0 ,8 );
		txfFirmaNavn = new TextField();
		this.add(txfFirmaNavn,1 ,8);


		Label lblFirmaTlfNr = new Label("Firma Tlfnr");
		this.add(lblFirmaTlfNr,0 ,9);
		txfFirmaTlfNr = new TextField();
		this.add(txfFirmaTlfNr,1 ,9);

		}
	}





