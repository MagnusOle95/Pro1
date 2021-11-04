package gui;

import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import Opgave1.Yatzy;

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

    private boolean bonusUsed = false;

    private int countDisabledFields = 0;


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
        //Opretter texstfelterne til terningerne//
        txfValues = new TextField[5];
        for (int i = 0; i < txfValues.length; i++) {
            txfValues[i] = new TextField();
            dicePane.add(txfValues[i], i, 0, 1, 1);
            txfValues[i].setPrefWidth(80);
            txfValues[i].setPrefHeight(80);
            txfValues[i].setFont(Font.font("arial",50));
            txfValues[i].setEditable(false);
        }

        //Opretter checkboxe, under terningefelter//
        chbHolds = new CheckBox[5];
        for (int i = 0; i < chbHolds.length; i++) {
            chbHolds[i] = new CheckBox("Hold");
            dicePane.add(chbHolds[i], i, 1, 1, 1);
            GridPane.setMargin(chbHolds[i], new Insets(0, 20, 20, 20));
        }

        //laver knappen, roll//
        btnRoll = new Button("Roll");
        dicePane.add(btnRoll, 3, 2, 1, 1);
        btnRoll.setPrefWidth(80);
        btnRoll.setPrefHeight(40);
        btnRoll.setOnAction(event -> rollDices());

        //label der viser rolled//
        lblRolled = new Label("Rolled: " + dice.getThrowCount());
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
        //Laver alle resultats texstfelterne//
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

        //laver array med alle pointforklaringerne//
        String[] labbelArray = {"1-s", "2-s", "3-s", "4-s", "5-s", "6-s", "One Pair",
                "Two Pairs", "Three Same", "Four Same", "Full House",
                "Small Straight", "Large Straight", "Chance", "Yatzy"};

        //Forloop der udskriver arrayet labbelarray//
        for (int i = 0; i < labbelArray.length; i++) {
            Label lbl = new Label(labbelArray[i]);
            scorePane.add(lbl, 0, i);
        }

        // labels and text fields for sums, bonus and total.
        //Laver label og texstfelt til SumS//
        Label lblSumS = new Label("Sum:");
        scorePane.add(lblSumS, 2, 5);
        txfSumSame = new TextField("0");
        scorePane.add(txfSumSame, 3, 5, 1, 1);
        txfSumSame.setPrefWidth(50);
        txfSumSame.setEditable(false);

        //Laver label og texstfelt til Bonus//
        Label lblBonusS = new Label("Bonus:");
        scorePane.add(lblBonusS, 4, 5);
        txfBonus = new TextField("0");
        scorePane.add(txfBonus, 5, 5, 1, 1);
        txfBonus.setPrefWidth(50);
        txfBonus.setEditable(false);

        //Laver label og texstfelt til SumO//
        Label lblSumO = new Label("Sum:");
        scorePane.add(lblSumO, 2, 14);
        txfSumOther = new TextField("0");
        scorePane.add(txfSumOther, 3, 14, 1, 1);
        txfSumOther.setPrefWidth(50);
        txfSumOther.setEditable(false);

        //Laver label og texstfelt til total//
        Label lblTotal = new Label("Total:");
        scorePane.add(lblTotal, 4, 14);
        txfTotal = new TextField("0");
        scorePane.add(txfTotal, 5, 14, 1, 1);
        txfTotal.setPrefWidth(50);
        txfTotal.setEditable(false);
    }

    // -------------------------------------------------------------------------

    private Yatzy dice = new Yatzy();
    private int amoundOfRolls = 0;

    // Create a method for btnRoll's action.
    // Hint: Create small helper methods to be used in the action method.
    // TODO
    //laver roll dice, som kaster terningen, der ikke er sat hold, og der ikke er udført 3 kast//
    //Og sætter label lblrolled//
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
            setvaluesAndResult();
        }

        if (dice.getThrowCount() >= 3) {
                btnRoll.setDisable(true);
                for (int i = 0; i < chbHolds.length; i++) {
                    chbHolds[i].setDisable(true);
                }
            }
        lblRolled.setText("Rolled: " + dice.getThrowCount());
    }

    //Sætter, terningers værdi, og resultatfelter//
    public void setvaluesAndResult(){
        for (int i = 0; i < 5; i++) {
            txfValues[i].setText(dice.getValues()[i] + "");
        }

        int[] result = dice.getResults();
        for (int i = 0; i < 15; i++) {
            if (!txfResults[i].isDisable()){
                txfResults[i].setText(result[i] + "");
            }
        }
    }

    // -------------------------------------------------------------------------

    // Create a method for mouse click on one of the text fields in txfResults.
    // Hint: Create small helper methods to be used in the mouse click method.
    // TODO
    //når man vælger resultatboks 1 til 6 så plusses det i sums og boksen låses//
    public void chooseFieldActionSumSame(Event event) {
        TextField txt = (TextField) event.getSource();
        txt.setDisable(true);
        int value = Integer.parseInt(txt.getText().trim());
        int sumS = Integer.parseInt(txfSumSame.getText().trim());
        txfSumSame.setText(value + sumS + "");
        countDisabledFields++;
        sumTotal();
        resetRound();
        chechForEndGame();
        }

    //når man vælger resultatboks 6 til 15 så plusses det i sumO og boksen låses//
    public void chooseFieldActionSumO(Event event){
        TextField txt = (TextField) event.getSource();
        txt.setDisable(true);
        int value = Integer.parseInt(txt.getText().trim());
        int sumO = Integer.parseInt(txfSumOther.getText().trim());
        txfSumOther.setText(value + sumO + "");
        countDisabledFields++;
        sumTotal();
        resetRound();
        chechForEndGame();
    }

    //Udregner om man har fået en bonus//
    public void sumTotal(){
        int sumS = Integer.parseInt(txfSumSame.getText().trim());
        int sumO = Integer.parseInt(txfSumOther.getText().trim());
        int total = sumS + sumO;

        if (total >= 63 && !bonusUsed){
            total += 50;
            bonusUsed = false;
            txfBonus.setText(50 + "");
        }

        txfTotal.setText(total + "");
    }

    //Rester runden efter valgt felt//
    public void resetRound(){
        btnRoll.setDisable(false);
        dice.resetThrowCount();
        lblRolled.setText("Rolled: " + dice.getThrowCount());
        for (int i = 0; i < txfValues.length; i++){
            txfValues[i].clear();
            chbHolds[i].setDisable(false);
            chbHolds[i].setSelected(false);
        }

        for (int i = 0; i < txfResults.length; i++){
            if (!txfResults[i].isDisable()){
                txfResults[i].setText("0");
            }
        }
    }

    //Tjekker om spillet er slut og genstarter spillet, altså resetter alle felter og variabler//
    public void chechForEndGame(){
        if (countDisabledFields >= 15){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Spillet er færdigt");
            alert.setContentText("Dine totale point er: " + txfTotal.getText().trim() + "\nTryk ok for at starte et nyt spil");
            alert.showAndWait();

            for (int i = 0; i < txfResults.length; i++){
                txfResults[i].setDisable(false);
            }
            resetRound();
            countDisabledFields = 0;
            txfSumSame.setText("0");
            txfSumOther.setText("0");
            txfBonus.setText("0");
            txfTotal.setText("0");
        }
    }
}









