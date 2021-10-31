package gui;

import javafx.application.Application;
import javafx.event.Event;
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
        for (int i = 0; i < txfValues.length; i++) {
            txfValues[i] = new TextField();
            dicePane.add(txfValues[i], i, 0, 1, 1);
            txfValues[i].setPrefWidth(80);
            txfValues[i].setPrefHeight(80);
        }

        chbHolds = new CheckBox[5];
        for (int i = 0; i < chbHolds.length; i++) {
            chbHolds[i] = new CheckBox("Hold");
            dicePane.add(chbHolds[i], i, 1, 1, 1);
            GridPane.setMargin(chbHolds[i], new Insets(0, 20, 20, 20));
        }

        btnRoll = new Button("Roll");
        dicePane.add(btnRoll, 3, 2, 1, 1);
        btnRoll.setPrefWidth(80);
        btnRoll.setPrefHeight(40);
        btnRoll.setOnAction(event -> rollDices());

        Label lblRolled = new Label("Rolled: " + dice.getThrowCount());
        dicePane.add(lblRolled, 4, 2, 1, 1);
        GridPane.setMargin(lblRolled, new Insets(0, 20, 20, 20));


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
        for (int i = 0; i < txfResults.length; i++) {
            txfResults[i] = new TextField("0");
            scorePane.add(txfResults[i], 1, i, 1, 1);
            txfResults[i].setMaxWidth(50);
            if (i < 6) {
                txfResults[i].setOnMouseClicked(event -> this.chooseFieldActionSumSame(event));
            }else{
                txfResults[i].setOnMouseClicked(event -> this.chooseFieldActionSumO(event));
            }
        }

        String[] labbelArray = {"1-s", "2-s", "3-s", "4-s", "5-s", "6-s", "One Pair",
                "Two Pairs", "Three Same", "Four Same", "Full House",
                "Small Straight", "Large Straight", "Chance", "Yatzy"};

        for (int i = 0; i < labbelArray.length; i++) {
            Label lbl = new Label(labbelArray[i]);
            scorePane.add(lbl, 0, i);
        }

        // labels and text fields for sums, bonus and total.
        Label lblSumS = new Label("Sum:");
        scorePane.add(lblSumS, 2, 5);
        txfSumSame = new TextField("0");
        scorePane.add(txfSumSame, 3, 5, 1, 1);
        txfSumSame.setPrefWidth(50);

        Label lblBonusS = new Label("Bonus:");
        scorePane.add(lblBonusS, 4, 5);
        txfBonus = new TextField("0");
        scorePane.add(txfBonus, 5, 5, 1, 1);
        txfBonus.setPrefWidth(50);

        Label lblSumO = new Label("Sum:");
        scorePane.add(lblSumO, 2, 14);
        txfSumOther = new TextField("0");
        scorePane.add(txfSumOther, 3, 14, 1, 1);
        txfSumOther.setPrefWidth(50);

        Label lblTotal = new Label("Total:");
        scorePane.add(lblTotal, 4, 14);
        txfTotal = new TextField("0");
        scorePane.add(txfTotal, 5, 14, 1, 1);
        txfTotal.setPrefWidth(50);
    }

    // -------------------------------------------------------------------------

    private Yatzy dice = new Yatzy();
    private int amoundOfRolls = 0;

    // Create a method for btnRoll's action.
    // Hint: Create small helper methods to be used in the action method.
    // TODO
    public void rollDices() {
        if (dice.getThrowCount() < 3) {
            boolean[] holds = new boolean[5];
            for (int i = 0; i < chbHolds.length; i++) {
                if (chbHolds[i].isSelected()) {
                    holds[i] = true;
                } else {
                    holds[i] = false;
                }
            }

            dice.throwDice(holds);
            for (int i = 0; i < 5; i++) {
                txfValues[i].setText(dice.getValues()[i] + "");
            }
            int[] result = dice.getResults();
            for (int i = 0; i < 15; i++) {
                if (!txfResults[i].isDisable()){
                    txfResults[i].setText(result[i] + "");
                }
            }

            if (dice.getThrowCount() >= 3) {
                btnRoll.setDisable(true);
                for (int i = 0; i < chbHolds.length; i++) {
                    chbHolds[i].setDisable(true);
                }
            }
        }
    }

    // -------------------------------------------------------------------------

    // Create a method for mouse click on one of the text fields in txfResults.
    // Hint: Create small helper methods to be used in the mouse click method.
    // TODO
    public void chooseFieldActionSumSame(Event event) {
        TextField txt = (TextField) event.getSource();
        txt.setDisable(true);
        int value = Integer.parseInt(txt.getText().trim());
        int sumS = Integer.parseInt(txfSumSame.getText().trim());
        txfSumSame.setText(value + sumS + "");
        sumTotal();
        }


    public void chooseFieldActionSumO(Event event){
        TextField txt = (TextField) event.getSource();
        txt.setDisable(true);

        int value = Integer.parseInt(txt.getText().trim());
        int sumO = Integer.parseInt(txfSumOther.getText().trim());
        txfSumOther.setText(value + sumO + "");
        sumTotal();
    }

    public void sumTotal(){
        int sumS = Integer.parseInt(txfSumSame.getText().trim());
        int sumO = Integer.parseInt(txfSumOther.getText().trim());
        txfTotal.setText(sumS + sumO + "");
    }
}









