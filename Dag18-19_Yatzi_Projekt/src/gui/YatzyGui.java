package gui;

import com.sun.source.tree.NewArrayTree;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Yatzy;

public class YatzyGui extends Application {
	

	@Override
	public void start(Stage stage) {
		stage.setTitle("Yatzy");
		GridPane pane = new GridPane();
		this.initContent(pane);

		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}

	// -------------------------------------------------------------------------

	// Shows the face values of the 5 dice.
	private TextField[] txfValues;
	// Shows the hold status of the 5 dice.
	private CheckBox[] chbHolds;
	// Shows the results previously selected .
	// For free results (results not set yet), the results
	// corresponding to the actual face values of the 5 dice are shown.
	private TextField[] txfResults;
	// Shows points in sums, bonus and total.
	private TextField txfSumSame, txfBonus, txfSumOther, txfTotal;
	// Shows the number of times the dice has been rolled.
	private Label lblRolled;

	private Button btnRoll;

	private void initContent(GridPane pane) {
		pane.setGridLinesVisible(false);
		pane.setPadding(new Insets(10));
		pane.setHgap(10);
		pane.setVgap(10);

		// ---------------------------------------------------------------------

		GridPane dicePane = new GridPane();
		pane.add(dicePane, 0, 0);
		dicePane.setGridLinesVisible(false);
		dicePane.setPadding(new Insets(10));
		dicePane.setHgap(10);
		dicePane.setVgap(10);
		dicePane.setStyle("-fx-border-color: black");

		// initialize txfValues, chbHolds, btnRoll and lblRolled
		// TODO
			txfValues = new TextField[5];
		for (int i = 0; i < txfValues.length; i++){
			txfValues[i] = new TextField();
			dicePane.add(txfValues[i],i,0,1,1);
			txfValues[i].setPrefWidth(80);
			txfValues[i].setPrefHeight(80);
		}

		chbHolds = new CheckBox[5];
		for (int i = 0; i < chbHolds.length; i++){
			chbHolds[i] = new CheckBox("Hold");
			dicePane.add(chbHolds[i],i,1,1,1 );
			GridPane.setMargin(chbHolds[i],new Insets(0,20 ,20 ,20 ) );
		}

		Button btnRoll = new Button("Roll");
		dicePane.add(btnRoll,3 ,2,1,1);
		btnRoll.setPrefWidth(80);
		btnRoll.setPrefHeight(40);

		Label lblRolled = new Label("Rolled: ");
		dicePane.add(lblRolled,4 ,2,1,1 );
		GridPane.setMargin(lblRolled,new Insets(0,20 ,20 ,20 ));


		// ---------------------------------------------------------------------

		GridPane scorePane = new GridPane();
		pane.add(scorePane, 0, 1);
		scorePane.setGridLinesVisible(false);
		scorePane.setPadding(new Insets(10));
		scorePane.setVgap(5);
		scorePane.setHgap(10);
		scorePane.setStyle("-fx-border-color: black");
		int w = 50; // width of the text fields

		// Initialize labels for results, txfResults,
		// TODO
		txfResults = new TextField[15];
		for (int i = 0; i < txfResults.length; i++){
			txfResults[i] = new TextField();
			scorePane.add(txfResults[i],1,i,1,1);
			txfResults[i].setMaxWidth(50);
		}

		String[] labbelArray = {"1-s","2-s","3-s","4-s","5-s","6-s", "One Pair",
				"Two Pairs","Three Same","Four Same", "Full House",
				"Small Straight","Large Straight","Chance","Yatzy"};

		for (int i = 0; i < labbelArray.length; i++){
			Label lbl = new Label(labbelArray[i]);
			scorePane.add(lbl,0,i);
		}

		// labels and text fields for sums, bonus and total.
		Label lblSumS = new Label("Sum:");
		scorePane.add(lblSumS, 2,5);
		TextField txfSumS = new TextField();
		scorePane.add(txfSumS,3,5,1,1 );
		txfSumS.setPrefWidth(50);

		Label lblBonusS = new Label("Bonus:");
		scorePane.add(lblBonusS, 4,5);
		TextField txfBonusS = new TextField();
		scorePane.add(txfBonusS,5,5,1,1 );
		txfBonusS.setPrefWidth(50);

		Label lblSumO = new Label("Sum:");
		scorePane.add(lblSumO, 2,14);
		TextField txfSumO = new TextField();
		scorePane.add(txfSumO,3,14,1,1 );
		txfSumO.setPrefWidth(50);

		Label lblTotal = new Label("Total:");
		scorePane.add(lblTotal,4 ,14);
		TextField txfTotal = new TextField();
		scorePane.add(txfTotal,5 ,14,1,1);

	}

	// -------------------------------------------------------------------------

	private Yatzy dice = new Yatzy();

	// Create a method for btnRoll's action.
	// Hint: Create small helper methods to be used in the action method.
	// TODO

	// -------------------------------------------------------------------------

	// Create a method for mouse click on one of the text fields in txfResults.
	// Hint: Create small helper methods to be used in the mouse click method.
	// TODO

}
